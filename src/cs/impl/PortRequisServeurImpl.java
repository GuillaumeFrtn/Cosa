/**
 */
package cs.impl;

import cosa.impl.PortRequisImpl;

import cs.CsPackage;
import cs.PortRequisServeur;
import cs.Serveur;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortRequisServeurImpl extends PortRequisImpl implements PortRequisServeur {
	
	Serveur observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_REQUIS_SERVEUR;
	}

	@Override
	public void addObserver(Serveur observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);
		
	}

} //PortRequisServeurImpl
