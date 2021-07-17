/**
 */
package sirius.hb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Room Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage#getRoomType()
 * @model
 * @generated
 */
public enum RoomType implements Enumerator {
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
	 * The '<em><b>BATHROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATHROOM_VALUE
	 * @generated
	 * @ordered
	 */
	BATHROOM(1, "BATHROOM", "BATHROOM"),

	/**
	 * The '<em><b>LIVING ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVING_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	LIVING_ROOM(2, "LIVING_ROOM", "LIVING_ROOM"),

	/**
	 * The '<em><b>BEDROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEDROOM_VALUE
	 * @generated
	 * @ordered
	 */
	BEDROOM(3, "BEDROOM", "BEDROOM"),

	/**
	 * The '<em><b>HALLWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALLWAY_VALUE
	 * @generated
	 * @ordered
	 */
	HALLWAY(4, "HALLWAY", "HALLWAY"),

	/**
	 * The '<em><b>STUDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDY(5, "STUDY", "STUDY"),

	/**
	 * The '<em><b>ENTRANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRANCE(6, "ENTRANCE", "ENTRANCE"),

	/**
	 * The '<em><b>STORAGE ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_ROOM(7, "STORAGE_ROOM", "STORAGE_ROOM"),

	/**
	 * The '<em><b>GARAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARAGE_VALUE
	 * @generated
	 * @ordered
	 */
	GARAGE(8, "GARAGE", "GARAGE"),

	/**
	 * The '<em><b>LAUNDRY ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAUNDRY_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	LAUNDRY_ROOM(9, "LAUNDRY_ROOM", "LAUNDRY_ROOM"),

	/**
	 * The '<em><b>HOBBY ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOBBY_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	HOBBY_ROOM(10, "HOBBY_ROOM", "HOBBY_ROOM"),

	/**
	 * The '<em><b>CELLAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLAR_VALUE
	 * @generated
	 * @ordered
	 */
	CELLAR(11, "CELLAR", "CELLAR"),

	/**
	 * The '<em><b>LUNCHROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUNCHROOM_VALUE
	 * @generated
	 * @ordered
	 */
	LUNCHROOM(12, "LUNCHROOM", "LUNCHROOM"),

	/**
	 * The '<em><b>RUMPUS ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUMPUS_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	RUMPUS_ROOM(13, "RUMPUS_ROOM", "RUMPUS_ROOM"),

	/**
	 * The '<em><b>STAIRS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAIRS_VALUE
	 * @generated
	 * @ordered
	 */
	STAIRS(14, "STAIRS", "STAIRS"),

	/**
	 * The '<em><b>KITCHEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KITCHEN_VALUE
	 * @generated
	 * @ordered
	 */
	KITCHEN(15, "KITCHEN", "KITCHEN");

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
	 * The '<em><b>BATHROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATHROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATHROOM_VALUE = 1;

	/**
	 * The '<em><b>LIVING ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVING_ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIVING_ROOM_VALUE = 2;

	/**
	 * The '<em><b>BEDROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEDROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEDROOM_VALUE = 3;

	/**
	 * The '<em><b>HALLWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALLWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALLWAY_VALUE = 4;

	/**
	 * The '<em><b>STUDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDY_VALUE = 5;

	/**
	 * The '<em><b>ENTRANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTRANCE_VALUE = 6;

	/**
	 * The '<em><b>STORAGE ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_ROOM_VALUE = 7;

	/**
	 * The '<em><b>GARAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GARAGE_VALUE = 8;

	/**
	 * The '<em><b>LAUNDRY ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAUNDRY_ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAUNDRY_ROOM_VALUE = 9;

	/**
	 * The '<em><b>HOBBY ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOBBY_ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOBBY_ROOM_VALUE = 10;

	/**
	 * The '<em><b>CELLAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CELLAR_VALUE = 11;

	/**
	 * The '<em><b>LUNCHROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUNCHROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUNCHROOM_VALUE = 12;

	/**
	 * The '<em><b>RUMPUS ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUMPUS_ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUMPUS_ROOM_VALUE = 13;

	/**
	 * The '<em><b>STAIRS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAIRS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAIRS_VALUE = 14;

	/**
	 * The '<em><b>KITCHEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KITCHEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KITCHEN_VALUE = 15;

	/**
	 * An array of all the '<em><b>Room Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoomType[] VALUES_ARRAY = new RoomType[] { SIMPLE, BATHROOM, LIVING_ROOM, BEDROOM, HALLWAY,
			STUDY, ENTRANCE, STORAGE_ROOM, GARAGE, LAUNDRY_ROOM, HOBBY_ROOM, CELLAR, LUNCHROOM, RUMPUS_ROOM, STAIRS,
			KITCHEN, };

	/**
	 * A public read-only list of all the '<em><b>Room Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoomType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoomType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Room Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoomType get(int value) {
		switch (value) {
		case SIMPLE_VALUE:
			return SIMPLE;
		case BATHROOM_VALUE:
			return BATHROOM;
		case LIVING_ROOM_VALUE:
			return LIVING_ROOM;
		case BEDROOM_VALUE:
			return BEDROOM;
		case HALLWAY_VALUE:
			return HALLWAY;
		case STUDY_VALUE:
			return STUDY;
		case ENTRANCE_VALUE:
			return ENTRANCE;
		case STORAGE_ROOM_VALUE:
			return STORAGE_ROOM;
		case GARAGE_VALUE:
			return GARAGE;
		case LAUNDRY_ROOM_VALUE:
			return LAUNDRY_ROOM;
		case HOBBY_ROOM_VALUE:
			return HOBBY_ROOM;
		case CELLAR_VALUE:
			return CELLAR;
		case LUNCHROOM_VALUE:
			return LUNCHROOM;
		case RUMPUS_ROOM_VALUE:
			return RUMPUS_ROOM;
		case STAIRS_VALUE:
			return STAIRS;
		case KITCHEN_VALUE:
			return KITCHEN;
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
	private RoomType(int value, String name, String literal) {
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

} //RoomType
