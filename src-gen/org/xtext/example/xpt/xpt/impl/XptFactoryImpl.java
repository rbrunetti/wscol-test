/**
 */
package org.xtext.example.xpt.xpt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.xpt.xpt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XptFactoryImpl extends EFactoryImpl implements XptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XptFactory init()
  {
    try
    {
      XptFactory theXptFactory = (XptFactory)EPackage.Registry.INSTANCE.getEFactory(XptPackage.eNS_URI);
      if (theXptFactory != null)
      {
        return theXptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XptPackage.MODEL: return createModel();
      case XptPackage.DECLARATION: return createDeclaration();
      case XptPackage.ASSERTIONS: return createAssertions();
      case XptPackage.ASSERTION_BRACED: return createAssertionBraced();
      case XptPackage.ASSERTION_NOT: return createAssertionNot();
      case XptPackage.ASSERTION_FORM: return createAssertionForm();
      case XptPackage.ASSERTION_STD_CMP: return createAssertionStdCmp();
      case XptPackage.ASSERTION: return createAssertion();
      case XptPackage.ASSERTION_QUANTIFIED: return createAssertionQuantified();
      case XptPackage.STEP: return createStep();
      case XptPackage.PREDICATE: return createPredicate();
      case XptPackage.FUNCTION: return createFunction();
      case XptPackage.EXPRESSION: return createExpression();
      case XptPackage.VALUES: return createValues();
      case XptPackage.VALUE: return createValue();
      case XptPackage.CONSTANT: return createConstant();
      case XptPackage.ASSERTION_OR: return createAssertionOr();
      case XptPackage.ASSERTION_AND: return createAssertionAnd();
      case XptPackage.PLUS: return createPlus();
      case XptPackage.MINUS: return createMinus();
      case XptPackage.MULTI: return createMulti();
      case XptPackage.DIV: return createDiv();
      case XptPackage.REST: return createRest();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertions createAssertions()
  {
    AssertionsImpl assertions = new AssertionsImpl();
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionBraced createAssertionBraced()
  {
    AssertionBracedImpl assertionBraced = new AssertionBracedImpl();
    return assertionBraced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionNot createAssertionNot()
  {
    AssertionNotImpl assertionNot = new AssertionNotImpl();
    return assertionNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionForm createAssertionForm()
  {
    AssertionFormImpl assertionForm = new AssertionFormImpl();
    return assertionForm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionStdCmp createAssertionStdCmp()
  {
    AssertionStdCmpImpl assertionStdCmp = new AssertionStdCmpImpl();
    return assertionStdCmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionQuantified createAssertionQuantified()
  {
    AssertionQuantifiedImpl assertionQuantified = new AssertionQuantifiedImpl();
    return assertionQuantified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionOr createAssertionOr()
  {
    AssertionOrImpl assertionOr = new AssertionOrImpl();
    return assertionOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionAnd createAssertionAnd()
  {
    AssertionAndImpl assertionAnd = new AssertionAndImpl();
    return assertionAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rest createRest()
  {
    RestImpl rest = new RestImpl();
    return rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XptPackage getXptPackage()
  {
    return (XptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XptPackage getPackage()
  {
    return XptPackage.eINSTANCE;
  }

} //XptFactoryImpl
