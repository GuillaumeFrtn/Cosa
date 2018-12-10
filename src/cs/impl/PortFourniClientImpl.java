/**
 */
package cs.impl;

import cosa.impl.PortFourniImpl;
import cs.CS;
import cs.CsPackage;
import cs.PortFourniClient;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortFourniClientImpl extends PortFourniImpl implements PortFourniClient {
	
	CS observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_FOURNI_CLIENT;
	}

	@Override
	public void addObserver(CS observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConfig(String message) {
		this.observer.transfert(this, message);
		
	}

} //PortFourniClientImpl
