/**
 */
package cs.impl;

import cosa.impl.EComposantImpl;
import cs.CS;
import cs.Client;
import cs.CsPackage;
import cs.PortFourniClient;
import cs.PortRequisClient;
import cs.ServiceFourniClient;
import cs.ServiceRequisClient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.ClientImpl#getPortrequisclient <em>Portrequisclient</em>}</li>
 *   <li>{@link cs.impl.ClientImpl#getPortfournisclient <em>Portfournisclient</em>}</li>
 *   <li>{@link cs.impl.ClientImpl#getServicerequisclient <em>Servicerequisclient</em>}</li>
 *   <li>{@link cs.impl.ClientImpl#getServicefourniclient <em>Servicefourniclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends EComposantImpl implements Client {
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
	 * The cached value of the '{@link #getPortfournisclient() <em>Portfournisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournisclient()
	 * @generated
	 * @ordered
	 */
	protected PortFourniClient portfournisclient;

	/**
	 * The cached value of the '{@link #getServicerequisclient() <em>Servicerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerequisclient()
	 * @generated
	 * @ordered
	 */
	protected ServiceRequisClient servicerequisclient;

	/**
	 * The cached value of the '{@link #getServicefourniclient() <em>Servicefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicefourniclient()
	 * @generated
	 * @ordered
	 */
	protected ServiceFourniClient servicefourniclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}
	
	protected ClientImpl(CS observer) {
		super();
		portrequisclient = new PortRequisClientImpl();
		portfournisclient = new PortFourniClientImpl();
		servicerequisclient = new ServiceRequisClientImpl();
		servicefourniclient = new ServiceFourniClientImpl();
		
		portrequisclient.addObserver(this);
		portfournisclient.addObserver(observer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.CLIENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CLIENT__PORTREQUISCLIENT, oldPortrequisclient, portrequisclient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CLIENT__PORTREQUISCLIENT, oldPortrequisclient, portrequisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniClient getPortfournisclient() {
		if (portfournisclient != null && portfournisclient.eIsProxy()) {
			InternalEObject oldPortfournisclient = (InternalEObject)portfournisclient;
			portfournisclient = (PortFourniClient)eResolveProxy(oldPortfournisclient);
			if (portfournisclient != oldPortfournisclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CLIENT__PORTFOURNISCLIENT, oldPortfournisclient, portfournisclient));
			}
		}
		return portfournisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniClient basicGetPortfournisclient() {
		return portfournisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournisclient(PortFourniClient newPortfournisclient) {
		PortFourniClient oldPortfournisclient = portfournisclient;
		portfournisclient = newPortfournisclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CLIENT__PORTFOURNISCLIENT, oldPortfournisclient, portfournisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisClient getServicerequisclient() {
		if (servicerequisclient != null && servicerequisclient.eIsProxy()) {
			InternalEObject oldServicerequisclient = (InternalEObject)servicerequisclient;
			servicerequisclient = (ServiceRequisClient)eResolveProxy(oldServicerequisclient);
			if (servicerequisclient != oldServicerequisclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CLIENT__SERVICEREQUISCLIENT, oldServicerequisclient, servicerequisclient));
			}
		}
		return servicerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisClient basicGetServicerequisclient() {
		return servicerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicerequisclient(ServiceRequisClient newServicerequisclient) {
		ServiceRequisClient oldServicerequisclient = servicerequisclient;
		servicerequisclient = newServicerequisclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CLIENT__SERVICEREQUISCLIENT, oldServicerequisclient, servicerequisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniClient getServicefourniclient() {
		if (servicefourniclient != null && servicefourniclient.eIsProxy()) {
			InternalEObject oldServicefourniclient = (InternalEObject)servicefourniclient;
			servicefourniclient = (ServiceFourniClient)eResolveProxy(oldServicefourniclient);
			if (servicefourniclient != oldServicefourniclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.CLIENT__SERVICEFOURNICLIENT, oldServicefourniclient, servicefourniclient));
			}
		}
		return servicefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniClient basicGetServicefourniclient() {
		return servicefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicefourniclient(ServiceFourniClient newServicefourniclient) {
		ServiceFourniClient oldServicefourniclient = servicefourniclient;
		servicefourniclient = newServicefourniclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.CLIENT__SERVICEFOURNICLIENT, oldServicefourniclient, servicefourniclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.CLIENT__PORTREQUISCLIENT:
				if (resolve) return getPortrequisclient();
				return basicGetPortrequisclient();
			case CsPackage.CLIENT__PORTFOURNISCLIENT:
				if (resolve) return getPortfournisclient();
				return basicGetPortfournisclient();
			case CsPackage.CLIENT__SERVICEREQUISCLIENT:
				if (resolve) return getServicerequisclient();
				return basicGetServicerequisclient();
			case CsPackage.CLIENT__SERVICEFOURNICLIENT:
				if (resolve) return getServicefourniclient();
				return basicGetServicefourniclient();
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
			case CsPackage.CLIENT__PORTREQUISCLIENT:
				setPortrequisclient((PortRequisClient)newValue);
				return;
			case CsPackage.CLIENT__PORTFOURNISCLIENT:
				setPortfournisclient((PortFourniClient)newValue);
				return;
			case CsPackage.CLIENT__SERVICEREQUISCLIENT:
				setServicerequisclient((ServiceRequisClient)newValue);
				return;
			case CsPackage.CLIENT__SERVICEFOURNICLIENT:
				setServicefourniclient((ServiceFourniClient)newValue);
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
			case CsPackage.CLIENT__PORTREQUISCLIENT:
				setPortrequisclient((PortRequisClient)null);
				return;
			case CsPackage.CLIENT__PORTFOURNISCLIENT:
				setPortfournisclient((PortFourniClient)null);
				return;
			case CsPackage.CLIENT__SERVICEREQUISCLIENT:
				setServicerequisclient((ServiceRequisClient)null);
				return;
			case CsPackage.CLIENT__SERVICEFOURNICLIENT:
				setServicefourniclient((ServiceFourniClient)null);
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
			case CsPackage.CLIENT__PORTREQUISCLIENT:
				return portrequisclient != null;
			case CsPackage.CLIENT__PORTFOURNISCLIENT:
				return portfournisclient != null;
			case CsPackage.CLIENT__SERVICEREQUISCLIENT:
				return servicerequisclient != null;
			case CsPackage.CLIENT__SERVICEFOURNICLIENT:
				return servicefourniclient != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
