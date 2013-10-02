/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Quantified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionQuantified#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionQuantified#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionQuantified#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionQuantified#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionQuantified()
 * @model
 * @generated
 */
public interface AssertionQuantified extends Assertions
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' attribute.
   * @see #setQuantifier(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionQuantified_Quantifier()
   * @model
   * @generated
   */
  String getQuantifier();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getQuantifier <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' attribute.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionQuantified_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute.
   * @see #setValues(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionQuantified_Values()
   * @model
   * @generated
   */
  String getValues();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionQuantified#getValues <em>Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' attribute.
   * @see #getValues()
   * @generated
   */
  void setValues(String value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpt.xpt.Assertions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionQuantified_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Assertions> getConditions();

} // AssertionQuantified
