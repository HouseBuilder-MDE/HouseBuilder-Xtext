/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Outer Space Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getOuterSpaceType()
 * @model
 * @generated
 */
public enum OuterSpaceType implements Enumerator {
	/**
	 * The '<em><b>BALCONY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALCONY_VALUE
	 * @generated
	 * @ordered
	 */
	BALCONY(0, "BALCONY", "BALCONY"),

	/**
	 * The '<em><b>GARDEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARDEN_VALUE
	 * @generated
	 * @ordered
	 */
	GARDEN(1, "GARDEN", "GARDEN"),

	/**
	 * The '<em><b>TERRACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TERRACE(2, "TERRACE", "TERRACE");

	/**
	 * The '<em><b>BALCONY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALCONY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BALCONY_VALUE = 0;

	/**
	 * The '<em><b>GARDEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARDEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GARDEN_VALUE = 1;

	/**
	 * The '<em><b>TERRACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TERRACE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Outer Space Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OuterSpaceType[] VALUES_ARRAY = new OuterSpaceType[] { BALCONY, GARDEN, TERRACE, };

	/**
	 * A public read-only list of all the '<em><b>Outer Space Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OuterSpaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Outer Space Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OuterSpaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OuterSpaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Outer Space Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OuterSpaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OuterSpaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Outer Space Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OuterSpaceType get(int value) {
		switch (value) {
		case BALCONY_VALUE:
			return BALCONY;
		case GARDEN_VALUE:
			return GARDEN;
		case TERRACE_VALUE:
			return TERRACE;
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
	private OuterSpaceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //OuterSpaceType
