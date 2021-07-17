/**
 */
package sirius.hb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Actuator#getType <em>Type</em>}</li>
 *   <li>{@link sirius.hb.Actuator#getModel <em>Model</em>}</li>
 *   <li>{@link sirius.hb.Actuator#getDevice <em>Device</em>}</li>
 *   <li>{@link sirius.hb.Actuator#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see sirius.hb.HbPackage#getActuator_Type()
	 * @model required="true"
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link sirius.hb.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see sirius.hb.HbPackage#getActuator_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link sirius.hb.Actuator#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Device#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see sirius.hb.HbPackage#getActuator_Device()
	 * @see sirius.hb.Device#getActuator
	 * @model opposite="actuator" required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link sirius.hb.Actuator#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Controller#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' container reference.
	 * @see #setController(Controller)
	 * @see sirius.hb.HbPackage#getActuator_Controller()
	 * @see sirius.hb.Controller#getActuators
	 * @model opposite="actuators" required="true" transient="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link sirius.hb.Actuator#getController <em>Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' container reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Actuator
