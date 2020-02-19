/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.Logo#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.Logo#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getLogo()
 * @model
 * @generated
 */
public interface Logo extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getLogo_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iDSL.Logo#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(String)
   * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getLogo_Position()
   * @model
   * @generated
   */
  String getPosition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iDSL.Logo#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(String value);

} // Logo