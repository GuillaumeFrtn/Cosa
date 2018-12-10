/**
 */
package cs;

import cosa.ServiceRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Requis Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceRequisServeur()
 * @model
 * @generated
 */
public interface ServiceRequisServeur extends ServiceRequis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receptionMessage();
	void receptionMessage(PortRequisServeur port, String message);


} // ServiceRequisServeur
