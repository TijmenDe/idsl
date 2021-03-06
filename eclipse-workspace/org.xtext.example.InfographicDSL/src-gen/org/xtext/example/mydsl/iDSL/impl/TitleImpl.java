/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.iDSL.AlignPossibilities;
import org.xtext.example.mydsl.iDSL.Color;
import org.xtext.example.mydsl.iDSL.FONT;
import org.xtext.example.mydsl.iDSL.IDSLPackage;
import org.xtext.example.mydsl.iDSL.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getMaxwidth <em>Maxwidth</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.TitleImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends MinimalEObjectImpl.Container implements Title
{
  /**
   * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected static final AlignPossibilities ALIGN_EDEFAULT = AlignPossibilities.LEFT;

  /**
   * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected AlignPossibilities align = ALIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected FONT font;

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
   * The default value of the '{@link #getMaxwidth() <em>Maxwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxwidth()
   * @generated
   * @ordered
   */
  protected static final int MAXWIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxwidth() <em>Maxwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxwidth()
   * @generated
   * @ordered
   */
  protected int maxwidth = MAXWIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TitleImpl()
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
    return IDSLPackage.Literals.TITLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlignPossibilities getAlign()
  {
    return align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlign(AlignPossibilities newAlign)
  {
    AlignPossibilities oldAlign = align;
    align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__ALIGN, oldAlign, align));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.TITLE__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.TITLE__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FONT getFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFont(FONT newFont, NotificationChain msgs)
  {
    FONT oldFont = font;
    font = newFont;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__FONT, oldFont, newFont);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFont(FONT newFont)
  {
    if (newFont != font)
    {
      NotificationChain msgs = null;
      if (font != null)
        msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.TITLE__FONT, null, msgs);
      if (newFont != null)
        msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.TITLE__FONT, null, msgs);
      msgs = basicSetFont(newFont, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__FONT, newFont, newFont));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxwidth()
  {
    return maxwidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxwidth(int newMaxwidth)
  {
    int oldMaxwidth = maxwidth;
    maxwidth = newMaxwidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__MAXWIDTH, oldMaxwidth, maxwidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.TITLE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IDSLPackage.TITLE__COLOR:
        return basicSetColor(null, msgs);
      case IDSLPackage.TITLE__FONT:
        return basicSetFont(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case IDSLPackage.TITLE__ALIGN:
        return getAlign();
      case IDSLPackage.TITLE__COLOR:
        return getColor();
      case IDSLPackage.TITLE__FONT:
        return getFont();
      case IDSLPackage.TITLE__POSITION:
        return getPosition();
      case IDSLPackage.TITLE__MAXWIDTH:
        return getMaxwidth();
      case IDSLPackage.TITLE__VALUE:
        return getValue();
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
      case IDSLPackage.TITLE__ALIGN:
        setAlign((AlignPossibilities)newValue);
        return;
      case IDSLPackage.TITLE__COLOR:
        setColor((Color)newValue);
        return;
      case IDSLPackage.TITLE__FONT:
        setFont((FONT)newValue);
        return;
      case IDSLPackage.TITLE__POSITION:
        setPosition((String)newValue);
        return;
      case IDSLPackage.TITLE__MAXWIDTH:
        setMaxwidth((Integer)newValue);
        return;
      case IDSLPackage.TITLE__VALUE:
        setValue((String)newValue);
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
      case IDSLPackage.TITLE__ALIGN:
        setAlign(ALIGN_EDEFAULT);
        return;
      case IDSLPackage.TITLE__COLOR:
        setColor((Color)null);
        return;
      case IDSLPackage.TITLE__FONT:
        setFont((FONT)null);
        return;
      case IDSLPackage.TITLE__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case IDSLPackage.TITLE__MAXWIDTH:
        setMaxwidth(MAXWIDTH_EDEFAULT);
        return;
      case IDSLPackage.TITLE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case IDSLPackage.TITLE__ALIGN:
        return align != ALIGN_EDEFAULT;
      case IDSLPackage.TITLE__COLOR:
        return color != null;
      case IDSLPackage.TITLE__FONT:
        return font != null;
      case IDSLPackage.TITLE__POSITION:
        return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
      case IDSLPackage.TITLE__MAXWIDTH:
        return maxwidth != MAXWIDTH_EDEFAULT;
      case IDSLPackage.TITLE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (align: ");
    result.append(align);
    result.append(", position: ");
    result.append(position);
    result.append(", maxwidth: ");
    result.append(maxwidth);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //TitleImpl
