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
      case XptPackage.NEGATED_FORMULA: return createNegatedFormula();
      case XptPackage.ASSERTION_FORM: return createAssertionForm();
      case XptPackage.ASSERTION: return createAssertion();
      case XptPackage.QUERY: return createQuery();
      case XptPackage.STEP: return createStep();
      case XptPackage.ATTRIBUTE: return createAttribute();
      case XptPackage.CONSTANT: return createConstant();
      case XptPackage.ASSERTION_SET: return createAssertionSet();
      case XptPackage.ASSERTION_AND: return createAssertionAnd();
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
  public NegatedFormula createNegatedFormula()
  {
    NegatedFormulaImpl negatedFormula = new NegatedFormulaImpl();
    return negatedFormula;
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
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
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
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
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
  public AssertionSet createAssertionSet()
  {
    AssertionSetImpl assertionSet = new AssertionSetImpl();
    return assertionSet;
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
