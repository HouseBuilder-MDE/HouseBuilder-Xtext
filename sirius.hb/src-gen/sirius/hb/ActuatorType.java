/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actuator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getActuatorType()
 * @model
 * @generated
 */
public enum ActuatorType implements Enumerator {
	/**
	 * The '<em><b>IDRAULIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDRAULIC_VALUE
	 * @generated
	 * @ordered
	 */
	IDRAULIC(0, "IDRAULIC", "IDRAULIC"),

	/**
	 * The '<em><b>PNEUMATIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMATIC(1, "PNEUMATIC", "PNEUMATIC"),

	/**
	 * The '<em><b>ELECTRICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL(2, "ELECTRICAL", "ELECTRICAL"),

	/**
	 * The '<em><b>THERMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL_VALUE
	 * @generated
	 * @ordered
	 */
	THERMAL(3, "THERMAL", "THERMAL"),

	/**
	 * The '<em><b>MECHANICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICAL(4, "MECHANICAL", "MECHANICAL");

	/**
	 * The '<em><b>IDRAULIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDRAULIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDRAULIC_VALUE = 0;

	/**
	 * The '<em><b>PNEUMATIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMATIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PNEUMATIC_VALUE = 1;

	/**
	 * The '<em><b>ELECTRICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_VALUE = 2;

	/**
	 * The '<em><b>THERMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_VALUE = 3;

	/**
	 * The '<em><b>MECHANICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActuatorType[] VALUES_ARRAY = new ActuatorType[] { IDRAULIC, PNEUMATIC, ELECTRICAL, THERMAL,
			MECHANICAL, };

	/**
	 * A public read-only list of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActuatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(int value) {
		switch (value) {
		case IDRAULIC_VALUE:
			return IDRAULIC;
		case PNEUMATIC_VALUE:
			return PNEUMATIC;
		case ELECTRICAL_VALUE:
			return ELECTRICAL;
		case THERMAL_VALUE:
			return THERMAL;
		case MECHANICAL_VALUE:
			return MECHANICAL;
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
	private ActuatorType(int value, String name, String literal) {
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

} //ActuatorType
