/**
 */
package org.xtext.example.xpt.xpt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.Model#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Model#getQuerySet <em>Query Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpt.xpt.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.xtext.example.xpt.xpt.XptPackage#getModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Query Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Set</em>' containment reference.
   * @see #setQuerySet(AssertionSet)
   * @see org.xtext.example.xpt.xpt.XptPackage#getModel_QuerySet()
   * @model containment="true"
   * @generated
   */
  AssertionSet getQuerySet();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Model#getQuerySet <em>Query Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Set</em>' containment reference.
   * @see #getQuerySet()
   * @generated
   */
  void setQuerySet(AssertionSet value);

} // Model
