/**
 */
package cs.impl;

import cosa.impl.PortRequisImpl;
import cs.ConnectionManager;
import cs.CsPackage;
import cs.PortRequisConnectionM;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortRequisConnectionMImpl extends PortRequisImpl implements PortRequisConnectionM {
	
	ConnectionManager observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisConnectionMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_REQUIS_CONNECTION_M;
	}

	@Override
	public void addObserver(ConnectionManager observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConnectionManager(String message) {
		this.observer.receiveNotify(this, message);
		
	}

} //PortRequisConnectionMImpl
