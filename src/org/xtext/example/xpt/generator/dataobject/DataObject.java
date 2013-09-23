package org.xtext.example.xpt.generator.dataobject;

import java.util.Iterator;
import java.util.Set;

import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multiset;

public class DataObject {

	private HashMultimap<String, Object> data;

	/**
	 * @param data
	 */
	public DataObject(HashMultimap<String, Object> data) {
		this.data = data;
	}

	public DataObject() {
		data = HashMultimap.create();
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
			current = getSubmap(current, s.getName(), s.getAttribute());
//			if (s.getAttribute() != null) {
//				if (s.getAttribute().getOp() == null && s.getAttribute().getInt() > 0) {
//					current = getElement(current, s.getAttribute().getInt());
//				}
//			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	/**
	 * Search the specified key in the DataObject and return the corresponding
	 * DataObject value
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
				i = i+1;
				try {
					DataObject nextDO = (DataObject) next;
					if (attribute != null) {
						DataObject checkedAttribute = getSubMapWithAttribute(nextDO, attribute);
						if (checkedAttribute != null) {
							subMap.putAll(checkedAttribute);
						} else if(attribute.getInt() > 0 && attribute.getInt() == i){
							subMap.putAll(nextDO);
							return subMap;
						}
					} else {
						subMap.putAll(nextDO); // take the DataObject and all
												// the sub-attribute
					}
				} catch (ClassCastException e) {					
					// if there's the selection of the n-th element
					if (attribute != null) {
						if (attribute.getInt() > 0) {
							if (attribute.getInt() == i) { // only the i-th would be putted in the map TODO ma nelle hashmap non c'è un ordine!
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
								if((double) iter.next() == intValue){
									return current;								
								}
								break;
							case "!=":
								if((double) iter.next() != intValue){
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
		}
		return null; // TODO magari meglio un'eccezione...

	}

	public Set<Object> get(String property) {
		return data.get(property);
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

	public HashMultimap<String, Object> getData() {
		return data;
	}

	public boolean put(String key, Object value) {
		return data.put(key, value);
	}

	public boolean putAll(DataObject dataObject) {
		return data.putAll(dataObject.getData());
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