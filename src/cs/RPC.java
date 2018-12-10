/**
 */
package cs;

import cosa.EConnecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.RPC#getGluerpc <em>Gluerpc</em>}</li>
 *   <li>{@link cs.RPC#getRolerequisclient <em>Rolerequisclient</em>}</li>
 *   <li>{@link cs.RPC#getRolerequisserveur <em>Rolerequisserveur</em>}</li>
 *   <li>{@link cs.RPC#getRolefourniclient <em>Rolefourniclient</em>}</li>
 *   <li>{@link cs.RPC#getRolefourniserveur <em>Rolefourniserveur</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getRPC()
 * @model
 * @generated
 */
public interface RPC extends EConnecteur {
	/**
	 * Returns the value of the '<em><b>Gluerpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gluerpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gluerpc</em>' reference.
	 * @see #setGluerpc(GlueRPC)
	 * @see cs.CsPackage#getRPC_Gluerpc()
	 * @model required="true"
	 * @generated
	 */
	GlueRPC getGluerpc();

	/**
	 * Sets the value of the '{@link cs.RPC#getGluerpc <em>Gluerpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gluerpc</em>' reference.
	 * @see #getGluerpc()
	 * @generated
	 */
	void setGluerpc(GlueRPC value);

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
	 * @see cs.CsPackage#getRPC_Rolerequisclient()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisRPC getRolerequisclient();

	/**
	 * Sets the value of the '{@link cs.RPC#getRolerequisclient <em>Rolerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisclient</em>' reference.
	 * @see #getRolerequisclient()
	 * @generated
	 */
	void setRolerequisclient(RoleRequisRPC value);

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
	 * @see cs.CsPackage#getRPC_Rolerequisserveur()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisRPC getRolerequisserveur();

	/**
	 * Sets the value of the '{@link cs.RPC#getRolerequisserveur <em>Rolerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisserveur</em>' reference.
	 * @see #getRolerequisserveur()
	 * @generated
	 */
	void setRolerequisserveur(RoleRequisRPC value);

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
	 * @see cs.CsPackage#getRPC_Rolefourniclient()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniRPC getRolefourniclient();

	/**
	 * Sets the value of the '{@link cs.RPC#getRolefourniclient <em>Rolefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefourniclient</em>' reference.
	 * @see #getRolefourniclient()
	 * @generated
	 */
	void setRolefourniclient(RoleFourniRPC value);

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
	 * @see cs.CsPackage#getRPC_Rolefourniserveur()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniRPC getRolefourniserveur();

	/**
	 * Sets the value of the '{@link cs.RPC#getRolefourniserveur <em>Rolefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefourniserveur</em>' reference.
	 * @see #getRolefourniserveur()
	 * @generated
	 */
	void setRolefourniserveur(RoleFourniRPC value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transfertMessageRPC();
	void transfertMessageRPCy(RoleRequisRPC role, String message);

} // RPC
