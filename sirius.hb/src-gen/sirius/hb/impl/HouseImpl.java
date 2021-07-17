/**
 */
package sirius.hb.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sirius.hb.Controller;
import sirius.hb.Entrance;
import sirius.hb.Floor;
import sirius.hb.HbPackage;
import sirius.hb.House;
import sirius.hb.Passage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.impl.HouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getState <em>State</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getCity <em>City</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getBuildingDate <em>Building Date</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getFloors <em>Floors</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getPassages <em>Passages</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getInternalFootage <em>Internal Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getOuterFootage <em>Outer Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getFootage <em>Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getRoomsNumber <em>Rooms Number</em>}</li>
 *   <li>{@link sirius.hb.impl.HouseImpl#getEntrances <em>Entrances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseImpl extends MinimalEObjectImpl.Container implements House {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvince() <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvince() <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvince()
	 * @generated
	 * @ordered
	 */
	protected String province = PROVINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingDate() <em>Building Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BUILDING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingDate() <em>Building Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingDate()
	 * @generated
	 * @ordered
	 */
	protected Date buildingDate = BUILDING_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFloors() <em>Floors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloors()
	 * @generated
	 * @ordered
	 */
	protected EList<Floor> floors;

	/**
	 * The cached value of the '{@link #getPassages() <em>Passages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassages()
	 * @generated
	 * @ordered
	 */
	protected EList<Passage> passages;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The cached setting delegate for the '{@link #getInternalFootage() <em>Internal Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INTERNAL_FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.HOUSE__INTERNAL_FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOuterFootage() <em>Outer Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUTER_FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.HOUSE__OUTER_FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFootage() <em>Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.HOUSE__FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRoomsNumber() <em>Rooms Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomsNumber()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROOMS_NUMBER__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.HOUSE__ROOMS_NUMBER)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getEntrances() <em>Entrances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrances()
	 * @generated
	 * @ordered
	 */
	protected EList<Entrance> entrances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbPackage.Literals.HOUSE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvince(String newProvince) {
		String oldProvince = province;
		province = newProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__PROVINCE, oldProvince, province));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__POSTAL_CODE, oldPostalCode,
					postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBuildingDate() {
		return buildingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingDate(Date newBuildingDate) {
		Date oldBuildingDate = buildingDate;
		buildingDate = newBuildingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.HOUSE__BUILDING_DATE, oldBuildingDate,
					buildingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Floor> getFloors() {
		if (floors == null) {
			floors = new EObjectContainmentWithInverseEList<Floor>(Floor.class, this, HbPackage.HOUSE__FLOORS,
					HbPackage.FLOOR__HOUSE);
		}
		return floors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passage> getPassages() {
		if (passages == null) {
			passages = new EObjectContainmentWithInverseEList<Passage>(Passage.class, this, HbPackage.HOUSE__PASSAGES,
					HbPackage.PASSAGE__HOUSE);
		}
		return passages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentWithInverseEList<Controller>(Controller.class, this,
					HbPackage.HOUSE__CONTROLLERS, HbPackage.CONTROLLER__HOUSE);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInternalFootage() {
		return (Float) INTERNAL_FOOTAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOuterFootage() {
		return (Float) OUTER_FOOTAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFootage() {
		return (Float) FOOTAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomsNumber() {
		return (Integer) ROOMS_NUMBER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entrance> getEntrances() {
		if (entrances == null) {
			entrances = new EObjectContainmentWithInverseEList<Entrance>(Entrance.class, this,
					HbPackage.HOUSE__ENTRANCES, HbPackage.ENTRANCE__HOUSE);
		}
		return entrances;
	}

	/**
	 * The cached invocation delegate for the '{@link #hasOuterSpace() <em>Has Outer Space</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOuterSpace()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_OUTER_SPACE__EINVOCATION_DELEGATE = ((EOperation.Internal) HbPackage.Literals.HOUSE___HAS_OUTER_SPACE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean hasOuterSpace() {
		try {
			return (Boolean) HAS_OUTER_SPACE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSmart() <em>Is Smart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmart()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SMART__EINVOCATION_DELEGATE = ((EOperation.Internal) HbPackage.Literals.HOUSE___IS_SMART)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isSmart() {
		try {
			return (Boolean) IS_SMART__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HbPackage.HOUSE__FLOORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFloors()).basicAdd(otherEnd, msgs);
		case HbPackage.HOUSE__PASSAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPassages()).basicAdd(otherEnd, msgs);
		case HbPackage.HOUSE__CONTROLLERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getControllers()).basicAdd(otherEnd, msgs);
		case HbPackage.HOUSE__ENTRANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntrances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HbPackage.HOUSE__FLOORS:
			return ((InternalEList<?>) getFloors()).basicRemove(otherEnd, msgs);
		case HbPackage.HOUSE__PASSAGES:
			return ((InternalEList<?>) getPassages()).basicRemove(otherEnd, msgs);
		case HbPackage.HOUSE__CONTROLLERS:
			return ((InternalEList<?>) getControllers()).basicRemove(otherEnd, msgs);
		case HbPackage.HOUSE__ENTRANCES:
			return ((InternalEList<?>) getEntrances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HbPackage.HOUSE__NAME:
			return getName();
		case HbPackage.HOUSE__STATE:
			return getState();
		case HbPackage.HOUSE__PROVINCE:
			return getProvince();
		case HbPackage.HOUSE__CITY:
			return getCity();
		case HbPackage.HOUSE__POSTAL_CODE:
			return getPostalCode();
		case HbPackage.HOUSE__ADDRESS:
			return getAddress();
		case HbPackage.HOUSE__BUILDING_DATE:
			return getBuildingDate();
		case HbPackage.HOUSE__FLOORS:
			return getFloors();
		case HbPackage.HOUSE__PASSAGES:
			return getPassages();
		case HbPackage.HOUSE__CONTROLLERS:
			return getControllers();
		case HbPackage.HOUSE__INTERNAL_FOOTAGE:
			return getInternalFootage();
		case HbPackage.HOUSE__OUTER_FOOTAGE:
			return getOuterFootage();
		case HbPackage.HOUSE__FOOTAGE:
			return getFootage();
		case HbPackage.HOUSE__ROOMS_NUMBER:
			return getRoomsNumber();
		case HbPackage.HOUSE__ENTRANCES:
			return getEntrances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HbPackage.HOUSE__NAME:
			setName((String) newValue);
			return;
		case HbPackage.HOUSE__STATE:
			setState((String) newValue);
			return;
		case HbPackage.HOUSE__PROVINCE:
			setProvince((String) newValue);
			return;
		case HbPackage.HOUSE__CITY:
			setCity((String) newValue);
			return;
		case HbPackage.HOUSE__POSTAL_CODE:
			setPostalCode((String) newValue);
			return;
		case HbPackage.HOUSE__ADDRESS:
			setAddress((String) newValue);
			return;
		case HbPackage.HOUSE__BUILDING_DATE:
			setBuildingDate((Date) newValue);
			return;
		case HbPackage.HOUSE__FLOORS:
			getFloors().clear();
			getFloors().addAll((Collection<? extends Floor>) newValue);
			return;
		case HbPackage.HOUSE__PASSAGES:
			getPassages().clear();
			getPassages().addAll((Collection<? extends Passage>) newValue);
			return;
		case HbPackage.HOUSE__CONTROLLERS:
			getControllers().clear();
			getControllers().addAll((Collection<? extends Controller>) newValue);
			return;
		case HbPackage.HOUSE__ENTRANCES:
			getEntrances().clear();
			getEntrances().addAll((Collection<? extends Entrance>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HbPackage.HOUSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HbPackage.HOUSE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case HbPackage.HOUSE__PROVINCE:
			setProvince(PROVINCE_EDEFAULT);
			return;
		case HbPackage.HOUSE__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case HbPackage.HOUSE__POSTAL_CODE:
			setPostalCode(POSTAL_CODE_EDEFAULT);
			return;
		case HbPackage.HOUSE__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HbPackage.HOUSE__BUILDING_DATE:
			setBuildingDate(BUILDING_DATE_EDEFAULT);
			return;
		case HbPackage.HOUSE__FLOORS:
			getFloors().clear();
			return;
		case HbPackage.HOUSE__PASSAGES:
			getPassages().clear();
			return;
		case HbPackage.HOUSE__CONTROLLERS:
			getControllers().clear();
			return;
		case HbPackage.HOUSE__ENTRANCES:
			getEntrances().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HbPackage.HOUSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HbPackage.HOUSE__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case HbPackage.HOUSE__PROVINCE:
			return PROVINCE_EDEFAULT == null ? province != null : !PROVINCE_EDEFAULT.equals(province);
		case HbPackage.HOUSE__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case HbPackage.HOUSE__POSTAL_CODE:
			return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
		case HbPackage.HOUSE__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HbPackage.HOUSE__BUILDING_DATE:
			return BUILDING_DATE_EDEFAULT == null ? buildingDate != null : !BUILDING_DATE_EDEFAULT.equals(buildingDate);
		case HbPackage.HOUSE__FLOORS:
			return floors != null && !floors.isEmpty();
		case HbPackage.HOUSE__PASSAGES:
			return passages != null && !passages.isEmpty();
		case HbPackage.HOUSE__CONTROLLERS:
			return controllers != null && !controllers.isEmpty();
		case HbPackage.HOUSE__INTERNAL_FOOTAGE:
			return INTERNAL_FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.HOUSE__OUTER_FOOTAGE:
			return OUTER_FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.HOUSE__FOOTAGE:
			return FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.HOUSE__ROOMS_NUMBER:
			return ROOMS_NUMBER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.HOUSE__ENTRANCES:
			return entrances != null && !entrances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HbPackage.HOUSE___HAS_OUTER_SPACE:
			return hasOuterSpace();
		case HbPackage.HOUSE___IS_SMART:
			return isSmart();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", state: ");
		result.append(state);
		result.append(", province: ");
		result.append(province);
		result.append(", city: ");
		result.append(city);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", address: ");
		result.append(address);
		result.append(", buildingDate: ");
		result.append(buildingDate);
		result.append(')');
		return result.toString();
	}

} //HouseImpl
