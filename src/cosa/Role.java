/**
 */
package cosa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Role#getNomRole <em>Nom Role</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getRole()
 * @model abstract="true"
 * @generated
 */
public interface Role extends InterfaceConnecteur {
	/**
	 * Returns the value of the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Role</em>' attribute.
	 * @see #setNomRole(String)
	 * @see cosa.CosaPackage#getRole_NomRole()
	 * @model
	 * @generated
	 */
	String getNomRole();

	/**
	 * Sets the value of the '{@link cosa.Role#getNomRole <em>Nom Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Role</em>' attribute.
	 * @see #getNomRole()
	 * @generated
	 */
	void setNomRole(String value);

} // Role
