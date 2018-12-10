/**
 */
package cs.impl;

import cosa.impl.PortFourniImpl;

import cs.CsPackage;
import cs.PortFourniDataBase;
import cs.Serveur;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fourni Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortFourniDataBaseImpl extends PortFourniImpl implements PortFourniDataBase {
	
	Serveur observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniDataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_FOURNI_DATA_BASE;
	}

	@Override
	public void addObserver(Serveur observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);
		
	}

} //PortFourniDataBaseImpl
