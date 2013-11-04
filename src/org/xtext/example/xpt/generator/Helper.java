package org.xtext.example.xpt.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionAnd;
import org.xtext.example.xpt.xpt.AssertionBraced;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.AssertionOr;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.AssertionStdCmp;
import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Predicate;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Value;
import org.xtext.example.xpt.xpt.Values;

public class Helper {

	/**
	 * Generates the {@link String} representation of an {@link AssertionForm}
	 * 
	 * @param af the {@link AssertionForm} to represent
	 * @return a {@link String} representing the passed {@link AssertionForm}
	 */
	public static String assertionFormToString(AssertionForm af) {
		if (af instanceof AssertionStdCmp) {
			return assertionToString(((AssertionStdCmp) af).getLeftAssert()) + " " + ((AssertionStdCmp) af).getOp() + " " + assertionToString(((AssertionStdCmp) af).getRightAssert());
		} else if(af instanceof AssertionQuantified) {
			return assertionQuantifiedToString((AssertionQuantified) af);
		} else {
			return assertionToString((Assertion) af);
		}
	}

	/**
	 * Generates the {@link String} representation of a {@link Declaration}
	 * 
	 * @param d the {@link Declaration} to represent
	 * @return a {@link String} representing the passed {@link Declaration}
	 */
	public static String declarationToString(Declaration d) {
		return d.getVar() + " = " + assertionToString(d.getAssert());
	}

	/**
	 * Generates the {@link String} representation of a {@link Assertions}
	 * (parent of {@link AssertionOr}, {@link AssertionAnd}, {@link AssertionForm}, {@link AssertionNot} and {@link AssertionBraced})
	 * 
	 * @param a the {@link Assertions} to represent
	 * @return a {@link String} representing the passed {@link Assertions}
	 */
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
	
	/**
	 * Generates the {@link String} representation of a {@link AssertionQuantified}
	 * 
	 * @param aq the {@link AssertionQuantified} to represent
	 * @return the {@link String} representing the passed {@link AssertionQuantified}
	 */
	public static String assertionQuantifiedToString(AssertionQuantified aq) {
		return aq.getQuantifier() + "(" + aq.getAlias() + " in " + aq.getVar() + ", " + assertionsToString(aq.getConditions()) + ")";
	}

	/**
	 * Generate the {@link String} representation of an {@link Assertion}
	 * 
	 * @param a the {@link Assertion} to represent
	 * @return the {@link String} representing the passed {@link Assertion}
	 */
	public static String assertionToString(Assertion a) {
		if(a == null) return null;
		String res = "";
		if (a instanceof AssertionQuantified) {
			res = assertionQuantifiedToString((AssertionQuantified) a);
		} else if (!a.getSteps().isEmpty()) {
			res = queryToString(a.getSteps());
		} else if (a.getConstant() != null) {
			if (a.getConstant().getString() == null) {
				res = String.valueOf(a.getConstant().getNumber());
			} else {
				res = a.getConstant().getString();
			}
		} else if (a.getValues() != null) {
			res = valuesToList(a.getValues()).toString();
		} else {
			res = String.valueOf(a.isBool());
//			return null;
		}
		res += functionsToString(a.getFunctions());
		return res;
	}
	
	private static String functionsToString(EList<Function> functions) {
		String res = "";
		if (functions != null) {
			for(Function f:functions){
				String params = "";
				if (f.getParams() != null) {
					for (Value v : f.getParams().getValue()) {
						params += ((v instanceof Constant) 
								? constantToString((Constant) v) 
								: (Helper.queryToString(v.getSteps()) + Helper.functionsToString(v.getFunctions()))) + ", ";
					}
					params = params.substring(0, params.length() - 2); //delete the last ','
				}
				res += '.' + f.getName() + '(' + params + ')';
			}
		}
		return res;
	}

	/**
	 * Generate the {@link String} representation of an {@link Query}
	 * 
	 * @param q the {@link Query} to represent
	 * @return the {@link String} representing the passed {@link Query}
	 */
	public static String queryToString(EList<Step> steps) {
		String res = "";
		for (int i = 0; i < steps.size(); i++) {
			res += stepToString(steps.get(i));
		}
		return res;
	}

	/**
	 * Generate the {@link String} representation of a {@link Step}
	 * 
	 * @param s the {@link Step} to represent
	 * @return the {@link String} representing the passed {@link Step}
	 */
	public static String stepToString(Step s) {
		// if it is a variable
		if (s.getPlaceholder() != null) {
			return s.getPlaceholder();
		}
		
		String res = '/' + s.getName();
		Predicate attribute = s.getPredicate();
		
		// check if it contains an attribute
		if (attribute != null) {
			String property = attribute.getProperty();
			String operation = attribute.getOp();
			double value = attribute.getNumber();
			double numericValue = attribute.getNumberValue();
			res += '[';
			if (property != null && operation != null) {
				res += property + operation;
				if (attribute.getStrValue() != null) {
					res += '"' + attribute.getStrValue() + '"' + ']';
				} else if(attribute.getVarValue() != null) {
					res += attribute.getVarValue() + ']';
				} else {
					res += String.valueOf(numericValue) + ']';
				}
			} else { // it contains a variable or it's just the i-th selection
				res += ((attribute.getVar()!=null) ? attribute.getVar() : String.valueOf(value)) + ']';
			}
		}
		return res;
	}

	/**
	 * Generate the {@link String} representation of a {@link Values}
	 * 
	 * @param values the {@link Values} to represent
	 * @return the {@link String} representing the passed {@link Values}
	 */
	public static List<Object> valuesToList(Values values) {
		List<Object> result = new ArrayList<>();
		for (Value c : values.getValue()) {
			if (!c.getSteps().isEmpty()) {
				result.add(Helper.queryToString(c.getSteps()));
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

	/**
	 * Returns the {@link String} representation of the inner value of a {@link Constant}
	 * @param constant the {@link Constant} to represent
	 * @return the {@link String} representing the value of the passed {@link Constant}
	 */
	private static String constantToString(Constant constant) {
		if (constant.getString() != null) {
			return constant.getString();
		} else {
			return String.valueOf(constant.getNumber());
		}
	}

}
