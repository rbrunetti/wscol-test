package org.xtext.example.xpt.generator;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionAnd;
import org.xtext.example.xpt.xpt.AssertionBraced;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.AssertionOr;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Value;
import org.xtext.example.xpt.xpt.Values;

public class Helper {

	public static String assertionFormToString(AssertionForm af) {
		if (af.getOp() == null && af.getRightAssert() == null) {
			return assertionToString(af.getLeftAssert());
		}
		return assertionToString(af.getLeftAssert()) + " " + af.getOp() + " " + assertionToString(af.getRightAssert());
	}

	public static String declarationToString(Declaration d) {
		return d.getVar() + " = " + assertionToString(d.getAssert());
	}

	public static String assertionsToString(Assertions a) {
		String res = "";
		if (a instanceof AssertionOr) {
			res = assertionsToString(((AssertionOr) a).getLeft()) + " || " + assertionsToString(((AssertionOr) a).getRight());
		} else if (a instanceof AssertionAnd) {
			res = assertionsToString(((AssertionAnd) a).getLeft()) + " && " + assertionsToString(((AssertionAnd) a).getRight());
		} else if (a instanceof AssertionNot) {
			res = "!(" + assertionsToString(((AssertionNot) a).getInnerFormula()) + ")";
		} else if (a instanceof AssertionBraced) {
			res = "(" + assertionsToString(((AssertionBraced) a).getInnerFormula()) + ")";
		} else if (a instanceof AssertionForm) {
			res = assertionFormToString((AssertionForm) a);
		}
		return res;
	}
	
	public static String assertionQuantifiedToString(AssertionQuantified aq) {
		return aq.getQuantifier() + "(" + aq.getAlias() + " in " + aq.getVar() + ", " + assertionsToString(aq.getConditions()) + ")";
	}

	public static String assertionToString(Assertion a) { // TODO sistemare!
		String res = "";
		if (a == null) {
			return null;
		}
		if (a.getQuery() != null) {
			res = queryToString(a.getQuery());
		} else if (a.getConstant() != null) {
			if (a.getConstant().getString() == null) {
				res = String.valueOf(a.getConstant().getNumber());
			} else {
				res = a.getConstant().getString();
			}
		} else if (a.getValues() != null) {
			res = valuesToList(a.getValues()).toString();
		} else if (a instanceof AssertionQuantified) {
			res = assertionQuantifiedToString((AssertionQuantified) a);
		} else {
			res = String.valueOf(a.isBoolean());
		}
		if (a.getFunction() != null) {
			String params = "";
			if (a.getFunction().getParams() != null) {
				for (Value v : a.getFunction().getParams().getValue()) {
					params += ((v instanceof Constant) ? constantToString((Constant) v) : v.getVar()) + ", ";
				}
				params = params.substring(0, params.length() - 2);
			}
			res += '.' + a.getFunction().getName() + '(' + params + ')';
		}
		return res;
	}

	public static String queryToString(Query q) {
		String res = "";
		for (int i = 0; i < q.getSteps().size(); i++) {
			res += stepToString(q.getSteps().get(i));
		}
		return res;
	}

	public static String stepToString(Step s) {
		if (s.getPlaceholder() != null) {
			return s.getPlaceholder();
		}
		String res = '/' + s.getName();
		Attribute attribute = s.getAttribute();
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
		return res;
	}

	private static List<Object> valuesToList(Values values) {
		List<Object> result = new ArrayList<>();
		for (Value c : values.getValue()) {
			if (c.getVar() != null) {
				result.add(c.getVar());
			} else if (c instanceof Constant) {
				if (((Constant) c).getString() != null) {
					result.add(((Constant) c).getString());
				} else {
					result.add(((Constant) c).getNumber());
				}
			} else {
				result.add(c);
			}
		}
		return result;
	}

	private static String constantToString(Constant constant) {
		if (constant.getString() != null) {
			return constant.getString();
		} else {
			return String.valueOf(constant.getNumber());
		}
	}

}
