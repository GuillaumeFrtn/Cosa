/**
 */
package cs;

import cosa.PortRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortRequisConnectionM()
 * @model
 * @generated
 */
public interface PortRequisConnectionM extends PortRequis {
	
	void addObserver(ConnectionManager observer);
	void notifyConnectionManager(String message);
} // PortRequisConnectionM
