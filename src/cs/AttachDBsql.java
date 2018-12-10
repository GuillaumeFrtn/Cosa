/**
 */
package cs;

import cosa.Attachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach DBsql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.AttachDBsql#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}</li>
 *   <li>{@link cs.AttachDBsql#getPortrequisdatabase <em>Portrequisdatabase</em>}</li>
 *   <li>{@link cs.AttachDBsql#getPortfournidatabase <em>Portfournidatabase</em>}</li>
 *   <li>{@link cs.AttachDBsql#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getAttachDBsql()
 * @model
 * @generated
 */
public interface AttachDBsql extends Attachment {
	/**
	 * Returns the value of the '<em><b>Rolefournisqlquerydb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefournisqlquerydb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefournisqlquerydb</em>' reference.
	 * @see #setRolefournisqlquerydb(RoleFourniSQLquery)
	 * @see cs.CsPackage#getAttachDBsql_Rolefournisqlquerydb()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniSQLquery getRolefournisqlquerydb();

	/**
	 * Sets the value of the '{@link cs.AttachDBsql#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournisqlquerydb</em>' reference.
	 * @see #getRolefournisqlquerydb()
	 * @generated
	 */
	void setRolefournisqlquerydb(RoleFourniSQLquery value);

	/**
	 * Returns the value of the '<em><b>Portrequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisdatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisdatabase</em>' reference.
	 * @see #setPortrequisdatabase(PortRequisDataBase)
	 * @see cs.CsPackage#getAttachDBsql_Portrequisdatabase()
	 * @model required="true"
	 * @generated
	 */
	PortRequisDataBase getPortrequisdatabase();

	/**
	 * Sets the value of the '{@link cs.AttachDBsql#getPortrequisdatabase <em>Portrequisdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisdatabase</em>' reference.
	 * @see #getPortrequisdatabase()
	 * @generated
	 */
	void setPortrequisdatabase(PortRequisDataBase value);

	/**
	 * Returns the value of the '<em><b>Portfournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournidatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournidatabase</em>' reference.
	 * @see #setPortfournidatabase(PortFourniDataBase)
	 * @see cs.CsPackage#getAttachDBsql_Portfournidatabase()
	 * @model required="true"
	 * @generated
	 */
	PortFourniDataBase getPortfournidatabase();

	/**
	 * Sets the value of the '{@link cs.AttachDBsql#getPortfournidatabase <em>Portfournidatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournidatabase</em>' reference.
	 * @see #getPortfournidatabase()
	 * @generated
	 */
	void setPortfournidatabase(PortFourniDataBase value);

	/**
	 * Returns the value of the '<em><b>Rolerequisdbsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequisdbsqlquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequisdbsqlquery</em>' reference.
	 * @see #setRolerequisdbsqlquery(RoleRequisSQLquery)
	 * @see cs.CsPackage#getAttachDBsql_Rolerequisdbsqlquery()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisSQLquery getRolerequisdbsqlquery();

	/**
	 * Sets the value of the '{@link cs.AttachDBsql#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisdbsqlquery</em>' reference.
	 * @see #getRolerequisdbsqlquery()
	 * @generated
	 */
	void setRolerequisdbsqlquery(RoleRequisSQLquery value);
	
	PortRequisDataBase getCorrespondance(RoleFourniSQLquery role);
	RoleRequisSQLquery getCorrespondance(PortFourniDataBase port);

} // AttachDBsql
