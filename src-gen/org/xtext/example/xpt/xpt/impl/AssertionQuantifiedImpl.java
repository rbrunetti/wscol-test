/**
 */
package org.xtext.example.xpt.xpt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionQuantified;
import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Values;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Quantified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionQuantifiedImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionQuantifiedImpl extends AssertionFormImpl implements AssertionQuantified
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected Values values;

  /**
   * The default value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
  protected static final boolean BOOL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
  protected boolean bool = BOOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> steps;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected static final String QUANTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected String quantifier = QUANTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected Assertions conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionQuantifiedImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XptPackage.Literals.ASSERTION_QUANTIFIED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values getValues()
  {
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValues(Values newValues, NotificationChain msgs)
  {
    Values oldValues = values;
    values = newValues;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__VALUES, oldValues, newValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValues(Values newValues)
  {
    if (newValues != values)
    {
      NotificationChain msgs = null;
      if (values != null)
        msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_QUANTIFIED__VALUES, null, msgs);
      if (newValues != null)
        msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_QUANTIFIED__VALUES, null, msgs);
      msgs = basicSetValues(newValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__VALUES, newValues, newValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(boolean newBool)
  {
    boolean oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__BOOL, oldBool, bool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Step> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Step>(Step.class, this, XptPackage.ASSERTION_QUANTIFIED__STEPS);
    }
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifier(String newQuantifier)
  {
    String oldQuantifier = quantifier;
    quantifier = newQuantifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__QUANTIFIER, oldQuantifier, quantifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertions getConditions()
  {
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditions(Assertions newConditions, NotificationChain msgs)
  {
    Assertions oldConditions = conditions;
    conditions = newConditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__CONDITIONS, oldConditions, newConditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditions(Assertions newConditions)
  {
    if (newConditions != conditions)
    {
      NotificationChain msgs = null;
      if (conditions != null)
        msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_QUANTIFIED__CONDITIONS, null, msgs);
      if (newConditions != null)
        msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_QUANTIFIED__CONDITIONS, null, msgs);
      msgs = basicSetConditions(newConditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_QUANTIFIED__CONDITIONS, newConditions, newConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_QUANTIFIED__VALUES:
        return basicSetValues(null, msgs);
      case XptPackage.ASSERTION_QUANTIFIED__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
      case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case XptPackage.ASSERTION_QUANTIFIED__CONDITIONS:
        return basicSetConditions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_QUANTIFIED__VALUES:
        return getValues();
      case XptPackage.ASSERTION_QUANTIFIED__BOOL:
        return isBool();
      case XptPackage.ASSERTION_QUANTIFIED__STEPS:
        return getSteps();
      case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS:
        return getFunctions();
      case XptPackage.ASSERTION_QUANTIFIED__QUANTIFIER:
        return getQuantifier();
      case XptPackage.ASSERTION_QUANTIFIED__ALIAS:
        return getAlias();
      case XptPackage.ASSERTION_QUANTIFIED__VAR:
        return getVar();
      case XptPackage.ASSERTION_QUANTIFIED__CONDITIONS:
        return getConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_QUANTIFIED__VALUES:
        setValues((Values)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__BOOL:
        setBool((Boolean)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__QUANTIFIER:
        setQuantifier((String)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__ALIAS:
        setAlias((String)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__VAR:
        setVar((String)newValue);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__CONDITIONS:
        setConditions((Assertions)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_QUANTIFIED__VALUES:
        setValues((Values)null);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__BOOL:
        setBool(BOOL_EDEFAULT);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__STEPS:
        getSteps().clear();
        return;
      case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS:
        getFunctions().clear();
        return;
      case XptPackage.ASSERTION_QUANTIFIED__QUANTIFIER:
        setQuantifier(QUANTIFIER_EDEFAULT);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case XptPackage.ASSERTION_QUANTIFIED__CONDITIONS:
        setConditions((Assertions)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_QUANTIFIED__VALUES:
        return values != null;
      case XptPackage.ASSERTION_QUANTIFIED__BOOL:
        return bool != BOOL_EDEFAULT;
      case XptPackage.ASSERTION_QUANTIFIED__STEPS:
        return steps != null && !steps.isEmpty();
      case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case XptPackage.ASSERTION_QUANTIFIED__QUANTIFIER:
        return QUANTIFIER_EDEFAULT == null ? quantifier != null : !QUANTIFIER_EDEFAULT.equals(quantifier);
      case XptPackage.ASSERTION_QUANTIFIED__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case XptPackage.ASSERTION_QUANTIFIED__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case XptPackage.ASSERTION_QUANTIFIED__CONDITIONS:
        return conditions != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Assertion.class)
    {
      switch (derivedFeatureID)
      {
        case XptPackage.ASSERTION_QUANTIFIED__VALUES: return XptPackage.ASSERTION__VALUES;
        case XptPackage.ASSERTION_QUANTIFIED__BOOL: return XptPackage.ASSERTION__BOOL;
        case XptPackage.ASSERTION_QUANTIFIED__STEPS: return XptPackage.ASSERTION__STEPS;
        case XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS: return XptPackage.ASSERTION__FUNCTIONS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Assertion.class)
    {
      switch (baseFeatureID)
      {
        case XptPackage.ASSERTION__VALUES: return XptPackage.ASSERTION_QUANTIFIED__VALUES;
        case XptPackage.ASSERTION__BOOL: return XptPackage.ASSERTION_QUANTIFIED__BOOL;
        case XptPackage.ASSERTION__STEPS: return XptPackage.ASSERTION_QUANTIFIED__STEPS;
        case XptPackage.ASSERTION__FUNCTIONS: return XptPackage.ASSERTION_QUANTIFIED__FUNCTIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (bool: ");
    result.append(bool);
    result.append(", quantifier: ");
    result.append(quantifier);
    result.append(", alias: ");
    result.append(alias);
    result.append(", var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //AssertionQuantifiedImpl
