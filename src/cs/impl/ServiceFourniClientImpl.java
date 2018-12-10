/**
 */
package cs.impl;

import cosa.impl.ServiceFourniImpl;

import cs.CsPackage;
import cs.PortFourniClient;
import cs.ServiceFourniClient;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceFourniClientImpl extends ServiceFourniImpl implements ServiceFourniClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFourniClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_FOURNI_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void envoieRequeteClient() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void envoieRequeteClient(PortFourniClient port, String message) {
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
			case CsPackage.SERVICE_FOURNI_CLIENT___ENVOIE_REQUETE_CLIENT:
				envoieRequeteClient();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceFourniClientImpl
