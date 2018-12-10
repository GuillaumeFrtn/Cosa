/**
 */
package cs.impl;

import cosa.impl.ServiceRequisImpl;

import cs.CsPackage;
import cs.PortRequisConnectionM;
import cs.ServiceRequisConnectionM;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Requis Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceRequisConnectionMImpl extends ServiceRequisImpl implements ServiceRequisConnectionM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequisConnectionMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_REQUIS_CONNECTION_M;
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
	
	public void receptionMessage(PortRequisConnectionM port, String message) {
		port.notifyConnectionManager(message);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SERVICE_REQUIS_CONNECTION_M___RECEPTION_REQUETE_SERVEUR:
				receptionMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	

} //ServiceRequisConnectionMImpl
