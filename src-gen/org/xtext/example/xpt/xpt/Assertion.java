/**
 */
package org.xtext.example.xpt.xpt;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.xpt.xpt.Assertion#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Assertion#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Assertion#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Constant)
   * @see org.xtext.example.xpt.xpt.XptPackage#getAssertion_Constant()
   * @model containment="true"
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link org.xtext.example.xpt.xpt.Assertion#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);
  
  String assertionConstruction(Map<String, Object> variables); //TODO necessario??

} // Assertion
