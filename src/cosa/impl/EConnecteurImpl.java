/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.EConnecteur;
import cosa.Glue;
import cosa.InterfaceConnecteur;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EConnecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.EConnecteurImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link cosa.impl.EConnecteurImpl#getInterfaceconnecteur <em>Interfaceconnecteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EConnecteurImpl extends ElementImpl implements EConnecteur {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * The cached value of the '{@link #getInterfaceconnecteur() <em>Interfaceconnecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnecteur> interfaceconnecteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ECONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CosaPackage.ECONNECTEUR__GLUE, oldGlue, newGlue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject)glue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CosaPackage.ECONNECTEUR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject)newGlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CosaPackage.ECONNECTEUR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CosaPackage.ECONNECTEUR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnecteur> getInterfaceconnecteur() {
		if (interfaceconnecteur == null) {
			interfaceconnecteur = new EObjectContainmentEList<InterfaceConnecteur>(InterfaceConnecteur.class, this, CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR);
		}
		return interfaceconnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.ECONNECTEUR__GLUE:
				return basicSetGlue(null, msgs);
			case CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR:
				return ((InternalEList<?>)getInterfaceconnecteur()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CosaPackage.ECONNECTEUR__GLUE:
				return getGlue();
			case CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR:
				return getInterfaceconnecteur();
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
			case CosaPackage.ECONNECTEUR__GLUE:
				setGlue((Glue)newValue);
				return;
			case CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
				getInterfaceconnecteur().addAll((Collection<? extends InterfaceConnecteur>)newValue);
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
			case CosaPackage.ECONNECTEUR__GLUE:
				setGlue((Glue)null);
				return;
			case CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR:
				getInterfaceconnecteur().clear();
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
			case CosaPackage.ECONNECTEUR__GLUE:
				return glue != null;
			case CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR:
				return interfaceconnecteur != null && !interfaceconnecteur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EConnecteurImpl
