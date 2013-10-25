package org.xtext.example.xpt.generator.dataobject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.management.Query;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.xtext.example.xpt.generator.Main;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Values;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

public class DataObject {
	
	private LinkedHashMultimap<String, Object> data;

	/**
	 * Default constructor, build an empty {@link LinkedHashMultimap}
	 */
	public DataObject() {
		data = LinkedHashMultimap.create();
	}

	/**
	 * Builds the {@link DataObject} starting from a passed {@link LinkedHashMultimap}
	 * 
	 * @param data the {@link LinkedHashMultimap} from which data are copied
	 */
	public DataObject(LinkedHashMultimap<String, Object> data) {
		this.data = data;
	}

	/**
	 * Builds the {@link DataObject} as a single pair key-value, where the value is a list of {@link Object}
	 * (used for the representation of {@link Values} elements)
	 * 
	 * @param name the key name
	 * @param values the list of values to associate with the key
	 */
	public DataObject(String name, List<Object> values) {
		data = LinkedHashMultimap.create();
		for (Object o : values) {
			data.put(name, o); // in this way there's values associated to a key ('data.put(name,values)' would associate a list to a key)
		}
	}

	/**
	 * Builds the {@link DataObject} from the parsing of JSON code or an XML file
	 * 
	 * @param string the JSON code or the path of the XML file to parse
	 * @param isJson if <code>true</code> the string param is intendes as JSON, otherwise as the path of the XML file to read
	 */
	public DataObject(String string, boolean isJson) {
		if(isJson) {
			data = parseJSON(string);
		} else {
			data = parseXML(string);
		}
	}

	/**
	 * Method for the evaluation of a Query
	 * 
	 * @param query the {@link Query} to evaluate
	 * @return a {@link DataObject} containing the results of the query
	 * @throws Exception if the evaluation goes wrong (see the called method for the specific exception)
	 */
	public DataObject evaluate(EList<Step> steps) throws Exception {
		DataObject current = new DataObject(data);
		for (Step s : steps) {
			if(s.getPlaceholder() == null) {
				current = getSubmap(current, s.getName(), s.getAttribute());
			}
			if (current == null) {//TODO a cosa serve?
				return null;
			}
		}
		return current;
	}

	/**
	 * Search the specified key in the DataObject and return the corresponding DataObject value
	 * 
	 * @param current the {@link DataObject} in which the search is done
	 * @param property the searched key/property in the {@link DataObject}
	 * @return a {@link DataObject} corresponding to the searched value (if found)
	 * @throws Exception if the searched property is not found
	 */
	private DataObject getSubmap(DataObject current, String property, Attribute attribute) throws Exception {
		DataObject subMap = new DataObject();
		if (current.keys().contains(property)) {
			Set<Object> values = current.get(property);
			Iterator<Object> iter = values.iterator();
			double i = 0; // index used for counting the i-th element to extract (if the proper attribute is set)
			while (iter.hasNext()) {
				Object next = iter.next();
				i = i + 1;
				if (next instanceof DataObject) {
					DataObject nextDO = (DataObject) next;
					if (attribute != null) {
						// check the case in which there's a variable instead of a String or a Double
						int number = -1;
						if (attribute.getVar() != null) { // check if the attribute is a variable to retrieve
							Object num = Main.getVariable(attribute.getVar());
							if (num instanceof Double) {
								number = (int) (double) num;
							} else if (num == null) {
								throw new Exception("The variable '" + attribute.getVar() + "' is not defined.");
							} else {
								throw new Exception("The variable '" + attribute.getVar() + "' it's not of a numeric type (Value: " + num + ". Class: " + num.getClass().getSimpleName() + ").");
							}
						} else {
							number = (int) attribute.getNumber();
						}

						if (number > 0) {
							if (number == i) {
								subMap.putAll(nextDO);
								return subMap;
							} else if(number > current.size()) {
								throw new Exception("Index out of bound (index = " + number + ", actual size = " + current.size() + ")");
							}
						} else {
							DataObject subMapWithAttribute = getSubMapWithAttribute(nextDO, attribute);
							if (subMapWithAttribute != null) {
								subMap.putAll(subMapWithAttribute);
							}
						}
					} else {
						subMap.putAll(nextDO); // take the whole DataObject and all the sub-attribute
					}
				} else {
					// if there's the selection of the n-th element
					if (attribute != null) {

						// check the case in which there's a variable instead of a String or a Double
						int number = -1;
						if (attribute.getVar() != null) {
							Object num = Main.getVariable(attribute.getVar());
							if (num instanceof Double) {
								number = (int) (double) num;
							} else if (num == null) {
								throw new Exception("The variable '" + attribute.getVar() + "' is not defined.");
							} else {
								throw new Exception("The variable '" + attribute.getVar() + "' it's not of a numeric type (Value: " + num + ". Class: " + num.getClass().getSimpleName() + ").");
							}
						} else {
							number = (int) attribute.getNumber();
						}

						if (number > 0) {
							if (number == i) { // only the i-th would be putted in the map
								subMap.put(property, next);
								return subMap;
							} else if(number > current.size()) {
								throw new Exception("Index out of bound (index = " + number + ", actual size = " + current.size() + ")");
							}
						}
					} else {
						subMap.put(property, next); // take a unique object (any type)
					}
				}
			}
			return subMap;
		}
		throw new Exception("The property '" + property + "' is not contained in '" + current.toString() + "'");
	}

