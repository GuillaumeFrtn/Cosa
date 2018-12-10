/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.RoleImpl#getNomRole <em>Nom Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoleImpl extends InterfaceConnecteurImpl implements Role {
	/**
	 * The default value of the '{@link #getNomRole() <em>Nom Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRole()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomRole() <em>Nom Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRole()
	 * @generated
	 * @ordered
	 */
	protected String nomRole = NOM_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomRole() {
		return nomRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomRole(String newNomRole) {
		String oldNomRole = nomRole;
		nomRole = newNomRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.ROLE__NOM_ROLE, oldNomRole, nomRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.ROLE__NOM_ROLE:
				return getNomRole();
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
			case CosaPackage.ROLE__NOM_ROLE:
				setNomRole((String)newValue);
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
			case CosaPackage.ROLE__NOM_ROLE:
				setNomRole(NOM_ROLE_EDEFAULT);
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
			case CosaPackage.ROLE__NOM_ROLE:
				return NOM_ROLE_EDEFAULT == null ? nomRole != null : !NOM_ROLE_EDEFAULT.equals(nomRole);
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
		result.append(" (nomRole: ");
		result.append(nomRole);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
