/**
 */
package org.xtext.example.xpt.xpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionNot#getInnerFormula <em>Inner Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionNot()
 * @model
 * @generated
 */
public interface AssertionNot extends Assertions
{
  /**
   * Returns the value of the '<em><b>Inner Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Formula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Formula</em>' containment reference.
   * @see #setInnerFormula(Assertions)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionNot_InnerFormula()
   * @model containment="true"
   * @generated
   */
  Assertions getInnerFormula();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.AssertionNot#getInnerFormula <em>Inner Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner Formula</em>' containment reference.
   * @see #getInnerFormula()
   * @generated
   */
  void setInnerFormula(Assertions value);

} // AssertionNot
