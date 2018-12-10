/**
 */
package cs.impl;

import cosa.impl.ServiceFourniImpl;

import cs.CsPackage;
import cs.PortFourniDataBase;
import cs.ServiceFourniDataBase;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Fourni Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceFourniDataBaseImpl extends ServiceFourniImpl implements ServiceFourniDataBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFourniDataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_FOURNI_DATA_BASE;
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
	
	public void envoieMessage(PortFourniDataBase port, String message) {
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
			case CsPackage.SERVICE_FOURNI_DATA_BASE___ENVOIE_REPONSE_CONNECTION_M:
				envoieMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceFourniDataBaseImpl
