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
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.AssertionOr;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Model;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Values;
import org.xtext.example.xpt.xpt.XptPackage;

@SuppressWarnings("all")
public class XptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XptPackage.ASSERTION:
				if(context == grammarAccess.getAssertionRule()) {
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
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0() ||
				   context == grammarAccess.getHighProrityAssertionRule()) {
					sequence_AssertionBraced(context, (AssertionBraced) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_FORM:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionFormRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0() ||
				   context == grammarAccess.getHighProrityAssertionRule()) {
					sequence_AssertionForm(context, (AssertionForm) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_NOT:
				if(context == grammarAccess.getAssertionAndRule() ||
				   context == grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0() ||
				   context == grammarAccess.getAssertionNotRule() ||
				   context == grammarAccess.getAssertionOrRule() ||
				   context == grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0() ||
				   context == grammarAccess.getHighProrityAssertionRule()) {
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
				if(context == grammarAccess.getAssertionQuantifiedBooleanRule()) {
					sequence_AssertionQuantifiedBoolean(context, (AssertionQuantified) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssertionRule() ||
				   context == grammarAccess.getAssertionQuantifiedNumericRule()) {
					sequence_AssertionQuantifiedNumeric(context, (AssertionQuantified) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
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
			case XptPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.STEP:
				if(context == grammarAccess.getStepRule()) {
					sequence_Step(context, (Step) semanticObject); 
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
	 *     (left=AssertionAnd_AssertionAnd_1_0 right=HighProrityAssertion)
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
		feeder.accept(grammarAccess.getAssertionAndAccess().getRightHighProrityAssertionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     ((leftAssert=Assertion op=Rop rightAssert=Assertion) | leftAssert=AssertionQuantifiedBoolean)
	 */
	protected void sequence_AssertionForm(EObject context, AssertionForm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((query=Query function=Function?) | constant=Constant | boolean=BOOLEAN | values=Values)
	 */
	protected void sequence_Assertion(EObject context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property=ID ((op=Rop numberValue=NUMBER) | (op=StringRop strValue=STRING))) | number=NUMBER)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
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
	 *     (steps+=Step+ | steps+=Step+)
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID attribute=Attribute?) | placeholder=Variable)
	 */
	protected void sequence_Step(EObject context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=Constant value+=Constant*)
	 */
	protected void sequence_Values(EObject context, Values semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
