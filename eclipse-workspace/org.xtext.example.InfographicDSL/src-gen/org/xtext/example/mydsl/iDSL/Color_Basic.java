/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.iDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Basic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.iDSL.IDSLPackage#getColor_Basic()
 * @model
 * @generated
 */
public enum Color_Basic implements Enumerator
{
  /**
   * The '<em><b>C1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C1_VALUE
   * @generated
   * @ordered
   */
  C1(0, "c1", "green"),

  /**
   * The '<em><b>C2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C2_VALUE
   * @generated
   * @ordered
   */
  C2(1, "c2", "red"),

  /**
   * The '<em><b>C3</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C3_VALUE
   * @generated
   * @ordered
   */
  C3(2, "c3", "blue"),

  /**
   * The '<em><b>C4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C4_VALUE
   * @generated
   * @ordered
   */
  C4(3, "c4", "yellow"),

  /**
   * The '<em><b>C5</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C5_VALUE
   * @generated
   * @ordered
   */
  C5(4, "c5", "black"),

  /**
   * The '<em><b>C6</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C6_VALUE
   * @generated
   * @ordered
   */
  C6(5, "c6", "white"),

  /**
   * The '<em><b>C7</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C7_VALUE
   * @generated
   * @ordered
   */
  C7(6, "c7", "orange"),

  /**
   * The '<em><b>C8</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C8_VALUE
   * @generated
   * @ordered
   */
  C8(7, "c8", "purple"),

  /**
   * The '<em><b>C9</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C9_VALUE
   * @generated
   * @ordered
   */
  C9(8, "c9", "pink");

  /**
   * The '<em><b>C1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C1
   * @model name="c1" literal="green"
   * @generated
   * @ordered
   */
  public static final int C1_VALUE = 0;

  /**
   * The '<em><b>C2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C2
   * @model name="c2" literal="red"
   * @generated
   * @ordered
   */
  public static final int C2_VALUE = 1;

  /**
   * The '<em><b>C3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C3
   * @model name="c3" literal="blue"
   * @generated
   * @ordered
   */
  public static final int C3_VALUE = 2;

  /**
   * The '<em><b>C4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C4
   * @model name="c4" literal="yellow"
   * @generated
   * @ordered
   */
  public static final int C4_VALUE = 3;

  /**
   * The '<em><b>C5</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C5
   * @model name="c5" literal="black"
   * @generated
   * @ordered
   */
  public static final int C5_VALUE = 4;

  /**
   * The '<em><b>C6</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C6
   * @model name="c6" literal="white"
   * @generated
   * @ordered
   */
  public static final int C6_VALUE = 5;

  /**
   * The '<em><b>C7</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C7
   * @model name="c7" literal="orange"
   * @generated
   * @ordered
   */
  public static final int C7_VALUE = 6;

  /**
   * The '<em><b>C8</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C8
   * @model name="c8" literal="purple"
   * @generated
   * @ordered
   */
  public static final int C8_VALUE = 7;

  /**
   * The '<em><b>C9</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #C9
   * @model name="c9" literal="pink"
   * @generated
   * @ordered
   */
  public static final int C9_VALUE = 8;

  /**
   * An array of all the '<em><b>Color Basic</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Color_Basic[] VALUES_ARRAY =
    new Color_Basic[]
    {
      C1,
      C2,
      C3,
      C4,
      C5,
      C6,
      C7,
      C8,
      C9,
    };

  /**
   * A public read-only list of all the '<em><b>Color Basic</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Color_Basic> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Color Basic</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color_Basic get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color_Basic result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color Basic</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color_Basic getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color_Basic result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color Basic</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Color_Basic get(int value)
  {
    switch (value)
    {
      case C1_VALUE: return C1;
      case C2_VALUE: return C2;
      case C3_VALUE: return C3;
      case C4_VALUE: return C4;
      case C5_VALUE: return C5;
      case C6_VALUE: return C6;
      case C7_VALUE: return C7;
      case C8_VALUE: return C8;
      case C9_VALUE: return C9;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Color_Basic(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Color_Basic
