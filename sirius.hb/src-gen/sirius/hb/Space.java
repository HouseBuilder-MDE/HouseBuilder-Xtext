/**
 */
package sirius.hb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Space#getLength <em>Length</em>}</li>
 *   <li>{@link sirius.hb.Space#getWidth <em>Width</em>}</li>
 *   <li>{@link sirius.hb.Space#getDevices <em>Devices</em>}</li>
 *   <li>{@link sirius.hb.Space#getFloor <em>Floor</em>}</li>
 *   <li>{@link sirius.hb.Space#getSensors <em>Sensors</em>}</li>
 *   <li>{@link sirius.hb.Space#getPassagesA <em>Passages A</em>}</li>
 *   <li>{@link sirius.hb.Space#getPassagesB <em>Passages B</em>}</li>
 *   <li>{@link sirius.hb.Space#getPassages <em>Passages</em>}</li>
 *   <li>{@link sirius.hb.Space#getFootage <em>Footage</em>}</li>
 *   <li>{@link sirius.hb.Space#getEntrances <em>Entrances</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getSpace()
 * @model abstract="true"
 * @generated
 */
public interface Space extends Named {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see sirius.hb.HbPackage#getSpace_Length()
	 * @model required="true"
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link sirius.hb.Space#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see sirius.hb.HbPackage#getSpace_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link sirius.hb.Space#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.hb.Device}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Device#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see sirius.hb.HbPackage#getSpace_Devices()
	 * @see sirius.hb.Device#getSpace
	 * @model opposite="space" containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Floor#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' container reference.
	 * @see #setFloor(Floor)
	 * @see sirius.hb.HbPackage#getSpace_Floor()
	 * @see sirius.hb.Floor#getSpaces
	 * @model opposite="spaces" required="true" transient="false"
	 * @generated
	 */
	Floor getFloor();

	/**
	 * Sets the value of the '{@link sirius.hb.Space#getFloor <em>Floor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' container reference.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(Floor value);

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link sirius.hb.Sensor}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Sensor#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see sirius.hb.HbPackage#getSpace_Sensors()
	 * @see sirius.hb.Sensor#getSpace
	 * @model opposite="space" ordered="false"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Passages A</b></em>' reference list.
	 * The list contents are of type {@link sirius.hb.Passage}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Passage#getSpaceA <em>Space A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passages A</em>' reference list.
	 * @see sirius.hb.HbPackage#getSpace_PassagesA()
	 * @see sirius.hb.Passage#getSpaceA
	 * @model opposite="spaceA" ordered="false"
	 * @generated
	 */
	EList<Passage> getPassagesA();

	/**
	 * Returns the value of the '<em><b>Passages B</b></em>' reference list.
	 * The list contents are of type {@link sirius.hb.Passage}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Passage#getSpaceB <em>Space B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passages B</em>' reference list.
	 * @see sirius.hb.HbPackage#getSpace_PassagesB()
	 * @see sirius.hb.Passage#getSpaceB
	 * @model opposite="spaceB" ordered="false"
	 * @generated
	 */
	EList<Passage> getPassagesB();

	/**
	 * Returns the value of the '<em><b>Passages</b></em>' reference list.
	 * The list contents are of type {@link sirius.hb.Passage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passages</em>' reference list.
	 * @see sirius.hb.HbPackage#getSpace_Passages()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='passagesA-&gt;union(passagesB)'"
	 * @generated
	 */
	EList<Passage> getPassages();

	/**
	 * Returns the value of the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footage</em>' attribute.
	 * @see sirius.hb.HbPackage#getSpace_Footage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='length * width'"
	 * @generated
	 */
	float getFootage();

	/**
	 * Returns the value of the '<em><b>Entrances</b></em>' reference list.
	 * The list contents are of type {@link sirius.hb.Entrance}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Entrance#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrances</em>' reference list.
	 * @see sirius.hb.HbPackage#getSpace_Entrances()
	 * @see sirius.hb.Entrance#getSpace
	 * @model opposite="space"
	 * @generated
	 */
	EList<Entrance> getEntrances();

} // Space
