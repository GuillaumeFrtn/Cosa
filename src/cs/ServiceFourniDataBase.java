/**
 */
package cs;

import cosa.ServiceFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Fourni Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceFourniDataBase()
 * @model
 * @generated
 */
public interface ServiceFourniDataBase extends ServiceFourni {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void envoieMessage();
	void envoieMessage(PortFourniDataBase port, String message);

} // ServiceFourniDataBase
