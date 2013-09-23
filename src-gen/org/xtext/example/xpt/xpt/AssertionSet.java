/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.AssertionSet#getAssertions <em>Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionSet()
 * @model
 * @generated
 */
public interface AssertionSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpt.xpt.AssertionForm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertionSet_Assertions()
   * @model containment="true"
   * @generated
   */
  EList<AssertionForm> getAssertions();

} // AssertionSet
