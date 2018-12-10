/**
 */
package cs;

import cosa.PortRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getPortRequisDataBase()
 * @model
 * @generated
 */
public interface PortRequisDataBase extends PortRequis {
	
	void addObserver(DataBase db);
	void notifyDataBase(String message);
} // PortRequisDataBase
