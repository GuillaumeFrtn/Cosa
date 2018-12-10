/**
 */
package cs;

import cosa.ServiceFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceFourniClient()
 * @model
 * @generated
 */
public interface ServiceFourniClient extends ServiceFourni {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void envoieRequeteClient();
	void envoieRequeteClient(PortFourniClient port, String message);

} // ServiceFourniClient
