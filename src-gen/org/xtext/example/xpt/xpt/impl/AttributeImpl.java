/**
 */
package org.xtext.example.xpt.xpt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpt.xpt.Attribute;
import org.xtext.example.xpt.xpt.XptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttributeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttributeImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttributeImpl#getNumberValue <em>Number Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttributeImpl#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.impl.AttributeImpl#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
   * The default value of the '{@link #getNumberValue() <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberValue()
   * @generated
   * @ordered
   */
  protected static final double NUMBER_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getNumberValue() <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberValue()
   * @generated
   * @ordered
   */
  protected double numberValue = NUMBER_VALUE_EDEFAULT;

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
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final double NUMBER_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected double number = NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return XptPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTRIBUTE__PROPERTY, oldProperty, property));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTRIBUTE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getNumberValue()
  {
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberValue(double newNumberValue)
  {
    double oldNumberValue = numberValue;
    numberValue = newNumberValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTRIBUTE__NUMBER_VALUE, oldNumberValue, numberValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTRIBUTE__STR_VALUE, oldStrValue, strValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(double newNumber)
  {
    double oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XptPackage.ATTRIBUTE__NUMBER, oldNumber, number));
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
      case XptPackage.ATTRIBUTE__PROPERTY:
        return getProperty();
      case XptPackage.ATTRIBUTE__OP:
        return getOp();
      case XptPackage.ATTRIBUTE__NUMBER_VALUE:
        return getNumberValue();
      case XptPackage.ATTRIBUTE__STR_VALUE:
        return getStrValue();
      case XptPackage.ATTRIBUTE__NUMBER:
        return getNumber();
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
      case XptPackage.ATTRIBUTE__PROPERTY:
        setProperty((String)newValue);
        return;
      case XptPackage.ATTRIBUTE__OP:
        setOp((String)newValue);
        return;
      case XptPackage.ATTRIBUTE__NUMBER_VALUE:
        setNumberValue((Double)newValue);
        return;
      case XptPackage.ATTRIBUTE__STR_VALUE:
        setStrValue((String)newValue);
        return;
      case XptPackage.ATTRIBUTE__NUMBER:
        setNumber((Double)newValue);
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
      case XptPackage.ATTRIBUTE__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case XptPackage.ATTRIBUTE__OP:
        setOp(OP_EDEFAULT);
        return;
      case XptPackage.ATTRIBUTE__NUMBER_VALUE:
        setNumberValue(NUMBER_VALUE_EDEFAULT);
        return;
      case XptPackage.ATTRIBUTE__STR_VALUE:
        setStrValue(STR_VALUE_EDEFAULT);
        return;
      case XptPackage.ATTRIBUTE__NUMBER:
        setNumber(NUMBER_EDEFAULT);
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
      case XptPackage.ATTRIBUTE__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case XptPackage.ATTRIBUTE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case XptPackage.ATTRIBUTE__NUMBER_VALUE:
        return numberValue != NUMBER_VALUE_EDEFAULT;
      case XptPackage.ATTRIBUTE__STR_VALUE:
        return STR_VALUE_EDEFAULT == null ? strValue != null : !STR_VALUE_EDEFAULT.equals(strValue);
      case XptPackage.ATTRIBUTE__NUMBER:
        return number != NUMBER_EDEFAULT;
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
    result.append(", numberValue: ");
    result.append(numberValue);
    result.append(", strValue: ");
    result.append(strValue);
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
