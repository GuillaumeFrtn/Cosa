/**
 */
package cs;

import cosa.Glue;
import cosa.RoleFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getGlueSQLquery()
 * @model
 * @generated
 */
public interface GlueSQLquery extends Glue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCorrespondance(RoleRequisSQLquery roleRequis, RoleFourniSQLquery roleFourni);
	RoleFourniSQLquery matchRolesSQLquery(RoleRequisSQLquery key);
	RoleFourniSQLquery matchRolesSQLquery();

} // GlueSQLquery
