package org.xtext.example.xpt.generator;

import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Query;

public class Helper {
	
	public static String assertionFormToString(AssertionForm af) {
		return assertionToString(af.getLeftAssert()) + " " + af.getOp() + " " + assertionToString(af.getRightAssert());
	}

	public static String assertionToString(Assertion a) {
		String res = "";
		if(a.getQuery() != null){
			res = queryToString(a.getQuery());
		} else if(a.getConstant().getString() == null){
			res = String.valueOf(a.getConstant().getInt());
		} else {
			res = a.getConstant().getString();
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
					double value = attribute.getInt();
					double intValue = attribute.getIntValue();
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
	
}
