/**
 */
package cs.impl;

import cosa.impl.AttachmentImpl;

import cs.AttachCONNECTIONsql;
import cs.CsPackage;
import cs.PortFourniConnectionM;
import cs.PortRequisConnectionM;
import cs.RoleFourniSQLquery;
import cs.RoleRequisSQLquery;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach CONNECTIO Nsql</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.AttachCONNECTIONsqlImpl#getPortfournicmdatabase <em>Portfournicmdatabase</em>}</li>
 *   <li>{@link cs.impl.AttachCONNECTIONsqlImpl#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}</li>
 *   <li>{@link cs.impl.AttachCONNECTIONsqlImpl#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}</li>
 *   <li>{@link cs.impl.AttachCONNECTIONsqlImpl#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachCONNECTIONsqlImpl extends AttachmentImpl implements AttachCONNECTIONsql {
	/**
	 * The cached value of the '{@link #getPortfournicmdatabase() <em>Portfournicmdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicmdatabase()
	 * @generated
	 * @ordered
	 */
	protected PortFourniConnectionM portfournicmdatabase;

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
	 * The cached value of the '{@link #getRolefournisqlquerycm() <em>Rolefournisqlquerycm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournisqlquerycm()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniSQLquery rolefournisqlquerycm;

	/**
	 * The cached value of the '{@link #getPortrequisdatabasecm() <em>Portrequisdatabasecm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisdatabasecm()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConnectionM portrequisdatabasecm;
	
	private HashMap<RoleFourniSQLquery, PortRequisConnectionM> correspondanceRole;
	private HashMap<PortFourniConnectionM, RoleRequisSQLquery> correspondancePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachCONNECTIONsqlImpl() {
		super();
	}
	
	protected AttachCONNECTIONsqlImpl(PortFourniConnectionM portfournicmdatabase, RoleRequisSQLquery rolerequiscmsqlquery, RoleFourniSQLquery rolefournisqlquerycm, PortRequisConnectionM portrequisdatabasecm) {
		super();
		this.portfournicmdatabase = portfournicmdatabase;
		this.rolerequiscmsqlquery = rolerequiscmsqlquery;
		this.rolefournisqlquerycm = rolefournisqlquerycm;
		this.portrequisdatabasecm = portrequisdatabasecm;
		
		correspondanceRole = new HashMap<RoleFourniSQLquery, PortRequisConnectionM>();
		correspondancePort = new HashMap<PortFourniConnectionM, RoleRequisSQLquery>();
		
		correspondanceRole.put(rolefournisqlquerycm, portrequisdatabasecm);
		correspondancePort.put(portfournicmdatabase, rolerequiscmsqlquery);
	}
	
	public PortRequisConnectionM getCorrespondance(RoleFourniSQLquery role)
	{
		return correspondanceRole.get(role);
	}
	
	public RoleRequisSQLquery getCorrespondance(PortFourniConnectionM port)
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
		return CsPackage.Literals.ATTACH_CONNECTIO_NSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConnectionM getPortfournicmdatabase() {
		if (portfournicmdatabase != null && portfournicmdatabase.eIsProxy()) {
			InternalEObject oldPortfournicmdatabase = (InternalEObject)portfournicmdatabase;
			portfournicmdatabase = (PortFourniConnectionM)eResolveProxy(oldPortfournicmdatabase);
			if (portfournicmdatabase != oldPortfournicmdatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE, oldPortfournicmdatabase, portfournicmdatabase));
			}
		}
		return portfournicmdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConnectionM basicGetPortfournicmdatabase() {
		return portfournicmdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournicmdatabase(PortFourniConnectionM newPortfournicmdatabase) {
		PortFourniConnectionM oldPortfournicmdatabase = portfournicmdatabase;
		portfournicmdatabase = newPortfournicmdatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE, oldPortfournicmdatabase, portfournicmdatabase));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY, oldRolerequiscmsqlquery, rolerequiscmsqlquery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY, oldRolerequiscmsqlquery, rolerequiscmsqlquery));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM, oldRolefournisqlquerycm, rolefournisqlquerycm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM, oldRolefournisqlquerycm, rolefournisqlquerycm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConnectionM getPortrequisdatabasecm() {
		if (portrequisdatabasecm != null && portrequisdatabasecm.eIsProxy()) {
			InternalEObject oldPortrequisdatabasecm = (InternalEObject)portrequisdatabasecm;
			portrequisdatabasecm = (PortRequisConnectionM)eResolveProxy(oldPortrequisdatabasecm);
			if (portrequisdatabasecm != oldPortrequisdatabasecm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM, oldPortrequisdatabasecm, portrequisdatabasecm));
			}
		}
		return portrequisdatabasecm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConnectionM basicGetPortrequisdatabasecm() {
		return portrequisdatabasecm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisdatabasecm(PortRequisConnectionM newPortrequisdatabasecm) {
		PortRequisConnectionM oldPortrequisdatabasecm = portrequisdatabasecm;
		portrequisdatabasecm = newPortrequisdatabasecm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM, oldPortrequisdatabasecm, portrequisdatabasecm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE:
				if (resolve) return getPortfournicmdatabase();
				return basicGetPortfournicmdatabase();
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY:
				if (resolve) return getRolerequiscmsqlquery();
				return basicGetRolerequiscmsqlquery();
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM:
				if (resolve) return getRolefournisqlquerycm();
				return basicGetRolefournisqlquerycm();
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM:
				if (resolve) return getPortrequisdatabasecm();
				return basicGetPortrequisdatabasecm();
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
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE:
				setPortfournicmdatabase((PortFourniConnectionM)newValue);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY:
				setRolerequiscmsqlquery((RoleRequisSQLquery)newValue);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM:
				setRolefournisqlquerycm((RoleFourniSQLquery)newValue);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM:
				setPortrequisdatabasecm((PortRequisConnectionM)newValue);
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
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE:
				setPortfournicmdatabase((PortFourniConnectionM)null);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY:
				setRolerequiscmsqlquery((RoleRequisSQLquery)null);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM:
				setRolefournisqlquerycm((RoleFourniSQLquery)null);
				return;
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM:
				setPortrequisdatabasecm((PortRequisConnectionM)null);
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
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE:
				return portfournicmdatabase != null;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY:
				return rolerequiscmsqlquery != null;
			case CsPackage.ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM:
				return rolefournisqlquerycm != null;
			case CsPackage.ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM:
				return portrequisdatabasecm != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachCONNECTIONsqlImpl
