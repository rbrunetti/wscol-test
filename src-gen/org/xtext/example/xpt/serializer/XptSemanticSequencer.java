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
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.AssertionSet;
import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.Constant;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Model;
import org.xtext.example.xpt.xpt.Query;
import org.xtext.example.xpt.xpt.Step;
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
			case XptPackage.ASSERTION_FORM:
				if(context == grammarAccess.getAssertionFormRule()) {
					sequence_AssertionForm(context, (AssertionForm) semanticObject); 
					return; 
				}
				else break;
			case XptPackage.ASSERTION_SET:
				if(context == grammarAccess.getAssertionSetRule()) {
					sequence_AssertionSet(context, (AssertionSet) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftAssert=Assertion op=Rop rightAssert=Assertion)
	 */
	protected void sequence_AssertionForm(EObject context, AssertionForm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_FORM__LEFT_ASSERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_FORM__LEFT_ASSERT));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_FORM__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_FORM__OP));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.ASSERTION_FORM__RIGHT_ASSERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.ASSERTION_FORM__RIGHT_ASSERT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssertionFormAccess().getLeftAssertAssertionParserRuleCall_0_0(), semanticObject.getLeftAssert());
		feeder.accept(grammarAccess.getAssertionFormAccess().getOpRopParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAssertionFormAccess().getRightAssertAssertionParserRuleCall_2_0(), semanticObject.getRightAssert());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assertions+=AssertionForm assertions+=AssertionForm*)
	 */
	protected void sequence_AssertionSet(EObject context, AssertionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((query=Query function=Function?) | constant=Constant)
	 */
	protected void sequence_Assertion(EObject context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property=ID ((op=Rop intValue=NUMBER) | (op=StringRop strValue=STRING))) | int=NUMBER)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (int=NUMBER | string=STRING)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Variable assert=Assertion)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.DECLARATION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.DECLARATION__VAR));
			if(transientValues.isValueTransient(semanticObject, XptPackage.Literals.DECLARATION__ASSERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XptPackage.Literals.DECLARATION__ASSERT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getVarVariableParserRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getDeclarationAccess().getAssertAssertionParserRuleCall_3_0(), semanticObject.getAssert());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* querySet=AssertionSet)
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
}
