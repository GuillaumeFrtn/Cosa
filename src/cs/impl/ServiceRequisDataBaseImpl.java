/**
 */
package cs.impl;

import cosa.impl.ServiceRequisImpl;

import cs.CsPackage;
import cs.PortRequisDataBase;
import cs.ServiceRequisDataBase;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Requis Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceRequisDataBaseImpl extends ServiceRequisImpl implements ServiceRequisDataBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRequisDataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVICE_REQUIS_DATA_BASE;
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

	public void receptionMessage(PortRequisDataBase port, String message) {
		port.notifyDataBase(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.SERVICE_REQUIS_DATA_BASE___RECEPTION_REQUETE_CONNECTION_M:
				receptionMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceRequisDataBaseImpl
