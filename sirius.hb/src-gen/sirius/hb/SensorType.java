/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(0, "TEMPERATURE", "TEMPERATURE"),

	/**
	 * The '<em><b>PRESSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE(1, "PRESSURE", "PRESSURE"),

	/**
	 * The '<em><b>PROXIMITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXIMITY_VALUE
	 * @generated
	 * @ordered
	 */
	PROXIMITY(2, "PROXIMITY", "PROXIMITY"),

	/**
	 * The '<em><b>ACCELEROMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELEROMETER(3, "ACCELEROMETER", "ACCELEROMETER"),

	/**
	 * The '<em><b>GAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(4, "GAS", "GAS"),

	/**
	 * The '<em><b>SMOKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOKE_VALUE
	 * @generated
	 * @ordered
	 */
	SMOKE(5, "SMOKE", "SMOKE"),

	/**
	 * The '<em><b>VIDEO SURVAILLANCE CAMERA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_SURVAILLANCE_CAMERA_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_SURVAILLANCE_CAMERA(6, "VIDEO_SURVAILLANCE_CAMERA", "VIDEO_SURVAILLANCE_CAMERA");

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 0;

	/**
	 * The '<em><b>PRESSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_VALUE = 1;

	/**
	 * The '<em><b>PROXIMITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXIMITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXIMITY_VALUE = 2;

	/**
	 * The '<em><b>ACCELEROMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCELEROMETER_VALUE = 3;

	/**
	 * The '<em><b>GAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 4;

	/**
	 * The '<em><b>SMOKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMOKE_VALUE = 5;

	/**
	 * The '<em><b>VIDEO SURVAILLANCE CAMERA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_SURVAILLANCE_CAMERA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_SURVAILLANCE_CAMERA_VALUE = 6;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY = new SensorType[] { TEMPERATURE, PRESSURE, PROXIMITY, ACCELEROMETER,
			GAS, SMOKE, VIDEO_SURVAILLANCE_CAMERA, };

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
		case TEMPERATURE_VALUE:
			return TEMPERATURE;
		case PRESSURE_VALUE:
			return PRESSURE;
		case PROXIMITY_VALUE:
			return PROXIMITY;
		case ACCELEROMETER_VALUE:
			return ACCELEROMETER;
		case GAS_VALUE:
			return GAS;
		case SMOKE_VALUE:
			return SMOKE;
		case VIDEO_SURVAILLANCE_CAMERA_VALUE:
			return VIDEO_SURVAILLANCE_CAMERA;
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
	private SensorType(int value, String name, String literal) {
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

} //SensorType
