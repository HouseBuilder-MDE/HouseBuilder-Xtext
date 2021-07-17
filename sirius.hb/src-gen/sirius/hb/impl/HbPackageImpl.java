/**
 */
package sirius.hb.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sirius.hb.Actuator;
import sirius.hb.ActuatorType;
import sirius.hb.Controller;
import sirius.hb.Device;
import sirius.hb.DeviceType;
import sirius.hb.Door;
import sirius.hb.DoorType;
import sirius.hb.Entrance;
import sirius.hb.ExternalSpace;
import sirius.hb.Floor;
import sirius.hb.GroundType;
import sirius.hb.HbFactory;
import sirius.hb.HbPackage;
import sirius.hb.House;
import sirius.hb.Named;
import sirius.hb.OuterSpaceType;
import sirius.hb.Passage;
import sirius.hb.Room;
import sirius.hb.RoomType;
import sirius.hb.Sensor;
import sirius.hb.SensorType;
import sirius.hb.Space;
import sirius.hb.Window;

import sirius.hb.util.HbValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbPackageImpl extends EPackageImpl implements HbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outerSpaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groundTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sirius.hb.HbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HbPackageImpl() {
		super(eNS_URI, HbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HbPackage init() {
		if (isInited)
			return (HbPackage) EPackage.Registry.INSTANCE.getEPackage(HbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HbPackageImpl theHbPackage = registeredHbPackage instanceof HbPackageImpl ? (HbPackageImpl) registeredHbPackage
				: new HbPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHbPackage.createPackageContents();

		// Initialize created meta-data
		theHbPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theHbPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return HbValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theHbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HbPackage.eNS_URI, theHbPackage);
		return theHbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_State() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Province() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_City() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_PostalCode() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Address() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_BuildingDate() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Floors() {
		return (EReference) houseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Passages() {
		return (EReference) houseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Controllers() {
		return (EReference) houseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_InternalFootage() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_OuterFootage() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Footage() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_RoomsNumber() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Entrances() {
		return (EReference) houseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHouse__HasOuterSpace() {
		return houseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHouse__IsSmart() {
		return houseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute) namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_Level() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_Spaces() {
		return (EReference) floorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloor_House() {
		return (EReference) floorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_InternalFootage() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_OuterFootage() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_Footage() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloor_RoomsNumber() {
		return (EAttribute) floorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpace() {
		return spaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Length() {
		return (EAttribute) spaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Width() {
		return (EAttribute) spaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_Devices() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_Floor() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_Sensors() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_PassagesA() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_PassagesB() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_Passages() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpace_Footage() {
		return (EAttribute) spaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpace_Entrances() {
		return (EReference) spaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Height() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomType() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Windows() {
		return (EReference) roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassage() {
		return passageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassage_SpaceA() {
		return (EReference) passageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassage_SpaceB() {
		return (EReference) passageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassage_House() {
		return (EReference) passageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Model() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Os() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_OsVersion() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Actuators() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Sensors() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_House() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Type() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Model() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Device() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Controller() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Type() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Value() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Model() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Space() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Controller() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Type() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Model() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Actuator() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Space() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Door() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_DoorsNumber() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Width() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Height() {
		return (EAttribute) windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindow_Room() {
		return (EReference) windowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalSpace() {
		return externalSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalSpace_Type() {
		return (EAttribute) externalSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalSpace_Ground() {
		return (EAttribute) externalSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_DoorType() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_DoorsNumber() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Width() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Height() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_Devices() {
		return (EReference) doorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntrance() {
		return entranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntrance_House() {
		return (EReference) entranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntrance_Space() {
		return (EReference) entranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomType() {
		return roomTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoorType() {
		return doorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActuatorType() {
		return actuatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOuterSpaceType() {
		return outerSpaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroundType() {
		return groundTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceType() {
		return deviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbFactory getHbFactory() {
		return (HbFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__STATE);
		createEAttribute(houseEClass, HOUSE__PROVINCE);
		createEAttribute(houseEClass, HOUSE__CITY);
		createEAttribute(houseEClass, HOUSE__POSTAL_CODE);
		createEAttribute(houseEClass, HOUSE__ADDRESS);
		createEAttribute(houseEClass, HOUSE__BUILDING_DATE);
		createEReference(houseEClass, HOUSE__FLOORS);
		createEReference(houseEClass, HOUSE__PASSAGES);
		createEReference(houseEClass, HOUSE__CONTROLLERS);
		createEAttribute(houseEClass, HOUSE__INTERNAL_FOOTAGE);
		createEAttribute(houseEClass, HOUSE__OUTER_FOOTAGE);
		createEAttribute(houseEClass, HOUSE__FOOTAGE);
		createEAttribute(houseEClass, HOUSE__ROOMS_NUMBER);
		createEReference(houseEClass, HOUSE__ENTRANCES);
		createEOperation(houseEClass, HOUSE___HAS_OUTER_SPACE);
		createEOperation(houseEClass, HOUSE___IS_SMART);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		floorEClass = createEClass(FLOOR);
		createEAttribute(floorEClass, FLOOR__LEVEL);
		createEReference(floorEClass, FLOOR__SPACES);
		createEReference(floorEClass, FLOOR__HOUSE);
		createEAttribute(floorEClass, FLOOR__INTERNAL_FOOTAGE);
		createEAttribute(floorEClass, FLOOR__OUTER_FOOTAGE);
		createEAttribute(floorEClass, FLOOR__FOOTAGE);
		createEAttribute(floorEClass, FLOOR__ROOMS_NUMBER);

		spaceEClass = createEClass(SPACE);
		createEAttribute(spaceEClass, SPACE__LENGTH);
		createEAttribute(spaceEClass, SPACE__WIDTH);
		createEReference(spaceEClass, SPACE__DEVICES);
		createEReference(spaceEClass, SPACE__FLOOR);
		createEReference(spaceEClass, SPACE__SENSORS);
		createEReference(spaceEClass, SPACE__PASSAGES_A);
		createEReference(spaceEClass, SPACE__PASSAGES_B);
		createEReference(spaceEClass, SPACE__PASSAGES);
		createEAttribute(spaceEClass, SPACE__FOOTAGE);
		createEReference(spaceEClass, SPACE__ENTRANCES);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__HEIGHT);
		createEAttribute(roomEClass, ROOM__ROOM_TYPE);
		createEReference(roomEClass, ROOM__WINDOWS);

		passageEClass = createEClass(PASSAGE);
		createEReference(passageEClass, PASSAGE__SPACE_A);
		createEReference(passageEClass, PASSAGE__SPACE_B);
		createEReference(passageEClass, PASSAGE__HOUSE);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__MODEL);
		createEAttribute(controllerEClass, CONTROLLER__OS);
		createEAttribute(controllerEClass, CONTROLLER__OS_VERSION);
		createEReference(controllerEClass, CONTROLLER__ACTUATORS);
		createEReference(controllerEClass, CONTROLLER__SENSORS);
		createEReference(controllerEClass, CONTROLLER__HOUSE);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__TYPE);
		createEAttribute(actuatorEClass, ACTUATOR__MODEL);
		createEReference(actuatorEClass, ACTUATOR__DEVICE);
		createEReference(actuatorEClass, ACTUATOR__CONTROLLER);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__TYPE);
		createEAttribute(sensorEClass, SENSOR__VALUE);
		createEAttribute(sensorEClass, SENSOR__MODEL);
		createEReference(sensorEClass, SENSOR__SPACE);
		createEReference(sensorEClass, SENSOR__CONTROLLER);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEAttribute(deviceEClass, DEVICE__MODEL);
		createEReference(deviceEClass, DEVICE__ACTUATOR);
		createEReference(deviceEClass, DEVICE__SPACE);
		createEReference(deviceEClass, DEVICE__DOOR);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__DOORS_NUMBER);
		createEAttribute(windowEClass, WINDOW__WIDTH);
		createEAttribute(windowEClass, WINDOW__HEIGHT);
		createEReference(windowEClass, WINDOW__ROOM);

		externalSpaceEClass = createEClass(EXTERNAL_SPACE);
		createEAttribute(externalSpaceEClass, EXTERNAL_SPACE__TYPE);
		createEAttribute(externalSpaceEClass, EXTERNAL_SPACE__GROUND);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__DOOR_TYPE);
		createEAttribute(doorEClass, DOOR__DOORS_NUMBER);
		createEAttribute(doorEClass, DOOR__WIDTH);
		createEAttribute(doorEClass, DOOR__HEIGHT);
		createEReference(doorEClass, DOOR__DEVICES);

		entranceEClass = createEClass(ENTRANCE);
		createEReference(entranceEClass, ENTRANCE__HOUSE);
		createEReference(entranceEClass, ENTRANCE__SPACE);

		// Create enums
		roomTypeEEnum = createEEnum(ROOM_TYPE);
		doorTypeEEnum = createEEnum(DOOR_TYPE);
		actuatorTypeEEnum = createEEnum(ACTUATOR_TYPE);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		outerSpaceTypeEEnum = createEEnum(OUTER_SPACE_TYPE);
		groundTypeEEnum = createEEnum(GROUND_TYPE);
		deviceTypeEEnum = createEEnum(DEVICE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		houseEClass.getESuperTypes().add(this.getNamed());
		floorEClass.getESuperTypes().add(this.getNamed());
		spaceEClass.getESuperTypes().add(this.getNamed());
		roomEClass.getESuperTypes().add(this.getSpace());
		passageEClass.getESuperTypes().add(this.getNamed());
		passageEClass.getESuperTypes().add(this.getDoor());
		controllerEClass.getESuperTypes().add(this.getNamed());
		actuatorEClass.getESuperTypes().add(this.getNamed());
		sensorEClass.getESuperTypes().add(this.getNamed());
		deviceEClass.getESuperTypes().add(this.getNamed());
		windowEClass.getESuperTypes().add(this.getNamed());
		externalSpaceEClass.getESuperTypes().add(this.getSpace());
		doorEClass.getESuperTypes().add(this.getNamed());
		entranceEClass.getESuperTypes().add(this.getNamed());
		entranceEClass.getESuperTypes().add(this.getDoor());

		// Initialize classes, features, and operations; add parameters
		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_State(), ecorePackage.getEString(), "state", null, 0, 1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Province(), ecorePackage.getEString(), "province", null, 0, 1, House.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_City(), ecorePackage.getEString(), "city", null, 0, 1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, House.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Address(), ecorePackage.getEString(), "address", null, 0, 1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_BuildingDate(), ecorePackage.getEDate(), "buildingDate", null, 0, 1, House.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Floors(), this.getFloor(), this.getFloor_House(), "floors", null, 1, -1, House.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Passages(), this.getPassage(), this.getPassage_House(), "passages", null, 0, -1,
				House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Controllers(), this.getController(), this.getController_House(), "controllers", null, 0,
				-1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_InternalFootage(), ecorePackage.getEFloat(), "internalFootage", null, 1, 1, House.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_OuterFootage(), ecorePackage.getEFloat(), "outerFootage", null, 1, 1, House.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Footage(), ecorePackage.getEFloat(), "footage", null, 1, 1, House.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_RoomsNumber(), ecorePackage.getEInt(), "roomsNumber", null, 1, 1, House.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Entrances(), this.getEntrance(), this.getEntrance_House(), "entrances", null, 1, -1,
				House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHouse__HasOuterSpace(), ecorePackage.getEBooleanObject(), "hasOuterSpace", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHouse__IsSmart(), ecorePackage.getEBooleanObject(), "isSmart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, Named.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorEClass, Floor.class, "Floor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloor_Level(), ecorePackage.getEInt(), "level", null, 1, 1, Floor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloor_Spaces(), this.getSpace(), this.getSpace_Floor(), "spaces", null, 1, -1, Floor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloor_House(), this.getHouse(), this.getHouse_Floors(), "house", null, 1, 1, Floor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_InternalFootage(), ecorePackage.getEFloat(), "internalFootage", null, 1, 1, Floor.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_OuterFootage(), ecorePackage.getEFloat(), "outerFootage", null, 1, 1, Floor.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_Footage(), ecorePackage.getEFloat(), "footage", null, 1, 1, Floor.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloor_RoomsNumber(), ecorePackage.getEInt(), "roomsNumber", null, 1, 1, Floor.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spaceEClass, Space.class, "Space", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpace_Length(), ecorePackage.getEFloat(), "length", null, 1, 1, Space.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpace_Width(), ecorePackage.getEFloat(), "width", null, 1, 1, Space.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_Devices(), this.getDevice(), this.getDevice_Space(), "devices", null, 0, -1,
				Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_Floor(), this.getFloor(), this.getFloor_Spaces(), "floor", null, 1, 1, Space.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_Sensors(), this.getSensor(), this.getSensor_Space(), "sensors", null, 0, -1,
				Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpace_PassagesA(), this.getPassage(), this.getPassage_SpaceA(), "passagesA", null, 0, -1,
				Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpace_PassagesB(), this.getPassage(), this.getPassage_SpaceB(), "passagesB", null, 0, -1,
				Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpace_Passages(), this.getPassage(), null, "passages", null, 0, -1, Space.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpace_Footage(), ecorePackage.getEFloat(), "footage", null, 1, 1, Space.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpace_Entrances(), this.getEntrance(), this.getEntrance_Space(), "entrances", null, 0, -1,
				Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_RoomType(), this.getRoomType(), "roomType", null, 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Windows(), this.getWindow(), this.getWindow_Room(), "windows", null, 0, -1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passageEClass, Passage.class, "Passage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassage_SpaceA(), this.getSpace(), this.getSpace_PassagesA(), "spaceA", null, 1, 1,
				Passage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassage_SpaceB(), this.getSpace(), this.getSpace_PassagesB(), "spaceB", null, 1, 1,
				Passage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassage_House(), this.getHouse(), this.getHouse_Passages(), "house", null, 1, 1,
				Passage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Model(), ecorePackage.getEString(), "model", null, 1, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_Os(), ecorePackage.getEString(), "os", null, 0, 1, Controller.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getController_OsVersion(), ecorePackage.getEString(), "osVersion", null, 0, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Actuators(), this.getActuator(), this.getActuator_Controller(), "actuators", null,
				1, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Sensors(), this.getSensor(), this.getSensor_Controller(), "sensors", null, 1, -1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_House(), this.getHouse(), this.getHouse_Controllers(), "house", null, 1, 1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Type(), this.getActuatorType(), "type", null, 1, 1, Actuator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_Model(), ecorePackage.getEString(), "model", null, 0, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Device(), this.getDevice(), this.getDevice_Actuator(), "device", null, 1, 1,
				Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Controller(), this.getController(), this.getController_Actuators(), "controller",
				null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Type(), this.getSensorType(), "type", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Value(), ecorePackage.getEFloat(), "value", "0.0", 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Model(), ecorePackage.getEString(), "model", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Space(), this.getSpace(), this.getSpace_Sensors(), "space", null, 1, 1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Controller(), this.getController(), this.getController_Sensors(), "controller", null,
				1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Type(), this.getDeviceType(), "type", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Model(), ecorePackage.getEString(), "model", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Actuator(), this.getActuator(), this.getActuator_Device(), "actuator", null, 0, 1,
				Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Space(), this.getSpace(), this.getSpace_Devices(), "space", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Door(), this.getDoor(), this.getDoor_Devices(), "door", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_DoorsNumber(), ecorePackage.getEInt(), "doorsNumber", null, 1, 1, Window.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_Width(), ecorePackage.getEFloat(), "width", null, 1, 1, Window.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Window.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWindow_Room(), this.getRoom(), this.getRoom_Windows(), "room", null, 0, 1, Window.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalSpaceEClass, ExternalSpace.class, "ExternalSpace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalSpace_Type(), this.getOuterSpaceType(), "type", null, 0, 1, ExternalSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalSpace_Ground(), this.getGroundType(), "ground", null, 0, 1, ExternalSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorEClass, Door.class, "Door", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_DoorType(), this.getDoorType(), "doorType", null, 1, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_DoorsNumber(), ecorePackage.getEInt(), "doorsNumber", null, 1, 1, Door.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Width(), ecorePackage.getEFloat(), "width", null, 1, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoor_Devices(), this.getDevice(), this.getDevice_Door(), "devices", null, 0, -1, Door.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entranceEClass, Entrance.class, "Entrance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntrance_House(), this.getHouse(), this.getHouse_Entrances(), "house", null, 1, 1,
				Entrance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntrance_Space(), this.getSpace(), this.getSpace_Entrances(), "space", null, 1, 1,
				Entrance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roomTypeEEnum, RoomType.class, "RoomType");
		addEEnumLiteral(roomTypeEEnum, RoomType.SIMPLE);
		addEEnumLiteral(roomTypeEEnum, RoomType.BATHROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.LIVING_ROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.BEDROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.HALLWAY);
		addEEnumLiteral(roomTypeEEnum, RoomType.STUDY);
		addEEnumLiteral(roomTypeEEnum, RoomType.ENTRANCE);
		addEEnumLiteral(roomTypeEEnum, RoomType.STORAGE_ROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.GARAGE);
		addEEnumLiteral(roomTypeEEnum, RoomType.LAUNDRY_ROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.HOBBY_ROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.CELLAR);
		addEEnumLiteral(roomTypeEEnum, RoomType.LUNCHROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.RUMPUS_ROOM);
		addEEnumLiteral(roomTypeEEnum, RoomType.STAIRS);
		addEEnumLiteral(roomTypeEEnum, RoomType.KITCHEN);

		initEEnum(doorTypeEEnum, DoorType.class, "DoorType");
		addEEnumLiteral(doorTypeEEnum, DoorType.SIMPLE);
		addEEnumLiteral(doorTypeEEnum, DoorType.DOOR_WINDOW);
		addEEnumLiteral(doorTypeEEnum, DoorType.PANIC_DOOR);
		addEEnumLiteral(doorTypeEEnum, DoorType.ENTRANCE_DOOR);
		addEEnumLiteral(doorTypeEEnum, DoorType.SLIDING_DOOR);
		addEEnumLiteral(doorTypeEEnum, DoorType.GATE);
		addEEnumLiteral(doorTypeEEnum, DoorType.EMPTY);

		initEEnum(actuatorTypeEEnum, ActuatorType.class, "ActuatorType");
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.IDRAULIC);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.PNEUMATIC);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.ELECTRICAL);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.THERMAL);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.MECHANICAL);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.TEMPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.PRESSURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.PROXIMITY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.ACCELEROMETER);
		addEEnumLiteral(sensorTypeEEnum, SensorType.GAS);
		addEEnumLiteral(sensorTypeEEnum, SensorType.SMOKE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.VIDEO_SURVAILLANCE_CAMERA);

		initEEnum(outerSpaceTypeEEnum, OuterSpaceType.class, "OuterSpaceType");
		addEEnumLiteral(outerSpaceTypeEEnum, OuterSpaceType.BALCONY);
		addEEnumLiteral(outerSpaceTypeEEnum, OuterSpaceType.GARDEN);
		addEEnumLiteral(outerSpaceTypeEEnum, OuterSpaceType.TERRACE);

		initEEnum(groundTypeEEnum, GroundType.class, "GroundType");
		addEEnumLiteral(groundTypeEEnum, GroundType.ASPALTH);
		addEEnumLiteral(groundTypeEEnum, GroundType.TERRAIN);
		addEEnumLiteral(groundTypeEEnum, GroundType.PAVING);

		initEEnum(deviceTypeEEnum, DeviceType.class, "DeviceType");
		addEEnumLiteral(deviceTypeEEnum, DeviceType.THERMOSTAT);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.APPLIANCE);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.SOCKET);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.ROLLER_SHUTTERS);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.GATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(floorEClass, source, new String[] { "constraints", "FloorLevelUnique" });
		addAnnotation(controllerEClass, source, new String[] { "constraints", "OsVersionMissing" });
		addAnnotation(windowEClass, source, new String[] { "constraints", "WindowHeightConstraints" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getHouse__HasOuterSpace(), source,
				new String[] { "body", "self.floors.spaces->select(e | e.oclIsTypeOf(ExternalSpace))->size() > 0" });
		addAnnotation(getHouse__IsSmart(), source, new String[] { "body", "self.controllers->size() > 0" });
		addAnnotation(getHouse_InternalFootage(), source,
				new String[] { "derivation", "self.floors->collect(s | s.internalFootage)->sum()" });
		addAnnotation(getHouse_OuterFootage(), source,
				new String[] { "derivation", "self.floors->collect(s | s.outerFootage)->sum()" });
		addAnnotation(getHouse_Footage(), source, new String[] { "derivation", "internalFootage + outerFootage" });
		addAnnotation(getHouse_RoomsNumber(), source,
				new String[] { "derivation", "self.floors->collect(s | s.roomsNumber)->sum()" });
		addAnnotation(floorEClass, source, new String[] { "FloorLevelUnique",
				"Tuple {\n\tmessage : String = \'There is another floor with the same level. Level must be unique\',\n\tstatus : Boolean = \n\t\t\t\t\t\t\tself.house.floors->select(f | f <> self)->collect(f | f.level)->excludes(self.level)\n}.status" });
		addAnnotation(getFloor_InternalFootage(), source, new String[] { "derivation",
				"self.spaces->select(s | s.oclIsTypeOf(Room))->collect(s | s.footage)->sum()" });
		addAnnotation(getFloor_OuterFootage(), source, new String[] { "derivation",
				"self.spaces->select(s | s.oclIsTypeOf(ExternalSpace))->collect(s | s.footage)->sum()" });
		addAnnotation(getFloor_Footage(), source, new String[] { "derivation", "internalFootage + outerFootage" });
		addAnnotation(getFloor_RoomsNumber(), source,
				new String[] { "derivation", "self.spaces->select(e | e.oclIsTypeOf(Room))->size()" });
		addAnnotation(getSpace_Passages(), source, new String[] { "derivation", "passagesA->union(passagesB)" });
		addAnnotation(getSpace_Footage(), source, new String[] { "derivation", "length * width" });
		addAnnotation(controllerEClass, source, new String[] { "OsVersionMissing",
				"Tuple {\n\tmessage : String = \'If you specify the os, you have to specify the osVersion too\',\n\tstatus : Boolean = if self.os->notEmpty() then self.os->notEmpty() else null endif\n}.status" });
		addAnnotation(windowEClass, source, new String[] { "WindowHeightConstraints",
				"Tuple {\n\tmessage : String = \'Window height must be a value between 0 and room height\',\n\tstatus : Boolean = \n\t\t\t\t\t\t\t\t\t\t\t\theight <= room.height and height >= 0.0\n}.status" });
	}

} //HbPackageImpl
