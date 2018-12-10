/**
 */
package cs.impl;

import cosa.impl.EConnecteurImpl;

import cs.CsPackage;
import cs.GlueSQLquery;
import cs.RoleFourniSQLquery;
import cs.RoleRequisSQLquery;
import cs.SQLquery;
import cs.Serveur;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.SQLqueryImpl#getGluesqlquery <em>Gluesqlquery</em>}</li>
 *   <li>{@link cs.impl.SQLqueryImpl#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}</li>
 *   <li>{@link cs.impl.SQLqueryImpl#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}</li>
 *   <li>{@link cs.impl.SQLqueryImpl#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}</li>
 *   <li>{@link cs.impl.SQLqueryImpl#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLqueryImpl extends EConnecteurImpl implements SQLquery {
	/**
	 * The cached value of the '{@link #getGluesqlquery() <em>Gluesqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluesqlquery()
	 * @generated
	 * @ordered
	 */
	protected GlueSQLquery gluesqlquery;

	/**
	 * The cached value of the '{@link #getRolerequiscmsqlquery() <em>Rolerequiscmsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequiscmsqlquery()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisSQLquery rolerequiscmsqlquery;

	/**
	 * The cached value of the '{@link #getRolerequisdbsqlquery() <em>Rolerequisdbsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisdbsqlquery()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisSQLquery rolerequisdbsqlquery;

	/**
	 * The cached value of the '{@link #getRolefournisqlquerycm() <em>Rolefournisqlquerycm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournisqlquerycm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniSQLquery rolefournisqlquerycm;

	/**
	 * The cached value of the '{@link #getRolefournisqlquerydb() <em>Rolefournisqlquerydb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournisqlquerydb()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniSQLquery rolefournisqlquerydb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLqueryImpl() {
		super();
	}
	
	protected SQLqueryImpl(Serveur observer) {
		super();
		gluesqlquery = new GlueSQLqueryImpl();
		
		rolerequiscmsqlquery = new RoleRequisSQLqueryImpl();
		rolerequisdbsqlquery = new RoleRequisSQLqueryImpl();
		rolefournisqlquerycm = new RoleFourniSQLqueryImpl();
		rolefournisqlquerydb = new RoleFourniSQLqueryImpl();
		
		rolerequiscmsqlquery.addObserver(this);
		rolerequisdbsqlquery.addObserver(this);
		rolefournisqlquerycm.addObserver(observer);
		rolefournisqlquerydb.addObserver(observer);
		
		gluesqlquery.addCorrespondance(rolerequiscmsqlquery, rolefournisqlquerydb);
		gluesqlquery.addCorrespondance(rolerequisdbsqlquery, rolefournisqlquerycm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SQ_LQUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueSQLquery getGluesqlquery() {
		if (gluesqlquery != null && gluesqlquery.eIsProxy()) {
			InternalEObject oldGluesqlquery = (InternalEObject)gluesqlquery;
			gluesqlquery = (GlueSQLquery)eResolveProxy(oldGluesqlquery);
			if (gluesqlquery != oldGluesqlquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SQ_LQUERY__GLUESQLQUERY, oldGluesqlquery, gluesqlquery));
			}
		}
		return gluesqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueSQLquery basicGetGluesqlquery() {
		return gluesqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluesqlquery(GlueSQLquery newGluesqlquery) {
		GlueSQLquery oldGluesqlquery = gluesqlquery;
		gluesqlquery = newGluesqlquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SQ_LQUERY__GLUESQLQUERY, oldGluesqlquery, gluesqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisSQLquery getRolerequiscmsqlquery() {
		if (rolerequiscmsqlquery != null && rolerequiscmsqlquery.eIsProxy()) {
			InternalEObject oldRolerequiscmsqlquery = (InternalEObject)rolerequiscmsqlquery;
			rolerequiscmsqlquery = (RoleRequisSQLquery)eResolveProxy(oldRolerequiscmsqlquery);
			if (rolerequiscmsqlquery != oldRolerequiscmsqlquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY, oldRolerequiscmsqlquery, rolerequiscmsqlquery));
			}
		}
		return rolerequiscmsqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisSQLquery basicGetRolerequiscmsqlquery() {
		return rolerequiscmsqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequiscmsqlquery(RoleRequisSQLquery newRolerequiscmsqlquery) {
		RoleRequisSQLquery oldRolerequiscmsqlquery = rolerequiscmsqlquery;
		rolerequiscmsqlquery = newRolerequiscmsqlquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY, oldRolerequiscmsqlquery, rolerequiscmsqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisSQLquery getRolerequisdbsqlquery() {
		if (rolerequisdbsqlquery != null && rolerequisdbsqlquery.eIsProxy()) {
			InternalEObject oldRolerequisdbsqlquery = (InternalEObject)rolerequisdbsqlquery;
			rolerequisdbsqlquery = (RoleRequisSQLquery)eResolveProxy(oldRolerequisdbsqlquery);
			if (rolerequisdbsqlquery != oldRolerequisdbsqlquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY, oldRolerequisdbsqlquery, rolerequisdbsqlquery));
			}
		}
		return rolerequisdbsqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisSQLquery basicGetRolerequisdbsqlquery() {
		return rolerequisdbsqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequisdbsqlquery(RoleRequisSQLquery newRolerequisdbsqlquery) {
		RoleRequisSQLquery oldRolerequisdbsqlquery = rolerequisdbsqlquery;
		rolerequisdbsqlquery = newRolerequisdbsqlquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY, oldRolerequisdbsqlquery, rolerequisdbsqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery getRolefournisqlquerycm() {
		if (rolefournisqlquerycm != null && rolefournisqlquerycm.eIsProxy()) {
			InternalEObject oldRolefournisqlquerycm = (InternalEObject)rolefournisqlquerycm;
			rolefournisqlquerycm = (RoleFourniSQLquery)eResolveProxy(oldRolefournisqlquerycm);
			if (rolefournisqlquerycm != oldRolefournisqlquerycm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM, oldRolefournisqlquerycm, rolefournisqlquerycm));
			}
		}
		return rolefournisqlquerycm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery basicGetRolefournisqlquerycm() {
		return rolefournisqlquerycm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournisqlquerycm(RoleFourniSQLquery newRolefournisqlquerycm) {
		RoleFourniSQLquery oldRolefournisqlquerycm = rolefournisqlquerycm;
		rolefournisqlquerycm = newRolefournisqlquerycm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM, oldRolefournisqlquerycm, rolefournisqlquerycm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery getRolefournisqlquerydb() {
		if (rolefournisqlquerydb != null && rolefournisqlquerydb.eIsProxy()) {
			InternalEObject oldRolefournisqlquerydb = (InternalEObject)rolefournisqlquerydb;
			rolefournisqlquerydb = (RoleFourniSQLquery)eResolveProxy(oldRolefournisqlquerydb);
			if (rolefournisqlquerydb != oldRolefournisqlquerydb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB, oldRolefournisqlquerydb, rolefournisqlquerydb));
			}
		}
		return rolefournisqlquerydb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery basicGetRolefournisqlquerydb() {
		return rolefournisqlquerydb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournisqlquerydb(RoleFourniSQLquery newRolefournisqlquerydb) {
		RoleFourniSQLquery oldRolefournisqlquerydb = rolefournisqlquerydb;
		rolefournisqlquerydb = newRolefournisqlquerydb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB, oldRolefournisqlquerydb, rolefournisqlquerydb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transfertMessageSQLquery() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void transfertMessageSQLquery(RoleRequisSQLquery role, String message) {
		RoleFourniSQLquery newrole = (RoleFourniSQLquery) gluesqlquery.matchRolesSQLquery(role);
		newrole.notifyServeur(newrole, message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.SQ_LQUERY__GLUESQLQUERY:
				if (resolve) return getGluesqlquery();
				return basicGetGluesqlquery();
			case CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY:
				if (resolve) return getRolerequiscmsqlquery();
				return basicGetRolerequiscmsqlquery();
			case CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY:
				if (resolve) return getRolerequisdbsqlquery();
				return basicGetRolerequisdbsqlquery();
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM:
				if (resolve) return getRolefournisqlquerycm();
				return basicGetRolefournisqlquerycm();
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB:
				if (resolve) return getRolefournisqlquerydb();
				return basicGetRolefournisqlquerydb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.SQ_LQUERY__GLUESQLQUERY:
				setGluesqlquery((GlueSQLquery)newValue);
				return;
			case CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY:
				setRolerequiscmsqlquery((RoleRequisSQLquery)newValue);
				return;
			case CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY:
				setRolerequisdbsqlquery((RoleRequisSQLquery)newValue);
				return;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM:
				setRolefournisqlquerycm((RoleFourniSQLquery)newValue);
				return;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB:
				setRolefournisqlquerydb((RoleFourniSQLquery)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.SQ_LQUERY__GLUESQLQUERY:
				setGluesqlquery((GlueSQLquery)null);
				return;
			case CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY:
				setRolerequiscmsqlquery((RoleRequisSQLquery)null);
				return;
			case CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY:
				setRolerequisdbsqlquery((RoleRequisSQLquery)null);
				return;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM:
				setRolefournisqlquerycm((RoleFourniSQLquery)null);
				return;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB:
				setRolefournisqlquerydb((RoleFourniSQLquery)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.SQ_LQUERY__GLUESQLQUERY:
				return gluesqlquery != null;
			case CsPackage.SQ_LQUERY__ROLEREQUISCMSQLQUERY:
				return rolerequiscmsqlquery != null;
			case CsPackage.SQ_LQUERY__ROLEREQUISDBSQLQUERY:
				return rolerequisdbsqlquery != null;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYCM:
				return rolefournisqlquerycm != null;
			case CsPackage.SQ_LQUERY__ROLEFOURNISQLQUERYDB:
				return rolefournisqlquerydb != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SQ_LQUERY___TRANSFERT_MESSAGE_SQ_LQUERY:
				transfertMessageSQLquery();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SQLqueryImpl
