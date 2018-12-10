/**
 */
package cs.impl;

import cosa.impl.ServiceFourniImpl;

import cs.CsPackage;
import cs.PortFourniServeur;
import cs.ServiceFourniServeur;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceFourniServeurImpl extends ServiceFourniImpl implements ServiceFourniServeur {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFourniServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_FOURNI_SERVEUR;
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

	public void envoieMessage(PortFourniServeur port, String message) {
		port.notifyConfig(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SERVICE_FOURNI_SERVEUR___ENVOIE_REPONSE_CLIENT:
				envoieMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceFourniServeurImpl
