/**
 */
package cs.impl;

import cosa.impl.RoleFourniImpl;

import cs.CsPackage;
import cs.RoleFourniSQLquery;
import cs.Serveur;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fourni SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoleFourniSQLqueryImpl extends RoleFourniImpl implements RoleFourniSQLquery {
	
	Serveur observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleFourniSQLqueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ROLE_FOURNI_SQ_LQUERY;
	}

	@Override
	public void addObserver(Serveur observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyServeur(RoleFourniSQLquery newrole, String message) {
		this.observer.transfert(this, message);
		
	}

} //RoleFourniSQLqueryImpl
