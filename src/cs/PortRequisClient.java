/**
 */
package cs;

import cosa.PortRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortRequisClient()
 * @model
 * @generated
 */
public interface PortRequisClient extends PortRequis {
	
	void addObserver(Client observer);
	void notifyClient(String message);
} // PortRequisClient
