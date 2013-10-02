/**
 */
package org.xtext.example.xpt.xpt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negated Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.NegatedFormula#getInnerFormula <em>Inner Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getNegatedFormula()
 * @model
 * @generated
 */
public interface NegatedFormula extends Assertions
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
   * @see org.xtext.example.xpt.xpt.XptPackage#getNegatedFormula_InnerFormula()
   * @model containment="true"
   * @generated
   */
  Assertions getInnerFormula();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.NegatedFormula#getInnerFormula <em>Inner Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner Formula</em>' containment reference.
   * @see #getInnerFormula()
   * @generated
   */
  void setInnerFormula(Assertions value);

} // NegatedFormula
