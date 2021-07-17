/**
 */
package sirius.hb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sirius.hb.ExternalSpace;
import sirius.hb.GroundType;
import sirius.hb.HbPackage;
import sirius.hb.OuterSpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.impl.ExternalSpaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link sirius.hb.impl.ExternalSpaceImpl#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSpaceImpl extends SpaceImpl implements ExternalSpace {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OuterSpaceType TYPE_EDEFAULT = OuterSpaceType.BALCONY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OuterSpaceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGround() <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected static final GroundType GROUND_EDEFAULT = GroundType.ASPALTH;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected GroundType ground = GROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbPackage.Literals.EXTERNAL_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterSpaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OuterSpaceType newType) {
		OuterSpaceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.EXTERNAL_SPACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundType getGround() {
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGround(GroundType newGround) {
		GroundType oldGround = ground;
		ground = newGround == null ? GROUND_EDEFAULT : newGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbPackage.EXTERNAL_SPACE__GROUND, oldGround, ground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HbPackage.EXTERNAL_SPACE__TYPE:
			return getType();
		case HbPackage.EXTERNAL_SPACE__GROUND:
			return getGround();
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
		case HbPackage.EXTERNAL_SPACE__TYPE:
			setType((OuterSpaceType) newValue);
			return;
		case HbPackage.EXTERNAL_SPACE__GROUND:
			setGround((GroundType) newValue);
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
		case HbPackage.EXTERNAL_SPACE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case HbPackage.EXTERNAL_SPACE__GROUND:
			setGround(GROUND_EDEFAULT);
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
		case HbPackage.EXTERNAL_SPACE__TYPE:
			return type != TYPE_EDEFAULT;
		case HbPackage.EXTERNAL_SPACE__GROUND:
			return ground != GROUND_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", ground: ");
		result.append(ground);
		result.append(')');
		return result.toString();
	}

} //ExternalSpaceImpl
