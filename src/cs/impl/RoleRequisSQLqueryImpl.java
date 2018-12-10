/**
 */
package cs.impl;

import cosa.impl.RoleRequisImpl;

import cs.CsPackage;
import cs.RoleRequisSQLquery;
import cs.SQLquery;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoleRequisSQLqueryImpl extends RoleRequisImpl implements RoleRequisSQLquery {
	
	private SQLquery observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequisSQLqueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ROLE_REQUIS_SQ_LQUERY;
	}

	public void addObserver(SQLquery observer) {
		this.observer = observer;
		
	}

	public void notifySQLquery(String message) {
		observer.transfertMessageSQLquery(this, message);
		
	}

} //RoleRequisSQLqueryImpl
