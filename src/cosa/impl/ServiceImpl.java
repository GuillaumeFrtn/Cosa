/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ServiceImpl#getNomService <em>Nom Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceImpl extends InterfaceComposantImpl implements Service {
	/**
	 * The default value of the '{@link #getNomService() <em>Nom Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomService()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomService() <em>Nom Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomService()
	 * @generated
	 * @ordered
	 */
	protected String nomService = NOM_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomService() {
		return nomService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomService(String newNomService) {
		String oldNomService = nomService;
		nomService = newNomService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.SERVICE__NOM_SERVICE, oldNomService, nomService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.SERVICE__NOM_SERVICE:
				return getNomService();
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
			case CosaPackage.SERVICE__NOM_SERVICE:
				setNomService((String)newValue);
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
			case CosaPackage.SERVICE__NOM_SERVICE:
				setNomService(NOM_SERVICE_EDEFAULT);
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
			case CosaPackage.SERVICE__NOM_SERVICE:
				return NOM_SERVICE_EDEFAULT == null ? nomService != null : !NOM_SERVICE_EDEFAULT.equals(nomService);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nomService: ");
		result.append(nomService);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
