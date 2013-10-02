/**
 */
package org.xtext.example.xpt.xpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionSet#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionSet#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionSet()
 * @model
 * @generated
 */
public interface AssertionSet extends Assertions
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Assertions)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionSet_Left()
   * @model containment="true"
   * @generated
   */
  Assertions getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionSet#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Assertions value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Assertions)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionSet_Right()
   * @model containment="true"
   * @generated
   */
  Assertions getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionSet#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Assertions value);

} // AssertionSet
