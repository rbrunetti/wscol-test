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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.xpt.xpt.Assertions;
import org.xtext.example.xpt.xpt.Declaration;
import org.xtext.example.xpt.xpt.Model;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.ModelImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.ModelImpl#getAssertionSet <em>Assertion Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declarations;

  /**
   * The cached value of the '{@link #getAssertionSet() <em>Assertion Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertionSet()
   * @generated
   * @ordered
   */
  protected Assertions assertionSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return XptPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, XptPackage.MODEL__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertions getAssertionSet()
  {
    return assertionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertionSet(Assertions newAssertionSet, NotificationChain msgs)
  {
    Assertions oldAssertionSet = assertionSet;
    assertionSet = newAssertionSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XptPackage.MODEL__ASSERTION_SET, oldAssertionSet, newAssertionSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertionSet(Assertions newAssertionSet)
  {
    if (newAssertionSet != assertionSet)
    {
      NotificationChain msgs = null;
      if (assertionSet != null)
        msgs = ((InternalEObject)assertionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XptPackage.MODEL__ASSERTION_SET, null, msgs);
      if (newAssertionSet != null)
        msgs = ((InternalEObject)newAssertionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XptPackage.MODEL__ASSERTION_SET, null, msgs);
      msgs = basicSetAssertionSet(newAssertionSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.MODEL__ASSERTION_SET, newAssertionSet, newAssertionSet));
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
      case XptPackage.MODEL__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case XptPackage.MODEL__ASSERTION_SET:
        return basicSetAssertionSet(null, msgs);
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
      case XptPackage.MODEL__DECLARATIONS:
        return getDeclarations();
      case XptPackage.MODEL__ASSERTION_SET:
        return getAssertionSet();
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
      case XptPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Declaration>)newValue);
        return;
      case XptPackage.MODEL__ASSERTION_SET:
        setAssertionSet((Assertions)newValue);
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
      case XptPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
        return;
      case XptPackage.MODEL__ASSERTION_SET:
        setAssertionSet((Assertions)null);
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
      case XptPackage.MODEL__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case XptPackage.MODEL__ASSERTION_SET:
        return assertionSet != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
