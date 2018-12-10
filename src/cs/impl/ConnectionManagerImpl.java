/**
 */
package cs.impl;

import cosa.impl.EComposantImpl;

import cs.ConnectionManager;
import cs.CsPackage;
import cs.PortFourniConnectionM;
import cs.PortRequisConnectionM;
import cs.Serveur;
import cs.ServiceFourniConnectionM;
import cs.ServiceRequisConnectionM;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getPortrequisserveurcm <em>Portrequisserveurcm</em>}</li>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}</li>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getPortfournicmserveur <em>Portfournicmserveur</em>}</li>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getPortfournicmdatabase <em>Portfournicmdatabase</em>}</li>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getServicerequisconnectionm <em>Servicerequisconnectionm</em>}</li>
 *   <li>{@link cs.impl.ConnectionManagerImpl#getServicefourniconnectionm <em>Servicefourniconnectionm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends EComposantImpl implements ConnectionManager {
	/**
	 * The cached value of the '{@link #getPortrequisserveurcm() <em>Portrequisserveurcm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisserveurcm()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConnectionM portrequisserveurcm;

	/**
	 * The cached value of the '{@link #getPortrequisdatabasecm() <em>Portrequisdatabasecm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisdatabasecm()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConnectionM portrequisdatabasecm;

	/**
	 * The cached value of the '{@link #getPortfournicmserveur() <em>Portfournicmserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicmserveur()
	 * @generated
	 * @ordered
	 */
	protected PortFourniConnectionM portfournicmserveur;

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
	 * The cached value of the '{@link #getServicerequisconnectionm() <em>Servicerequisconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerequisconnectionm()
	 * @generated
	 * @ordered
	 */
	protected ServiceRequisConnectionM servicerequisconnectionm;

	/**
	 * The cached value of the '{@link #getServicefourniconnectionm() <em>Servicefourniconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicefourniconnectionm()
	 * @generated
	 * @ordered
	 */
	protected ServiceFourniConnectionM servicefourniconnectionm;
	
	private HashMap<PortRequisConnectionM, PortFourniConnectionM> portCorrespondance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl(Serveur observer) {
		super();
		portrequisserveurcm = new PortRequisConnectionMImpl();
		portrequisdatabasecm = new PortRequisConnectionMImpl();
		portfournicmserveur = new PortFourniConnectionMImpl();
		portfournicmdatabase = new PortFourniConnectionMImpl();
		servicerequisconnectionm = new ServiceRequisConnectionMImpl();
		servicefourniconnectionm = new ServiceFourniConnectionMImpl();
		
		portrequisserveurcm.addObserver(this);
		portrequisdatabasecm.addObserver(this);
		portfournicmserveur.addObserver(observer);
		portfournicmdatabase.addObserver(observer);
		
		portCorrespondance.put(portrequisserveurcm, portfournicmdatabase);
		portCorrespondance.put(portrequisdatabasecm, portfournicmserveur);
	}
	
	public void receiveNotify(PortRequisConnectionM portRequis, String message)
	{
		PortFourniConnectionM portFourni = portCorrespondance.get(portRequis);
		servicefourniconnectionm.envoieMessage(portFourni, message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConnectionM getPortrequisserveurcm() {
		if (portrequisserveurcm != null && portrequisserveurcm.eIsProxy()) {
			InternalEObject oldPortrequisserveurcm = (InternalEObject)portrequisserveurcm;
			portrequisserveurcm = (PortRequisConnectionM)eResolveProxy(oldPortrequisserveurcm);
			if (portrequisserveurcm != oldPortrequisserveurcm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM, oldPortrequisserveurcm, portrequisserveurcm));
			}
		}
		return portrequisserveurcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConnectionM basicGetPortrequisserveurcm() {
		return portrequisserveurcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisserveurcm(PortRequisConnectionM newPortrequisserveurcm) {
		PortRequisConnectionM oldPortrequisserveurcm = portrequisserveurcm;
		portrequisserveurcm = newPortrequisserveurcm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM, oldPortrequisserveurcm, portrequisserveurcm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM, oldPortrequisdatabasecm, portrequisdatabasecm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM, oldPortrequisdatabasecm, portrequisdatabasecm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConnectionM getPortfournicmserveur() {
		if (portfournicmserveur != null && portfournicmserveur.eIsProxy()) {
			InternalEObject oldPortfournicmserveur = (InternalEObject)portfournicmserveur;
			portfournicmserveur = (PortFourniConnectionM)eResolveProxy(oldPortfournicmserveur);
			if (portfournicmserveur != oldPortfournicmserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR, oldPortfournicmserveur, portfournicmserveur));
			}
		}
		return portfournicmserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConnectionM basicGetPortfournicmserveur() {
		return portfournicmserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournicmserveur(PortFourniConnectionM newPortfournicmserveur) {
		PortFourniConnectionM oldPortfournicmserveur = portfournicmserveur;
		portfournicmserveur = newPortfournicmserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR, oldPortfournicmserveur, portfournicmserveur));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE, oldPortfournicmdatabase, portfournicmdatabase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE, oldPortfournicmdatabase, portfournicmdatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisConnectionM getServicerequisconnectionm() {
		if (servicerequisconnectionm != null && servicerequisconnectionm.eIsProxy()) {
			InternalEObject oldServicerequisconnectionm = (InternalEObject)servicerequisconnectionm;
			servicerequisconnectionm = (ServiceRequisConnectionM)eResolveProxy(oldServicerequisconnectionm);
			if (servicerequisconnectionm != oldServicerequisconnectionm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM, oldServicerequisconnectionm, servicerequisconnectionm));
			}
		}
		return servicerequisconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisConnectionM basicGetServicerequisconnectionm() {
		return servicerequisconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicerequisconnectionm(ServiceRequisConnectionM newServicerequisconnectionm) {
		ServiceRequisConnectionM oldServicerequisconnectionm = servicerequisconnectionm;
		servicerequisconnectionm = newServicerequisconnectionm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM, oldServicerequisconnectionm, servicerequisconnectionm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniConnectionM getServicefourniconnectionm() {
		if (servicefourniconnectionm != null && servicefourniconnectionm.eIsProxy()) {
			InternalEObject oldServicefourniconnectionm = (InternalEObject)servicefourniconnectionm;
			servicefourniconnectionm = (ServiceFourniConnectionM)eResolveProxy(oldServicefourniconnectionm);
			if (servicefourniconnectionm != oldServicefourniconnectionm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM, oldServicefourniconnectionm, servicefourniconnectionm));
			}
		}
		return servicefourniconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniConnectionM basicGetServicefourniconnectionm() {
		return servicefourniconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicefourniconnectionm(ServiceFourniConnectionM newServicefourniconnectionm) {
		ServiceFourniConnectionM oldServicefourniconnectionm = servicefourniconnectionm;
		servicefourniconnectionm = newServicefourniconnectionm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM, oldServicefourniconnectionm, servicefourniconnectionm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM:
				if (resolve) return getPortrequisserveurcm();
				return basicGetPortrequisserveurcm();
			case CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM:
				if (resolve) return getPortrequisdatabasecm();
				return basicGetPortrequisdatabasecm();
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR:
				if (resolve) return getPortfournicmserveur();
				return basicGetPortfournicmserveur();
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE:
				if (resolve) return getPortfournicmdatabase();
				return basicGetPortfournicmdatabase();
			case CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM:
				if (resolve) return getServicerequisconnectionm();
				return basicGetServicerequisconnectionm();
			case CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM:
				if (resolve) return getServicefourniconnectionm();
				return basicGetServicefourniconnectionm();
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
			case CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM:
				setPortrequisserveurcm((PortRequisConnectionM)newValue);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM:
				setPortrequisdatabasecm((PortRequisConnectionM)newValue);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR:
				setPortfournicmserveur((PortFourniConnectionM)newValue);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE:
				setPortfournicmdatabase((PortFourniConnectionM)newValue);
				return;
			case CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM:
				setServicerequisconnectionm((ServiceRequisConnectionM)newValue);
				return;
			case CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM:
				setServicefourniconnectionm((ServiceFourniConnectionM)newValue);
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
			case CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM:
				setPortrequisserveurcm((PortRequisConnectionM)null);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM:
				setPortrequisdatabasecm((PortRequisConnectionM)null);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR:
				setPortfournicmserveur((PortFourniConnectionM)null);
				return;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE:
				setPortfournicmdatabase((PortFourniConnectionM)null);
				return;
			case CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM:
				setServicerequisconnectionm((ServiceRequisConnectionM)null);
				return;
			case CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM:
				setServicefourniconnectionm((ServiceFourniConnectionM)null);
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
			case CsPackage.CONNECTION_MANAGER__PORTREQUISSERVEURCM:
				return portrequisserveurcm != null;
			case CsPackage.CONNECTION_MANAGER__PORTREQUISDATABASECM:
				return portrequisdatabasecm != null;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMSERVEUR:
				return portfournicmserveur != null;
			case CsPackage.CONNECTION_MANAGER__PORTFOURNICMDATABASE:
				return portfournicmdatabase != null;
			case CsPackage.CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM:
				return servicerequisconnectionm != null;
			case CsPackage.CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM:
				return servicefourniconnectionm != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
