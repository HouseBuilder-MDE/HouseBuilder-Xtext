/**
 */
package sirius.hb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Door#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link sirius.hb.Door#getDoorsNumber <em>Doors Number</em>}</li>
 *   <li>{@link sirius.hb.Door#getWidth <em>Width</em>}</li>
 *   <li>{@link sirius.hb.Door#getHeight <em>Height</em>}</li>
 *   <li>{@link sirius.hb.Door#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getDoor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Door extends Named {
	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.DoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Type</em>' attribute.
	 * @see sirius.hb.DoorType
	 * @see #setDoorType(DoorType)
	 * @see sirius.hb.HbPackage#getDoor_DoorType()
	 * @model required="true"
	 * @generated
	 */
	DoorType getDoorType();

	/**
	 * Sets the value of the '{@link sirius.hb.Door#getDoorType <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Type</em>' attribute.
	 * @see sirius.hb.DoorType
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorType value);

	/**
	 * Returns the value of the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors Number</em>' attribute.
	 * @see #setDoorsNumber(int)
	 * @see sirius.hb.HbPackage#getDoor_DoorsNumber()
	 * @model required="true"
	 * @generated
	 */
	int getDoorsNumber();

	/**
	 * Sets the value of the '{@link sirius.hb.Door#getDoorsNumber <em>Doors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doors Number</em>' attribute.
	 * @see #getDoorsNumber()
	 * @generated
	 */
	void setDoorsNumber(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see sirius.hb.HbPackage#getDoor_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link sirius.hb.Door#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see sirius.hb.HbPackage#getDoor_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link sirius.hb.Door#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.hb.Device}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Device#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see sirius.hb.HbPackage#getDoor_Devices()
	 * @see sirius.hb.Device#getDoor
	 * @model opposite="door" containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

} // Door
