/**
 */
package sirius.hb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sirius.hb.Actuator;
import sirius.hb.Device;
import sirius.hb.DeviceType;
import sirius.hb.Door;
import sirius.hb.HbPackage;
import sirius.hb.Space;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link sirius.hb.impl.DeviceImpl#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceType TYPE_EDEFAULT = DeviceType.THERMOSTAT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected Actuator actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbPackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeviceType newType) {
		DeviceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		if (actuator != null && actuator.eIsProxy()) {
			InternalEObject oldActuator = (InternalEObject) actuator;
			actuator = (Actuator) eResolveProxy(oldActuator);
			if (actuator != oldActuator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbPackage.DEVICE__ACTUATOR, oldActuator,
							actuator));
			}
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(Actuator newActuator, NotificationChain msgs) {
		Actuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__ACTUATOR,
					oldActuator, newActuator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject) actuator).eInverseRemove(this, HbPackage.ACTUATOR__DEVICE, Actuator.class,
						msgs);
			if (newActuator != null)
				msgs = ((InternalEObject) newActuator).eInverseAdd(this, HbPackage.ACTUATOR__DEVICE, Actuator.class,
						msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__ACTUATOR, newActuator,
					newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpace() {
		if (eContainerFeatureID() != HbPackage.DEVICE__SPACE)
			return null;
		return (Space) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpace, HbPackage.DEVICE__SPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(Space newSpace) {
		if (newSpace != eInternalContainer()
				|| (eContainerFeatureID() != HbPackage.DEVICE__SPACE && newSpace != null)) {
			if (EcoreUtil.isAncestor(this, newSpace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpace != null)
				msgs = ((InternalEObject) newSpace).eInverseAdd(this, HbPackage.SPACE__DEVICES, Space.class, msgs);
			msgs = basicSetSpace(newSpace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__SPACE, newSpace, newSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (eContainerFeatureID() != HbPackage.DEVICE__DOOR)
			return null;
		return (Door) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor(Door newDoor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDoor, HbPackage.DEVICE__DOOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		if (newDoor != eInternalContainer() || (eContainerFeatureID() != HbPackage.DEVICE__DOOR && newDoor != null)) {
			if (EcoreUtil.isAncestor(this, newDoor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoor != null)
				msgs = ((InternalEObject) newDoor).eInverseAdd(this, HbPackage.DOOR__DEVICES, Door.class, msgs);
			msgs = basicSetDoor(newDoor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.DEVICE__DOOR, newDoor, newDoor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HbPackage.DEVICE__ACTUATOR:
			if (actuator != null)
				msgs = ((InternalEObject) actuator).eInverseRemove(this, HbPackage.ACTUATOR__DEVICE, Actuator.class,
						msgs);
			return basicSetActuator((Actuator) otherEnd, msgs);
		case HbPackage.DEVICE__SPACE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSpace((Space) otherEnd, msgs);
		case HbPackage.DEVICE__DOOR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDoor((Door) otherEnd, msgs);
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
		case HbPackage.DEVICE__ACTUATOR:
			return basicSetActuator(null, msgs);
		case HbPackage.DEVICE__SPACE:
			return basicSetSpace(null, msgs);
		case HbPackage.DEVICE__DOOR:
			return basicSetDoor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case HbPackage.DEVICE__SPACE:
			return eInternalContainer().eInverseRemove(this, HbPackage.SPACE__DEVICES, Space.class, msgs);
		case HbPackage.DEVICE__DOOR:
			return eInternalContainer().eInverseRemove(this, HbPackage.DOOR__DEVICES, Door.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HbPackage.DEVICE__NAME:
			return getName();
		case HbPackage.DEVICE__TYPE:
			return getType();
		case HbPackage.DEVICE__MODEL:
			return getModel();
		case HbPackage.DEVICE__ACTUATOR:
			if (resolve)
				return getActuator();
			return basicGetActuator();
		case HbPackage.DEVICE__SPACE:
			return getSpace();
		case HbPackage.DEVICE__DOOR:
			return getDoor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HbPackage.DEVICE__NAME:
			setName((String) newValue);
			return;
		case HbPackage.DEVICE__TYPE:
			setType((DeviceType) newValue);
			return;
		case HbPackage.DEVICE__MODEL:
			setModel((String) newValue);
			return;
		case HbPackage.DEVICE__ACTUATOR:
			setActuator((Actuator) newValue);
			return;
		case HbPackage.DEVICE__SPACE:
			setSpace((Space) newValue);
			return;
		case HbPackage.DEVICE__DOOR:
			setDoor((Door) newValue);
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
		case HbPackage.DEVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HbPackage.DEVICE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case HbPackage.DEVICE__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case HbPackage.DEVICE__ACTUATOR:
			setActuator((Actuator) null);
			return;
		case HbPackage.DEVICE__SPACE:
			setSpace((Space) null);
			return;
		case HbPackage.DEVICE__DOOR:
			setDoor((Door) null);
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
		case HbPackage.DEVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HbPackage.DEVICE__TYPE:
			return type != TYPE_EDEFAULT;
		case HbPackage.DEVICE__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case HbPackage.DEVICE__ACTUATOR:
			return actuator != null;
		case HbPackage.DEVICE__SPACE:
			return getSpace() != null;
		case HbPackage.DEVICE__DOOR:
			return getDoor() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(", type: ");
		result.append(type);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
