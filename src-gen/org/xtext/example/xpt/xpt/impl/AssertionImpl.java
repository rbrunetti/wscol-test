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
import org.xtext.example.xpt.xpt.Function;
import org.xtext.example.xpt.xpt.Step;
import org.xtext.example.xpt.xpt.Values;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends AssertionFormImpl implements Assertion
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionImpl()
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
    return XptPackage.Literals.ASSERTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION__VALUES, oldValues, newValues);
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
        msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION__VALUES, null, msgs);
      if (newValues != null)
        msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION__VALUES, null, msgs);
      msgs = basicSetValues(newValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION__VALUES, newValues, newValues));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION__BOOL, oldBool, bool));
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
      steps = new EObjectContainmentEList<Step>(Step.class, this, XptPackage.ASSERTION__STEPS);
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
      functions = new EObjectContainmentEList<Function>(Function.class, this, XptPackage.ASSERTION__FUNCTIONS);
    }
    return functions;
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
      case XptPackage.ASSERTION__VALUES:
        return basicSetValues(null, msgs);
      case XptPackage.ASSERTION__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
      case XptPackage.ASSERTION__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case XptPackage.ASSERTION__VALUES:
        return getValues();
      case XptPackage.ASSERTION__BOOL:
        return isBool();
      case XptPackage.ASSERTION__STEPS:
        return getSteps();
      case XptPackage.ASSERTION__FUNCTIONS:
        return getFunctions();
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
      case XptPackage.ASSERTION__VALUES:
        setValues((Values)newValue);
        return;
      case XptPackage.ASSERTION__BOOL:
        setBool((Boolean)newValue);
        return;
      case XptPackage.ASSERTION__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
        return;
      case XptPackage.ASSERTION__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
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
      case XptPackage.ASSERTION__VALUES:
        setValues((Values)null);
        return;
      case XptPackage.ASSERTION__BOOL:
        setBool(BOOL_EDEFAULT);
        return;
      case XptPackage.ASSERTION__STEPS:
        getSteps().clear();
        return;
      case XptPackage.ASSERTION__FUNCTIONS:
        getFunctions().clear();
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
      case XptPackage.ASSERTION__VALUES:
        return values != null;
      case XptPackage.ASSERTION__BOOL:
        return bool != BOOL_EDEFAULT;
      case XptPackage.ASSERTION__STEPS:
        return steps != null && !steps.isEmpty();
      case XptPackage.ASSERTION__FUNCTIONS:
        return functions != null && !functions.isEmpty();
    }
    return super.eIsSet(featureID);
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
    result.append(')');
    return result.toString();
  }

} //AssertionImpl
