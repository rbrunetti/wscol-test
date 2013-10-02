/**
 */
package org.xtext.example.xpt.xpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionForm#getLeftAssert <em>Left Assert</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionForm#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionForm#getRightAssert <em>Right Assert</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionForm()
 * @model
 * @generated
 */
public interface AssertionForm extends Assertions
{
  /**
   * Returns the value of the '<em><b>Left Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Assert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Assert</em>' containment reference.
   * @see #setLeftAssert(Assertion)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionForm_LeftAssert()
   * @model containment="true"
   * @generated
   */
  Assertion getLeftAssert();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionForm#getLeftAssert <em>Left Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Assert</em>' containment reference.
   * @see #getLeftAssert()
   * @generated
   */
  void setLeftAssert(Assertion value);

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
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionForm_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionForm#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right Assert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Assert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Assert</em>' containment reference.
   * @see #setRightAssert(Assertion)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionForm_RightAssert()
   * @model containment="true"
   * @generated
   */
  Assertion getRightAssert();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionForm#getRightAssert <em>Right Assert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Assert</em>' containment reference.
   * @see #getRightAssert()
   * @generated
   */
  void setRightAssert(Assertion value);

} // AssertionForm
