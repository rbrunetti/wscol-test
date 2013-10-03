package org.xtext.example.xpt.generator;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Values;

public class Helper {
	
	public static String assertionFormToString(AssertionForm af) {
		return assertionToString(af.getLeftAssert()) + " " + af.getOp() + " " + assertionToString(af.getRightAssert());
	}

	public static String assertionToString(Assertion a) {
		String res = "";
		if(a.getQuery() != null){
			res = queryToString(a.getQuery());
		} else if(a.getConstant() != null) {
			if(a.getConstant().getString() == null){
				res = String.valueOf(a.getConstant().getNumber());
			} else {
				res = a.getConstant().getString();
			}
		} else if(a.getValues() != null) {
			res = valuesToList(a.getValues()).toString();
		}
		if (a.getFunction() != null) {
			res += '.' + a.getFunction();
		}
		return res;
	}
	
	public static String queryToString(Query q) {
		String res = "";
		Attribute attribute = null;
		for (int i = 0; i < q.getSteps().size(); i++) {
			if (q.getSteps().get(i).getPlaceholder() != null) {
				res = q.getSteps().get(i).getPlaceholder();
			} else {
				res += '/' + q.getSteps().get(i).getName();
				attribute = q.getSteps().get(i).getAttribute();
				if (attribute != null) {
					String property = attribute.getProperty();
					String operation = attribute.getOp();
					double value = attribute.getNumber();
					double intValue = attribute.getNumberValue();
					res += '[';
					if (property != null && operation != null) {
						res += property + operation;
						if (attribute.getStrValue() != null) {
							res += '"' + attribute.getStrValue() + '"' + ']';
						} else {
							res += String.valueOf(intValue) + ']';
						}
					} else {
						res += String.valueOf(value) + ']';
					}
				}
			}
		}
		return res;
	}
	
	public static List<Object> valuesToList(Values values){
		List<Object> result = new ArrayList<>();
		for(Constant c : values.getValue()){
			if(c.getString() != null){
				result.add(c.getString());
			} else {
				result.add(c.getNumber());
			}
		}
		return result;
	}
	
}
