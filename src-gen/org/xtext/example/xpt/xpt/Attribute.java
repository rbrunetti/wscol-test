/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.Attribute#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Attribute#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Attribute#getNumberValue <em>Number Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Attribute#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Attribute#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Attribute#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Attribute#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Number Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Value</em>' attribute.
   * @see #setNumberValue(double)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute_NumberValue()
   * @model
   * @generated
   */
  double getNumberValue();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Attribute#getNumberValue <em>Number Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Value</em>' attribute.
   * @see #getNumberValue()
   * @generated
   */
  void setNumberValue(double value);

  /**
   * Returns the value of the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str Value</em>' attribute.
   * @see #setStrValue(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute_StrValue()
   * @model
   * @generated
   */
  String getStrValue();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Attribute#getStrValue <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str Value</em>' attribute.
   * @see #getStrValue()
   * @generated
   */
  void setStrValue(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(double)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAttribute_Number()
   * @model
   * @generated
   */
  double getNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Attribute#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(double value);

} // Attribute
