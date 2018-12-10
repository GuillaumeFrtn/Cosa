/**
 */
package cs;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach CONNECTIO Nsql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.AttachCONNECTIONsql#getPortfournicmdatabase <em>Portfournicmdatabase</em>}</li>
 *   <li>{@link cs.AttachCONNECTIONsql#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}</li>
 *   <li>{@link cs.AttachCONNECTIONsql#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}</li>
 *   <li>{@link cs.AttachCONNECTIONsql#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getAttachCONNECTIONsql()
 * @model
 * @generated
 */
public interface AttachCONNECTIONsql extends Attachment {
	/**
	 * Returns the value of the '<em><b>Portfournicmdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicmdatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournicmdatabase</em>' reference.
	 * @see #setPortfournicmdatabase(PortFourniConnectionM)
	 * @see cs.CsPackage#getAttachCONNECTIONsql_Portfournicmdatabase()
	 * @model required="true"
	 * @generated
	 */
	PortFourniConnectionM getPortfournicmdatabase();

	/**
	 * Sets the value of the '{@link cs.AttachCONNECTIONsql#getPortfournicmdatabase <em>Portfournicmdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournicmdatabase</em>' reference.
	 * @see #getPortfournicmdatabase()
	 * @generated
	 */
	void setPortfournicmdatabase(PortFourniConnectionM value);

	/**
	 * Returns the value of the '<em><b>Rolerequiscmsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequiscmsqlquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequiscmsqlquery</em>' reference.
	 * @see #setRolerequiscmsqlquery(RoleRequisSQLquery)
	 * @see cs.CsPackage#getAttachCONNECTIONsql_Rolerequiscmsqlquery()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisSQLquery getRolerequiscmsqlquery();

	/**
	 * Sets the value of the '{@link cs.AttachCONNECTIONsql#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequiscmsqlquery</em>' reference.
	 * @see #getRolerequiscmsqlquery()
	 * @generated
	 */
	void setRolerequiscmsqlquery(RoleRequisSQLquery value);

	/**
	 * Returns the value of the '<em><b>Rolefournisqlquerycm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefournisqlquerycm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefournisqlquerycm</em>' reference.
	 * @see #setRolefournisqlquerycm(RoleFourniSQLquery)
	 * @see cs.CsPackage#getAttachCONNECTIONsql_Rolefournisqlquerycm()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniSQLquery getRolefournisqlquerycm();

	/**
	 * Sets the value of the '{@link cs.AttachCONNECTIONsql#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournisqlquerycm</em>' reference.
	 * @see #getRolefournisqlquerycm()
	 * @generated
	 */
	void setRolefournisqlquerycm(RoleFourniSQLquery value);

	/**
	 * Returns the value of the '<em><b>Portrequisdatabasecm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisdatabasecm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisdatabasecm</em>' reference.
	 * @see #setPortrequisdatabasecm(PortRequisConnectionM)
	 * @see cs.CsPackage#getAttachCONNECTIONsql_Portrequisdatabasecm()
	 * @model required="true"
	 * @generated
	 */
	PortRequisConnectionM getPortrequisdatabasecm();

	/**
	 * Sets the value of the '{@link cs.AttachCONNECTIONsql#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisdatabasecm</em>' reference.
	 * @see #getPortrequisdatabasecm()
	 * @generated
	 */
	void setPortrequisdatabasecm(PortRequisConnectionM value);
	
	PortRequisConnectionM getCorrespondance(RoleFourniSQLquery role);
	RoleRequisSQLquery getCorrespondance(PortFourniConnectionM port);

} // AttachCONNECTIONsql
