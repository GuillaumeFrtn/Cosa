/**
 */
package cs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Clientrpc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.AttachClientrpc#getPortrequisclient <em>Portrequisclient</em>}</li>
 *   <li>{@link cs.AttachClientrpc#getRolefourniclient <em>Rolefourniclient</em>}</li>
 *   <li>{@link cs.AttachClientrpc#getRolerequisclient <em>Rolerequisclient</em>}</li>
 *   <li>{@link cs.AttachClientrpc#getPortfourniclient <em>Portfourniclient</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getAttachClientrpc()
 * @model
 * @generated
 */
public interface AttachClientrpc extends EObject {
	/**
	 * Returns the value of the '<em><b>Portrequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisclient</em>' reference.
	 * @see #setPortrequisclient(PortRequisClient)
	 * @see cs.CsPackage#getAttachClientrpc_Portrequisclient()
	 * @model required="true"
	 * @generated
	 */
	PortRequisClient getPortrequisclient();

	/**
	 * Sets the value of the '{@link cs.AttachClientrpc#getPortrequisclient <em>Portrequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisclient</em>' reference.
	 * @see #getPortrequisclient()
	 * @generated
	 */
	void setPortrequisclient(PortRequisClient value);

	/**
	 * Returns the value of the '<em><b>Rolefourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefourniclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefourniclient</em>' reference.
	 * @see #setRolefourniclient(RoleFourniRPC)
	 * @see cs.CsPackage#getAttachClientrpc_Rolefourniclient()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniRPC getRolefourniclient();

	/**
	 * Sets the value of the '{@link cs.AttachClientrpc#getRolefourniclient <em>Rolefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefourniclient</em>' reference.
	 * @see #getRolefourniclient()
	 * @generated
	 */
	void setRolefourniclient(RoleFourniRPC value);

	/**
	 * Returns the value of the '<em><b>Rolerequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequisclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequisclient</em>' reference.
	 * @see #setRolerequisclient(RoleRequisRPC)
	 * @see cs.CsPackage#getAttachClientrpc_Rolerequisclient()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisRPC getRolerequisclient();

	/**
	 * Sets the value of the '{@link cs.AttachClientrpc#getRolerequisclient <em>Rolerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisclient</em>' reference.
	 * @see #getRolerequisclient()
	 * @generated
	 */
	void setRolerequisclient(RoleRequisRPC value);

	/**
	 * Returns the value of the '<em><b>Portfourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniclient</em>' reference.
	 * @see #setPortfourniclient(PortFourniClient)
	 * @see cs.CsPackage#getAttachClientrpc_Portfourniclient()
	 * @model required="true"
	 * @generated
	 */
	PortFourniClient getPortfourniclient();

	/**
	 * Sets the value of the '{@link cs.AttachClientrpc#getPortfourniclient <em>Portfourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourniclient</em>' reference.
	 * @see #getPortfourniclient()
	 * @generated
	 */
	void setPortfourniclient(PortFourniClient value);
	
	PortRequisClient getCorrespondance(RoleFourniRPC role);
	RoleRequisRPC getCorrespondance(PortFourniClient port);

} // AttachClientrpc
