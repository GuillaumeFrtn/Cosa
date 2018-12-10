/**
 */
package cosa.impl;

import cosa.Attachment;
import cosa.CosaPackage;
import cosa.InterfaceConnecteur;
import cosa.Port;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.AttachmentImpl#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 *   <li>{@link cosa.impl.AttachmentImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends MinimalEObjectImpl.Container implements Attachment {
	/**
	 * The cached value of the '{@link #getInterfaceconnecteur() <em>Interfaceconnecteur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnecteur> interfaceconnecteur;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnecteur> getInterfaceconnecteur() {
		if (interfaceconnecteur == null) {
			interfaceconnecteur = new EObjectResolvingEList<InterfaceConnecteur>(InterfaceConnecteur.class, this, CosaPackage.ATTACHMENT__INTERFACECONNECTEUR);
		}
		return interfaceconnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<Port>(Port.class, this, CosaPackage.ATTACHMENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.ATTACHMENT__INTERFACECONNECTEUR:
				return getInterfaceconnecteur();
			case CosaPackage.ATTACHMENT__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CosaPackage.ATTACHMENT__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
				getInterfaceconnecteur().addAll((Collection<? extends InterfaceConnecteur>)newValue);
				return;
			case CosaPackage.ATTACHMENT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
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
			case CosaPackage.ATTACHMENT__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
				return;
			case CosaPackage.ATTACHMENT__PORT:
				getPort().clear();
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
			case CosaPackage.ATTACHMENT__INTERFACECONNECTEUR:
				return interfaceconnecteur != null && !interfaceconnecteur.isEmpty();
			case CosaPackage.ATTACHMENT__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