	/**
	 * Evaluate the attributes on a passed {@link DataObject}
	 * 
	 * @param current {@link DataObject} on which the attribute is verified
	 * @param attribute {@link Attribute} to check
	 * @return {@link DataObject} selected from 'current' with the corresponding attribute, <code>null</code> if the attribute is not respected
	 * @throws Exception if the searched property is not found
	 */
	private DataObject getSubMapWithAttribute(DataObject current, Attribute attribute) throws Exception {
		String key = attribute.getProperty();
		String strValue = attribute.getStrValue();
		String op = attribute.getOp();
		double numericValue = attribute.getNumberValue();

		if (current.containsKey(key)) {
			if (op != null) { // check if it's a complete attribute (eg. /book[title="..."]), other types of attribute (by i-th selection and by varible are already checked)

				// check if the comparison is done with a variable; if necessary retrieve the value
				if (attribute.getVarValue() != null) {
					Object value = Main.getVariable(attribute.getVarValue());
					if (value != null) {
						if (value instanceof String) {
							strValue = (String) value;
						} else if (value instanceof Double) {
							numericValue = (double) value;
						} else {
							throw new Exception("The variable '" + attribute.getVarValue() + "' contains a DataObject, unacceptable in attributes.");
						}
					} else {
						throw new Exception("The variable '" + attribute.getVarValue() + "' is not defined.");
					}
				}

				if (strValue != null) { // check if it's a string attribute
					if (op.equals("=") && current.containsEntry(key, strValue)) {
						return current;
					} else if (op.equals("!=") && !current.containsEntry(key, strValue)) {
						return current;
					} else if(!(op.equals("!=") || op.equals("=="))){ // runtime check in the case that the strValue is obtained by a variable (so there's not static analysis of tokens)
						throw new Exception("Unsupported operation '" + op + "' for a String.");
					} else {
						return null;
					}
				} else {
					Set<Object> set = current.get(key);
					Iterator<Object> iter = set.iterator();
					while (iter.hasNext()) {
						switch (op) {
						case "=":
							if ((double) iter.next() == numericValue) {
								return current;
							}
							return null;
						case "!=":
							if ((double) iter.next() != numericValue) {
								return current;
							}
							return null;
						case ">":
							if ((double) iter.next() > numericValue) {
								return current;
							}
							return null;
						case ">=":
							if ((double) iter.next() >= numericValue) {
								return current;
							}
							return null;
						case "<":
							if ((double) iter.next() < numericValue) {
								return current;
							}
							return null;
						case "<=":
							if ((double) iter.next() <= numericValue) {
								return current;
							}
							return null;
						}
					}
				}
			}
		}
		throw new Exception("The property '" + key + "' is not contained in '" + current.toString() + "'");
	}

	/**
	 * Returns a collection view of all values associated with a key.
	 * 
	 * @param key key to search for in the {@link DataObject}
	 * @return the collection of values that the key maps to
	 * @see com.google.common.collect.AbstractSetMultimap#get(Object)
	 */
	public Set<Object> get(String property) {
		return data.get(property);
		
	}
	
