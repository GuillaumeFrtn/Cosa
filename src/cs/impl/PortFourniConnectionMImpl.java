/**
 */
package cs.impl;

import cosa.impl.PortFourniImpl;

import cs.CsPackage;
import cs.PortFourniConnectionM;
import cs.Serveur;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortFourniConnectionMImpl extends PortFourniImpl implements PortFourniConnectionM {
	
	Serveur observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniConnectionMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_FOURNI_CONNECTION_M;
	}

	@Override
	public void addObserver(Serveur observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);
		
	}

} //PortFourniConnectionMImpl
