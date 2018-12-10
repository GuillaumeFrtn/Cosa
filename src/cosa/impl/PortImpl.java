/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.PortImpl#getNomPort <em>Nom Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends InterfaceComposantImpl implements Port {
	/**
	 * The default value of the '{@link #getNomPort() <em>Nom Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomPort()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomPort() <em>Nom Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomPort()
	 * @generated
	 * @ordered
	 */
	protected String nomPort = NOM_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomPort() {
		return nomPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomPort(String newNomPort) {
		String oldNomPort = nomPort;
		nomPort = newNomPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.PORT__NOM_PORT, oldNomPort, nomPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.PORT__NOM_PORT:
				return getNomPort();
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
			case CosaPackage.PORT__NOM_PORT:
				setNomPort((String)newValue);
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
			case CosaPackage.PORT__NOM_PORT:
				setNomPort(NOM_PORT_EDEFAULT);
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
			case CosaPackage.PORT__NOM_PORT:
				return NOM_PORT_EDEFAULT == null ? nomPort != null : !NOM_PORT_EDEFAULT.equals(nomPort);
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
		result.append(" (nomPort: ");
		result.append(nomPort);
		result.append(')');
		return result.toString();
	}

} //PortImpl
