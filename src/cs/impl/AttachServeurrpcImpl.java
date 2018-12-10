/**
 */
package cs.impl;

import cs.AttachServeurrpc;
import cs.CsPackage;
import cs.PortFourniServeur;
import cs.PortRequisServeur;
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
 * An implementation of the model object '<em><b>Attach Serveurrpc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.AttachServeurrpcImpl#getPortrequisserveur <em>Portrequisserveur</em>}</li>
 *   <li>{@link cs.impl.AttachServeurrpcImpl#getRolefourniserveur <em>Rolefourniserveur</em>}</li>
 *   <li>{@link cs.impl.AttachServeurrpcImpl#getRolerequisserveur <em>Rolerequisserveur</em>}</li>
 *   <li>{@link cs.impl.AttachServeurrpcImpl#getPortfourniserveur <em>Portfourniserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachServeurrpcImpl extends MinimalEObjectImpl.Container implements AttachServeurrpc {
	/**
	 * The cached value of the '{@link #getPortrequisserveur() <em>Portrequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisserveur()
	 * @generated
	 * @ordered
	 */
	protected PortRequisServeur portrequisserveur;

	/**
	 * The cached value of the '{@link #getRolefourniserveur() <em>Rolefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefourniserveur()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniRPC rolefourniserveur;

	/**
	 * The cached value of the '{@link #getRolerequisserveur() <em>Rolerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisserveur()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisRPC rolerequisserveur;

	/**
	 * The cached value of the '{@link #getPortfourniserveur() <em>Portfourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniserveur()
	 * @generated
	 * @ordered
	 */
	protected PortFourniServeur portfourniserveur;
	
	private HashMap<RoleFourniRPC, PortRequisServeur> correspondanceRole;
	private HashMap<PortFourniServeur, RoleRequisRPC> correspondancePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachServeurrpcImpl() {
		super();
	}
	
	protected AttachServeurrpcImpl(PortRequisServeur portrequisserveur, RoleFourniRPC rolefourniserveur, RoleRequisRPC rolerequisserveur, PortFourniServeur portfourniserveur) {
		super();
		this.portrequisserveur = portrequisserveur;
		this.rolefourniserveur = rolefourniserveur;
		this.rolerequisserveur = rolerequisserveur;
		this.portfourniserveur = portfourniserveur;
		
		correspondanceRole = new HashMap<RoleFourniRPC, PortRequisServeur>();
		correspondancePort = new HashMap<PortFourniServeur, RoleRequisRPC>();
		
		correspondanceRole.put(rolefourniserveur, portrequisserveur);
		correspondancePort.put(portfourniserveur, rolerequisserveur);
	}
	
	public PortRequisServeur getCorrespondance(RoleFourniRPC role)
	{
		return correspondanceRole.get(role);
	}
	
	public RoleRequisRPC getCorrespondance(PortFourniServeur port)
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
		return CsPackage.Literals.ATTACH_SERVEURRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisServeur getPortrequisserveur() {
		if (portrequisserveur != null && portrequisserveur.eIsProxy()) {
			InternalEObject oldPortrequisserveur = (InternalEObject)portrequisserveur;
			portrequisserveur = (PortRequisServeur)eResolveProxy(oldPortrequisserveur);
			if (portrequisserveur != oldPortrequisserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
			}
		}
		return portrequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisServeur basicGetPortrequisserveur() {
		return portrequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisserveur(PortRequisServeur newPortrequisserveur) {
		PortRequisServeur oldPortrequisserveur = portrequisserveur;
		portrequisserveur = newPortrequisserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC getRolefourniserveur() {
		if (rolefourniserveur != null && rolefourniserveur.eIsProxy()) {
			InternalEObject oldRolefourniserveur = (InternalEObject)rolefourniserveur;
			rolefourniserveur = (RoleFourniRPC)eResolveProxy(oldRolefourniserveur);
			if (rolefourniserveur != oldRolefourniserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR, oldRolefourniserveur, rolefourniserveur));
			}
		}
		return rolefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC basicGetRolefourniserveur() {
		return rolefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefourniserveur(RoleFourniRPC newRolefourniserveur) {
		RoleFourniRPC oldRolefourniserveur = rolefourniserveur;
		rolefourniserveur = newRolefourniserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR, oldRolefourniserveur, rolefourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC getRolerequisserveur() {
		if (rolerequisserveur != null && rolerequisserveur.eIsProxy()) {
			InternalEObject oldRolerequisserveur = (InternalEObject)rolerequisserveur;
			rolerequisserveur = (RoleRequisRPC)eResolveProxy(oldRolerequisserveur);
			if (rolerequisserveur != oldRolerequisserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR, oldRolerequisserveur, rolerequisserveur));
			}
		}
		return rolerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC basicGetRolerequisserveur() {
		return rolerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequisserveur(RoleRequisRPC newRolerequisserveur) {
		RoleRequisRPC oldRolerequisserveur = rolerequisserveur;
		rolerequisserveur = newRolerequisserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR, oldRolerequisserveur, rolerequisserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniServeur getPortfourniserveur() {
		if (portfourniserveur != null && portfourniserveur.eIsProxy()) {
			InternalEObject oldPortfourniserveur = (InternalEObject)portfourniserveur;
			portfourniserveur = (PortFourniServeur)eResolveProxy(oldPortfourniserveur);
			if (portfourniserveur != oldPortfourniserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
			}
		}
		return portfourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniServeur basicGetPortfourniserveur() {
		return portfourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniserveur(PortFourniServeur newPortfourniserveur) {
		PortFourniServeur oldPortfourniserveur = portfourniserveur;
		portfourniserveur = newPortfourniserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR:
				if (resolve) return getPortrequisserveur();
				return basicGetPortrequisserveur();
			case CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR:
				if (resolve) return getRolefourniserveur();
				return basicGetRolefourniserveur();
			case CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR:
				if (resolve) return getRolerequisserveur();
				return basicGetRolerequisserveur();
			case CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR:
				if (resolve) return getPortfourniserveur();
				return basicGetPortfourniserveur();
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
			case CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)newValue);
				return;
			case CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR:
				setRolefourniserveur((RoleFourniRPC)newValue);
				return;
			case CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR:
				setRolerequisserveur((RoleRequisRPC)newValue);
				return;
			case CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR:
				setPortfourniserveur((PortFourniServeur)newValue);
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
			case CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)null);
				return;
			case CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR:
				setRolefourniserveur((RoleFourniRPC)null);
				return;
			case CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR:
				setRolerequisserveur((RoleRequisRPC)null);
				return;
			case CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR:
				setPortfourniserveur((PortFourniServeur)null);
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
			case CsPackage.ATTACH_SERVEURRPC__PORTREQUISSERVEUR:
				return portrequisserveur != null;
			case CsPackage.ATTACH_SERVEURRPC__ROLEFOURNISERVEUR:
				return rolefourniserveur != null;
			case CsPackage.ATTACH_SERVEURRPC__ROLEREQUISSERVEUR:
				return rolerequisserveur != null;
			case CsPackage.ATTACH_SERVEURRPC__PORTFOURNISERVEUR:
				return portfourniserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachServeurrpcImpl
