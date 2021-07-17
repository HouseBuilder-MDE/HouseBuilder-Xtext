/**
 */
package sirius.hb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sirius.hb.Passage#getSpaceA <em>Space A</em>}</li>
 *   <li>{@link sirius.hb.Passage#getSpaceB <em>Space B</em>}</li>
 *   <li>{@link sirius.hb.Passage#getHouse <em>House</em>}</li>
 * </ul>
 *
 * @see sirius.hb.HbPackage#getPassage()
 * @model
 * @generated
 */
public interface Passage extends Named, Door {
	/**
	 * Returns the value of the '<em><b>Space A</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Space#getPassagesA <em>Passages A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space A</em>' reference.
	 * @see #setSpaceA(Space)
	 * @see sirius.hb.HbPackage#getPassage_SpaceA()
	 * @see sirius.hb.Space#getPassagesA
	 * @model opposite="passagesA" required="true"
	 * @generated
	 */
	Space getSpaceA();

	/**
	 * Sets the value of the '{@link sirius.hb.Passage#getSpaceA <em>Space A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space A</em>' reference.
	 * @see #getSpaceA()
	 * @generated
	 */
	void setSpaceA(Space value);

	/**
	 * Returns the value of the '<em><b>Space B</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.Space#getPassagesB <em>Passages B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space B</em>' reference.
	 * @see #setSpaceB(Space)
	 * @see sirius.hb.HbPackage#getPassage_SpaceB()
	 * @see sirius.hb.Space#getPassagesB
	 * @model opposite="passagesB" required="true"
	 * @generated
	 */
	Space getSpaceB();

	/**
	 * Sets the value of the '{@link sirius.hb.Passage#getSpaceB <em>Space B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space B</em>' reference.
	 * @see #getSpaceB()
	 * @generated
	 */
	void setSpaceB(Space value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sirius.hb.House#getPassages <em>Passages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see sirius.hb.HbPackage#getPassage_House()
	 * @see sirius.hb.House#getPassages
	 * @model opposite="passages" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link sirius.hb.Passage#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // Passage
