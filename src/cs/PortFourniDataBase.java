/**
 */
package cs;

import cosa.PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortFourniDataBase()
 * @model
 * @generated
 */
public interface PortFourniDataBase extends PortFourni {
	
	void addObserver(Serveur observer);
	void notifyServeur(String message);
} // PortFourniDataBase
