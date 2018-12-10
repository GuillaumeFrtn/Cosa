/**
 */
package cs;

import cosa.PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortFourniServeur()
 * @model
 * @generated
 */
public interface PortFourniServeur extends PortFourni {
	
	void addObserver(CS observer);
	void notifyConfig(String message);
} // PortFourniServeur
