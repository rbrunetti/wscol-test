/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.xpt.xpt.XptFactory
 * @model kind="package"
 * @generated
 */
public interface XptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xpt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/xpt/Xpt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xpt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XptPackage eINSTANCE = org.xtext.example.xpt.xpt.impl.XptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ModelImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Assertion Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASSERTION_SET = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.DeclarationImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ASSERT = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionsImpl <em>Assertions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionsImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertions()
   * @generated
   */
  int ASSERTIONS = 2;

  /**
   * The number of structural features of the '<em>Assertions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionBracedImpl <em>Assertion Braced</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionBracedImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionBraced()
   * @generated
   */
  int ASSERTION_BRACED = 3;

  /**
   * The feature id for the '<em><b>Inner Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_BRACED__INNER_FORMULA = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assertion Braced</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_BRACED_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionNotImpl <em>Assertion Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionNotImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionNot()
   * @generated
   */
  int ASSERTION_NOT = 4;

  /**
   * The feature id for the '<em><b>Inner Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_NOT__INNER_FORMULA = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assertion Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_NOT_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl <em>Assertion Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionFormImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionForm()
   * @generated
   */
  int ASSERTION_FORM = 5;

  /**
   * The number of structural features of the '<em>Assertion Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FORM_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionStdCmpImpl <em>Assertion Std Cmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionStdCmpImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionStdCmp()
   * @generated
   */
  int ASSERTION_STD_CMP = 6;

  /**
   * The feature id for the '<em><b>Left Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_STD_CMP__LEFT_ASSERT = ASSERTION_FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_STD_CMP__OP = ASSERTION_FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_STD_CMP__RIGHT_ASSERT = ASSERTION_FORM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assertion Std Cmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_STD_CMP_FEATURE_COUNT = ASSERTION_FORM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 7;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__VALUES = ASSERTION_FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__BOOL = ASSERTION_FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__STEPS = ASSERTION_FORM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__FUNCTIONS = ASSERTION_FORM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = ASSERTION_FORM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl <em>Assertion Quantified</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionQuantified()
   * @generated
   */
  int ASSERTION_QUANTIFIED = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__VALUES = ASSERTION_FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__BOOL = ASSERTION_FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__STEPS = ASSERTION_FORM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__FUNCTIONS = ASSERTION_FORM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__QUANTIFIER = ASSERTION_FORM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__ALIAS = ASSERTION_FORM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__VAR = ASSERTION_FORM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__CONDITIONS = ASSERTION_FORM_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Assertion Quantified</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED_FEATURE_COUNT = ASSERTION_FORM_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.StepImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getStep()
   * @generated
   */
  int STEP = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__PREDICATE = 1;

  /**
   * The feature id for the '<em><b>Placeholder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__PLACEHOLDER = 2;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.PredicateImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 10;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__OP = 1;

  /**
   * The feature id for the '<em><b>Number Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__NUMBER_VALUE = 2;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__STR_VALUE = 3;

  /**
   * The feature id for the '<em><b>Var Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__VAR_VALUE = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__NUMBER = 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__VAR = 6;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.FunctionImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ExpressionImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUES = ASSERTION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BOOL = ASSERTION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__STEPS = ASSERTION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FUNCTIONS = ASSERTION__FUNCTIONS;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ValuesImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getValues()
   * @generated
   */
  int VALUES = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__VALUE = 0;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ValueImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getValue()
   * @generated
   */
  int VALUE = 14;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ConstantImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 15;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUES = VALUE__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__BOOL = VALUE__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STEPS = VALUE__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__FUNCTIONS = VALUE__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NUMBER = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionOrImpl <em>Assertion Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionOrImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionOr()
   * @generated
   */
  int ASSERTION_OR = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_OR__LEFT = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_OR__RIGHT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assertion Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_OR_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionAndImpl <em>Assertion And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionAndImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionAnd()
   * @generated
   */
  int ASSERTION_AND = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_AND__LEFT = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_AND__RIGHT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assertion And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_AND_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.PlusImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 18;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.MinusImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 19;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.MultiImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 20;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.DivImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getDiv()
   * @generated
   */
  int DIV = 21;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.RestImpl <em>Rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.RestImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getRest()
   * @generated
   */
  int REST = 22;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__VALUES = EXPRESSION__VALUES;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__BOOL = EXPRESSION__BOOL;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__STEPS = EXPRESSION__STEPS;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__FUNCTIONS = EXPRESSION__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.xpt.xpt.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.example.xpt.xpt.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Model#getAssertionSet <em>Assertion Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertion Set</em>'.
   * @see org.xtext.example.xpt.xpt.Model#getAssertionSet()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AssertionSet();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.example.xpt.xpt.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Declaration#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.xpt.xpt.Declaration#getVar()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Declaration#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert</em>'.
   * @see org.xtext.example.xpt.xpt.Declaration#getAssert()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Assert();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Assertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertions</em>'.
   * @see org.xtext.example.xpt.xpt.Assertions
   * @generated
   */
  EClass getAssertions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionBraced <em>Assertion Braced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Braced</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionBraced
   * @generated
   */
  EClass getAssertionBraced();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionBraced#getInnerFormula <em>Inner Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner Formula</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionBraced#getInnerFormula()
   * @see #getAssertionBraced()
   * @generated
   */
  EReference getAssertionBraced_InnerFormula();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionNot <em>Assertion Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Not</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionNot
   * @generated
   */
  EClass getAssertionNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionNot#getInnerFormula <em>Inner Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner Formula</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionNot#getInnerFormula()
   * @see #getAssertionNot()
   * @generated
   */
  EReference getAssertionNot_InnerFormula();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionForm <em>Assertion Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Form</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionForm
   * @generated
   */
  EClass getAssertionForm();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionStdCmp <em>Assertion Std Cmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Std Cmp</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionStdCmp
   * @generated
   */
  EClass getAssertionStdCmp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionStdCmp#getLeftAssert <em>Left Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Assert</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionStdCmp#getLeftAssert()
   * @see #getAssertionStdCmp()
   * @generated
   */
  EReference getAssertionStdCmp_LeftAssert();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.AssertionStdCmp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionStdCmp#getOp()
   * @see #getAssertionStdCmp()
   * @generated
   */
  EAttribute getAssertionStdCmp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionStdCmp#getRightAssert <em>Right Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Assert</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionStdCmp#getRightAssert()
   * @see #getAssertionStdCmp()
   * @generated
   */
  EReference getAssertionStdCmp_RightAssert();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Assertion#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getValues()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Values();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Assertion#isBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#isBool()
   * @see #getAssertion()
   * @generated
   */
  EAttribute getAssertion_Bool();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Assertion#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getSteps()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Steps();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Assertion#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getFunctions()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionQuantified <em>Assertion Quantified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Quantified</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionQuantified
   * @generated
   */
  EClass getAssertionQuantified();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantifier</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionQuantified#getQuantifier()
   * @see #getAssertionQuantified()
   * @generated
   */
  EAttribute getAssertionQuantified_Quantifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionQuantified#getAlias()
   * @see #getAssertionQuantified()
   * @generated
   */
  EAttribute getAssertionQuantified_Alias();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionQuantified#getVar()
   * @see #getAssertionQuantified()
   * @generated
   */
  EAttribute getAssertionQuantified_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditions</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionQuantified#getConditions()
   * @see #getAssertionQuantified()
   * @generated
   */
  EReference getAssertionQuantified_Conditions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see org.xtext.example.xpt.xpt.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.xpt.xpt.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Step#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.xtext.example.xpt.xpt.Step#getPredicate()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Predicate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Step#getPlaceholder <em>Placeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Placeholder</em>'.
   * @see org.xtext.example.xpt.xpt.Step#getPlaceholder()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Placeholder();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getProperty()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Property();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getOp()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getNumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Value</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getNumberValue()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_NumberValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getStrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str Value</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getStrValue()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_StrValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getVarValue <em>Var Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Value</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getVarValue()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_VarValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getNumber()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Predicate#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.xpt.xpt.Predicate#getVar()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.xpt.xpt.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.xpt.xpt.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Function#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.xtext.example.xpt.xpt.Function#getParams()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.xpt.xpt.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see org.xtext.example.xpt.xpt.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Values#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.xpt.xpt.Values#getValue()
   * @see #getValues()
   * @generated
   */
  EReference getValues_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.example.xpt.xpt.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.xtext.example.xpt.xpt.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Constant#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.xpt.xpt.Constant#getNumber()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Constant#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.xpt.xpt.Constant#getString()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_String();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionOr <em>Assertion Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Or</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionOr
   * @generated
   */
  EClass getAssertionOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionOr#getLeft()
   * @see #getAssertionOr()
   * @generated
   */
  EReference getAssertionOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionOr#getRight()
   * @see #getAssertionOr()
   * @generated
   */
  EReference getAssertionOr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionAnd <em>Assertion And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion And</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionAnd
   * @generated
   */
  EClass getAssertionAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionAnd#getLeft()
   * @see #getAssertionAnd()
   * @generated
   */
  EReference getAssertionAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionAnd#getRight()
   * @see #getAssertionAnd()
   * @generated
   */
  EReference getAssertionAnd_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.xtext.example.xpt.xpt.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.example.xpt.xpt.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.xtext.example.xpt.xpt.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.xtext.example.xpt.xpt.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Rest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest</em>'.
   * @see org.xtext.example.xpt.xpt.Rest
   * @generated
   */
  EClass getRest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Rest#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.Rest#getLeft()
   * @see #getRest()
   * @generated
   */
  EReference getRest_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Rest#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.Rest#getRight()
   * @see #getRest()
   * @generated
   */
  EReference getRest_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XptFactory getXptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.ModelImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '<em><b>Assertion Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASSERTION_SET = eINSTANCE.getModel_AssertionSet();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.DeclarationImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__VAR = eINSTANCE.getDeclaration_Var();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__ASSERT = eINSTANCE.getDeclaration_Assert();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionsImpl <em>Assertions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionsImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertions()
     * @generated
     */
    EClass ASSERTIONS = eINSTANCE.getAssertions();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionBracedImpl <em>Assertion Braced</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionBracedImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionBraced()
     * @generated
     */
    EClass ASSERTION_BRACED = eINSTANCE.getAssertionBraced();

    /**
     * The meta object literal for the '<em><b>Inner Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_BRACED__INNER_FORMULA = eINSTANCE.getAssertionBraced_InnerFormula();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionNotImpl <em>Assertion Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionNotImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionNot()
     * @generated
     */
    EClass ASSERTION_NOT = eINSTANCE.getAssertionNot();

    /**
     * The meta object literal for the '<em><b>Inner Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_NOT__INNER_FORMULA = eINSTANCE.getAssertionNot_InnerFormula();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl <em>Assertion Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionFormImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionForm()
     * @generated
     */
    EClass ASSERTION_FORM = eINSTANCE.getAssertionForm();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionStdCmpImpl <em>Assertion Std Cmp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionStdCmpImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionStdCmp()
     * @generated
     */
    EClass ASSERTION_STD_CMP = eINSTANCE.getAssertionStdCmp();

    /**
     * The meta object literal for the '<em><b>Left Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_STD_CMP__LEFT_ASSERT = eINSTANCE.getAssertionStdCmp_LeftAssert();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_STD_CMP__OP = eINSTANCE.getAssertionStdCmp_Op();

    /**
     * The meta object literal for the '<em><b>Right Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_STD_CMP__RIGHT_ASSERT = eINSTANCE.getAssertionStdCmp_RightAssert();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__VALUES = eINSTANCE.getAssertion_Values();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION__BOOL = eINSTANCE.getAssertion_Bool();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__STEPS = eINSTANCE.getAssertion_Steps();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__FUNCTIONS = eINSTANCE.getAssertion_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl <em>Assertion Quantified</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionQuantified()
     * @generated
     */
    EClass ASSERTION_QUANTIFIED = eINSTANCE.getAssertionQuantified();

    /**
     * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_QUANTIFIED__QUANTIFIER = eINSTANCE.getAssertionQuantified_Quantifier();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_QUANTIFIED__ALIAS = eINSTANCE.getAssertionQuantified_Alias();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_QUANTIFIED__VAR = eINSTANCE.getAssertionQuantified_Var();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_QUANTIFIED__CONDITIONS = eINSTANCE.getAssertionQuantified_Conditions();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.StepImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__PREDICATE = eINSTANCE.getStep_Predicate();

    /**
     * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__PLACEHOLDER = eINSTANCE.getStep_Placeholder();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.PredicateImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__PROPERTY = eINSTANCE.getPredicate_Property();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__OP = eINSTANCE.getPredicate_Op();

    /**
     * The meta object literal for the '<em><b>Number Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__NUMBER_VALUE = eINSTANCE.getPredicate_NumberValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__STR_VALUE = eINSTANCE.getPredicate_StrValue();

    /**
     * The meta object literal for the '<em><b>Var Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__VAR_VALUE = eINSTANCE.getPredicate_VarValue();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__NUMBER = eINSTANCE.getPredicate_Number();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__VAR = eINSTANCE.getPredicate_Var();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.FunctionImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.ExpressionImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.ValuesImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUES__VALUE = eINSTANCE.getValues_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.ValueImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.ConstantImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NUMBER = eINSTANCE.getConstant_Number();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING = eINSTANCE.getConstant_String();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionOrImpl <em>Assertion Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionOrImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionOr()
     * @generated
     */
    EClass ASSERTION_OR = eINSTANCE.getAssertionOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_OR__LEFT = eINSTANCE.getAssertionOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_OR__RIGHT = eINSTANCE.getAssertionOr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionAndImpl <em>Assertion And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionAndImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionAnd()
     * @generated
     */
    EClass ASSERTION_AND = eINSTANCE.getAssertionAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_AND__LEFT = eINSTANCE.getAssertionAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_AND__RIGHT = eINSTANCE.getAssertionAnd_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.PlusImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.MinusImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.MultiImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.DivImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.RestImpl <em>Rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.RestImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getRest()
     * @generated
     */
    EClass REST = eINSTANCE.getRest();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST__LEFT = eINSTANCE.getRest_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST__RIGHT = eINSTANCE.getRest_Right();

  }

} //XptPackage
