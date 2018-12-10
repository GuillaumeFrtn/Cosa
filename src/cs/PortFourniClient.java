/**
 */
package cs;

import cosa.PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortFourniClient()
 * @model
 * @generated
 */
public interface PortFourniClient extends PortFourni {
	
	void addObserver(CS observer);
	void notifyConfig(String message);
} // PortFourniClient
