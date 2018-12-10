/**
 */
package cs;

import cosa.PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Connection M</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortFourniConnectionM()
 * @model
 * @generated
 */
public interface PortFourniConnectionM extends PortFourni {
	
	void addObserver(Serveur observer);
	void notifyServeur(String message);
} // PortFourniConnectionM
