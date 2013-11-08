/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#isBool <em>Bool</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends AssertionForm
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(Values)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Values()
   * @model containment="true"
   * @generated
   */
  Values getValues();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Assertion#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(Values value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(boolean)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Bool()
   * @model
   * @generated
   */
  boolean isBool();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Assertion#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #isBool()
   * @generated
   */
  void setBool(boolean value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpt.xpt.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpt.xpt.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Assertion
