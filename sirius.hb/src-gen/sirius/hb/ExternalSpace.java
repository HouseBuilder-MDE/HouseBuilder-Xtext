/**
 */
package sirius.hb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.ExternalSpace#getType <em>Type</em>}</li>
 *   <li>{@link sirius.hb.ExternalSpace#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getExternalSpace()
 * @model
 * @generated
 */
public interface ExternalSpace extends Space {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.OuterSpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.OuterSpaceType
	 * @see #setType(OuterSpaceType)
	 * @see sirius.hb.HbPackage#getExternalSpace_Type()
	 * @model
	 * @generated
	 */
	OuterSpaceType getType();

	/**
	 * Sets the value of the '{@link sirius.hb.ExternalSpace#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see sirius.hb.OuterSpaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(OuterSpaceType value);

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' attribute.
	 * The literals are from the enumeration {@link sirius.hb.GroundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' attribute.
	 * @see sirius.hb.GroundType
	 * @see #setGround(GroundType)
	 * @see sirius.hb.HbPackage#getExternalSpace_Ground()
	 * @model
	 * @generated
	 */
	GroundType getGround();

	/**
	 * Sets the value of the '{@link sirius.hb.ExternalSpace#getGround <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' attribute.
	 * @see sirius.hb.GroundType
	 * @see #getGround()
	 * @generated
	 */
	void setGround(GroundType value);

} // ExternalSpace
