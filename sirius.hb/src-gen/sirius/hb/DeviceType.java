/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Device Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getDeviceType()
 * @model
 * @generated
 */
public enum DeviceType implements Enumerator {
	/**
	 * The '<em><b>THERMOSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMOSTAT(0, "THERMOSTAT", "THERMOSTAT"),

	/**
	 * The '<em><b>APPLIANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLIANCE(1, "APPLIANCE", "APPLIANCE"),

	/**
	 * The '<em><b>SOCKET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	SOCKET(2, "SOCKET", "SOCKET"),

	/**
	 * The '<em><b>ROLLER SHUTTERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLLER_SHUTTERS_VALUE
	 * @generated
	 * @ordered
	 */
	ROLLER_SHUTTERS(3, "ROLLER_SHUTTERS", "ROLLER_SHUTTERS"),

	/**
	 * The '<em><b>GATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE_VALUE
	 * @generated
	 * @ordered
	 */
	GATE(4, "GATE", "GATE");

	/**
	 * The '<em><b>THERMOSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMOSTAT_VALUE = 0;

	/**
	 * The '<em><b>APPLIANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLIANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLIANCE_VALUE = 1;

	/**
	 * The '<em><b>SOCKET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCKET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOCKET_VALUE = 2;

	/**
	 * The '<em><b>ROLLER SHUTTERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLLER_SHUTTERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROLLER_SHUTTERS_VALUE = 3;

	/**
	 * The '<em><b>GATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceType[] VALUES_ARRAY = new DeviceType[] { THERMOSTAT, APPLIANCE, SOCKET, ROLLER_SHUTTERS,
			GATE, };

	/**
	 * A public read-only list of all the '<em><b>Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceType get(int value) {
		switch (value) {
		case THERMOSTAT_VALUE:
			return THERMOSTAT;
		case APPLIANCE_VALUE:
			return APPLIANCE;
		case SOCKET_VALUE:
			return SOCKET;
		case ROLLER_SHUTTERS_VALUE:
			return ROLLER_SHUTTERS;
		case GATE_VALUE:
			return GATE;
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
	private DeviceType(int value, String name, String literal) {
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

} //DeviceType
