/**
 */
package cs.impl;

import cosa.impl.AttachmentImpl;

import cs.AttachDBsql;
import cs.CsPackage;
import cs.PortFourniDataBase;
import cs.PortRequisDataBase;
import cs.RoleFourniSQLquery;
import cs.RoleRequisSQLquery;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach DBsql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.AttachDBsqlImpl#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}</li>
 *   <li>{@link cs.impl.AttachDBsqlImpl#getPortrequisdatabase <em>Portrequisdatabase</em>}</li>
 *   <li>{@link cs.impl.AttachDBsqlImpl#getPortfournidatabase <em>Portfournidatabase</em>}</li>
 *   <li>{@link cs.impl.AttachDBsqlImpl#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachDBsqlImpl extends AttachmentImpl implements AttachDBsql {
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
	 * The cached value of the '{@link #getPortrequisdatabase() <em>Portrequisdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisdatabase()
	 * @generated
	 * @ordered
	 */
	protected PortRequisDataBase portrequisdatabase;

	/**
	 * The cached value of the '{@link #getPortfournidatabase() <em>Portfournidatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournidatabase()
	 * @generated
	 * @ordered
	 */
	protected PortFourniDataBase portfournidatabase;

	/**
	 * The cached value of the '{@link #getRolerequisdbsqlquery() <em>Rolerequisdbsqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisdbsqlquery()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisSQLquery rolerequisdbsqlquery;
	
	private HashMap<RoleFourniSQLquery, PortRequisDataBase> correspondanceRole;
	private HashMap<PortFourniDataBase, RoleRequisSQLquery> correspondancePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachDBsqlImpl() {
		super();
	}
	
	protected AttachDBsqlImpl(RoleFourniSQLquery rolefournisqlquerydb, PortRequisDataBase portrequisdatabase, PortFourniDataBase portfournidatabase, RoleRequisSQLquery rolerequisdbsqlquery) {
		super();
		this.rolefournisqlquerydb = rolefournisqlquerydb;
		this.portrequisdatabase = portrequisdatabase;
		this.portfournidatabase = portfournidatabase;
		this.rolerequisdbsqlquery = rolerequisdbsqlquery;
		
		correspondanceRole = new HashMap<RoleFourniSQLquery, PortRequisDataBase>();
		correspondancePort = new HashMap<PortFourniDataBase, RoleRequisSQLquery>();
		
		correspondanceRole.put(rolefournisqlquerydb, portrequisdatabase);
		correspondancePort.put(portfournidatabase, rolerequisdbsqlquery);
	}
	
	public PortRequisDataBase getCorrespondance(RoleFourniSQLquery role)
	{
		return correspondanceRole.get(role);
	}
	
	public RoleRequisSQLquery getCorrespondance(PortFourniDataBase port)
	{
		return correspondancePort.get(port);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ATTACH_DBSQL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB, oldRolefournisqlquerydb, rolefournisqlquerydb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB, oldRolefournisqlquerydb, rolefournisqlquerydb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisDataBase getPortrequisdatabase() {
		if (portrequisdatabase != null && portrequisdatabase.eIsProxy()) {
			InternalEObject oldPortrequisdatabase = (InternalEObject)portrequisdatabase;
			portrequisdatabase = (PortRequisDataBase)eResolveProxy(oldPortrequisdatabase);
			if (portrequisdatabase != oldPortrequisdatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE, oldPortrequisdatabase, portrequisdatabase));
			}
		}
		return portrequisdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisDataBase basicGetPortrequisdatabase() {
		return portrequisdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisdatabase(PortRequisDataBase newPortrequisdatabase) {
		PortRequisDataBase oldPortrequisdatabase = portrequisdatabase;
		portrequisdatabase = newPortrequisdatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE, oldPortrequisdatabase, portrequisdatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniDataBase getPortfournidatabase() {
		if (portfournidatabase != null && portfournidatabase.eIsProxy()) {
			InternalEObject oldPortfournidatabase = (InternalEObject)portfournidatabase;
			portfournidatabase = (PortFourniDataBase)eResolveProxy(oldPortfournidatabase);
			if (portfournidatabase != oldPortfournidatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE, oldPortfournidatabase, portfournidatabase));
			}
		}
		return portfournidatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniDataBase basicGetPortfournidatabase() {
		return portfournidatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournidatabase(PortFourniDataBase newPortfournidatabase) {
		PortFourniDataBase oldPortfournidatabase = portfournidatabase;
		portfournidatabase = newPortfournidatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE, oldPortfournidatabase, portfournidatabase));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY, oldRolerequisdbsqlquery, rolerequisdbsqlquery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY, oldRolerequisdbsqlquery, rolerequisdbsqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB:
				if (resolve) return getRolefournisqlquerydb();
				return basicGetRolefournisqlquerydb();
			case CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE:
				if (resolve) return getPortrequisdatabase();
				return basicGetPortrequisdatabase();
			case CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE:
				if (resolve) return getPortfournidatabase();
				return basicGetPortfournidatabase();
			case CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY:
				if (resolve) return getRolerequisdbsqlquery();
				return basicGetRolerequisdbsqlquery();
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
			case CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB:
				setRolefournisqlquerydb((RoleFourniSQLquery)newValue);
				return;
			case CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE:
				setPortrequisdatabase((PortRequisDataBase)newValue);
				return;
			case CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE:
				setPortfournidatabase((PortFourniDataBase)newValue);
				return;
			case CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY:
				setRolerequisdbsqlquery((RoleRequisSQLquery)newValue);
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
			case CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB:
				setRolefournisqlquerydb((RoleFourniSQLquery)null);
				return;
			case CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE:
				setPortrequisdatabase((PortRequisDataBase)null);
				return;
			case CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE:
				setPortfournidatabase((PortFourniDataBase)null);
				return;
			case CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY:
				setRolerequisdbsqlquery((RoleRequisSQLquery)null);
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
			case CsPackage.ATTACH_DBSQL__ROLEFOURNISQLQUERYDB:
				return rolefournisqlquerydb != null;
			case CsPackage.ATTACH_DBSQL__PORTREQUISDATABASE:
				return portrequisdatabase != null;
			case CsPackage.ATTACH_DBSQL__PORTFOURNIDATABASE:
				return portfournidatabase != null;
			case CsPackage.ATTACH_DBSQL__ROLEREQUISDBSQLQUERY:
				return rolerequisdbsqlquery != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachDBsqlImpl
