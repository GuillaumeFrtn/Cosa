/**
 */
package cs.impl;

import cosa.impl.PortFourniImpl;
import cs.CS;
import cs.CsPackage;
import cs.PortFourniServeur;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortFourniServeurImpl extends PortFourniImpl implements PortFourniServeur {
	
	CS observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_FOURNI_SERVEUR;
	}

	@Override
	public void addObserver(CS observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConfig(String message) {
		this.observer.transfert(this, message);
		
	}

} //PortFourniServeurImpl
