/*
 * generated by me
 */
package org.xtext.example.xpt.generator;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.xpt.generator.dataobject.DataObject;
import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionAnd;
import org.xtext.example.xpt.xpt.AssertionBraced;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.AssertionOr;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Model;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	private static String queriesPath = "src/org/xtext/example/xpt/queries.xpt";
	private static String xmlFilePath = "src/org/xtext/example/xpt/book.xml";
	@SuppressWarnings("unused")
	private static String xmlFilePath2 = "src/org/xtext/example/xpt/book2.xml";

	private static Map<String, Object> variables = new HashMap<String, Object>();
	private static DataObject input = new DataObject();

	public static void main(String[] args) {
		Injector injector = new org.xtext.example.xpt.XptStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);

		File f = new File(queriesPath);
		String string = f.toURI().toString();

		main.runGenerator(string);
	}

	@SuppressWarnings("unused")
	private DataObject hashMapTest() {
		DataObject data = new DataObject();
		DataObject books = new DataObject();
		DataObject book1 = new DataObject();
		DataObject book2 = new DataObject();

		book1.put("title", "Snow Crash");
		book1.put("year", (double) 2000);
		book1.put("author", "Neal Stephenson");
		book1.put("publisher", "Spectra");
		book1.put("isbn", "0553380958");
		book1.put("price", (double) 15.0);
		books.put("book", book1);

		book2.put("title", "Burning Tower");
		book2.put("year", (double) 2005);
		book2.put("author", "Larry Niven");
		book2.put("author", "Jerry Pournelle");
		book2.put("publisher", "Pocket");
		book2.put("isbn", "0743416910");
		book2.put("price", (double) 5.99);
		books.put("book", book2);

		books.put("book", (double) 5);

		data.put("inventory", books);

		return data;
	}

	protected void runGenerator(String string) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(string), true);
		
		if(syntaxErrors(resource)) {
			return;
		}

		// get contents
		Model model = (Model) resource.getContents().get(0);
		EObjectContainmentEList<Declaration> declarations = (EObjectContainmentEList<Declaration>) model.getDeclarations();
		Assertions assertionSet = model.getAssertionSet();

		// number of assertions
		int count = 0;
		TreeIterator<EObject> a = assertionSet.eAllContents();
		if (assertionSet instanceof AssertionForm) {
			count = count + 1;
		}
		while (a.hasNext()) {
			EObject next = a.next();
			if (next instanceof AssertionForm) {
				count = count + 1;
			}
		}

		// get input: via xml parsing or passed DataObject
		input = new DataObject(xmlFilePath);
		// input = hashMapTest(); // load input from a DataObject
		System.out.println("################## INPUT ###################\n" + input + "\n");

		if (count == 0) {
			System.out.println("No assertions. Execution halted.");
			return;
		}

		System.out.println("################## RULES ###################");
		System.out.println(declarations.size() + " variable declarated.");
		System.out.println(count + " assertions has been found.\n");

		// get variables declaration and sets the hashmap
		try {
			setVariable(declarations);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

		// verify the assertions
		System.out.println("\n################ ASSERTIONS ################");
		try {
			System.out.println("\nRESULT: " + verifyAssertions(assertionSet));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

	}

	/**
	 * Syntax error checking, with the indication of the erroneous token
	 * @param resource the result of the loading by the parser
	 * @return true if there is no errors, false otherwise
	 */
	private boolean syntaxErrors(Resource resource) {
		// syntax errors checking
		Iterable<INode> errors = ((XtextResource) resource).getParseResult().getSyntaxErrors();
		Iterator<INode> iter = errors.iterator();
		int number = resource.getErrors().size();
		
		if(number == 0) {
			return false;
		}
		
		System.err.println("**** MALFORMED ASSERTIONS ****\n*** " + number + " syntax errors found ***\n");

		INode errorNode = null;
		while (iter.hasNext()) {
			errorNode = iter.next();
			ICompositeNode parent = errorNode.getParent();
			EObject semanticElement = errorNode.getSemanticElement();
			int sl = errorNode.getStartLine();
			SyntaxErrorMessage errm = errorNode.getSyntaxErrorMessage();
			String erroneousToken = "";
			if (semanticElement instanceof AssertionForm) {
				erroneousToken = Helper.assertionFormToString((AssertionForm) semanticElement);
			} else if (semanticElement instanceof Assertion) {
				erroneousToken = Helper.assertionToString((Assertion) semanticElement);
			} else if (semanticElement instanceof Declaration) {
				erroneousToken = Helper.declarationToString((Declaration) semanticElement);
			} else if (semanticElement instanceof Query) {
				erroneousToken = Helper.queryToString((Query) semanticElement);
			} else if (semanticElement instanceof Step) {
				erroneousToken = Helper.stepToString((Step) semanticElement);
			} else {
				EObject parentSemanticElement = parent.getSemanticElement();
				while (erroneousToken.equals("")) {
					if (parentSemanticElement instanceof AssertionForm) {
						erroneousToken = Helper.assertionFormToString((AssertionForm) parentSemanticElement);
					} else if (parentSemanticElement instanceof Assertion) {
						erroneousToken = Helper.assertionToString((Assertion) parentSemanticElement);
					} else if (parentSemanticElement instanceof Declaration) {
						erroneousToken = Helper.declarationToString((Declaration) parentSemanticElement);
					} else if (parentSemanticElement instanceof Query) {
						erroneousToken = Helper.queryToString((Query) parentSemanticElement);
					} else if (parentSemanticElement instanceof Step) {
						erroneousToken = Helper.stepToString((Step) parentSemanticElement);
					} else {
						if(parentSemanticElement.eContainer() != null) {
							parentSemanticElement = parentSemanticElement.eContainer();
						} else { // we are in the root node
							break; //TODO come trattarlo...??
						}
					}
				}
			}
			System.err.println("ERROR: " + errm.getMessage() + " - line: " + sl + " - token: '" + erroneousToken + "'");
			
			// "table-formatted" output
			//System.err.printf("%-60s - %-8s - %-60s %n", "ERROR: " + errm.getMessage(), "line: " + sl, "token: " + erroneousToken);
		}
		return true;
	}
	
	/**
	 * Syntax errors checking with the validator
	 * TODO valuta se eliminabile
	 * @param resource
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean checkSyntaxErrorValidator(Resource resource){
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			System.err.println("*** MALFORMED ASSERTIONS ***");
			for (Issue issue : list) {
				URI problemURI = issue.getUriToProblem();
				String location = problemURI.fragment();
				String msg = issue.getMessage();
				Integer lineNumb = issue.getLineNumber();
				// Print out syntax errors
				System.err.println("ERROR:" + msg + " - line: " + lineNumb + " - " + location);
			}
			return true;
		}
		return false;
	}

	/**
	 * Method for the evaluation of the assertions, considering the operation (NOT, AND, OR) and the corresponding priority (NOT>AND>OR)
	 * 
	 * @param assertions
	 *            the list of assertions to evaluate
	 * @return true if the assertions are respected, false otherwise
	 * @throws Exception
	 *             if there are exception from the verification of the assertions
	 */
	public boolean verifyAssertions(Assertions assertions) throws Exception {
		EList<EObject> a = assertions.eContents();
		if (assertions instanceof AssertionAnd) {
			return (verifyAssertions((Assertions) a.get(0)) & verifyAssertions((Assertions) a.get(1)));
		} else if (assertions instanceof AssertionOr) {
			return (verifyAssertions((Assertions) a.get(0)) | verifyAssertions((Assertions) a.get(1)));
		} else if (assertions instanceof AssertionNot) {
			return !verifyAssertions(((AssertionNot) assertions).getInnerFormula());
		} else if (assertions instanceof AssertionBraced) {
			return verifyAssertions(((AssertionBraced) assertions).getInnerFormula());
		} else if (assertions instanceof AssertionQuantified) {
			return false;
		} else if (assertions instanceof AssertionForm) {
			return verifyAssertionForm((AssertionForm) assertions);
		}
		return false;
	}

	/**
	 * Check all the assertions
	 * 
	 * @param assertionSet
	 * @throws Exception
	 *             if there is data types conflicts
	 */
	private boolean verifyAssertionForm(AssertionForm af) throws Exception {
		Object laObj, raObj;
		String operation;

		laObj = doQueries(af.getLeftAssert());

		// check if the AssertionForm is of type AssertionQualifiedBoolean (so without the '= true' explicitly specified)
		if (af.getOp() == null && af.getRightAssert() == null) {
			operation = "=";
			raObj = true;
		} else {
			operation = af.getOp(); // get Op for using it for the comparisons
			raObj = doQueries(af.getRightAssert());
		}

		String condition = Helper.assertionFormToString(af);

		// check the objects class and evaluate the corresponding assertion
		if (laObj instanceof Double && raObj instanceof Double) {
			return numericAssertion((double) laObj, (double) raObj, operation, condition);
		} else if (laObj instanceof String && raObj instanceof String) {
			return stringAssertion((String) laObj, (String) raObj, operation, condition);
		} else if (laObj instanceof DataObject && raObj instanceof DataObject) {
			return dataobjectAssertion((DataObject) laObj, (DataObject) raObj, operation, condition);
		} else if (laObj instanceof Boolean && raObj instanceof Boolean) {
			return booleanAssertion((boolean) laObj, (boolean) raObj, operation, condition);
		} else if (laObj != null && raObj != null) {
			String msg = "Assertion " + condition + " could not be evaluated due to data types conflicts.";
			if (laObj instanceof DataObject && ((DataObject) laObj).isEmpty()) {
				msg += "\n NOTE: '" + Helper.assertionToString(af.getLeftAssert()) + "' gives empty result.";
			}
			if (raObj instanceof DataObject && ((DataObject) raObj).isEmpty()) {
				msg += "\n NOTE: '" + Helper.assertionToString(af.getRightAssert()) + "' gives empty result.";
			}
			msg += "\n Left assertion = " + laObj + " [Class: " + laObj.getClass().getSimpleName() + "]";
			msg += "\n Right assertion = " + raObj + " [Class: " + raObj.getClass().getSimpleName() + "]";
			throw new Exception(msg);
		} else {
			throw new Exception("Unable to evaluate assertion '" + condition + "', due to erroneous variables declaration.");
		}
	}

	/**
	 * Method for the evaluation of numeric assertion
	 * 
	 * @param left
	 *            the result of the left assertion
	 * @param right
	 *            the result of the right assertion
	 * @param operation
	 *            a string containing the operation to evaluate
	 * @param condition
	 *            a string representation of the assertion
	 * @return true if the assertion is correct, false otherwise
	 */
	private boolean numericAssertion(double left, double right, String operation, String condition) {
		boolean result;
		switch (operation) {
		case ">":
			if (left > right) {
				result = true;
			} else {
				result = false;
			}
			break;
		case ">=":
			if (left >= right) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "<":
			if (left < right) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "<=":
			if (left <= right) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "=":
			if (left == right) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "!=":
			if (left != right) {
				result = true;
			} else {
				result = false;
			}
			break;
		default:
			result = false;
			break;
		}

		if (result) {
			System.out.println("Assertion '" + condition + "' is verified.");
		} else {
			System.out.println("Assertion '" + condition + "' is wrong.");
		}

		return result;
	}

	/**
	 * Method for the evaluation of string assertion
	 * 
	 * @param left
	 *            the result of the left assertion
	 * @param right
	 *            the result of the right assertion
	 * @param operation
	 *            a string containing the operation to evaluate
	 * @param condition
	 *            a string representation of the assertion
	 * @return true if the assertion is correct, false otherwise
	 * @throws Exception
	 *             if the operation is not supported
	 */
	private boolean stringAssertion(String left, String right, String operation, String condition) throws Exception {
		boolean result;
		switch (operation) {
		case "=":
			if (left.equals(right)) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "!=":
			if (!left.equals(right)) {
				result = true;
			} else {
				result = false;
			}
			break;
		default:
			String msg = "Unsopported operation '" + operation + "' for the assertion between two String: '" + condition + "'";
			msg += "\n Left assertion = '" + left + "' ";
			msg += "\n Right assertion = '" + right + "' ";
			throw new Exception(msg);
		}

		if (result) {
			System.out.println("Assertion '" + condition + "' is verified.");
		} else {
			System.out.println("Assertion '" + condition + "' is wrong.");
		}

		return result;
	}

	/**
	 * Method for the evaluation of boolean assertion
	 * 
	 * @param left
	 *            the result of the left assertion
	 * @param right
	 *            the result of the right assertion
	 * @param operation
	 *            a string containing the operation to evaluate
	 * @param condition
	 *            a string representation of the assertion
	 * @return true if the assertion is correct, false otherwise
	 * @throws Exception
	 *             if the operation is not supported
	 */
	private boolean booleanAssertion(boolean left, boolean right, String operation, String condition) throws Exception {
		boolean result;
		switch (operation) {
		case "=":
			result = left == right;
			break;
		case "!=":
			result = left != right;
			break;
		default:
			String msg = "Unsopported operation '" + operation + "' for the assertion between two Boolean: '" + condition + "'";
			msg += "\n Left assertion = '" + left + "' ";
			msg += "\n Right assertion = '" + right + "' ";
			throw new Exception(msg);
		}

		if (result) {
			System.out.println("Assertion '" + condition + "' is verified.");
		} else {
			System.out.println("Assertion '" + condition + "' is wrong.");
		}

		return result;
	}

	/**
	 * Method for the evaluation of DataObject assertion
	 * 
	 * @param left
	 *            the result of the left assertion
	 * @param right
	 *            the result of the right assertion
	 * @param operation
	 *            a string containing the operation to evaluate
	 * @param condition
	 *            a string representation of the assertion
	 * @return true if the assertion is correct, false otherwise
	 * @throws Exception
	 *             if the operation is not supported
	 */
	private boolean dataobjectAssertion(DataObject left, DataObject right, String operation, String condition) throws Exception {
		boolean result;
		switch (operation) {
		case "=":
			if (left.equals(right)) {
				result = true;
			} else {
				result = false;
			}
			break;
		case "!=":
			if (!left.equals(right)) {
				result = true;
			} else {
				result = false;
			}
			break;
		default:
			String msg = "Unsopported operation '" + operation + "' for the assertion between two DataObject: '" + condition + "'";
			msg += "\n Left assertion = '" + left + "' ";
			msg += "\n Right assertion = '" + right + "' ";
			throw new Exception(msg);
		}

		if (result) {
			System.out.println("Assertion '" + condition + "' is verified.");
		} else {
			System.out.println("Assertion '" + condition + "' is wrong.");
		}

		return result;
	}

	/**
	 * Print the result of the evaluation of queries
	 * 
	 * @throws Exception
	 *             if is used an empty variable for the assertion
	 * @throws Exception
	 *             if the variable
	 */
	private Object doQueries(Assertion assertion) throws Exception {

		if (assertion instanceof AssertionQuantified) {
			return doAssertionQuantified(assertion);
		}

		Object result = new Object();
		// if the assertion is a constant it's not going to be an xpath query
		if (assertion.getConstant() != null) {
			return ((assertion.getConstant().getString() == null) ? assertion.getConstant().getNumber() : assertion.getConstant().getString());
		}
		// look if there's a placeholder, if any substitute it with its values (note: the placeholder is always on the first step!)
		if (assertion.getQuery() != null) {
			String placeholder = assertion.getQuery().getSteps().get(0).getPlaceholder();

			if (placeholder != null) {
				if (!variables.containsKey(placeholder)) {
					throw new Exception("Variable '" + placeholder + "' is not defined.");
				}
				Object value = variables.get(placeholder);
				if (value instanceof DataObject) {
					if (assertion.getQuery().getSteps().size() > 1) { // if there query goes deeper
						result = ((DataObject) value).evaluate(assertion.getQuery());
						if (((DataObject) result).isSingleValue()) {
							result = ((DataObject) result).getFirst();
						}
					} else if (value instanceof String || value instanceof Double || value instanceof Boolean) {
						result = value;
					} else {
						if (((DataObject) value).isSingleValue()) {
							result = ((DataObject) value).getFirst();
						} else {
							result = value;
						}
					}
				} else {
					result = value;
				}
			} else {
				result = input.evaluate(assertion.getQuery());
				// if the DataObject is containing a single value it will be extrapolated from the Object
				if (((DataObject) result).isSingleValue()) {
					result = ((DataObject) result).getFirst();
				}
			}
		} else {
			result = assertion.isBoolean();
		}

		// *** FUNCTIONS ***
		if (assertion.getFunction() != null) {
			if (result instanceof DataObject) {
				// TODO
			} else if (result instanceof String) {
				result = applyStringFunctions(result, assertion.getFunction());
			} else if (result instanceof Double) {
				result = applyDoubleFunctions(result, assertion.getFunction());
			}
		}
		return result;
	}

	/**
	 * Evaluate a quantified assertion
	 * 
	 * @param assertion
	 *            the AssertionQuatified to evaluate
	 * @return a boolean if the quantifier is 'forall' or 'exists', otherwise a double in the case the quantifier is 'numOf'
	 * @throws Exception
	 *             if the selected variable is not of DataObject type and if the chosen variable alias is already used
	 */
	private Object doAssertionQuantified(Assertion assertion) throws Exception {
		AssertionQuantified aq = (AssertionQuantified) assertion;

		if (!(variables.containsKey(aq.getVar()))) {
			throw new Exception("The variable '" + aq.getVar() + "' is not defined.");

		}

		if (!(variables.get(aq.getVar()) instanceof DataObject)) {
			throw new Exception("Could not iterate over a " + variables.get(aq.getVar()).getClass().getName() + ". A DataObject type was expected.");
		}

		DataObject set = (DataObject) variables.get(aq.getVar());
		String alias = aq.getAlias();
		boolean result;
		double count, sum;

		if (variables.containsKey(alias)) {
			throw new Exception("The variable '" + alias + "' is already used. Choose another.");
		}

		Iterator<Object> iter = set.values().iterator();

		switch (aq.getQuantifier()) {
		case "forall":
			while (iter.hasNext()) {
				variables.put(alias, iter.next());
				result = verifyAssertions(aq.getConditions());
				if (!result) {
					variables.remove(alias);
					return false;
				}
			}
			return true;
		case "exists":
			result = false;
			while (iter.hasNext()) {
				variables.put(alias, iter.next());
				result = result | verifyAssertions(aq.getConditions());
			}
			variables.remove(alias);
			return true;
		case "numOf":
			count = 0;
			while (iter.hasNext()) {
				variables.put(alias, iter.next());
				if (verifyAssertions(aq.getConditions())) {
					count = count + 1;
				}
			}
			variables.remove(alias);
			return count;
		case "sum":
			sum = 0;
			while (iter.hasNext()) {
				Object next = iter.next();
				if (!(next instanceof Double)) {
					throw new Exception("The variable '" + aq.getVar() + "' contains an element of class '" + next.getClass().getSimpleName() + "'. Only Doubles are accepted by '" + aq.getQuantifier() + "' function.");
				}
				variables.put(alias, next);
				if (verifyAssertions(aq.getConditions())) {
					sum += (double) next;
				}
			}
			variables.remove(alias);
			return sum;
		case "avg":
			sum = 0;
			count = 0;
			while (iter.hasNext()) {
				Object next = iter.next();
				if (!(next instanceof Double)) {
					throw new Exception("The variable '" + aq.getVar() + "' contains an element of class '" + next.getClass().getSimpleName() + "'. Only Doubles are accepted by '" + aq.getQuantifier() + "' function.");
				}
				variables.put(alias, next);
				if (verifyAssertions(aq.getConditions())) {
					sum += (double) next;
					count += 1;
				}
			}
			variables.remove(alias);
			return sum / count;
		case "product":
			double product = 1;
			while (iter.hasNext()) {
				Object next = iter.next();
				if (!(next instanceof Double)) {
					throw new Exception("The variable '" + aq.getVar() + "' contains an element of class '" + next.getClass().getSimpleName() + "'. Only Doubles are accepted by '" + aq.getQuantifier() + "' function.");
				}
				variables.put(alias, next);
				if (verifyAssertions(aq.getConditions())) {
					product *= (double) next;
				}
			}
			variables.remove(alias);
			return product;
		case "max":
			double max = Double.NEGATIVE_INFINITY;
			while (iter.hasNext()) {
				Object next = iter.next();
				if (!(next instanceof Double)) {
					throw new Exception("The variable '" + aq.getVar() + "' contains an element of class '" + next.getClass().getSimpleName() + "'. Only Doubles are accepted by '" + aq.getQuantifier() + "' function.");
				}
				variables.put(alias, next);
				if (verifyAssertions(aq.getConditions())) {
					if ((double) next > max) {
						max = (double) next;
					}
				}
			}
			variables.remove(alias);
			return max;
		case "min":
			double min = Double.POSITIVE_INFINITY;
			while (iter.hasNext()) {
				Object next = iter.next();
				if (!(next instanceof Double)) {
					throw new Exception("The variable '" + aq.getVar() + "' contains an element of class '" + next.getClass().getSimpleName() + "'. Only Doubles are accepted by '" + aq.getQuantifier() + "' function.");
				}
				variables.put(alias, next);
				if (verifyAssertions(aq.getConditions())) {
					if ((double) next < min) {
						min = (double) next;
					}
				}
			}
			variables.remove(alias);
			return min;
		default:
			return null; // never reached: other cases are blocked by the grammar parser as errors
		}
	}

	/**
	 * List of functions for the String results
	 * 
	 * @param object
	 *            the String the elaborate
	 * @param function
	 *            the function and the parameters for the function
	 * @return the result of the function
	 */
	private Object applyStringFunctions(Object object, Function function) {
		EList<Constant> params = null;
		if (function.getParams() != null) {
			params = function.getParams().getValue();
		}
		switch (function.getName()) {
		case "uppercase":
			if (params == null) {
				return ((String) object).toUpperCase();
			} else {
				return null;
			}
		case "length":
			if (params == null) {
				return (double) ((String) object).length();
			} else {
				return null;
			}
		case "startsWith":
			if (params != null && params.size() == 1) {
				String prefix = (params.get(0).getString() != null) ? params.get(0).getString() : String.valueOf(params.get(0).getNumber());
				return ((String) object).startsWith(prefix);
			} else {
				return null;
			}
		case "endsWith":
			if (params != null && params.size() == 1) {
				String suffix = (params.get(0).getString() != null) ? params.get(0).getString() : String.valueOf(params.get(0).getNumber());
				return ((String) object).endsWith(suffix);
			} else {
				return null;
			}
		case "substring":
			if (params != null && params.size() == 2) {
				int beginIndex = (Math.rint(params.get(0).getNumber()) == params.get(0).getNumber()) ? (int) params.get(0).getNumber() : null;
				int endIndex = (Math.rint(params.get(1).getNumber()) == params.get(1).getNumber()) ? (int) params.get(1).getNumber() : null;
				return ((String) object).substring(beginIndex, endIndex);
			} else {
				return null;
			}
		case "replace":
			if (params != null && params.size() == 2) {
				return ((String) object).replace(params.get(0).getString(), params.get(1).getString());
			} else {
				return null;
			}
		default:
			return null;
		}
	}

	/**
	 * List of functions for the numeric results
	 * 
	 * @param object
	 *            the number (of type Double) the elaborate
	 * @param function
	 *            the function and the parameters for the function
	 * @return the result of the function
	 */
	private Object applyDoubleFunctions(Object object, Function function) {
		EList<Constant> params = null;
		if (function.getParams() != null) {
			params = function.getParams().getValue();
		}
		switch (function.getName()) {
		case "abs":
			if (params == null) {
				return Math.abs((double) object);
			} else {
				return null;
			}
		case "length":
			if (params == null) {
				return (double) String.valueOf((double) object).length();
			} else {
				return null;
			}
		default:
			return null;
		}
	}

	/**
	 * Set variables according to the declarations
	 * 
	 * @throws Exception
	 */
	private void setVariable(EObjectContainmentEList<Declaration> declarations) throws Exception {
		Object result = null;
		System.out.println("############### DECLARATIONS ###############");
		for (Declaration d : declarations) {
			if (variables.containsKey(d.getVar())) {
				throw new Exception("The variable '" + d.getVar() + "' in '" + Helper.declarationToString(d) + "' is already used (" + d.getVar() + " = " + variables.get(d.getVar()) + "). Choose another.");
			}
			if (d.getAssert().getConstant() != null) {
				if (d.getAssert().getConstant().getString() != null) {
					result = d.getAssert().getConstant().getString();
				} else {
					result = d.getAssert().getConstant().getNumber();
				}
			} else if (d.getAssert().getValues() != null) {
				result = new DataObject(d.getVar(), d.getAssert().getValues());
			} else if (d.getAssert().getQuery() != null) {
				String placeholder = d.getAssert().getQuery().getSteps().get(0).getPlaceholder();

				if (placeholder != null) {
					if (!variables.containsKey(placeholder)) {
						throw new Exception("Variable '" + placeholder + "' is not defined.");
					}

					Object value = variables.get(placeholder);
					if (value instanceof DataObject) {
						if (d.getAssert().getQuery().getSteps().size() > 1) { // if there query goes deeper
							try {
								result = ((DataObject) value).evaluate(d.getAssert().getQuery());
							} catch (Exception e) {
								throw new Exception("Unable to evaluate '" + d.getVar() + " = " + Helper.assertionToString(d.getAssert()) + "' declaration. Please check it.\n" + " CAUSE: " + e.getMessage());
							}
							// if the DataObject is containing a single value, only that single value is stored as variable
							if (((DataObject) result).isSingleValue()) {
								result = ((DataObject) result).getFirst();
							}
						} else if (value instanceof String || value instanceof Double || value instanceof Boolean) {
							result = value;
						} else {
							// if (((DataObject) value).isSingleValue()) {
							// result = ((DataObject) value).getFirst();
							// } else {
							result = value;
							// }
						}
					} else {
						result = value;
					}
				} else {
					try {
						result = input.evaluate(d.getAssert().getQuery());
					} catch (Exception e) {
						throw new Exception("Unable to evaluate '" + d.getVar() + " = " + Helper.assertionToString(d.getAssert()) + "' declaration. Please check it.\n" + " CAUSE: " + e.getMessage());
					}
					if (((DataObject) result).isSingleValue()) {
						result = ((DataObject) result).getFirst();
					}
				}

				// *** FUNCTIONS ***
				if (d.getAssert().getFunction() != null) {
					if (result instanceof DataObject) {
						// TODO
					} else if (result instanceof String) {
						result = applyStringFunctions(result, d.getAssert().getFunction());
					} else if (result instanceof Double) {
						result = applyDoubleFunctions(result, d.getAssert().getFunction());
					}
				}

			} else if (d.getAssert() instanceof AssertionQuantified) {
				result = doAssertionQuantified(d.getAssert());
			} else {
				result = d.getAssert().isBoolean();
			}

			variables.put(d.getVar(), result);
			System.out.println(Helper.declarationToString(d));
		}
		return;
	}

}