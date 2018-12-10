/**
 */
package cs.impl;

import cosa.impl.RoleFourniImpl;
import cs.CS;
import cs.CsPackage;
import cs.RoleFourniRPC;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fourni RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoleFourniRPCImpl extends RoleFourniImpl implements RoleFourniRPC {
	
	CS observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleFourniRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ROLE_FOURNI_RPC;
	}

	@Override
	public void addObserver(CS observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConfig(RoleFourniRPC role, String message) {
		this.observer.transfert(role, message);
		
	}

} //RoleFourniRPCImpl
