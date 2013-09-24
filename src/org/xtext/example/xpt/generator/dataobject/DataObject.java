package org.xtext.example.xpt.generator.dataobject;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multiset;

public class DataObject {

	private LinkedHashMultimap<String, Object> data;

	/**
	 * @param data
	 */
	public DataObject(LinkedHashMultimap<String, Object> data) {
		this.data = data;
	}

	public DataObject() {
		data = LinkedHashMultimap.create();
	}

	public DataObject(String xmlPath) {
		data = parseXML(xmlPath);
	}

	/**
	 * Method for the evaluation of a Query
	 * 
	 * @param query
	 *            to evaluate
	 * @return a DataObject containing the results of the query
	 */
	public DataObject evaluate(Query query) {
		DataObject current = new DataObject(data);
		for (Step s : query.getSteps()) {
			if (s.getPlaceholder() == null) {
				current = getSubmap(current, s.getName(), s.getAttribute());
				if (current == null) {
					return null;
				}
			}
		}
		return current;
	}

	/**
	 * Search the specified key in the DataObject and return the corresponding DataObject value
	 * 
	 * @param current
	 *            the DataObject in which the search is done
	 * @param property
	 *            the searched key/property in the DataObject
	 * @return a DataObject corresponding to the searched value
	 */
	private DataObject getSubmap(DataObject current, String property, Attribute attribute) {
		DataObject subMap = new DataObject();
		if (current.keys().contains(property)) {
			Set<Object> sub = current.get(property);
			Iterator<Object> iter = sub.iterator();
			double i = 0;
			while (iter.hasNext()) {
				Object next = iter.next();
				i = i + 1;
				try {
					DataObject nextDO = (DataObject) next;
					if (attribute != null) {
						DataObject checkedAttribute = getSubMapWithAttribute(nextDO, attribute);
						if (checkedAttribute != null) {
							subMap.putAll(checkedAttribute);
						} else if (attribute.getInt() > 0 && attribute.getInt() == i) {
							subMap.putAll(nextDO);
							return subMap;
						}
					} else {
						subMap.put(nextDO); // take the DataObject and all the sub-attribute
					}
				} catch (ClassCastException e) {
					// if there's the selection of the n-th element
					if (attribute != null) {
						if (attribute.getInt() > 0) {
							if (attribute.getInt() == i) { // only the i-th would be putted in the map
								subMap.put(property, next);
								return subMap;
							}
						}
					} else {
						subMap.put(property, next); // take a unique object (any type)
					}
				}
			}
			return subMap;
		}
		return null; // TODO magari meglio un'eccezione...
	}

	private DataObject getSubMapWithAttribute(DataObject current, Attribute attribute) {
		String key = attribute.getProperty();
		String strValue = attribute.getStrValue();
		String op = attribute.getOp();
		double intValue = attribute.getIntValue();

		if (current.containsKey(key)) {
			if (op != null) { // check if it's a complete attribute or just a
								// constant (eg. /book[title="..."] or /book[1])
				if (strValue != null) { // check if it's a string attribute
					if (op.equals("=") && current.containsEntry(key, strValue)) {
						return current;
					} else if (op.equals("!=") && !current.containsEntry(key, strValue)) {
						return current;
					} else {
						return null;
					}
				} else {
					Set<Object> set = current.get(key);
					Iterator<Object> iter = set.iterator();
					while (iter.hasNext()) {
						switch (op) {
						case "=":
							if ((double) iter.next() == intValue) {
								return current;
							}
							break;
						case "!=":
							if ((double) iter.next() != intValue) {
								return current;
							}
							break;
						case ">":
							if ((double) iter.next() > intValue) {
								return current;
							}
							break;
						case ">=":
							if ((double) iter.next() >= intValue) {
								return current;
							}
							break;
						case "<":
							if ((double) iter.next() < intValue) {
								return current;
							}
							break;
						case "<=":
							if ((double) iter.next() <= intValue) {
								return current;
							}
							break;
						}
					}
					return null;
				}
			}
		}
		return null; // TODO magari meglio un'eccezione...
	}

	public Set<Object> get(String property) {
		return data.get(property);
	}

	/**
	 * Return the first entry of the DataObject
	 * 
	 * @return value corresponding to the first key putted in the DataObject
	 */
	public Object getFirst() {
		return data.values().iterator().next();
	}

	public Multiset<String> keys() {
		return data.keys();
	}

	public Set<String> keySet() {
		return data.keySet();
	}

	public boolean containsKey(Object key) {
		return data.containsKey(key);
	}

	public boolean containsEntry(Object key, Object value) {
		return data.containsEntry(key, value);
	}

	public LinkedHashMultimap<String, Object> getData() {
		return data;
	}

	public Collection<Object> values() {
		return data.values();
	}

	public boolean put(String key, Object value) {
		return data.put(key, value);
	}

	public void put(DataObject dataObj) {
		Collection<String> keys = dataObj.keySet();
		for (String k : keys) {
			Object value = dataObj.get(k);
			try {
				Set<Object> set = (Set<Object>) value;
				Iterator<Object> iter = set.iterator();
				while(iter.hasNext()){
					data.put(k, iter.next());
				}
			} catch (ClassCastException e) {
				data.put(k, value);
			}
		}
	}

	public boolean putAll(DataObject dataObject) {
		return data.putAll(dataObject.getData());
	}

	private LinkedHashMultimap<String, Object> parseXML(String xmlPath) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File(xmlPath));
			doc.getDocumentElement().normalize();
			Node root = doc.getFirstChild();
			return stepThrow(root).getData();
		} catch (ParserConfigurationException e2) {
			e2.printStackTrace();
		} catch (SAXException | IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	private DataObject stepThrow(Node root) {
		String name = root.getNodeName();
		DataObject father = new DataObject();
		DataObject sons = new DataObject();
		for (int i = 0; i < root.getChildNodes().getLength(); i++) {
			Node son = root.getChildNodes().item(i);
			int grandsons = son.getChildNodes().getLength();
			if(son instanceof Text){
				String value = son.getNodeValue().trim();
				if(!value.equals("")){
					try {
						double num = Double.parseDouble(value);
						father.put(name, num);
					} catch (NumberFormatException e) {
						father.put(name, value);
					}
					return father;
				}
			} else {
				sons.put(stepThrow(son));
			}
		}
		father.put(name, sons);
		return father;
//		for (int i = 0; i < root.getChildNodes().getLength(); i++) {
//			Node son = root.getChildNodes().item(i);
//			for (int j = 0; j < son.getChildNodes().getLength(); j++) {
//				Node grandson = son.getChildNodes().item(j);
//				if (grandson instanceof Text) {
//					String value = grandson.getNodeValue().trim();
//					if (!value.equals("")) {
//						try {
//							double number = Double.parseDouble(value);
//							father.put(son.getNodeName(), number);
//						} catch (NumberFormatException e) {
//							father.put(son.getNodeName(), value);
//						}
//					}
//				} else {
//					String sonName = son.getNodeName();
//					father.put(sonName, stepThrow(son));
//				}
//			}
//		}
	}

	public String toString() {
		String result = "{";
		for (String key : data.keySet()) {
			result += key + "=" + data.get(key) + ", ";
		}
		result = result.substring(0, result.length() - 2);
		result += "}";
		return result;

	}

}