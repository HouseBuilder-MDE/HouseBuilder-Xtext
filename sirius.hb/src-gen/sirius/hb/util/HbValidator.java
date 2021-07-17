/**
 */
package sirius.hb.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import sirius.hb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sirius.hb.HbPackage
 * @generated
 */
public class HbValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HbValidator INSTANCE = new HbValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sirius.hb";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return HbPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case HbPackage.HOUSE:
			return validateHouse((House) value, diagnostics, context);
		case HbPackage.NAMED:
			return validateNamed((Named) value, diagnostics, context);
		case HbPackage.FLOOR:
			return validateFloor((Floor) value, diagnostics, context);
		case HbPackage.SPACE:
			return validateSpace((Space) value, diagnostics, context);
		case HbPackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case HbPackage.PASSAGE:
			return validatePassage((Passage) value, diagnostics, context);
		case HbPackage.CONTROLLER:
			return validateController((Controller) value, diagnostics, context);
		case HbPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case HbPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case HbPackage.DEVICE:
			return validateDevice((Device) value, diagnostics, context);
		case HbPackage.WINDOW:
			return validateWindow((Window) value, diagnostics, context);
		case HbPackage.EXTERNAL_SPACE:
			return validateExternalSpace((ExternalSpace) value, diagnostics, context);
		case HbPackage.DOOR:
			return validateDoor((Door) value, diagnostics, context);
		case HbPackage.ENTRANCE:
			return validateEntrance((Entrance) value, diagnostics, context);
		case HbPackage.ROOM_TYPE:
			return validateRoomType((RoomType) value, diagnostics, context);
		case HbPackage.DOOR_TYPE:
			return validateDoorType((DoorType) value, diagnostics, context);
		case HbPackage.ACTUATOR_TYPE:
			return validateActuatorType((ActuatorType) value, diagnostics, context);
		case HbPackage.SENSOR_TYPE:
			return validateSensorType((SensorType) value, diagnostics, context);
		case HbPackage.OUTER_SPACE_TYPE:
			return validateOuterSpaceType((OuterSpaceType) value, diagnostics, context);
		case HbPackage.GROUND_TYPE:
			return validateGroundType((GroundType) value, diagnostics, context);
		case HbPackage.DEVICE_TYPE:
			return validateDeviceType((DeviceType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHouse(House house, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(house, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(named, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloor(Floor floor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(floor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(floor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFloor_FloorLevelUnique(floor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FloorLevelUnique constraint of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FLOOR__FLOOR_LEVEL_UNIQUE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'There is another floor with the same level. Level must be unique',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\t\t\t\t\tself.house.floors->select(f | f <> self)->collect(f | f.level)->excludes(self.level)\n"
			+ "}.status";

	/**
	 * Validates the FloorLevelUnique constraint of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloor_FloorLevelUnique(Floor floor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(HbPackage.Literals.FLOOR, floor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "FloorLevelUnique",
				FLOOR__FLOOR_LEVEL_UNIQUE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpace(Space space, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(space, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassage(Passage passage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controller, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(controller, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateController_OsVersionMissing(controller, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OsVersionMissing constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLER__OS_VERSION_MISSING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'If you specify the os, you have to specify the osVersion too',\n"
			+ "\tstatus : Boolean = if self.os->notEmpty() then self.os->notEmpty() else null endif\n" + "}.status";

	/**
	 * Validates the OsVersionMissing constraint of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController_OsVersionMissing(Controller controller, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(HbPackage.Literals.CONTROLLER, controller, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OsVersionMissing",
				CONTROLLER__OS_VERSION_MISSING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(window, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(window, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWindow_WindowHeightConstraints(window, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the WindowHeightConstraints constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WINDOW__WINDOW_HEIGHT_CONSTRAINTS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Window height must be a value between 0 and room height',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\t\t\t\t\t\t\t\t\t\theight <= room.height and height >= 0.0\n"
			+ "}.status";

	/**
	 * Validates the WindowHeightConstraints constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow_WindowHeightConstraints(Window window, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(HbPackage.Literals.WINDOW, window, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "WindowHeightConstraints",
				WINDOW__WINDOW_HEIGHT_CONSTRAINTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalSpace(ExternalSpace externalSpace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoor(Door door, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(door, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntrance(Entrance entrance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entrance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoomType(RoomType roomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoorType(DoorType doorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorType(ActuatorType actuatorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorType(SensorType sensorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterSpaceType(OuterSpaceType outerSpaceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroundType(GroundType groundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceType(DeviceType deviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //HbValidator