	/**
	 * Returns the i-th element of the {@link DataObject}
	 *  
	 * @param index the i-th element to extract
	 * @return the i-th element if present
	 * @throws Exception if the index is out of bound
	 */
	public Object get(int index) throws Exception {
		Object[] valuesArray = values().toArray();
		if(index >= valuesArray.length){
			throw new Exception("Index out of bound (index = " + index + ", actual size = " + valuesArray.length + ")");
		}
		return valuesArray[index];
	}
	
	/**
	 * Returns the size of the {@link DataObject} (the number of pairs key-value)
	 */
	public int size() {
		return data.size();
	}

	/**
	 * Return the value of the first entry of the {@link DataObject}
	 * 
	 * @return value corresponding to the first key inserted in the {@link DataObject}
	 */
	public Object getFirstValue() {
		return data.values().iterator().next();
	}

	/**
	 * Return <code>true</code> if there is only a value in the {@link DataObject}
	 */
	public boolean isSingleValue() {
		// a single value and not a DataObject (potentially containing other values)
		return data.values().size() == 1 && !(this.getFirstValue() instanceof DataObject);
	}

	/**
	 * Check if the {@link DataObject} contains just a single key with a list of simple values associated(of type {@link String}, {@link Double} or {@link Boolean})
	 * 
	 * @return <code>true</code> if it is a List, <code>false</code> otherwise
	 */
	//TODO unused...
	public boolean isList() {
		if (data.keySet().size() != 1) {
			return false;
		}
		for (Object o : this.values()) {
			if (!(o instanceof String || o instanceof Boolean || o instanceof Double)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Convert a DataObject to a List (used in case of array declaration, where the defined array became a DataObject view multiple value associated a key equal to the name of the declaration variable)
	 * 
	 * @return
	 */
	//TODO unused...
	public List<Object> getList() {
		if (this.keySet().size() != 1) {
			return null;
		}
		List<Object> res = new ArrayList<Object>();
		for (Object e : this.values()) {
			res.add(e);
		}
		return res;
	}

	/**
	 * Returns <code>true</code> if the {@link Multimap} contains no key-value pairs. 
	 */
	public boolean isEmpty() {
		return data.isEmpty();
	}

	/**
	 * Search the passed target through the values of the {@link DataObject}.
	 * The search is deep, so every nested {@link DataObject} value is inspected.
	 * 
	 * @param target the {@link Object} to search (possible types are {@link String}, {@link Double} and {@link DataObject})
	 * @return <code>true</code> if the target is found, <code>false</code> otherwise
	 */
	public boolean contains(Object target) {

		// if target is a DataObject, for each value contained in the target we try to find it in the current DataObject
		if (target instanceof DataObject) {
			Collection<Object> values = ((DataObject) target).values();
			boolean res = true;
			for (Object o : values) {
				if (!data.containsValue(o)) {
					res = res & false;
					break;
				}
			}
			if (res) {
				return true;
			}
		} else if (data.containsValue(target)) { // if the target is a simple object (String or Double)
			return true;
		}
		
		Iterator<Object> iter = this.values().iterator();
		while (iter.hasNext()) {
			Object elem = iter.next();
			if (elem instanceof DataObject) {
				if (target instanceof DataObject && elem.equals(target)) { // try a comparison between DataObjects
					return true;
				}
				boolean res = ((DataObject) elem).contains(target);
				if (res) {
					return res;
				}
			}
		}
		return false;
	}

	/**
	 * Returns a collection, which may contain duplicates, of all keys.
	 * 
	 * @return a multiset with keys corresponding to the distinct keys of the multimap and frequencies corresponding to the number of values that each key maps to
	 * @see com.google.common.collect.AbstractSetMultimap#keys()
	 */
	public Multiset<String> keys() {
		return data.keys();
	}

	/**
	 * Returns the set of all keys, each appearing once in the returned set.
	 * 
	 * @return the collection of distinct keys
	 * @see com.google.common.collect.AbstractSetMultimap#keySet()
	 */
	public Set<String> keySet() {
		return data.keySet();
	}

	/**
	 * Returns true if the multimap contains any values for the specified key.
	 * 
	 * @param key
	 *            key to search for in multimap
	 * @see com.google.common.collect.AbstractSetMultimap#containsKey(Object)
	 */
	public boolean containsKey(Object key) {
		return data.containsKey(key);
	}

	/**
	 * Returns true if the multimap contains the specified key-value pair.
	 * 
	 * @param key
	 *            key to search for in multimap
	 * @param value
	 *            value to search for in multimap
	 * @see com.google.common.collect.AbstractSetMultimap#containsEntry(Object, Object)
	 */
	public boolean containsEntry(Object key, Object value) {
		return data.containsEntry(key, value);
	}

	/**
	 * Returns the Map containing the data of the DataObject
	 * 
	 * @return data
	 */
	public LinkedHashMultimap<String, Object> getData() {
		return data;
	}

	/**
	 * Returns a collection of all values in the multimap.
	 * 
	 * @return collection of values, which may include the same value multiple times if it occurs in multiple mappings
	 * @see com.google.common.collect.AbstractSetMultimap#values()
	 */
	public Collection<Object> values() {
		return data.values();
	}

	/**
	 * Stores a key-value pair in the multimap.
	 * 
	 * @param key
	 *            key to store in the multimap
	 * @param value
	 *            value to store in the multimap
	 * @return true if the method increased the size of the multimap, or false if the multimap already contained the key-value pair
	 * @see com.google.common.collect.AbstractSetMultimap#put(Object, Object)
	 */
	public boolean put(String key, Object value) {
		return data.put(key, value);
	}

	/**
	 * Copies all of another multimap's key-value pairs into this multimap. The order in which the mappings are added is determined by multimap.entries().
	 * 
	 * @param dataObject
	 *            mappings to store in this multimap
	 * @return true if the multimap changed
	 */
	public boolean putAll(DataObject dataObject) {
		return data.putAll(dataObject.data);
	}
	
	/**
	 * Returns <code>true</code> if the passed object is a number, <code>false</code> othewise
	 * 
	 * @param elem the object to check
	 */
	private boolean isNumeric(Object elem) {
		if(elem instanceof Double) return true;
		try {
			Double.valueOf(elem.toString());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// ***************************
	// *** XML PARSING METHODS ***
	// ***************************

	/**
	 * Returns the {@link LinkedHashMultimap} corresponding to the input XML file
	 * 
	 * @param xmlPath the path of the XML file to parse
	 * @return the corresponding {@link LinkedHashMultimap} parsed from the XML
	 */
	private LinkedHashMultimap<String, Object> parseXML(String xmlPath) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File(xmlPath));
			doc.getDocumentElement().normalize();
			Node root = doc.getFirstChild();
			return stepThroughXML(root).getData();
		} catch (ParserConfigurationException e2) {
			e2.printStackTrace();
		} catch (SAXException | IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	/**
	 * Navigate recursively through the XML nodes and translate them to a {@link DataObject}
	 * 
	 * @param root the root {@link Node} of an XML portion of file
	 * @return a {@link DataObject} conversion of XML
	 */
	private DataObject stepThroughXML(Node root) {
		String name = root.getNodeName();
		DataObject father = new DataObject();
		DataObject sons = new DataObject();
		for (int i = 0; i < root.getChildNodes().getLength(); i++) {
			Node son = root.getChildNodes().item(i);
			if (son instanceof Text) {
				String value = son.getNodeValue().trim();
				if (!value.equals("")) {
					try {
						double num = Double.parseDouble(value);
						father.put(name, num);
					} catch (NumberFormatException e) {
						father.put(name, value);
					}
					return father;
				}
			} else {
				sons.putAll(stepThroughXML(son));
			}
		}
		father.put(name, sons);
		return father;
	}

	// ****************************
	// *** JSON PARSING METHODS ***
	// ****************************
	
	/**
	 * Parse JSON to DataObject
	 * 
	 * @param json the json object to parse 
	 * @return a {@link LinkedHashMultimap} corresponding to the JSON input
	 */
	@SuppressWarnings("rawtypes")
	private LinkedHashMultimap<String, Object> parseJSON(String json) {
		LinkedHashMultimap<String, Object> dataMap = LinkedHashMultimap.create();;
		JSONParser jsonParser = new JSONParser();
		try {
			Map map = (Map) jsonParser.parse(json);
			Iterator iter = map.entrySet().iterator();
			while(iter.hasNext()){
				Map.Entry next = (Map.Entry) iter.next();
				Object value = next.getValue();
				String key = (String) next.getKey();
				if(value instanceof JSONObject){
					dataMap.put(key, stepThroughJSON((JSONObject) value));
				} else if(value instanceof JSONArray) {
					for(int i=0; i<((JSONArray)value).size(); i++){
						Object elem = ((JSONArray)value).get(i);
						if(elem instanceof JSONObject){
							dataMap.put(key, stepThroughJSON((JSONObject) elem));
						} else {
							if(isNumeric(elem)){
								dataMap.put(key, Double.valueOf(elem.toString())); // numbers are parsed as Long, so it's converted to Double
							} else {
								dataMap.put(key, elem);
							}
						}
					}
				} else {
					if(isNumeric(value)) {
						dataMap.put(key, Double.valueOf(value.toString())); // numbers are parsed as Long, so it's converted to Double
					} else {
						dataMap.put(key, value);
					}
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dataMap;
	}

	/**
	 * Navigate recursively through the JSON object and converts elements to DataObject
	 * @param obj the {@link JSONObject} to convert
	 * @return a {@link DataObject} corresponding to the passed {@link JSONObject}
	 */
	@SuppressWarnings("rawtypes")
	private DataObject stepThroughJSON(JSONObject obj){
		LinkedHashMultimap<String, Object> dataMap = LinkedHashMultimap.create();;
		Iterator iterator = obj.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry next = (Map.Entry) iterator.next();
			Object value = next.getValue();
			String key = (String) next.getKey();
			if(value instanceof JSONObject){
				dataMap.put(key, stepThroughJSON((JSONObject) value));
			} else if(value instanceof JSONArray) {
				for(int i=0; i<((JSONArray)value).size(); i++){
					Object elem = ((JSONArray)value).get(i);
					if(elem instanceof JSONObject){
						dataMap.put(key, stepThroughJSON((JSONObject) elem));
					} else {
						if(isNumeric(elem)){
							dataMap.put(key, Double.valueOf(elem.toString())); // numbers are parsed as Long, so it's converted to Double
						} else {
							dataMap.put(key, elem);
						}
					}
				}
			} else {
				if(isNumeric(value)) {
					dataMap.put(key, Double.valueOf(value.toString())); // numbers are parsed as Long, so it's converted to Double
				} else {
					dataMap.put(key, value);
				}
			}
		}
		return new DataObject(dataMap);
	}
	

	@Override
	public String toString() {
		String result = "{";
		for (String key : data.keySet()) {
			result += key + "=" + data.get(key) + ", ";
		}
		if (result.length() > 1) {
			result = result.substring(0, result.length() - 2);
		}
		result += "}";
		return result;

	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof DataObject)) {
			return false;
		}

		// check if each of the map of the two DataObject contains a single key with a List value -> if so, ignore the keys and compare the lists
		// if (this.isList() && ((DataObject) o).isList()) {
		// return this.getList().equals(((DataObject) o).getList());
		// }

		// check if the maps has same values for the same keys
		return deepEqual(this, (DataObject) o);
	}

	/**
	 * Search and compare every single key-value pair
	 * 
	 * @param a the {@link DataObject} to compare
	 * @param b the {@link DataObject} to compare
	 * @return <code>true</code> if the {@link DataObject} are deeply equals, <code>false</code> otherwise
	 */
	private boolean deepEqual(DataObject a, DataObject b) {
		Set<String> keysA = a.keySet();
		Set<String> keysB = b.keySet();
		if (keysA.size() != keysB.size() || a.values().size() != b.values().size()) {
			return false;
		}
		for (String keyA : keysA) {
			if (!keysB.contains(keyA)) {
				return false;
			}
			Iterator<Object> iterA = a.get(keyA).iterator();
			Iterator<Object> iterB = b.get(keyA).iterator();
			while (iterA.hasNext() && iterB.hasNext()) {
				Object elemA = iterA.next();
				Object elemB = iterB.next();
				if (elemA instanceof DataObject && elemB instanceof DataObject) {
					boolean res = deepEqual((DataObject) elemA, (DataObject) elemB);
					if (!res) {
						return false;
					}
				} else if (!elemA.equals(elemB)) {
					return false;
				}
			}
		}
		return true;
	}

}