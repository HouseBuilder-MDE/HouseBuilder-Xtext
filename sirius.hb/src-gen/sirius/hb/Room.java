/**
 */
package sirius.hb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Room#getHeight <em>Height</em>}</li>
 *   <li>{@link sirius.hb.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link sirius.hb.Room#getWindows <em>Windows</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Space {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see sirius.hb.HbPackage#getRoom_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link sirius.hb.Room#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see sirius.hb.RoomType
	 * @see #setRoomType(RoomType)
	 * @see sirius.hb.HbPackage#getRoom_RoomType()
	 * @model
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link sirius.hb.Room#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see sirius.hb.RoomType
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.hb.Window}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see sirius.hb.HbPackage#getRoom_Windows()
	 * @see sirius.hb.Window#getRoom
	 * @model opposite="room" containment="true"
	 * @generated
	 */
	EList<Window> getWindows();

} // Room
