/**
 */
package cs.impl;

import cosa.impl.PortRequisImpl;
import cs.Client;
import cs.CsPackage;
import cs.PortRequisClient;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortRequisClientImpl extends PortRequisImpl implements PortRequisClient {
	
	Client observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_REQUIS_CLIENT;
	}

	@Override
	public void addObserver(Client observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyClient(String message) {
		this.observer.getServicerequisclient().receptionReponse(message);
		
	}

} //PortRequisClientImpl
