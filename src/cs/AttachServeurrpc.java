/**
 */
package cs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Serveurrpc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.AttachServeurrpc#getPortrequisserveur <em>Portrequisserveur</em>}</li>
 *   <li>{@link cs.AttachServeurrpc#getRolefourniserveur <em>Rolefourniserveur</em>}</li>
 *   <li>{@link cs.AttachServeurrpc#getRolerequisserveur <em>Rolerequisserveur</em>}</li>
 *   <li>{@link cs.AttachServeurrpc#getPortfourniserveur <em>Portfourniserveur</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getAttachServeurrpc()
 * @model
 * @generated
 */
public interface AttachServeurrpc extends EObject {
	/**
	 * Returns the value of the '<em><b>Portrequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisserveur</em>' reference.
	 * @see #setPortrequisserveur(PortRequisServeur)
	 * @see cs.CsPackage#getAttachServeurrpc_Portrequisserveur()
	 * @model required="true"
	 * @generated
	 */
	PortRequisServeur getPortrequisserveur();

	/**
	 * Sets the value of the '{@link cs.AttachServeurrpc#getPortrequisserveur <em>Portrequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisserveur</em>' reference.
	 * @see #getPortrequisserveur()
	 * @generated
	 */
	void setPortrequisserveur(PortRequisServeur value);

	/**
	 * Returns the value of the '<em><b>Rolefourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefourniserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefourniserveur</em>' reference.
	 * @see #setRolefourniserveur(RoleFourniRPC)
	 * @see cs.CsPackage#getAttachServeurrpc_Rolefourniserveur()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniRPC getRolefourniserveur();

	/**
	 * Sets the value of the '{@link cs.AttachServeurrpc#getRolefourniserveur <em>Rolefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefourniserveur</em>' reference.
	 * @see #getRolefourniserveur()
	 * @generated
	 */
	void setRolefourniserveur(RoleFourniRPC value);

	/**
	 * Returns the value of the '<em><b>Rolerequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequisserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequisserveur</em>' reference.
	 * @see #setRolerequisserveur(RoleRequisRPC)
	 * @see cs.CsPackage#getAttachServeurrpc_Rolerequisserveur()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisRPC getRolerequisserveur();

	/**
	 * Sets the value of the '{@link cs.AttachServeurrpc#getRolerequisserveur <em>Rolerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisserveur</em>' reference.
	 * @see #getRolerequisserveur()
	 * @generated
	 */
	void setRolerequisserveur(RoleRequisRPC value);

	/**
	 * Returns the value of the '<em><b>Portfourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniserveur</em>' reference.
	 * @see #setPortfourniserveur(PortFourniServeur)
	 * @see cs.CsPackage#getAttachServeurrpc_Portfourniserveur()
	 * @model required="true"
	 * @generated
	 */
	PortFourniServeur getPortfourniserveur();

	/**
	 * Sets the value of the '{@link cs.AttachServeurrpc#getPortfourniserveur <em>Portfourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourniserveur</em>' reference.
	 * @see #getPortfourniserveur()
	 * @generated
	 */
	void setPortfourniserveur(PortFourniServeur value);
	
	PortRequisServeur getCorrespondance(RoleFourniRPC role);
	RoleRequisRPC getCorrespondance(PortFourniServeur port);

} // AttachServeurrpc
