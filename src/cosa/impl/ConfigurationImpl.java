/**
 */
package cosa.impl;

import cosa.Attachment;
import cosa.Binding;
import cosa.Configuration;
import cosa.CosaPackage;
import cosa.EComposant;
import cosa.EConnecteur;
import cosa.Element;
import cosa.InterfaceComposant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.ConfigurationImpl#getInterfaceconfig <em>Interfaceconfig</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getEcomposant <em>Ecomposant</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getEconnecteur <em>Econnecteur</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link cosa.impl.ConfigurationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getInterfaceconfig() <em>Interfaceconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComposant> interfaceconfig;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The cached value of the '{@link #getEcomposant() <em>Ecomposant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcomposant()
	 * @generated
	 * @ordered
	 */
	protected EList<EComposant> ecomposant;

	/**
	 * The cached value of the '{@link #getEconnecteur() <em>Econnecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<EConnecteur> econnecteur;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachment;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComposant> getInterfaceconfig() {
		if (interfaceconfig == null) {
			interfaceconfig = new EObjectContainmentEList<InterfaceComposant>(InterfaceComposant.class, this, CosaPackage.CONFIGURATION__INTERFACECONFIG);
		}
		return interfaceconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, CosaPackage.CONFIGURATION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EComposant> getEcomposant() {
		if (ecomposant == null) {
			ecomposant = new EObjectContainmentEList<EComposant>(EComposant.class, this, CosaPackage.CONFIGURATION__ECOMPOSANT);
		}
		return ecomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EConnecteur> getEconnecteur() {
		if (econnecteur == null) {
			econnecteur = new EObjectContainmentEList<EConnecteur>(EConnecteur.class, this, CosaPackage.CONFIGURATION__ECONNECTEUR);
		}
		return econnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttachment() {
		if (attachment == null) {
			attachment = new EObjectContainmentEList<Attachment>(Attachment.class, this, CosaPackage.CONFIGURATION__ATTACHMENT);
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, CosaPackage.CONFIGURATION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.CONFIGURATION__INTERFACECONFIG:
				return ((InternalEList<?>)getInterfaceconfig()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ECOMPOSANT:
				return ((InternalEList<?>)getEcomposant()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ECONNECTEUR:
				return ((InternalEList<?>)getEconnecteur()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return ((InternalEList<?>)getAttachment()).basicRemove(otherEnd, msgs);
			case CosaPackage.CONFIGURATION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.CONFIGURATION__INTERFACECONFIG:
				return getInterfaceconfig();
			case CosaPackage.CONFIGURATION__ELEMENT:
				return getElement();
			case CosaPackage.CONFIGURATION__ECOMPOSANT:
				return getEcomposant();
			case CosaPackage.CONFIGURATION__ECONNECTEUR:
				return getEconnecteur();
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return getAttachment();
			case CosaPackage.CONFIGURATION__BINDING:
				return getBinding();
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
			case CosaPackage.CONFIGURATION__INTERFACECONFIG:
				getInterfaceconfig().clear();
				getInterfaceconfig().addAll((Collection<? extends InterfaceComposant>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ECOMPOSANT:
				getEcomposant().clear();
				getEcomposant().addAll((Collection<? extends EComposant>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ECONNECTEUR:
				getEconnecteur().clear();
				getEconnecteur().addAll((Collection<? extends EConnecteur>)newValue);
				return;
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
				getAttachment().addAll((Collection<? extends Attachment>)newValue);
				return;
			case CosaPackage.CONFIGURATION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
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
			case CosaPackage.CONFIGURATION__INTERFACECONFIG:
				getInterfaceconfig().clear();
				return;
			case CosaPackage.CONFIGURATION__ELEMENT:
				getElement().clear();
				return;
			case CosaPackage.CONFIGURATION__ECOMPOSANT:
				getEcomposant().clear();
				return;
			case CosaPackage.CONFIGURATION__ECONNECTEUR:
				getEconnecteur().clear();
				return;
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				getAttachment().clear();
				return;
			case CosaPackage.CONFIGURATION__BINDING:
				getBinding().clear();
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
			case CosaPackage.CONFIGURATION__INTERFACECONFIG:
				return interfaceconfig != null && !interfaceconfig.isEmpty();
			case CosaPackage.CONFIGURATION__ELEMENT:
				return element != null && !element.isEmpty();
			case CosaPackage.CONFIGURATION__ECOMPOSANT:
				return ecomposant != null && !ecomposant.isEmpty();
			case CosaPackage.CONFIGURATION__ECONNECTEUR:
				return econnecteur != null && !econnecteur.isEmpty();
			case CosaPackage.CONFIGURATION__ATTACHMENT:
				return attachment != null && !attachment.isEmpty();
			case CosaPackage.CONFIGURATION__BINDING:
				return binding != null && !binding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
