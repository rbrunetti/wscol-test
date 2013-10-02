/**
 */
package org.xtext.example.xpt.xpt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.xpt.xpt.Assertion;
import org.xtext.example.xpt.xpt.AssertionForm;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl#getLeftAssert <em>Left Assert</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AssertionFormImpl#getRightAssert <em>Right Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionFormImpl extends AssertionsImpl implements AssertionForm
{
  /**
   * The cached value of the '{@link #getLeftAssert() <em>Left Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAssert()
   * @generated
   * @ordered
   */
  protected Assertion leftAssert;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightAssert() <em>Right Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightAssert()
   * @generated
   * @ordered
   */
  protected Assertion rightAssert;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionFormImpl()
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
    return XptPackage.Literals.ASSERTION_FORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion getLeftAssert()
  {
    return leftAssert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftAssert(Assertion newLeftAssert, NotificationChain msgs)
  {
    Assertion oldLeftAssert = leftAssert;
    leftAssert = newLeftAssert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_FORM__LEFT_ASSERT, oldLeftAssert, newLeftAssert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAssert(Assertion newLeftAssert)
  {
    if (newLeftAssert != leftAssert)
    {
      NotificationChain msgs = null;
      if (leftAssert != null)
        msgs = ((InternalEObject)leftAssert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_FORM__LEFT_ASSERT, null, msgs);
      if (newLeftAssert != null)
        msgs = ((InternalEObject)newLeftAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_FORM__LEFT_ASSERT, null, msgs);
      msgs = basicSetLeftAssert(newLeftAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_FORM__LEFT_ASSERT, newLeftAssert, newLeftAssert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_FORM__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion getRightAssert()
  {
    return rightAssert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightAssert(Assertion newRightAssert, NotificationChain msgs)
  {
    Assertion oldRightAssert = rightAssert;
    rightAssert = newRightAssert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_FORM__RIGHT_ASSERT, oldRightAssert, newRightAssert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightAssert(Assertion newRightAssert)
  {
    if (newRightAssert != rightAssert)
    {
      NotificationChain msgs = null;
      if (rightAssert != null)
        msgs = ((InternalEObject)rightAssert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_FORM__RIGHT_ASSERT, null, msgs);
      if (newRightAssert != null)
        msgs = ((InternalEObject)newRightAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.ASSERTION_FORM__RIGHT_ASSERT, null, msgs);
      msgs = basicSetRightAssert(newRightAssert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ASSERTION_FORM__RIGHT_ASSERT, newRightAssert, newRightAssert));
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
      case XptPackage.ASSERTION_FORM__LEFT_ASSERT:
        return basicSetLeftAssert(null, msgs);
      case XptPackage.ASSERTION_FORM__RIGHT_ASSERT:
        return basicSetRightAssert(null, msgs);
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
      case XptPackage.ASSERTION_FORM__LEFT_ASSERT:
        return getLeftAssert();
      case XptPackage.ASSERTION_FORM__OP:
        return getOp();
      case XptPackage.ASSERTION_FORM__RIGHT_ASSERT:
        return getRightAssert();
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
      case XptPackage.ASSERTION_FORM__LEFT_ASSERT:
        setLeftAssert((Assertion)newValue);
        return;
      case XptPackage.ASSERTION_FORM__OP:
        setOp((String)newValue);
        return;
      case XptPackage.ASSERTION_FORM__RIGHT_ASSERT:
        setRightAssert((Assertion)newValue);
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
      case XptPackage.ASSERTION_FORM__LEFT_ASSERT:
        setLeftAssert((Assertion)null);
        return;
      case XptPackage.ASSERTION_FORM__OP:
        setOp(OP_EDEFAULT);
        return;
      case XptPackage.ASSERTION_FORM__RIGHT_ASSERT:
        setRightAssert((Assertion)null);
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
      case XptPackage.ASSERTION_FORM__LEFT_ASSERT:
        return leftAssert != null;
      case XptPackage.ASSERTION_FORM__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case XptPackage.ASSERTION_FORM__RIGHT_ASSERT:
        return rightAssert != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //AssertionFormImpl
