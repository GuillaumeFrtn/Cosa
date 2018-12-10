/**
 */
package cs.impl;

import cosa.RoleFourni;

import cosa.impl.GlueImpl;

import cs.CsPackage;
import cs.GlueRPC;
import cs.RoleFourniRPC;
import cs.RoleRequisRPC;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlueRPCImpl extends GlueImpl implements GlueRPC {
	
	private HashMap<RoleRequisRPC, RoleFourniRPC> roleCorrespondant;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueRPCImpl() {
		super();
		this.roleCorrespondant = new HashMap<RoleRequisRPC, RoleFourniRPC>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.GLUE_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni matchRolesRPC() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public RoleFourni matchRolesRPC(RoleRequisRPC key) {
		return roleCorrespondant.get(key);
	}
	
	public void addCorrespondance(RoleRequisRPC roleRequis, RoleFourniRPC roleFourni)
	{
		roleCorrespondant.put(roleRequis, roleFourni);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.GLUE_RPC___MATCH_ROLES_RPC:
				return matchRolesRPC();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlueRPCImpl
