/**
 */
package cs;

import cosa.Glue;
import cosa.RoleFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getGlueRPC()
 * @model
 * @generated
 */
public interface GlueRPC extends Glue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCorrespondance(RoleRequisRPC rolerequis, RoleFourniRPC rolefourni);
	RoleFourni matchRolesRPC(RoleRequisRPC key);
	RoleFourni matchRolesRPC();
	
} // GlueRPC
