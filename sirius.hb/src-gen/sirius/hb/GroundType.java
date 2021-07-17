/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ground Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getGroundType()
 * @model
 * @generated
 */
public enum GroundType implements Enumerator {
	/**
	 * The '<em><b>ASPALTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPALTH_VALUE
	 * @generated
	 * @ordered
	 */
	ASPALTH(0, "ASPALTH", "ASPALTH"),

	/**
	 * The '<em><b>TERRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TERRAIN(1, "TERRAIN", "TERRAIN"),

	/**
	 * The '<em><b>PAVING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAVING_VALUE
	 * @generated
	 * @ordered
	 */
	PAVING(2, "PAVING", "PAVING");

	/**
	 * The '<em><b>ASPALTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPALTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASPALTH_VALUE = 0;

	/**
	 * The '<em><b>TERRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TERRAIN_VALUE = 1;

	/**
	 * The '<em><b>PAVING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAVING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAVING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ground Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroundType[] VALUES_ARRAY = new GroundType[] { ASPALTH, TERRAIN, PAVING, };

	/**
	 * A public read-only list of all the '<em><b>Ground Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroundType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ground Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroundType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroundType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ground Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroundType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroundType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ground Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroundType get(int value) {
		switch (value) {
		case ASPALTH_VALUE:
			return ASPALTH;
		case TERRAIN_VALUE:
			return TERRAIN;
		case PAVING_VALUE:
			return PAVING;
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
	private GroundType(int value, String name, String literal) {
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

} //GroundType
