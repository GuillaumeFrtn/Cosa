/**
 */
package cs;

import cosa.EConnecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.SQLquery#getGluesqlquery <em>Gluesqlquery</em>}</li>
 *   <li>{@link cs.SQLquery#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}</li>
 *   <li>{@link cs.SQLquery#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}</li>
 *   <li>{@link cs.SQLquery#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}</li>
 *   <li>{@link cs.SQLquery#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getSQLquery()
 * @model
 * @generated
 */
public interface SQLquery extends EConnecteur {
	/**
	 * Returns the value of the '<em><b>Gluesqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gluesqlquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gluesqlquery</em>' reference.
	 * @see #setGluesqlquery(GlueSQLquery)
	 * @see cs.CsPackage#getSQLquery_Gluesqlquery()
	 * @model required="true"
	 * @generated
	 */
	GlueSQLquery getGluesqlquery();

	/**
	 * Sets the value of the '{@link cs.SQLquery#getGluesqlquery <em>Gluesqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gluesqlquery</em>' reference.
	 * @see #getGluesqlquery()
	 * @generated
	 */
	void setGluesqlquery(GlueSQLquery value);

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
	 * @see cs.CsPackage#getSQLquery_Rolerequiscmsqlquery()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisSQLquery getRolerequiscmsqlquery();

	/**
	 * Sets the value of the '{@link cs.SQLquery#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequiscmsqlquery</em>' reference.
	 * @see #getRolerequiscmsqlquery()
	 * @generated
	 */
	void setRolerequiscmsqlquery(RoleRequisSQLquery value);

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
	 * @see cs.CsPackage#getSQLquery_Rolerequisdbsqlquery()
	 * @model required="true"
	 * @generated
	 */
	RoleRequisSQLquery getRolerequisdbsqlquery();

	/**
	 * Sets the value of the '{@link cs.SQLquery#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequisdbsqlquery</em>' reference.
	 * @see #getRolerequisdbsqlquery()
	 * @generated
	 */
	void setRolerequisdbsqlquery(RoleRequisSQLquery value);

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
	 * @see cs.CsPackage#getSQLquery_Rolefournisqlquerycm()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniSQLquery getRolefournisqlquerycm();

	/**
	 * Sets the value of the '{@link cs.SQLquery#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournisqlquerycm</em>' reference.
	 * @see #getRolefournisqlquerycm()
	 * @generated
	 */
	void setRolefournisqlquerycm(RoleFourniSQLquery value);

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
	 * @see cs.CsPackage#getSQLquery_Rolefournisqlquerydb()
	 * @model required="true"
	 * @generated
	 */
	RoleFourniSQLquery getRolefournisqlquerydb();

	/**
	 * Sets the value of the '{@link cs.SQLquery#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournisqlquerydb</em>' reference.
	 * @see #getRolefournisqlquerydb()
	 * @generated
	 */
	void setRolefournisqlquerydb(RoleFourniSQLquery value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transfertMessageSQLquery();
	void transfertMessageSQLquery(RoleRequisSQLquery role, String message);

} // SQLquery
