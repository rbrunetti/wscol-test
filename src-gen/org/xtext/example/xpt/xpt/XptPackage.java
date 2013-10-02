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
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.NegatedFormulaImpl <em>Negated Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.NegatedFormulaImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getNegatedFormula()
   * @generated
   */
  int NEGATED_FORMULA = 3;

  /**
   * The feature id for the '<em><b>Inner Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATED_FORMULA__INNER_FORMULA = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negated Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATED_FORMULA_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl <em>Assertion Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionFormImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionForm()
   * @generated
   */
  int ASSERTION_FORM = 4;

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
  int ASSERTION = 5;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__QUERY = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
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
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.QueryImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 6;

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
  int STEP = 7;

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
  int ATTRIBUTE = 8;

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
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__INT_VALUE = 2;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STR_VALUE = 3;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__INT = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.ConstantImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 9;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INT = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING = 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionSetImpl <em>Assertion Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionSetImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionSet()
   * @generated
   */
  int ASSERTION_SET = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_SET__LEFT = ASSERTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_SET__RIGHT = ASSERTIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assertion Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_SET_FEATURE_COUNT = ASSERTIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpt.xpt.impl.AssertionAndImpl <em>Assertion And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpt.xpt.impl.AssertionAndImpl
   * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionAnd()
   * @generated
   */
  int ASSERTION_AND = 11;

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
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.NegatedFormula <em>Negated Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negated Formula</em>'.
   * @see org.xtext.example.xpt.xpt.NegatedFormula
   * @generated
   */
  EClass getNegatedFormula();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.NegatedFormula#getInnerFormula <em>Inner Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner Formula</em>'.
   * @see org.xtext.example.xpt.xpt.NegatedFormula#getInnerFormula()
   * @see #getNegatedFormula()
   * @generated
   */
  EReference getNegatedFormula_InnerFormula();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Assertion#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.xtext.example.xpt.xpt.Assertion#getFunction()
   * @see #getAssertion()
   * @generated
   */
  EAttribute getAssertion_Function();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getIntValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IntValue();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Attribute#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.example.xpt.xpt.Attribute#getInt()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Int();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.xpt.xpt.Constant#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.example.xpt.xpt.Constant#getInt()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Int();

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
   * Returns the meta object for class '{@link org.xtext.example.xpt.xpt.AssertionSet <em>Assertion Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Set</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionSet
   * @generated
   */
  EClass getAssertionSet();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionSet#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionSet#getLeft()
   * @see #getAssertionSet()
   * @generated
   */
  EReference getAssertionSet_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpt.xpt.AssertionSet#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpt.xpt.AssertionSet#getRight()
   * @see #getAssertionSet()
   * @generated
   */
  EReference getAssertionSet_Right();

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
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.NegatedFormulaImpl <em>Negated Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.NegatedFormulaImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getNegatedFormula()
     * @generated
     */
    EClass NEGATED_FORMULA = eINSTANCE.getNegatedFormula();

    /**
     * The meta object literal for the '<em><b>Inner Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATED_FORMULA__INNER_FORMULA = eINSTANCE.getNegatedFormula_InnerFormula();

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
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION__FUNCTION = eINSTANCE.getAssertion_Function();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__CONSTANT = eINSTANCE.getAssertion_Constant();

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
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__INT_VALUE = eINSTANCE.getAttribute_IntValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__STR_VALUE = eINSTANCE.getAttribute_StrValue();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__INT = eINSTANCE.getAttribute_Int();

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
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INT = eINSTANCE.getConstant_Int();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING = eINSTANCE.getConstant_String();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpt.xpt.impl.AssertionSetImpl <em>Assertion Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpt.xpt.impl.AssertionSetImpl
     * @see org.xtext.example.xpt.xpt.impl.XptPackageImpl#getAssertionSet()
     * @generated
     */
    EClass ASSERTION_SET = eINSTANCE.getAssertionSet();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_SET__LEFT = eINSTANCE.getAssertionSet_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_SET__RIGHT = eINSTANCE.getAssertionSet_Right();

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
