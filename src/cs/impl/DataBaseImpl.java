/**
 */
package cs.impl;

import cosa.impl.EComposantImpl;

import cs.CsPackage;
import cs.DataBase;
import cs.PortFourniDataBase;
import cs.PortRequisDataBase;
import cs.ServiceFourniDataBase;
import cs.ServiceRequisDataBase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.DataBaseImpl#getPortrequisdatabase <em>Portrequisdatabase</em>}</li>
 *   <li>{@link cs.impl.DataBaseImpl#getPortfournidatabase <em>Portfournidatabase</em>}</li>
 *   <li>{@link cs.impl.DataBaseImpl#getServicerequisdatabase <em>Servicerequisdatabase</em>}</li>
 *   <li>{@link cs.impl.DataBaseImpl#getServicefournidatabase <em>Servicefournidatabase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataBaseImpl extends EComposantImpl implements DataBase {
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
	 * The cached value of the '{@link #getServicerequisdatabase() <em>Servicerequisdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerequisdatabase()
	 * @generated
	 * @ordered
	 */
	protected ServiceRequisDataBase servicerequisdatabase;

	/**
	 * The cached value of the '{@link #getServicefournidatabase() <em>Servicefournidatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicefournidatabase()
	 * @generated
	 * @ordered
	 */
	protected ServiceFourniDataBase servicefournidatabase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.DATA_BASE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.DATA_BASE__PORTREQUISDATABASE, oldPortrequisdatabase, portrequisdatabase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DATA_BASE__PORTREQUISDATABASE, oldPortrequisdatabase, portrequisdatabase));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.DATA_BASE__PORTFOURNIDATABASE, oldPortfournidatabase, portfournidatabase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DATA_BASE__PORTFOURNIDATABASE, oldPortfournidatabase, portfournidatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisDataBase getServicerequisdatabase() {
		if (servicerequisdatabase != null && servicerequisdatabase.eIsProxy()) {
			InternalEObject oldServicerequisdatabase = (InternalEObject)servicerequisdatabase;
			servicerequisdatabase = (ServiceRequisDataBase)eResolveProxy(oldServicerequisdatabase);
			if (servicerequisdatabase != oldServicerequisdatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.DATA_BASE__SERVICEREQUISDATABASE, oldServicerequisdatabase, servicerequisdatabase));
			}
		}
		return servicerequisdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisDataBase basicGetServicerequisdatabase() {
		return servicerequisdatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicerequisdatabase(ServiceRequisDataBase newServicerequisdatabase) {
		ServiceRequisDataBase oldServicerequisdatabase = servicerequisdatabase;
		servicerequisdatabase = newServicerequisdatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DATA_BASE__SERVICEREQUISDATABASE, oldServicerequisdatabase, servicerequisdatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniDataBase getServicefournidatabase() {
		if (servicefournidatabase != null && servicefournidatabase.eIsProxy()) {
			InternalEObject oldServicefournidatabase = (InternalEObject)servicefournidatabase;
			servicefournidatabase = (ServiceFourniDataBase)eResolveProxy(oldServicefournidatabase);
			if (servicefournidatabase != oldServicefournidatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.DATA_BASE__SERVICEFOURNIDATABASE, oldServicefournidatabase, servicefournidatabase));
			}
		}
		return servicefournidatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniDataBase basicGetServicefournidatabase() {
		return servicefournidatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicefournidatabase(ServiceFourniDataBase newServicefournidatabase) {
		ServiceFourniDataBase oldServicefournidatabase = servicefournidatabase;
		servicefournidatabase = newServicefournidatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.DATA_BASE__SERVICEFOURNIDATABASE, oldServicefournidatabase, servicefournidatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.DATA_BASE__PORTREQUISDATABASE:
				if (resolve) return getPortrequisdatabase();
				return basicGetPortrequisdatabase();
			case CsPackage.DATA_BASE__PORTFOURNIDATABASE:
				if (resolve) return getPortfournidatabase();
				return basicGetPortfournidatabase();
			case CsPackage.DATA_BASE__SERVICEREQUISDATABASE:
				if (resolve) return getServicerequisdatabase();
				return basicGetServicerequisdatabase();
			case CsPackage.DATA_BASE__SERVICEFOURNIDATABASE:
				if (resolve) return getServicefournidatabase();
				return basicGetServicefournidatabase();
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
			case CsPackage.DATA_BASE__PORTREQUISDATABASE:
				setPortrequisdatabase((PortRequisDataBase)newValue);
				return;
			case CsPackage.DATA_BASE__PORTFOURNIDATABASE:
				setPortfournidatabase((PortFourniDataBase)newValue);
				return;
			case CsPackage.DATA_BASE__SERVICEREQUISDATABASE:
				setServicerequisdatabase((ServiceRequisDataBase)newValue);
				return;
			case CsPackage.DATA_BASE__SERVICEFOURNIDATABASE:
				setServicefournidatabase((ServiceFourniDataBase)newValue);
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
			case CsPackage.DATA_BASE__PORTREQUISDATABASE:
				setPortrequisdatabase((PortRequisDataBase)null);
				return;
			case CsPackage.DATA_BASE__PORTFOURNIDATABASE:
				setPortfournidatabase((PortFourniDataBase)null);
				return;
			case CsPackage.DATA_BASE__SERVICEREQUISDATABASE:
				setServicerequisdatabase((ServiceRequisDataBase)null);
				return;
			case CsPackage.DATA_BASE__SERVICEFOURNIDATABASE:
				setServicefournidatabase((ServiceFourniDataBase)null);
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
			case CsPackage.DATA_BASE__PORTREQUISDATABASE:
				return portrequisdatabase != null;
			case CsPackage.DATA_BASE__PORTFOURNIDATABASE:
				return portfournidatabase != null;
			case CsPackage.DATA_BASE__SERVICEREQUISDATABASE:
				return servicerequisdatabase != null;
			case CsPackage.DATA_BASE__SERVICEFOURNIDATABASE:
				return servicefournidatabase != null;
		}
		return super.eIsSet(featureID);
	}

} //DataBaseImpl
