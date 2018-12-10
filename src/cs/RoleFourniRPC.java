/**
 */
package cs;

import cosa.RoleFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fourni RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getRoleFourniRPC()
 * @model
 * @generated
 */
public interface RoleFourniRPC extends RoleFourni {
	
	void addObserver(CS observer);
	void notifyConfig(RoleFourniRPC newrole, String message);
} // RoleFourniRPC
