/**
 */
package sirius.hb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link sirius.hb.Sensor#getValue <em>Value</em>}</li>
 *   <li>{@link sirius.hb.Sensor#getModel <em>Model</em>}</li>
 *   <li>{@link sirius.hb.Sensor#getSpace <em>Space</em>}</li>
 *   <li>{@link sirius.hb.Sensor#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.SensorType
	 * @see #setType(SensorType)
	 * @see sirius.hb.HbPackage#getSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link sirius.hb.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see sirius.hb.HbPackage#getSensor_Value()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link sirius.hb.Sensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see sirius.hb.HbPackage#getSensor_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link sirius.hb.Sensor#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Space#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(Space)
	 * @see sirius.hb.HbPackage#getSensor_Space()
	 * @see sirius.hb.Space#getSensors
	 * @model opposite="sensors" required="true"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link sirius.hb.Sensor#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Controller#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' container reference.
	 * @see #setController(Controller)
	 * @see sirius.hb.HbPackage#getSensor_Controller()
	 * @see sirius.hb.Controller#getSensors
	 * @model opposite="sensors" required="true" transient="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link sirius.hb.Sensor#getController <em>Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' container reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Sensor
