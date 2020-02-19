/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.Color#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.iDSL.Color_Basic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.xtext.example.mydsl.iDSL.Color_Basic
   * @see #setColor(Color_Basic)
   * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getColor_Color()
   * @model
   * @generated
   */
  Color_Basic getColor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iDSL.Color#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.xtext.example.mydsl.iDSL.Color_Basic
   * @see #getColor()
   * @generated
   */
  void setColor(Color_Basic value);

} // Color