/**
 */
package cs.impl;

import cosa.impl.RoleRequisImpl;

import cs.CsPackage;
import cs.RPC;
import cs.RoleRequisRPC;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoleRequisRPCImpl extends RoleRequisImpl implements RoleRequisRPC {
	
	RPC observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequisRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ROLE_REQUIS_RPC;
	}

	@Override
	public void addObserver(RPC observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyRPC(String message) {
		this.observer.transfertMessageRPCy(this, message);
		
	}

} //RoleRequisRPCImpl
