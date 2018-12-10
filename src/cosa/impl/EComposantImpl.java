/**
 */
package cosa.impl;

import cosa.CosaPackage;
import cosa.EComposant;
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
 * An implementation of the model object '<em><b>EComposant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cosa.impl.EComposantImpl#getInterfacecomp <em>Interfacecomp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComposantImpl extends ElementImpl implements EComposant {
	/**
	 * The cached value of the '{@link #getInterfacecomp() <em>Interfacecomp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecomp()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComposant> interfacecomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.ECOMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComposant> getInterfacecomp() {
		if (interfacecomp == null) {
			interfacecomp = new EObjectContainmentEList<InterfaceComposant>(InterfaceComposant.class, this, CosaPackage.ECOMPOSANT__INTERFACECOMP);
		}
		return interfacecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CosaPackage.ECOMPOSANT__INTERFACECOMP:
				return ((InternalEList<?>)getInterfacecomp()).basicRemove(otherEnd, msgs);
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
			case CosaPackage.ECOMPOSANT__INTERFACECOMP:
				return getInterfacecomp();
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
			case CosaPackage.ECOMPOSANT__INTERFACECOMP:
				getInterfacecomp().clear();
				getInterfacecomp().addAll((Collection<? extends InterfaceComposant>)newValue);
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
			case CosaPackage.ECOMPOSANT__INTERFACECOMP:
				getInterfacecomp().clear();
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
			case CosaPackage.ECOMPOSANT__INTERFACECOMP:
				return interfacecomp != null && !interfacecomp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EComposantImpl
