/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.Interface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.InterfaceImpl#getNomInterface <em>Nom Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
	/**
	 * The default value of the '{@link #getNomInterface() <em>Nom Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomInterface() <em>Nom Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomInterface()
	 * @generated
	 * @ordered
	 */
	protected String nomInterface = NOM_INTERFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomInterface() {
		return nomInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomInterface(String newNomInterface) {
		String oldNomInterface = nomInterface;
		nomInterface = newNomInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.INTERFACE__NOM_INTERFACE, oldNomInterface, nomInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.INTERFACE__NOM_INTERFACE:
				return getNomInterface();
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
			case CosaPackage.INTERFACE__NOM_INTERFACE:
				setNomInterface((String)newValue);
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
			case CosaPackage.INTERFACE__NOM_INTERFACE:
				setNomInterface(NOM_INTERFACE_EDEFAULT);
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
			case CosaPackage.INTERFACE__NOM_INTERFACE:
				return NOM_INTERFACE_EDEFAULT == null ? nomInterface != null : !NOM_INTERFACE_EDEFAULT.equals(nomInterface);
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
		result.append(" (nomInterface: ");
		result.append(nomInterface);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
