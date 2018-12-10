/**
 */
package cs;

import cosa.ServiceFourni;
import cs.impl.PortFourniConnectionMImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Fourni Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceFourniConnectionM()
 * @model
 * @generated
 */
public interface ServiceFourniConnectionM extends ServiceFourni {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void envoieMessage();
	void envoieMessage(PortFourniConnectionM portFourni, String message);

} // ServiceFourniConnectionM
