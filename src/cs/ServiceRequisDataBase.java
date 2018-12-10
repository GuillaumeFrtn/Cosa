/**
 */
package cs;

import cosa.ServiceRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Requis Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see cs.CsPackage#getServiceRequisDataBase()
 * @model
 * @generated
 */
public interface ServiceRequisDataBase extends ServiceRequis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receptionMessage();
	void receptionMessage(PortRequisDataBase port, String message);

} // ServiceRequisDataBase
