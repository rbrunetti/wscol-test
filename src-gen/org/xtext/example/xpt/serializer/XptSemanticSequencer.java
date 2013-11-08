package org.xtext.example.xpt.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.xpt.services.XptGrammarAccess;
import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionAnd;
import org.xtext.example.xpt.xpt.AssertionBraced;
import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.AssertionOr;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.AssertionStdCmp;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Div;
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Minus;
import org.xtext.example.xpt.xpt.Model;
import org.xtext.example.xpt.xpt.Multi;
import org.xtext.example.xpt.xpt.Plus;
import org.xtext.example.xpt.xpt.Predicate;
import org.xtext.example.xpt.xpt.Rest;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Value;
import org.xtext.example.xpt.xpt.Values;
import org.xtext.example.xpt.xpt.XptPackage;

@SuppressWarnings("all")
public class XptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XptPackage.ASSERTION:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionBooleanRule() ||
				   context == grammarAccess.getAssertionFormRule() ||
				   context == grammarAccess.getAssertionHPRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0()) {
					sequence_AssertionBoolean(context, (Assertion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssertionRule()) {
					sequence_Assertion(context, (Assertion) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_AND:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0()) {
					sequence_AssertionAnd(context, (AssertionAnd) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_BRACED:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionBracedRule() ||
				   context == grammarAccess.getAssertionHPRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0()) {
					sequence_AssertionBraced(context, (AssertionBraced) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_NOT:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionHPRule() ||
				   context == grammarAccess.getAssertionNotRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0()) {
					sequence_AssertionNot(context, (AssertionNot) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_OR:
				if(context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0()) {
					sequence_AssertionOr(context, (AssertionOr) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_QUANTIFIED:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionFormRule() ||
				   context == grammarAccess.getAssertionHPRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0() ||
				   context == grammarAccess.getAssertionQuantifiedBooleanRule()) {
					sequence_AssertionQuantifiedBoolean(context, (AssertionQuantified) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getAssertionQuantifiedNumericRule()) {
					sequence_AssertionQuantifiedNumeric(context, (AssertionQuantified) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_STD_CMP:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionFormRule() ||
				   context == grammarAccess.getAssertionHPRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0() ||
				   context == grammarAccess.getAssertionStdCmpRule()) {
					sequence_AssertionStdCmp(context, (AssertionStdCmp) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.CONSTANT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.FUNCTION:
				if(context == grammarAccess.getFunctionBooleanRule()) {
					sequence_FunctionBoolean(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.REST:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Rest) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.STEP:
				if(context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.VALUE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.VALUES:
				if(context == grammarAccess.getValuesRule()) {
					sequence_Values(context, (Values) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AssertionAnd_AssertionAnd_1_0 right=AssertionHP)
	 */
	protected void sequence_AssertionAnd(EObject context, AssertionAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssertionAndAccess().getRightAssertionHPParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=Step+ functions+=Function* functions+=FunctionBoolean)
	 */
	protected void sequence_AssertionBoolean(EObject context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     innerFormula=AssertionOr
	 */
	protected void sequence_AssertionBraced(EObject context, AssertionBraced semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_BRACED__INNER_FORMULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_BRACED__INNER_FORMULA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionBracedAccess().getInnerFormulaAssertionOrParserRuleCall_1_0(), semanticObject.getInnerFormula());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     innerFormula=AssertionOr
	 */
	protected void sequence_AssertionNot(EObject context, AssertionNot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_NOT__INNER_FORMULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_NOT__INNER_FORMULA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionNotAccess().getInnerFormulaAssertionOrParserRuleCall_2_0(), semanticObject.getInnerFormula());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AssertionOr_AssertionOr_1_0 right=AssertionAnd)
	 */
	protected void sequence_AssertionOr(EObject context, AssertionOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssertionOrAccess().getRightAssertionAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quantifier=BoolQuantifier alias=Variable var=Variable conditions=AssertionOr)
	 */
	protected void sequence_AssertionQuantifiedBoolean(EObject context, AssertionQuantified semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (quantifier=NumbQuantifier alias=Variable var=Variable conditions=AssertionOr)
	 */
	protected void sequence_AssertionQuantifiedNumeric(EObject context, AssertionQuantified semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftAssert=Assertion op=Rop rightAssert=Assertion)
	 */
	protected void sequence_AssertionStdCmp(EObject context, AssertionStdCmp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__LEFT_ASSERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__LEFT_ASSERT));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__OP));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__RIGHT_ASSERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_STD_CMP__RIGHT_ASSERT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionStdCmpAccess().getLeftAssertAssertionParserRuleCall_0_0(), semanticObject.getLeftAssert());
		feeder.accept(grammarAccess.getAssertionStdCmpAccess().getOpRopParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAssertionStdCmpAccess().getRightAssertAssertionParserRuleCall_2_0(), semanticObject.getRightAssert());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values=Values | bool=BOOLEAN)
	 */
	protected void sequence_Assertion(EObject context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=NUMBER | string=STRING)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Variable (assert=Assertion | assert=AssertionQuantifiedBoolean))
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='contains' | name='startsWith' | name='endsWith') params=Values?)
	 */
	protected void sequence_FunctionBoolean(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID params=Values?)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* assertionSet=AssertionOr)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Rest_1_0_2_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Rest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property=ID ((op=Rop numberValue=NUMBER) | (op=StringRop strValue=STRING) | (op=Rop varValue=Variable))) | number=NUMBER | var=Variable)
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID predicate=Predicate?) | placeholder=Variable)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=Step+ functions+=Function*)
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=Value value+=Value*)
	 */
	protected void sequence_Values(EObject context, Values semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
