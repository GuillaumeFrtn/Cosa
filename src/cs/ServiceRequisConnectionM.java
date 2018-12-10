/**
 */
package cs;

import cosa.ServiceRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Requis Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceRequisConnectionM()
 * @model
 * @generated
 */
public interface ServiceRequisConnectionM extends ServiceRequis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receptionMessage();
	void receptionMessage(PortRequisConnectionM port, String message);

} // ServiceRequisConnectionM
