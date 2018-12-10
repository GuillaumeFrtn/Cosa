/**
 */
package cs;

import cosa.ServiceFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceFourniServeur()
 * @model
 * @generated
 */
public interface ServiceFourniServeur extends ServiceFourni {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void envoieMessage();
	void envoieMessage(PortFourniServeur port, String message);

} // ServiceFourniServeur
