/**
 */
package cs.impl;

import cosa.impl.BindingImpl;

import cs.BindingServeurConnectionM;
import cs.CsPackage;
import cs.PortFourniConnectionM;
import cs.PortFourniServeur;
import cs.PortRequisConnectionM;
import cs.PortRequisServeur;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Serveur Connection M</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.BindingServeurConnectionMImpl#getPortrequisserveur <em>Portrequisserveur</em>}</li>
 *   <li>{@link cs.impl.BindingServeurConnectionMImpl#getPortrequisserveurcm <em>Portrequisserveurcm</em>}</li>
 *   <li>{@link cs.impl.BindingServeurConnectionMImpl#getPortfournicmserveur <em>Portfournicmserveur</em>}</li>
 *   <li>{@link cs.impl.BindingServeurConnectionMImpl#getPortfourniserveur <em>Portfourniserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingServeurConnectionMImpl extends BindingImpl implements BindingServeurConnectionM {
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
	 * The cached value of the '{@link #getPortrequisserveurcm() <em>Portrequisserveurcm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisserveurcm()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConnectionM portrequisserveurcm;

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
	 * The cached value of the '{@link #getPortfourniserveur() <em>Portfourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniserveur()
	 * @generated
	 * @ordered
	 */
	protected PortFourniServeur portfourniserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingServeurConnectionMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.BINDING_SERVEUR_CONNECTION_M;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM, oldPortrequisserveurcm, portrequisserveurcm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM, oldPortrequisserveurcm, portrequisserveurcm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR, oldPortfournicmserveur, portfournicmserveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR, oldPortfournicmserveur, portfournicmserveur));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR:
				if (resolve) return getPortrequisserveur();
				return basicGetPortrequisserveur();
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM:
				if (resolve) return getPortrequisserveurcm();
				return basicGetPortrequisserveurcm();
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR:
				if (resolve) return getPortfournicmserveur();
				return basicGetPortfournicmserveur();
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR:
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
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)newValue);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM:
				setPortrequisserveurcm((PortRequisConnectionM)newValue);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR:
				setPortfournicmserveur((PortFourniConnectionM)newValue);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR:
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
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)null);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM:
				setPortrequisserveurcm((PortRequisConnectionM)null);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR:
				setPortfournicmserveur((PortFourniConnectionM)null);
				return;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR:
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
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR:
				return portrequisserveur != null;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM:
				return portrequisserveurcm != null;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR:
				return portfournicmserveur != null;
			case CsPackage.BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR:
				return portfourniserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingServeurConnectionMImpl
