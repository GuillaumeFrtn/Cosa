/**
 */
package cs.impl;

import cosa.impl.ServiceRequisImpl;

import cs.CsPackage;
import cs.ServiceRequisClient;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Requis Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceRequisClientImpl extends ServiceRequisImpl implements ServiceRequisClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequisClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_REQUIS_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receptionReponse() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void receptionReponse(String message) {
		System.out.println(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SERVICE_REQUIS_CLIENT___RECEPTION_REQUETE_CLIENT:
				receptionReponse();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceRequisClientImpl
