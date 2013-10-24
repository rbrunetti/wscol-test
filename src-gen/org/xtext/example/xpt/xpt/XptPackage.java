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
   * The feature id for the '<em><b>Left Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FORM__LEFT_ASSERT = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FORM__OP = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FORM__RIGHT_ASSERT = ASSERTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assertion Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FORM_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 6;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__QUERY = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__BOOLEAN = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__VALUES = 4;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl <em>Assertion Quantified</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionQuantified()
   * @generated
   */
  int ASSERTION_QUANTIFIED = 7;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__QUERY = ASSERTION__QUERY;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__FUNCTION = ASSERTION__FUNCTION;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__CONSTANT = ASSERTION__CONSTANT;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__BOOLEAN = ASSERTION__BOOLEAN;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__VALUES = ASSERTION__VALUES;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__QUANTIFIER = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__ALIAS = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__VAR = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED__CONDITIONS = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assertion Quantified</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_QUANTIFIED_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.QueryImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 8;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__STEPS = 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__ATTRIBUTE = 1;

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
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AttributeImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OP = 1;

  /**
   * The feature id for the '<em><b>Number Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NUMBER_VALUE = 2;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STR_VALUE = 3;

  /**
   * The feature id for the '<em><b>Var Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VAR_VALUE = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NUMBER = 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VAR = 6;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 7;

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
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ValuesImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getValues()
   * @generated
   */
  int VALUES = 12;

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
  int VALUE = 13;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__QUERY = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__FUNCTION = 1;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ConstantImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 14;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__QUERY = VALUE__QUERY;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__FUNCTION = VALUE__FUNCTION;

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
  int ASSERTION_OR = 15;

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
  int ASSERTION_AND = 16;

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionForm#getLeftAssert <em>Left Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Assert</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionForm#getLeftAssert()
   * @see #getAssertionForm()
   * @generated
   */
  EReference getAssertionForm_LeftAssert();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.AssertionForm#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionForm#getOp()
   * @see #getAssertionForm()
   * @generated
   */
  EAttribute getAssertionForm_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionForm#getRightAssert <em>Right Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Assert</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionForm#getRightAssert()
   * @see #getAssertionForm()
   * @generated
   */
  EReference getAssertionForm_RightAssert();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Assertion#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getQuery()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Query();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Assertion#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getFunction()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Assertion#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getConstant()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Constant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Assertion#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#isBoolean()
   * @see #getAssertion()
   * @generated
   */
  EAttribute getAssertion_Boolean();

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
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.xtext.example.xpt.xpt.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Query#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.xtext.example.xpt.xpt.Query#getSteps()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Steps();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Step#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.xtext.example.xpt.xpt.Step#getAttribute()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Attribute();

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
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getProperty()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Property();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getOp()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getNumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Value</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getNumberValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_NumberValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getStrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str Value</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getStrValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_StrValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getVarValue <em>Var Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Value</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getVarValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_VarValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getNumber()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Number();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getVar()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Var();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.Value#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see org.xtext.example.xpt.xpt.Value#getQuery()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Query();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpt.xpt.Value#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see org.xtext.example.xpt.xpt.Value#getFunction()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Function();

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
     * The meta object literal for the '<em><b>Left Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_FORM__LEFT_ASSERT = eINSTANCE.getAssertionForm_LeftAssert();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_FORM__OP = eINSTANCE.getAssertionForm_Op();

    /**
     * The meta object literal for the '<em><b>Right Assert</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_FORM__RIGHT_ASSERT = eINSTANCE.getAssertionForm_RightAssert();

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
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__QUERY = eINSTANCE.getAssertion_Query();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__FUNCTION = eINSTANCE.getAssertion_Function();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__CONSTANT = eINSTANCE.getAssertion_Constant();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION__BOOLEAN = eINSTANCE.getAssertion_Boolean();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__VALUES = eINSTANCE.getAssertion_Values();

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
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.QueryImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__STEPS = eINSTANCE.getQuery_Steps();

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
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__ATTRIBUTE = eINSTANCE.getStep_Attribute();

    /**
     * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__PLACEHOLDER = eINSTANCE.getStep_Placeholder();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AttributeImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__PROPERTY = eINSTANCE.getAttribute_Property();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OP = eINSTANCE.getAttribute_Op();

    /**
     * The meta object literal for the '<em><b>Number Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NUMBER_VALUE = eINSTANCE.getAttribute_NumberValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__STR_VALUE = eINSTANCE.getAttribute_StrValue();

    /**
     * The meta object literal for the '<em><b>Var Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VAR_VALUE = eINSTANCE.getAttribute_VarValue();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NUMBER = eINSTANCE.getAttribute_Number();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VAR = eINSTANCE.getAttribute_Var();

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
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__QUERY = eINSTANCE.getValue_Query();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__FUNCTION = eINSTANCE.getValue_Function();

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

  }

} //XptPackage
