/**
 */
package cs;

import cosa.RoleFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getRoleFourniSQLquery()
 * @model
 * @generated
 */
public interface RoleFourniSQLquery extends RoleFourni {
	
	void addObserver(Serveur observer);
	void notifyServeur(RoleFourniSQLquery newrole, String message);
} // RoleFourniSQLquery
