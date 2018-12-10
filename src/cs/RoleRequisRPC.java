/**
 */
package cs;

import cosa.RoleRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getRoleRequisRPC()
 * @model
 * @generated
 */
public interface RoleRequisRPC extends RoleRequis {
	
	void addObserver(RPC observer);
	void notifyRPC(String message);
} // RoleRequisRPC
