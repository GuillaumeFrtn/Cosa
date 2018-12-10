/**
 */
package cs.impl;

import cosa.impl.ServiceFourniImpl;

import cs.CsPackage;
import cs.PortFourniConnectionM;
import cs.ServiceFourniConnectionM;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Fourni Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceFourniConnectionMImpl extends ServiceFourniImpl implements ServiceFourniConnectionM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFourniConnectionMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_FOURNI_CONNECTION_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void envoieMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void envoieMessage(PortFourniConnectionM port, String message) {
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
			case CsPackage.SERVICE_FOURNI_CONNECTION_M___ENVOIE_REPONSE_SERVEUR:
				envoieMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceFourniConnectionMImpl
