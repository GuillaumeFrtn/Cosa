/**
 */
package cosa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Port#getNomPort <em>Nom Port</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends InterfaceComposant {
	/**
	 * Returns the value of the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Port</em>' attribute.
	 * @see #setNomPort(String)
	 * @see cosa.CosaPackage#getPort_NomPort()
	 * @model
	 * @generated
	 */
	String getNomPort();

	/**
	 * Sets the value of the '{@link cosa.Port#getNomPort <em>Nom Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Port</em>' attribute.
	 * @see #getNomPort()
	 * @generated
	 */
	void setNomPort(String value);

} // Port
