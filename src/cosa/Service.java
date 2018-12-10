/**
 */
package cosa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Service#getNomService <em>Nom Service</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getService()
 * @model abstract="true"
 * @generated
 */
public interface Service extends InterfaceComposant {
	/**
	 * Returns the value of the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Service</em>' attribute.
	 * @see #setNomService(String)
	 * @see cosa.CosaPackage#getService_NomService()
	 * @model
	 * @generated
	 */
	String getNomService();

	/**
	 * Sets the value of the '{@link cosa.Service#getNomService <em>Nom Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Service</em>' attribute.
	 * @see #getNomService()
	 * @generated
	 */
	void setNomService(String value);

} // Service
