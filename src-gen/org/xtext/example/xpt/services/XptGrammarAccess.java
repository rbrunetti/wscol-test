/*
* generated by Xtext
*/
package org.xtext.example.xpt.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class XptGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationsAssignment_0.eContents().get(0);
		private final Assignment cAssertionSetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAssertionSetAssertionSetParserRuleCall_1_0 = (RuleCall)cAssertionSetAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Model:
		//	declarations+=Declaration* assertionSet=AssertionSet ";";
		public ParserRule getRule() { return rule; }

		//declarations+=Declaration* assertionSet=AssertionSet ";"
		public Group getGroup() { return cGroup; }

		//declarations+=Declaration*
		public Assignment getDeclarationsAssignment_0() { return cDeclarationsAssignment_0; }

		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_0_0() { return cDeclarationsDeclarationParserRuleCall_0_0; }

		//assertionSet=AssertionSet
		public Assignment getAssertionSetAssignment_1() { return cAssertionSetAssignment_1; }

		//AssertionSet
		public RuleCall getAssertionSetAssertionSetParserRuleCall_1_0() { return cAssertionSetAssertionSetParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVarVariableParserRuleCall_1_0 = (RuleCall)cVarAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAssertAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssertAssertionParserRuleCall_3_0 = (RuleCall)cAssertAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Declaration:
		//	"let" var=Variable "=" assert=Assertion ";";
		public ParserRule getRule() { return rule; }

		//"let" var=Variable "=" assert=Assertion ";"
		public Group getGroup() { return cGroup; }

		//"let"
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }

		//var=Variable
		public Assignment getVarAssignment_1() { return cVarAssignment_1; }

		//Variable
		public RuleCall getVarVariableParserRuleCall_1_0() { return cVarVariableParserRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//assert=Assertion
		public Assignment getAssertAssignment_3() { return cAssertAssignment_3; }

		//Assertion
		public RuleCall getAssertAssertionParserRuleCall_3_0() { return cAssertAssertionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class AssertionSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssertionSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAssertionAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAssertionSetLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAssertionAndParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AssertionSet returns Assertions:
		//	AssertionAnd ({AssertionSet.left=current} "||" right=AssertionAnd)*;
		public ParserRule getRule() { return rule; }

		//AssertionAnd ({AssertionSet.left=current} "||" right=AssertionAnd)*
		public Group getGroup() { return cGroup; }

		//AssertionAnd
		public RuleCall getAssertionAndParserRuleCall_0() { return cAssertionAndParserRuleCall_0; }

		//({AssertionSet.left=current} "||" right=AssertionAnd)*
		public Group getGroup_1() { return cGroup_1; }

		//{AssertionSet.left=current}
		public Action getAssertionSetLeftAction_1_0() { return cAssertionSetLeftAction_1_0; }

		//"||"
		public Keyword getVerticalLineVerticalLineKeyword_1_1() { return cVerticalLineVerticalLineKeyword_1_1; }

		//right=AssertionAnd
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//AssertionAnd
		public RuleCall getRightAssertionAndParserRuleCall_1_2_0() { return cRightAssertionAndParserRuleCall_1_2_0; }
	}

	public class AssertionAndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssertionAnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cHighProrityAssertionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAssertionAndLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightHighProrityAssertionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AssertionAnd returns Assertions:
		//	HighProrityAssertion ({AssertionAnd.left=current} "&&" right=HighProrityAssertion)*;
		public ParserRule getRule() { return rule; }

		//HighProrityAssertion ({AssertionAnd.left=current} "&&" right=HighProrityAssertion)*
		public Group getGroup() { return cGroup; }

		//HighProrityAssertion
		public RuleCall getHighProrityAssertionParserRuleCall_0() { return cHighProrityAssertionParserRuleCall_0; }

		//({AssertionAnd.left=current} "&&" right=HighProrityAssertion)*
		public Group getGroup_1() { return cGroup_1; }

		//{AssertionAnd.left=current}
		public Action getAssertionAndLeftAction_1_0() { return cAssertionAndLeftAction_1_0; }

		//"&&"
		public Keyword getAmpersandAmpersandKeyword_1_1() { return cAmpersandAmpersandKeyword_1_1; }

		//right=HighProrityAssertion
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//HighProrityAssertion
		public RuleCall getRightHighProrityAssertionParserRuleCall_1_2_0() { return cRightHighProrityAssertionParserRuleCall_1_2_0; }
	}

	public class HighProrityAssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "HighProrityAssertion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNegatedFormulaParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBracedFormulaParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAssertionFormParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//HighProrityAssertion returns Assertions:
		//	NegatedFormula | BracedFormula | //| QuantifiedFormula 
		//	AssertionForm;
		public ParserRule getRule() { return rule; }

		//NegatedFormula | BracedFormula | //| QuantifiedFormula 
		//AssertionForm
		public Alternatives getAlternatives() { return cAlternatives; }

		//NegatedFormula
		public RuleCall getNegatedFormulaParserRuleCall_0() { return cNegatedFormulaParserRuleCall_0; }

		//BracedFormula
		public RuleCall getBracedFormulaParserRuleCall_1() { return cBracedFormulaParserRuleCall_1; }

		////| QuantifiedFormula 
		//AssertionForm
		public RuleCall getAssertionFormParserRuleCall_2() { return cAssertionFormParserRuleCall_2; }
	}

	public class NegatedFormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NegatedFormula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInnerFormulaAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInnerFormulaAssertionSetParserRuleCall_1_0 = (RuleCall)cInnerFormulaAssignment_1.eContents().get(0);
		
		////QuantifiedFormula:
		////	quantifier = Quantifier '[' variables+=LOWERCASE_ID (',' variables += LOWERCASE_ID)* ']' innerFormula = LowBindFormula
		////;
		//NegatedFormula:
		//	"!" innerFormula=AssertionSet;
		public ParserRule getRule() { return rule; }

		//"!" innerFormula=AssertionSet
		public Group getGroup() { return cGroup; }

		//"!"
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }

		//innerFormula=AssertionSet
		public Assignment getInnerFormulaAssignment_1() { return cInnerFormulaAssignment_1; }

		//AssertionSet
		public RuleCall getInnerFormulaAssertionSetParserRuleCall_1_0() { return cInnerFormulaAssertionSetParserRuleCall_1_0; }
	}

	public class BracedFormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BracedFormula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAssertionSetParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//BracedFormula returns Assertions:
		//	"(" AssertionSet ")";
		public ParserRule getRule() { return rule; }

		//"(" AssertionSet ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//AssertionSet
		public RuleCall getAssertionSetParserRuleCall_1() { return cAssertionSetParserRuleCall_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class AssertionFormElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssertionForm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssertAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftAssertAssertionParserRuleCall_0_0 = (RuleCall)cLeftAssertAssignment_0.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpRopParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cRightAssertAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightAssertAssertionParserRuleCall_2_0 = (RuleCall)cRightAssertAssignment_2.eContents().get(0);
		
		//AssertionForm:
		//	leftAssert=Assertion op=Rop rightAssert=Assertion;
		public ParserRule getRule() { return rule; }

		//leftAssert=Assertion op=Rop rightAssert=Assertion
		public Group getGroup() { return cGroup; }

		//leftAssert=Assertion
		public Assignment getLeftAssertAssignment_0() { return cLeftAssertAssignment_0; }

		//Assertion
		public RuleCall getLeftAssertAssertionParserRuleCall_0_0() { return cLeftAssertAssertionParserRuleCall_0_0; }

		//op=Rop
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }

		//Rop
		public RuleCall getOpRopParserRuleCall_1_0() { return cOpRopParserRuleCall_1_0; }

		//rightAssert=Assertion
		public Assignment getRightAssertAssignment_2() { return cRightAssertAssignment_2; }

		//Assertion
		public RuleCall getRightAssertAssertionParserRuleCall_2_0() { return cRightAssertAssertionParserRuleCall_2_0; }
	}

	public class AssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Assertion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cQueryAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cQueryQueryParserRuleCall_0_0_0 = (RuleCall)cQueryAssignment_0_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Keyword cFullStopKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cFunctionAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cFunctionFunctionParserRuleCall_0_1_1_0 = (RuleCall)cFunctionAssignment_0_1_1.eContents().get(0);
		private final Assignment cConstantAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cConstantConstantParserRuleCall_1_0 = (RuleCall)cConstantAssignment_1.eContents().get(0);
		
		//Assertion:
		//	query=Query ("." function=Function)? | constant=Constant;
		public ParserRule getRule() { return rule; }

		//query=Query ("." function=Function)? | constant=Constant
		public Alternatives getAlternatives() { return cAlternatives; }

		//query=Query ("." function=Function)?
		public Group getGroup_0() { return cGroup_0; }

		//query=Query
		public Assignment getQueryAssignment_0_0() { return cQueryAssignment_0_0; }

		//Query
		public RuleCall getQueryQueryParserRuleCall_0_0_0() { return cQueryQueryParserRuleCall_0_0_0; }

		//("." function=Function)?
		public Group getGroup_0_1() { return cGroup_0_1; }

		//"."
		public Keyword getFullStopKeyword_0_1_0() { return cFullStopKeyword_0_1_0; }

		//function=Function
		public Assignment getFunctionAssignment_0_1_1() { return cFunctionAssignment_0_1_1; }

		//Function
		public RuleCall getFunctionFunctionParserRuleCall_0_1_1_0() { return cFunctionFunctionParserRuleCall_0_1_1_0; }

		//constant=Constant
		public Assignment getConstantAssignment_1() { return cConstantAssignment_1; }

		//Constant
		public RuleCall getConstantConstantParserRuleCall_1_0() { return cConstantConstantParserRuleCall_1_0; }
	}

	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Query");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cStepsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cStepsStepParserRuleCall_0_1_0 = (RuleCall)cStepsAssignment_0_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cStepsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStepsStepParserRuleCall_1_0 = (RuleCall)cStepsAssignment_1.eContents().get(0);
		
		//Query:
		//	"(" steps+=Step+ ")" | steps+=Step+;
		public ParserRule getRule() { return rule; }

		//"(" steps+=Step+ ")" | steps+=Step+
		public Alternatives getAlternatives() { return cAlternatives; }

		//"(" steps+=Step+ ")"
		public Group getGroup_0() { return cGroup_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }

		//steps+=Step+
		public Assignment getStepsAssignment_0_1() { return cStepsAssignment_0_1; }

		//Step
		public RuleCall getStepsStepParserRuleCall_0_1_0() { return cStepsStepParserRuleCall_0_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }

		//steps+=Step+
		public Assignment getStepsAssignment_1() { return cStepsAssignment_1; }

		//Step
		public RuleCall getStepsStepParserRuleCall_1_0() { return cStepsStepParserRuleCall_1_0; }
	}

	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Step");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cSolidusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cAttributeAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cAttributeAttributeParserRuleCall_0_2_1_0 = (RuleCall)cAttributeAssignment_0_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_2_2 = (Keyword)cGroup_0_2.eContents().get(2);
		private final Assignment cPlaceholderAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cPlaceholderVariableParserRuleCall_1_0 = (RuleCall)cPlaceholderAssignment_1.eContents().get(0);
		
		//Step:
		//	"/" name=ID ("[" attribute=Attribute "]")? | placeholder=Variable;
		public ParserRule getRule() { return rule; }

		//"/" name=ID ("[" attribute=Attribute "]")? | placeholder=Variable
		public Alternatives getAlternatives() { return cAlternatives; }

		//"/" name=ID ("[" attribute=Attribute "]")?
		public Group getGroup_0() { return cGroup_0; }

		//"/"
		public Keyword getSolidusKeyword_0_0() { return cSolidusKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }

		//("[" attribute=Attribute "]")?
		public Group getGroup_0_2() { return cGroup_0_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0_2_0() { return cLeftSquareBracketKeyword_0_2_0; }

		//attribute=Attribute
		public Assignment getAttributeAssignment_0_2_1() { return cAttributeAssignment_0_2_1; }

		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_0_2_1_0() { return cAttributeAttributeParserRuleCall_0_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_0_2_2() { return cRightSquareBracketKeyword_0_2_2; }

		//placeholder=Variable
		public Assignment getPlaceholderAssignment_1() { return cPlaceholderAssignment_1; }

		//Variable
		public RuleCall getPlaceholderVariableParserRuleCall_1_0() { return cPlaceholderVariableParserRuleCall_1_0; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cPropertyAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cPropertyIDTerminalRuleCall_0_0_0 = (RuleCall)cPropertyAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cAlternatives_0_1.eContents().get(0);
		private final Assignment cOpAssignment_0_1_0_0 = (Assignment)cGroup_0_1_0.eContents().get(0);
		private final RuleCall cOpRopParserRuleCall_0_1_0_0_0 = (RuleCall)cOpAssignment_0_1_0_0.eContents().get(0);
		private final Assignment cIntValueAssignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cIntValueNUMBERTerminalRuleCall_0_1_0_1_0 = (RuleCall)cIntValueAssignment_0_1_0_1.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cAlternatives_0_1.eContents().get(1);
		private final Assignment cOpAssignment_0_1_1_0 = (Assignment)cGroup_0_1_1.eContents().get(0);
		private final RuleCall cOpStringRopParserRuleCall_0_1_1_0_0 = (RuleCall)cOpAssignment_0_1_1_0.eContents().get(0);
		private final Assignment cStrValueAssignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cStrValueSTRINGTerminalRuleCall_0_1_1_1_0 = (RuleCall)cStrValueAssignment_0_1_1_1.eContents().get(0);
		private final Assignment cIntAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntNUMBERTerminalRuleCall_1_0 = (RuleCall)cIntAssignment_1.eContents().get(0);
		
		//Attribute:
		//	property=ID (op=Rop intValue=NUMBER | op=StringRop strValue=STRING) | int=NUMBER;
		public ParserRule getRule() { return rule; }

		//property=ID (op=Rop intValue=NUMBER | op=StringRop strValue=STRING) | int=NUMBER
		public Alternatives getAlternatives() { return cAlternatives; }

		//property=ID (op=Rop intValue=NUMBER | op=StringRop strValue=STRING)
		public Group getGroup_0() { return cGroup_0; }

		//property=ID
		public Assignment getPropertyAssignment_0_0() { return cPropertyAssignment_0_0; }

		//ID
		public RuleCall getPropertyIDTerminalRuleCall_0_0_0() { return cPropertyIDTerminalRuleCall_0_0_0; }

		//op=Rop intValue=NUMBER | op=StringRop strValue=STRING
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//op=Rop intValue=NUMBER
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }

		//op=Rop
		public Assignment getOpAssignment_0_1_0_0() { return cOpAssignment_0_1_0_0; }

		//Rop
		public RuleCall getOpRopParserRuleCall_0_1_0_0_0() { return cOpRopParserRuleCall_0_1_0_0_0; }

		//intValue=NUMBER
		public Assignment getIntValueAssignment_0_1_0_1() { return cIntValueAssignment_0_1_0_1; }

		//NUMBER
		public RuleCall getIntValueNUMBERTerminalRuleCall_0_1_0_1_0() { return cIntValueNUMBERTerminalRuleCall_0_1_0_1_0; }

		//op=StringRop strValue=STRING
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }

		//op=StringRop
		public Assignment getOpAssignment_0_1_1_0() { return cOpAssignment_0_1_1_0; }

		//StringRop
		public RuleCall getOpStringRopParserRuleCall_0_1_1_0_0() { return cOpStringRopParserRuleCall_0_1_1_0_0; }

		//strValue=STRING
		public Assignment getStrValueAssignment_0_1_1_1() { return cStrValueAssignment_0_1_1_1; }

		//STRING
		public RuleCall getStrValueSTRINGTerminalRuleCall_0_1_1_1_0() { return cStrValueSTRINGTerminalRuleCall_0_1_1_1_0; }

		//int=NUMBER
		public Assignment getIntAssignment_1() { return cIntAssignment_1; }

		//NUMBER
		public RuleCall getIntNUMBERTerminalRuleCall_1_0() { return cIntNUMBERTerminalRuleCall_1_0; }
	}

	public class StringRopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringRop");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cExclamationMarkEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//StringRop:
		//	"=" | "!=";
		public ParserRule getRule() { return rule; }

		//"=" | "!="
		public Alternatives getAlternatives() { return cAlternatives; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//"!="
		public Keyword getExclamationMarkEqualsSignKeyword_1() { return cExclamationMarkEqualsSignKeyword_1; }
	}

	public class RopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rop");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringRopParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLessThanSignEqualsSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cGreaterThanSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//Rop:
		//	StringRop | "<" | "<=" | ">" | ">=";
		public ParserRule getRule() { return rule; }

		//StringRop | "<" | "<=" | ">" | ">="
		public Alternatives getAlternatives() { return cAlternatives; }

		//StringRop
		public RuleCall getStringRopParserRuleCall_0() { return cStringRopParserRuleCall_0; }

		//"<"
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }

		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_2() { return cLessThanSignEqualsSignKeyword_2; }

		//">"
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }

		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_4() { return cGreaterThanSignEqualsSignKeyword_4; }
	}

	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Function");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cUppercaseKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLengthKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Function:
		//	"uppercase" | "length" | ID;
		public ParserRule getRule() { return rule; }

		//"uppercase" | "length" | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//"uppercase"
		public Keyword getUppercaseKeyword_0() { return cUppercaseKeyword_0; }

		//"length"
		public Keyword getLengthKeyword_1() { return cLengthKeyword_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}

	public class ConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Constant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConstantAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cIntAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cIntNUMBERTerminalRuleCall_1_0_0 = (RuleCall)cIntAssignment_1_0.eContents().get(0);
		private final Assignment cStringAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cStringSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cStringAssignment_1_1.eContents().get(0);
		
		//Constant:
		//	{Constant} (int=NUMBER | string=STRING);
		public ParserRule getRule() { return rule; }

		//{Constant} (int=NUMBER | string=STRING)
		public Group getGroup() { return cGroup; }

		//{Constant}
		public Action getConstantAction_0() { return cConstantAction_0; }

		//int=NUMBER | string=STRING
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//int=NUMBER
		public Assignment getIntAssignment_1_0() { return cIntAssignment_1_0; }

		//NUMBER
		public RuleCall getIntNUMBERTerminalRuleCall_1_0_0() { return cIntNUMBERTerminalRuleCall_1_0_0; }

		//string=STRING
		public Assignment getStringAssignment_1_1() { return cStringAssignment_1_1; }

		//STRING
		public RuleCall getStringSTRINGTerminalRuleCall_1_1_0() { return cStringSTRINGTerminalRuleCall_1_1_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDollarSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		////Quantifier:
		////	'forall' | 'exists' | 'numOf'
		////;
		//Variable:
		//	"$" ID;
		public ParserRule getRule() { return rule; }

		//"$" ID
		public Group getGroup() { return cGroup; }

		//"$"
		public Keyword getDollarSignKeyword_0() { return cDollarSignKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private ModelElements pModel;
	private DeclarationElements pDeclaration;
	private AssertionSetElements pAssertionSet;
	private AssertionAndElements pAssertionAnd;
	private HighProrityAssertionElements pHighProrityAssertion;
	private NegatedFormulaElements pNegatedFormula;
	private BracedFormulaElements pBracedFormula;
	private AssertionFormElements pAssertionForm;
	private AssertionElements pAssertion;
	private QueryElements pQuery;
	private StepElements pStep;
	private AttributeElements pAttribute;
	private StringRopElements pStringRop;
	private RopElements pRop;
	private FunctionElements pFunction;
	private ConstantElements pConstant;
	private VariableElements pVariable;
	private TerminalRule tNUMBER;
	private TerminalRule tINT;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public XptGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.xpt.Xpt".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	declarations+=Declaration* assertionSet=AssertionSet ";";
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Declaration:
	//	"let" var=Variable "=" assert=Assertion ";";
	public DeclarationElements getDeclarationAccess() {
		return (pDeclaration != null) ? pDeclaration : (pDeclaration = new DeclarationElements());
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}

	//AssertionSet returns Assertions:
	//	AssertionAnd ({AssertionSet.left=current} "||" right=AssertionAnd)*;
	public AssertionSetElements getAssertionSetAccess() {
		return (pAssertionSet != null) ? pAssertionSet : (pAssertionSet = new AssertionSetElements());
	}
	
	public ParserRule getAssertionSetRule() {
		return getAssertionSetAccess().getRule();
	}

	//AssertionAnd returns Assertions:
	//	HighProrityAssertion ({AssertionAnd.left=current} "&&" right=HighProrityAssertion)*;
	public AssertionAndElements getAssertionAndAccess() {
		return (pAssertionAnd != null) ? pAssertionAnd : (pAssertionAnd = new AssertionAndElements());
	}
	
	public ParserRule getAssertionAndRule() {
		return getAssertionAndAccess().getRule();
	}

	//HighProrityAssertion returns Assertions:
	//	NegatedFormula | BracedFormula | //| QuantifiedFormula 
	//	AssertionForm;
	public HighProrityAssertionElements getHighProrityAssertionAccess() {
		return (pHighProrityAssertion != null) ? pHighProrityAssertion : (pHighProrityAssertion = new HighProrityAssertionElements());
	}
	
	public ParserRule getHighProrityAssertionRule() {
		return getHighProrityAssertionAccess().getRule();
	}

	////QuantifiedFormula:
	////	quantifier = Quantifier '[' variables+=LOWERCASE_ID (',' variables += LOWERCASE_ID)* ']' innerFormula = LowBindFormula
	////;
	//NegatedFormula:
	//	"!" innerFormula=AssertionSet;
	public NegatedFormulaElements getNegatedFormulaAccess() {
		return (pNegatedFormula != null) ? pNegatedFormula : (pNegatedFormula = new NegatedFormulaElements());
	}
	
	public ParserRule getNegatedFormulaRule() {
		return getNegatedFormulaAccess().getRule();
	}

	//BracedFormula returns Assertions:
	//	"(" AssertionSet ")";
	public BracedFormulaElements getBracedFormulaAccess() {
		return (pBracedFormula != null) ? pBracedFormula : (pBracedFormula = new BracedFormulaElements());
	}
	
	public ParserRule getBracedFormulaRule() {
		return getBracedFormulaAccess().getRule();
	}

	//AssertionForm:
	//	leftAssert=Assertion op=Rop rightAssert=Assertion;
	public AssertionFormElements getAssertionFormAccess() {
		return (pAssertionForm != null) ? pAssertionForm : (pAssertionForm = new AssertionFormElements());
	}
	
	public ParserRule getAssertionFormRule() {
		return getAssertionFormAccess().getRule();
	}

	//Assertion:
	//	query=Query ("." function=Function)? | constant=Constant;
	public AssertionElements getAssertionAccess() {
		return (pAssertion != null) ? pAssertion : (pAssertion = new AssertionElements());
	}
	
	public ParserRule getAssertionRule() {
		return getAssertionAccess().getRule();
	}

	//Query:
	//	"(" steps+=Step+ ")" | steps+=Step+;
	public QueryElements getQueryAccess() {
		return (pQuery != null) ? pQuery : (pQuery = new QueryElements());
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}

	//Step:
	//	"/" name=ID ("[" attribute=Attribute "]")? | placeholder=Variable;
	public StepElements getStepAccess() {
		return (pStep != null) ? pStep : (pStep = new StepElements());
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}

	//Attribute:
	//	property=ID (op=Rop intValue=NUMBER | op=StringRop strValue=STRING) | int=NUMBER;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//StringRop:
	//	"=" | "!=";
	public StringRopElements getStringRopAccess() {
		return (pStringRop != null) ? pStringRop : (pStringRop = new StringRopElements());
	}
	
	public ParserRule getStringRopRule() {
		return getStringRopAccess().getRule();
	}

	//Rop:
	//	StringRop | "<" | "<=" | ">" | ">=";
	public RopElements getRopAccess() {
		return (pRop != null) ? pRop : (pRop = new RopElements());
	}
	
	public ParserRule getRopRule() {
		return getRopAccess().getRule();
	}

	//Function:
	//	"uppercase" | "length" | ID;
	public FunctionElements getFunctionAccess() {
		return (pFunction != null) ? pFunction : (pFunction = new FunctionElements());
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}

	//Constant:
	//	{Constant} (int=NUMBER | string=STRING);
	public ConstantElements getConstantAccess() {
		return (pConstant != null) ? pConstant : (pConstant = new ConstantElements());
	}
	
	public ParserRule getConstantRule() {
		return getConstantAccess().getRule();
	}

	////Quantifier:
	////	'forall' | 'exists' | 'numOf'
	////;
	//Variable:
	//	"$" ID;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//terminal NUMBER returns ecore::EDouble:
	//	"0".."9"* ("." "0".."9"+)?;
	public TerminalRule getNUMBERRule() {
		return (tNUMBER != null) ? tNUMBER : (tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NUMBER"));
	} 

	//// override della regola di default
	//terminal INT returns ecore::EInt:
	//	"this one has been deactivated";
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
