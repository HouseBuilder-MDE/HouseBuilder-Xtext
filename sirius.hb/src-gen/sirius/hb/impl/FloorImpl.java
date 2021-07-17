/**
 */
package sirius.hb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sirius.hb.Floor;
import sirius.hb.HbPackage;
import sirius.hb.House;
import sirius.hb.Space;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.impl.FloorImpl#getName <em>Name</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getHouse <em>House</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getInternalFootage <em>Internal Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getOuterFootage <em>Outer Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getFootage <em>Footage</em>}</li>
 *   <li>{@link sirius.hb.impl.FloorImpl#getRoomsNumber <em>Rooms Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorImpl extends MinimalEObjectImpl.Container implements Floor {
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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpaces() <em>Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Space> spaces;

	/**
	 * The cached setting delegate for the '{@link #getInternalFootage() <em>Internal Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INTERNAL_FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.FLOOR__INTERNAL_FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOuterFootage() <em>Outer Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUTER_FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.FLOOR__OUTER_FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFootage() <em>Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.FLOOR__FOOTAGE)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRoomsNumber() <em>Rooms Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomsNumber()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROOMS_NUMBER__ESETTING_DELEGATE = ((EStructuralFeature.Internal) HbPackage.Literals.FLOOR__ROOMS_NUMBER)
			.getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbPackage.Literals.FLOOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.FLOOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.FLOOR__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Space> getSpaces() {
		if (spaces == null) {
			spaces = new EObjectContainmentWithInverseEList<Space>(Space.class, this, HbPackage.FLOOR__SPACES,
					HbPackage.SPACE__FLOOR);
		}
		return spaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != HbPackage.FLOOR__HOUSE)
			return null;
		return (House) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newHouse, HbPackage.FLOOR__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != HbPackage.FLOOR__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject) newHouse).eInverseAdd(this, HbPackage.HOUSE__FLOORS, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.FLOOR__HOUSE, newHouse, newHouse));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HbPackage.FLOOR__SPACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpaces()).basicAdd(otherEnd, msgs);
		case HbPackage.FLOOR__HOUSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetHouse((House) otherEnd, msgs);
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
		case HbPackage.FLOOR__SPACES:
			return ((InternalEList<?>) getSpaces()).basicRemove(otherEnd, msgs);
		case HbPackage.FLOOR__HOUSE:
			return basicSetHouse(null, msgs);
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
		case HbPackage.FLOOR__HOUSE:
			return eInternalContainer().eInverseRemove(this, HbPackage.HOUSE__FLOORS, House.class, msgs);
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
		case HbPackage.FLOOR__NAME:
			return getName();
		case HbPackage.FLOOR__LEVEL:
			return getLevel();
		case HbPackage.FLOOR__SPACES:
			return getSpaces();
		case HbPackage.FLOOR__HOUSE:
			return getHouse();
		case HbPackage.FLOOR__INTERNAL_FOOTAGE:
			return getInternalFootage();
		case HbPackage.FLOOR__OUTER_FOOTAGE:
			return getOuterFootage();
		case HbPackage.FLOOR__FOOTAGE:
			return getFootage();
		case HbPackage.FLOOR__ROOMS_NUMBER:
			return getRoomsNumber();
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
		case HbPackage.FLOOR__NAME:
			setName((String) newValue);
			return;
		case HbPackage.FLOOR__LEVEL:
			setLevel((Integer) newValue);
			return;
		case HbPackage.FLOOR__SPACES:
			getSpaces().clear();
			getSpaces().addAll((Collection<? extends Space>) newValue);
			return;
		case HbPackage.FLOOR__HOUSE:
			setHouse((House) newValue);
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
		case HbPackage.FLOOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HbPackage.FLOOR__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case HbPackage.FLOOR__SPACES:
			getSpaces().clear();
			return;
		case HbPackage.FLOOR__HOUSE:
			setHouse((House) null);
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
		case HbPackage.FLOOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HbPackage.FLOOR__LEVEL:
			return level != LEVEL_EDEFAULT;
		case HbPackage.FLOOR__SPACES:
			return spaces != null && !spaces.isEmpty();
		case HbPackage.FLOOR__HOUSE:
			return getHouse() != null;
		case HbPackage.FLOOR__INTERNAL_FOOTAGE:
			return INTERNAL_FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.FLOOR__OUTER_FOOTAGE:
			return OUTER_FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.FLOOR__FOOTAGE:
			return FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case HbPackage.FLOOR__ROOMS_NUMBER:
			return ROOMS_NUMBER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //FloorImpl
