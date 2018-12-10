/**
 */
package cs.impl;

import cs.AttachClientrpc;
import cs.CsPackage;
import cs.PortFourniClient;
import cs.PortRequisClient;
import cs.RoleFourniRPC;
import cs.RoleRequisRPC;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach Clientrpc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.AttachClientrpcImpl#getPortrequisclient <em>Portrequisclient</em>}</li>
 *   <li>{@link cs.impl.AttachClientrpcImpl#getRolefourniclient <em>Rolefourniclient</em>}</li>
 *   <li>{@link cs.impl.AttachClientrpcImpl#getRolerequisclient <em>Rolerequisclient</em>}</li>
 *   <li>{@link cs.impl.AttachClientrpcImpl#getPortfourniclient <em>Portfourniclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachClientrpcImpl extends MinimalEObjectImpl.Container implements AttachClientrpc {
	/**
	 * The cached value of the '{@link #getPortrequisclient() <em>Portrequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisclient()
	 * @generated
	 * @ordered
	 */
	protected PortRequisClient portrequisclient;

	/**
	 * The cached value of the '{@link #getRolefourniclient() <em>Rolefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefourniclient()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniRPC rolefourniclient;

	/**
	 * The cached value of the '{@link #getRolerequisclient() <em>Rolerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisclient()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisRPC rolerequisclient;

	/**
	 * The cached value of the '{@link #getPortfourniclient() <em>Portfourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniclient()
	 * @generated
	 * @ordered
	 */
	protected PortFourniClient portfourniclient;
	
	private HashMap<RoleFourniRPC, PortRequisClient> correspondanceRole;
	private HashMap<PortFourniClient, RoleRequisRPC> correspondancePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	protected AttachClientrpcImpl() {
		super();
	}
	
	protected AttachClientrpcImpl(RoleFourniRPC roleFourni, PortRequisClient portRequis, PortFourniClient portFourni, RoleRequisRPC roleRequis) {
		super();
		this.rolefourniclient = roleFourni;
		this.portrequisclient = portRequis;
		this.portfourniclient = portFourni;
		this.rolerequisclient = roleRequis;
		
		correspondanceRole = new HashMap<RoleFourniRPC, PortRequisClient>();
		correspondancePort = new HashMap<PortFourniClient, RoleRequisRPC>();
		
		correspondanceRole.put(rolefourniclient, portrequisclient);
		correspondancePort.put(portfourniclient, rolerequisclient);
	}
	
	public PortRequisClient getCorrespondance(RoleFourniRPC role)
	{
		return correspondanceRole.get(role);
	}
	
	public RoleRequisRPC getCorrespondance(PortFourniClient port)
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
		return CsPackage.Literals.ATTACH_CLIENTRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisClient getPortrequisclient() {
		if (portrequisclient != null && portrequisclient.eIsProxy()) {
			InternalEObject oldPortrequisclient = (InternalEObject)portrequisclient;
			portrequisclient = (PortRequisClient)eResolveProxy(oldPortrequisclient);
			if (portrequisclient != oldPortrequisclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT, oldPortrequisclient, portrequisclient));
			}
		}
		return portrequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisClient basicGetPortrequisclient() {
		return portrequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisclient(PortRequisClient newPortrequisclient) {
		PortRequisClient oldPortrequisclient = portrequisclient;
		portrequisclient = newPortrequisclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT, oldPortrequisclient, portrequisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC getRolefourniclient() {
		if (rolefourniclient != null && rolefourniclient.eIsProxy()) {
			InternalEObject oldRolefourniclient = (InternalEObject)rolefourniclient;
			rolefourniclient = (RoleFourniRPC)eResolveProxy(oldRolefourniclient);
			if (rolefourniclient != oldRolefourniclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT, oldRolefourniclient, rolefourniclient));
			}
		}
		return rolefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC basicGetRolefourniclient() {
		return rolefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefourniclient(RoleFourniRPC newRolefourniclient) {
		RoleFourniRPC oldRolefourniclient = rolefourniclient;
		rolefourniclient = newRolefourniclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT, oldRolefourniclient, rolefourniclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC getRolerequisclient() {
		if (rolerequisclient != null && rolerequisclient.eIsProxy()) {
			InternalEObject oldRolerequisclient = (InternalEObject)rolerequisclient;
			rolerequisclient = (RoleRequisRPC)eResolveProxy(oldRolerequisclient);
			if (rolerequisclient != oldRolerequisclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT, oldRolerequisclient, rolerequisclient));
			}
		}
		return rolerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC basicGetRolerequisclient() {
		return rolerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequisclient(RoleRequisRPC newRolerequisclient) {
		RoleRequisRPC oldRolerequisclient = rolerequisclient;
		rolerequisclient = newRolerequisclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT, oldRolerequisclient, rolerequisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniClient getPortfourniclient() {
		if (portfourniclient != null && portfourniclient.eIsProxy()) {
			InternalEObject oldPortfourniclient = (InternalEObject)portfourniclient;
			portfourniclient = (PortFourniClient)eResolveProxy(oldPortfourniclient);
			if (portfourniclient != oldPortfourniclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT, oldPortfourniclient, portfourniclient));
			}
		}
		return portfourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniClient basicGetPortfourniclient() {
		return portfourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniclient(PortFourniClient newPortfourniclient) {
		PortFourniClient oldPortfourniclient = portfourniclient;
		portfourniclient = newPortfourniclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT, oldPortfourniclient, portfourniclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT:
				if (resolve) return getPortrequisclient();
				return basicGetPortrequisclient();
			case CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT:
				if (resolve) return getRolefourniclient();
				return basicGetRolefourniclient();
			case CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT:
				if (resolve) return getRolerequisclient();
				return basicGetRolerequisclient();
			case CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT:
				if (resolve) return getPortfourniclient();
				return basicGetPortfourniclient();
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
			case CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT:
				setPortrequisclient((PortRequisClient)newValue);
				return;
			case CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT:
				setRolefourniclient((RoleFourniRPC)newValue);
				return;
			case CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT:
				setRolerequisclient((RoleRequisRPC)newValue);
				return;
			case CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT:
				setPortfourniclient((PortFourniClient)newValue);
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
			case CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT:
				setPortrequisclient((PortRequisClient)null);
				return;
			case CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT:
				setRolefourniclient((RoleFourniRPC)null);
				return;
			case CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT:
				setRolerequisclient((RoleRequisRPC)null);
				return;
			case CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT:
				setPortfourniclient((PortFourniClient)null);
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
			case CsPackage.ATTACH_CLIENTRPC__PORTREQUISCLIENT:
				return portrequisclient != null;
			case CsPackage.ATTACH_CLIENTRPC__ROLEFOURNICLIENT:
				return rolefourniclient != null;
			case CsPackage.ATTACH_CLIENTRPC__ROLEREQUISCLIENT:
				return rolerequisclient != null;
			case CsPackage.ATTACH_CLIENTRPC__PORTFOURNICLIENT:
				return portfourniclient != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachClientrpcImpl
