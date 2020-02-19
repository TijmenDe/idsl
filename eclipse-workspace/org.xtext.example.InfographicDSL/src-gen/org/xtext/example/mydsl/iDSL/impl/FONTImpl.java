/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.iDSL.FONT;
import org.xtext.example.mydsl.iDSL.Font_Family;
import org.xtext.example.mydsl.iDSL.Font_Weight;
import org.xtext.example.mydsl.iDSL.IDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FONT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.FONTImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.FONTImpl#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FONTImpl extends MinimalEObjectImpl.Container implements FONT
{
  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final Font_Weight WEIGHT_EDEFAULT = Font_Weight.B1;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Font_Weight weight = WEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected static final Font_Family FAMILY_EDEFAULT = Font_Family.FONT1;

  /**
   * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamily()
   * @generated
   * @ordered
   */
  protected Font_Family family = FAMILY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FONTImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IDSLPackage.Literals.FONT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Font_Weight getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeight(Font_Weight newWeight)
  {
    Font_Weight oldWeight = weight;
    weight = newWeight == null ? WEIGHT_EDEFAULT : newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.FONT__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Font_Family getFamily()
  {
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFamily(Font_Family newFamily)
  {
    Font_Family oldFamily = family;
    family = newFamily == null ? FAMILY_EDEFAULT : newFamily;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.FONT__FAMILY, oldFamily, family));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IDSLPackage.FONT__WEIGHT:
        return getWeight();
      case IDSLPackage.FONT__FAMILY:
        return getFamily();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IDSLPackage.FONT__WEIGHT:
        setWeight((Font_Weight)newValue);
        return;
      case IDSLPackage.FONT__FAMILY:
        setFamily((Font_Family)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IDSLPackage.FONT__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case IDSLPackage.FONT__FAMILY:
        setFamily(FAMILY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IDSLPackage.FONT__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
      case IDSLPackage.FONT__FAMILY:
        return family != FAMILY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (weight: ");
    result.append(weight);
    result.append(", family: ");
    result.append(family);
    result.append(')');
    return result.toString();
  }

} //FONTImpl
