/**
 */
package org.xtext.example.xpt.xpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.xpt.xpt.AssertionNot;
import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionNotImpl#getInnerFormula <em>Inner Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionNotImpl extends AssertionsImpl implements AssertionNot
{
  /**
   * The cached value of the '{@link #getInnerFormula() <em>Inner Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerFormula()
   * @generated
   * @ordered
   */
  protected Assertions innerFormula;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionNotImpl()
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
    return XptPackage.Literals.ASSERTION_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertions getInnerFormula()
  {
    return innerFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerFormula(Assertions newInnerFormula, NotificationChain msgs)
  {
    Assertions oldInnerFormula = innerFormula;
    innerFormula = newInnerFormula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_NOT__INNER_FORMULA, oldInnerFormula, newInnerFormula);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerFormula(Assertions newInnerFormula)
  {
    if (newInnerFormula != innerFormula)
    {
      NotificationChain msgs = null;
      if (innerFormula != null)
        msgs = ((InternalEObject)innerFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_NOT__INNER_FORMULA, null, msgs);
      if (newInnerFormula != null)
        msgs = ((InternalEObject)newInnerFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_NOT__INNER_FORMULA, null, msgs);
      msgs = basicSetInnerFormula(newInnerFormula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_NOT__INNER_FORMULA, newInnerFormula, newInnerFormula));
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
      case XptPackage.ASSERTION_NOT__INNER_FORMULA:
        return basicSetInnerFormula(null, msgs);
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
      case XptPackage.ASSERTION_NOT__INNER_FORMULA:
        return getInnerFormula();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XptPackage.ASSERTION_NOT__INNER_FORMULA:
        setInnerFormula((Assertions)newValue);
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
      case XptPackage.ASSERTION_NOT__INNER_FORMULA:
        setInnerFormula((Assertions)null);
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
      case XptPackage.ASSERTION_NOT__INNER_FORMULA:
        return innerFormula != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertionNotImpl
