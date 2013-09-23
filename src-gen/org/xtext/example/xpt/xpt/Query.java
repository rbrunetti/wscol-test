/**
 */
package org.xtext.example.xpt.xpt;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpt.xpt.Query#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpt.xpt.XptPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
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
   * @see org.xtext.example.xpt.xpt.XptPackage#getQuery_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();
  
  /**
   * Returns the {@code String} construction of a Query, composing its steps and resolving variables
   * @param query a query variable
   * @param variables an hash map containing the declared variables
   * @return a string translation of a query
   */
  String queryConstruction(Map<String, Object> variables);

} // Query
