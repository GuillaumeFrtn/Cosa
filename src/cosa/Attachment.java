/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Attachment#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 *   <li>{@link cosa.Attachment#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>Interfaceconnecteur</b></em>' reference list.
	 * The list contents are of type {@link cosa.InterfaceConnecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconnecteur</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconnecteur</em>' reference list.
	 * @see cosa.CosaPackage#getAttachment_Interfaceconnecteur()
	 * @model required="true"
	 * @generated
	 */
	EList<InterfaceConnecteur> getInterfaceconnecteur();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link cosa.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see cosa.CosaPackage#getAttachment_Port()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getPort();

} // Attachment
