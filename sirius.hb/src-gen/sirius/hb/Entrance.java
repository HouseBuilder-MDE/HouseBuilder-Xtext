/**
 */
package sirius.hb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Entrance#getHouse <em>House</em>}</li>
 *   <li>{@link sirius.hb.Entrance#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getEntrance()
 * @model
 * @generated
 */
public interface Entrance extends Named, Door {
	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.House#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see sirius.hb.HbPackage#getEntrance_House()
	 * @see sirius.hb.House#getEntrances
	 * @model opposite="entrances" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link sirius.hb.Entrance#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Space#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(Space)
	 * @see sirius.hb.HbPackage#getEntrance_Space()
	 * @see sirius.hb.Space#getEntrances
	 * @model opposite="entrances" required="true"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link sirius.hb.Entrance#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

} // Entrance
