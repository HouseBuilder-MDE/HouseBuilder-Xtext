/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getDoorType()
 * @model
 * @generated
 */
public enum DoorType implements Enumerator {
	/**
	 * The '<em><b>SIMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "SIMPLE", "SIMPLE"),

	/**
	 * The '<em><b>DOOR WINDOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_WINDOW_VALUE
	 * @generated
	 * @ordered
	 */
	DOOR_WINDOW(1, "DOOR_WINDOW", "DOOR_WINDOW"),

	/**
	 * The '<em><b>PANIC DOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PANIC_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	PANIC_DOOR(2, "PANIC_DOOR", "PANIC_DOOR"),

	/**
	 * The '<em><b>ENTRANCE DOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRANCE_DOOR(3, "ENTRANCE_DOOR", "ENTRANCE_DOOR"),

	/**
	 * The '<em><b>SLIDING DOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDING_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDING_DOOR(4, "SLIDING_DOOR", "SLIDING_DOOR"),

	/**
	 * The '<em><b>GATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE_VALUE
	 * @generated
	 * @ordered
	 */
	GATE(5, "GATE", "GATE"),

	/**
	 * The '<em><b>EMPTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(6, "EMPTY", "EMPTY");

	/**
	 * The '<em><b>SIMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>DOOR WINDOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOOR_WINDOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_WINDOW_VALUE = 1;

	/**
	 * The '<em><b>PANIC DOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PANIC_DOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PANIC_DOOR_VALUE = 2;

	/**
	 * The '<em><b>ENTRANCE DOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE_DOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTRANCE_DOOR_VALUE = 3;

	/**
	 * The '<em><b>SLIDING DOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDING_DOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLIDING_DOOR_VALUE = 4;

	/**
	 * The '<em><b>GATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATE_VALUE = 5;

	/**
	 * The '<em><b>EMPTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 6;

	/**
	 * An array of all the '<em><b>Door Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorType[] VALUES_ARRAY = new DoorType[] { SIMPLE, DOOR_WINDOW, PANIC_DOOR, ENTRANCE_DOOR,
			SLIDING_DOOR, GATE, EMPTY, };

	/**
	 * A public read-only list of all the '<em><b>Door Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType get(int value) {
		switch (value) {
		case SIMPLE_VALUE:
			return SIMPLE;
		case DOOR_WINDOW_VALUE:
			return DOOR_WINDOW;
		case PANIC_DOOR_VALUE:
			return PANIC_DOOR;
		case ENTRANCE_DOOR_VALUE:
			return ENTRANCE_DOOR;
		case SLIDING_DOOR_VALUE:
			return SLIDING_DOOR;
		case GATE_VALUE:
			return GATE;
		case EMPTY_VALUE:
			return EMPTY;
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
	private DoorType(int value, String name, String literal) {
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

} //DoorType
