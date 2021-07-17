/**
 */
package sirius.hb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Controller#getModel <em>Model</em>}</li>
 *   <li>{@link sirius.hb.Controller#getOs <em>Os</em>}</li>
 *   <li>{@link sirius.hb.Controller#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link sirius.hb.Controller#getActuators <em>Actuators</em>}</li>
 *   <li>{@link sirius.hb.Controller#getSensors <em>Sensors</em>}</li>
 *   <li>{@link sirius.hb.Controller#getHouse <em>House</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OsVersionMissing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OsVersionMissing='Tuple {\n\tmessage : String = \'If you specify the os, you have to specify the osVersion too\',\n\tstatus : Boolean = if self.os-&gt;notEmpty() then self.os-&gt;notEmpty() else null endif\n}.status'"
 * @generated
 */
public interface Controller extends Named {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see sirius.hb.HbPackage#getController_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link sirius.hb.Controller#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see sirius.hb.HbPackage#getController_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link sirius.hb.Controller#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see sirius.hb.HbPackage#getController_OsVersion()
	 * @model
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link sirius.hb.Controller#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.hb.Actuator}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Actuator#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see sirius.hb.HbPackage#getController_Actuators()
	 * @see sirius.hb.Actuator#getController
	 * @model opposite="controller" containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link sirius.hb.Sensor}.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Sensor#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see sirius.hb.HbPackage#getController_Sensors()
	 * @see sirius.hb.Sensor#getController
	 * @model opposite="controller" containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.House#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see sirius.hb.HbPackage#getController_House()
	 * @see sirius.hb.House#getControllers
	 * @model opposite="controllers" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link sirius.hb.Controller#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // Controller
