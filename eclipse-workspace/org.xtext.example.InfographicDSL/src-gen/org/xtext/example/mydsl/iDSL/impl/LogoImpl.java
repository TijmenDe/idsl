/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.iDSL.IDSLPackage;
import org.xtext.example.mydsl.iDSL.Logo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.LogoImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.LogoImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogoImpl extends MinimalEObjectImpl.Container implements Logo
{
  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final String POSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected String position = POSITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogoImpl()
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
    return IDSLPackage.Literals.LOGO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.LOGO__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPosition(String newPosition)
  {
    String oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.LOGO__POSITION, oldPosition, position));
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
      case IDSLPackage.LOGO__SIZE:
        return getSize();
      case IDSLPackage.LOGO__POSITION:
        return getPosition();
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
      case IDSLPackage.LOGO__SIZE:
        setSize((String)newValue);
        return;
      case IDSLPackage.LOGO__POSITION:
        setPosition((String)newValue);
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
      case IDSLPackage.LOGO__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case IDSLPackage.LOGO__POSITION:
        setPosition(POSITION_EDEFAULT);
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
      case IDSLPackage.LOGO__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case IDSLPackage.LOGO__POSITION:
        return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
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
    result.append(" (size: ");
    result.append(size);
    result.append(", position: ");
    result.append(position);
    result.append(')');
    return result.toString();
  }

} //LogoImpl