/**
 */
package org.xtext.example.xpt.xpt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpt.xpt.Attr;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttrImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttrImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttrImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttrImpl#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttrImpl#getInt <em>Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttrImpl extends MinimalEObjectImpl.Container implements Attr
{
  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected String property = PROPERTY_EDEFAULT;

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
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final double INT_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected double intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrValue()
   * @generated
   * @ordered
   */
  protected static final String STR_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrValue()
   * @generated
   * @ordered
   */
  protected String strValue = STR_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final double INT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected double int_ = INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrImpl()
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
    return XptPackage.Literals.ATTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(String newProperty)
  {
    String oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTR__PROPERTY, oldProperty, property));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTR__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(double newIntValue)
  {
    double oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTR__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrValue()
  {
    return strValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrValue(String newStrValue)
  {
    String oldStrValue = strValue;
    strValue = newStrValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTR__STR_VALUE, oldStrValue, strValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(double newInt)
  {
    double oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTR__INT, oldInt, int_));
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
      case XptPackage.ATTR__PROPERTY:
        return getProperty();
      case XptPackage.ATTR__OP:
        return getOp();
      case XptPackage.ATTR__INT_VALUE:
        return getIntValue();
      case XptPackage.ATTR__STR_VALUE:
        return getStrValue();
      case XptPackage.ATTR__INT:
        return getInt();
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
      case XptPackage.ATTR__PROPERTY:
        setProperty((String)newValue);
        return;
      case XptPackage.ATTR__OP:
        setOp((String)newValue);
        return;
      case XptPackage.ATTR__INT_VALUE:
        setIntValue((Double)newValue);
        return;
      case XptPackage.ATTR__STR_VALUE:
        setStrValue((String)newValue);
        return;
      case XptPackage.ATTR__INT:
        setInt((Double)newValue);
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
      case XptPackage.ATTR__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case XptPackage.ATTR__OP:
        setOp(OP_EDEFAULT);
        return;
      case XptPackage.ATTR__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case XptPackage.ATTR__STR_VALUE:
        setStrValue(STR_VALUE_EDEFAULT);
        return;
      case XptPackage.ATTR__INT:
        setInt(INT_EDEFAULT);
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
      case XptPackage.ATTR__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case XptPackage.ATTR__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case XptPackage.ATTR__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case XptPackage.ATTR__STR_VALUE:
        return STR_VALUE_EDEFAULT == null ? strValue != null : !STR_VALUE_EDEFAULT.equals(strValue);
      case XptPackage.ATTR__INT:
        return int_ != INT_EDEFAULT;
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
    result.append(" (property: ");
    result.append(property);
    result.append(", op: ");
    result.append(op);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", strValue: ");
    result.append(strValue);
    result.append(", int: ");
    result.append(int_);
    result.append(')');
    return result.toString();
  }

} //AttrImpl
