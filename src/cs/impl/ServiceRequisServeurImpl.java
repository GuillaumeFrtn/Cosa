/**
 */
package cs.impl;

import cosa.impl.ServiceRequisImpl;

import cs.CsPackage;
import cs.PortRequisServeur;
import cs.ServiceRequisServeur;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Requis Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceRequisServeurImpl extends ServiceRequisImpl implements ServiceRequisServeur {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequisServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_REQUIS_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receptionMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public void receptionMessage(PortRequisServeur port, String message) {
		port.notifyServeur(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SERVICE_REQUIS_SERVEUR___RECEPTION_REQUETE_CLIENT:
				receptionMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceRequisServeurImpl
