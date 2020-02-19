/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.iDSL.Color;
import org.xtext.example.mydsl.iDSL.IDSLPackage;
import org.xtext.example.mydsl.iDSL.Picturegraph;
import org.xtext.example.mydsl.iDSL.PicturegraphType;
import org.xtext.example.mydsl.iDSL.ShowOptionsOff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picturegraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getPicturegraphdata <em>Picturegraphdata</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getShowlegend <em>Showlegend</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getShowtitle <em>Showtitle</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iDSL.impl.PicturegraphImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicturegraphImpl extends MinimalEObjectImpl.Container implements Picturegraph
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getColors() <em>Colors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColors()
   * @generated
   * @ordered
   */
  protected static final String COLORS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColors() <em>Colors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColors()
   * @generated
   * @ordered
   */
  protected String colors = COLORS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPicturegraphdata() <em>Picturegraphdata</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPicturegraphdata()
   * @generated
   * @ordered
   */
  protected EList<String> picturegraphdata;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected static final int PADDING_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected int padding = PADDING_EDEFAULT;

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
   * The default value of the '{@link #getShowlegend() <em>Showlegend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowlegend()
   * @generated
   * @ordered
   */
  protected static final ShowOptionsOff SHOWLEGEND_EDEFAULT = ShowOptionsOff.SHOW1;

  /**
   * The cached value of the '{@link #getShowlegend() <em>Showlegend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowlegend()
   * @generated
   * @ordered
   */
  protected ShowOptionsOff showlegend = SHOWLEGEND_EDEFAULT;

  /**
   * The default value of the '{@link #getShowtitle() <em>Showtitle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowtitle()
   * @generated
   * @ordered
   */
  protected static final ShowOptionsOff SHOWTITLE_EDEFAULT = ShowOptionsOff.SHOW1;

  /**
   * The cached value of the '{@link #getShowtitle() <em>Showtitle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowtitle()
   * @generated
   * @ordered
   */
  protected ShowOptionsOff showtitle = SHOWTITLE_EDEFAULT;

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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final PicturegraphType TYPE_EDEFAULT = PicturegraphType.TYPE1;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PicturegraphType type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PicturegraphImpl()
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
    return IDSLPackage.Literals.PICTUREGRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__COLOR, oldColor, newColor);
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
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.PICTUREGRAPH__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IDSLPackage.PICTUREGRAPH__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getColors()
  {
    return colors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColors(String newColors)
  {
    String oldColors = colors;
    colors = newColors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__COLORS, oldColors, colors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPicturegraphdata()
  {
    if (picturegraphdata == null)
    {
      picturegraphdata = new EDataTypeEList<String>(String.class, this, IDSLPackage.PICTUREGRAPH__PICTUREGRAPHDATA);
    }
    return picturegraphdata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPadding()
  {
    return padding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPadding(int newPadding)
  {
    int oldPadding = padding;
    padding = newPadding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__PADDING, oldPadding, padding));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShowOptionsOff getShowlegend()
  {
    return showlegend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShowlegend(ShowOptionsOff newShowlegend)
  {
    ShowOptionsOff oldShowlegend = showlegend;
    showlegend = newShowlegend == null ? SHOWLEGEND_EDEFAULT : newShowlegend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__SHOWLEGEND, oldShowlegend, showlegend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShowOptionsOff getShowtitle()
  {
    return showtitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShowtitle(ShowOptionsOff newShowtitle)
  {
    ShowOptionsOff oldShowtitle = showtitle;
    showtitle = newShowtitle == null ? SHOWTITLE_EDEFAULT : newShowtitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__SHOWTITLE, oldShowtitle, showtitle));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PicturegraphType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(PicturegraphType newType)
  {
    PicturegraphType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IDSLPackage.PICTUREGRAPH__TYPE, oldType, type));
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
      case IDSLPackage.PICTUREGRAPH__COLOR:
        return basicSetColor(null, msgs);
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
      case IDSLPackage.PICTUREGRAPH__NAME:
        return getName();
      case IDSLPackage.PICTUREGRAPH__COLOR:
        return getColor();
      case IDSLPackage.PICTUREGRAPH__COLORS:
        return getColors();
      case IDSLPackage.PICTUREGRAPH__PICTUREGRAPHDATA:
        return getPicturegraphdata();
      case IDSLPackage.PICTUREGRAPH__LABEL:
        return getLabel();
      case IDSLPackage.PICTUREGRAPH__PADDING:
        return getPadding();
      case IDSLPackage.PICTUREGRAPH__POSITION:
        return getPosition();
      case IDSLPackage.PICTUREGRAPH__SHOWLEGEND:
        return getShowlegend();
      case IDSLPackage.PICTUREGRAPH__SHOWTITLE:
        return getShowtitle();
      case IDSLPackage.PICTUREGRAPH__SIZE:
        return getSize();
      case IDSLPackage.PICTUREGRAPH__TITLE:
        return getTitle();
      case IDSLPackage.PICTUREGRAPH__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IDSLPackage.PICTUREGRAPH__NAME:
        setName((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__COLOR:
        setColor((Color)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__COLORS:
        setColors((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__PICTUREGRAPHDATA:
        getPicturegraphdata().clear();
        getPicturegraphdata().addAll((Collection<? extends String>)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__LABEL:
        setLabel((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__PADDING:
        setPadding((Integer)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__POSITION:
        setPosition((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__SHOWLEGEND:
        setShowlegend((ShowOptionsOff)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__SHOWTITLE:
        setShowtitle((ShowOptionsOff)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__SIZE:
        setSize((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__TITLE:
        setTitle((String)newValue);
        return;
      case IDSLPackage.PICTUREGRAPH__TYPE:
        setType((PicturegraphType)newValue);
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
      case IDSLPackage.PICTUREGRAPH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__COLOR:
        setColor((Color)null);
        return;
      case IDSLPackage.PICTUREGRAPH__COLORS:
        setColors(COLORS_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__PICTUREGRAPHDATA:
        getPicturegraphdata().clear();
        return;
      case IDSLPackage.PICTUREGRAPH__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__PADDING:
        setPadding(PADDING_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__SHOWLEGEND:
        setShowlegend(SHOWLEGEND_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__SHOWTITLE:
        setShowtitle(SHOWTITLE_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case IDSLPackage.PICTUREGRAPH__TYPE:
        setType(TYPE_EDEFAULT);
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
      case IDSLPackage.PICTUREGRAPH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IDSLPackage.PICTUREGRAPH__COLOR:
        return color != null;
      case IDSLPackage.PICTUREGRAPH__COLORS:
        return COLORS_EDEFAULT == null ? colors != null : !COLORS_EDEFAULT.equals(colors);
      case IDSLPackage.PICTUREGRAPH__PICTUREGRAPHDATA:
        return picturegraphdata != null && !picturegraphdata.isEmpty();
      case IDSLPackage.PICTUREGRAPH__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case IDSLPackage.PICTUREGRAPH__PADDING:
        return padding != PADDING_EDEFAULT;
      case IDSLPackage.PICTUREGRAPH__POSITION:
        return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
      case IDSLPackage.PICTUREGRAPH__SHOWLEGEND:
        return showlegend != SHOWLEGEND_EDEFAULT;
      case IDSLPackage.PICTUREGRAPH__SHOWTITLE:
        return showtitle != SHOWTITLE_EDEFAULT;
      case IDSLPackage.PICTUREGRAPH__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case IDSLPackage.PICTUREGRAPH__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case IDSLPackage.PICTUREGRAPH__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", colors: ");
    result.append(colors);
    result.append(", picturegraphdata: ");
    result.append(picturegraphdata);
    result.append(", label: ");
    result.append(label);
    result.append(", padding: ");
    result.append(padding);
    result.append(", position: ");
    result.append(position);
    result.append(", showlegend: ");
    result.append(showlegend);
    result.append(", showtitle: ");
    result.append(showtitle);
    result.append(", size: ");
    result.append(size);
    result.append(", title: ");
    result.append(title);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //PicturegraphImpl