/**
 */
package cs;

import cosa.PortRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortRequisServeur()
 * @model
 * @generated
 */
public interface PortRequisServeur extends PortRequis {
	
	void addObserver(Serveur observer);
	void notifyServeur(String message);
} // PortRequisServeur
