/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EConnecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.EConnecteur#getGlue <em>Glue</em>}</li>
 *   <li>{@link cosa.EConnecteur#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getEConnecteur()
 * @model
 * @generated
 */
public interface EConnecteur extends Element {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see cosa.CosaPackage#getEConnecteur_Glue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link cosa.EConnecteur#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

	/**
	 * Returns the value of the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.InterfaceConnecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconnecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconnecteur</em>' containment reference list.
	 * @see cosa.CosaPackage#getEConnecteur_Interfaceconnecteur()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<InterfaceConnecteur> getInterfaceconnecteur();

} // EConnecteur
