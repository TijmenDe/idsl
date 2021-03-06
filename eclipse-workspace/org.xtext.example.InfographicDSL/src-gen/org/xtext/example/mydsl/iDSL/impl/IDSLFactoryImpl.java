/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.iDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDSLFactoryImpl extends EFactoryImpl implements IDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IDSLFactory init()
  {
    try
    {
      IDSLFactory theIDSLFactory = (IDSLFactory)EPackage.Registry.INSTANCE.getEFactory(IDSLPackage.eNS_URI);
      if (theIDSLFactory != null)
      {
        return theIDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IDSLPackage.INFOGRAPHIC: return createInfographic();
      case IDSLPackage.INFOGRAPHIC_ELEMENT_TYPE: return createInfographicElementType();
      case IDSLPackage.HEAD: return createHead();
      case IDSLPackage.TITLE: return createTitle();
      case IDSLPackage.LOGO: return createLogo();
      case IDSLPackage.BOX: return createBox();
      case IDSLPackage.TEXT: return createText();
      case IDSLPackage.IMAGE: return createImage();
      case IDSLPackage.PIECHART: return createPiechart();
      case IDSLPackage.BARCHART: return createBarchart();
      case IDSLPackage.PICTUREGRAPH: return createPicturegraph();
      case IDSLPackage.FOOT: return createFoot();
      case IDSLPackage.COLOR: return createColor();
      case IDSLPackage.FONT: return createFONT();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IDSLPackage.COLOR_BASIC:
        return createColor_BasicFromString(eDataType, initialValue);
      case IDSLPackage.FONT_WEIGHT:
        return createFont_WeightFromString(eDataType, initialValue);
      case IDSLPackage.FONT_FAMILY:
        return createFont_FamilyFromString(eDataType, initialValue);
      case IDSLPackage.ALIGN_POSSIBILITIES:
        return createAlignPossibilitiesFromString(eDataType, initialValue);
      case IDSLPackage.LEGEND_STYLE:
        return createLegendStyleFromString(eDataType, initialValue);
      case IDSLPackage.SHOW_OPTIONS_OFF:
        return createShowOptionsOffFromString(eDataType, initialValue);
      case IDSLPackage.PIE_TYPE:
        return createPieTypeFromString(eDataType, initialValue);
      case IDSLPackage.BAR_TYPE:
        return createBarTypeFromString(eDataType, initialValue);
      case IDSLPackage.PICTUREGRAPH_TYPE:
        return createPicturegraphTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IDSLPackage.COLOR_BASIC:
        return convertColor_BasicToString(eDataType, instanceValue);
      case IDSLPackage.FONT_WEIGHT:
        return convertFont_WeightToString(eDataType, instanceValue);
      case IDSLPackage.FONT_FAMILY:
        return convertFont_FamilyToString(eDataType, instanceValue);
      case IDSLPackage.ALIGN_POSSIBILITIES:
        return convertAlignPossibilitiesToString(eDataType, instanceValue);
      case IDSLPackage.LEGEND_STYLE:
        return convertLegendStyleToString(eDataType, instanceValue);
      case IDSLPackage.SHOW_OPTIONS_OFF:
        return convertShowOptionsOffToString(eDataType, instanceValue);
      case IDSLPackage.PIE_TYPE:
        return convertPieTypeToString(eDataType, instanceValue);
      case IDSLPackage.BAR_TYPE:
        return convertBarTypeToString(eDataType, instanceValue);
      case IDSLPackage.PICTUREGRAPH_TYPE:
        return convertPicturegraphTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Infographic createInfographic()
  {
    InfographicImpl infographic = new InfographicImpl();
    return infographic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfographicElementType createInfographicElementType()
  {
    InfographicElementTypeImpl infographicElementType = new InfographicElementTypeImpl();
    return infographicElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Logo createLogo()
  {
    LogoImpl logo = new LogoImpl();
    return logo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Box createBox()
  {
    BoxImpl box = new BoxImpl();
    return box;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Piechart createPiechart()
  {
    PiechartImpl piechart = new PiechartImpl();
    return piechart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Barchart createBarchart()
  {
    BarchartImpl barchart = new BarchartImpl();
    return barchart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Picturegraph createPicturegraph()
  {
    PicturegraphImpl picturegraph = new PicturegraphImpl();
    return picturegraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Foot createFoot()
  {
    FootImpl foot = new FootImpl();
    return foot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FONT createFONT()
  {
    FONTImpl font = new FONTImpl();
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color_Basic createColor_BasicFromString(EDataType eDataType, String initialValue)
  {
    Color_Basic result = Color_Basic.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColor_BasicToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font_Weight createFont_WeightFromString(EDataType eDataType, String initialValue)
  {
    Font_Weight result = Font_Weight.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFont_WeightToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font_Family createFont_FamilyFromString(EDataType eDataType, String initialValue)
  {
    Font_Family result = Font_Family.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFont_FamilyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignPossibilities createAlignPossibilitiesFromString(EDataType eDataType, String initialValue)
  {
    AlignPossibilities result = AlignPossibilities.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAlignPossibilitiesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegendStyle createLegendStyleFromString(EDataType eDataType, String initialValue)
  {
    LegendStyle result = LegendStyle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLegendStyleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowOptionsOff createShowOptionsOffFromString(EDataType eDataType, String initialValue)
  {
    ShowOptionsOff result = ShowOptionsOff.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertShowOptionsOffToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PieType createPieTypeFromString(EDataType eDataType, String initialValue)
  {
    PieType result = PieType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPieTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarType createBarTypeFromString(EDataType eDataType, String initialValue)
  {
    BarType result = BarType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBarTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PicturegraphType createPicturegraphTypeFromString(EDataType eDataType, String initialValue)
  {
    PicturegraphType result = PicturegraphType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPicturegraphTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IDSLPackage getIDSLPackage()
  {
    return (IDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IDSLPackage getPackage()
  {
    return IDSLPackage.eINSTANCE;
  }

} //IDSLFactoryImpl
