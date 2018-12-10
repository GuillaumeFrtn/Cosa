/**
 */
package cs;

import cosa.EComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.Client#getPortrequisclient <em>Portrequisclient</em>}</li>
 *   <li>{@link cs.Client#getPortfournisclient <em>Portfournisclient</em>}</li>
 *   <li>{@link cs.Client#getServicerequisclient <em>Servicerequisclient</em>}</li>
 *   <li>{@link cs.Client#getServicefourniclient <em>Servicefourniclient</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EComposant {
	/**
	 * Returns the value of the '<em><b>Portrequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisclient</em>' reference.
	 * @see #setPortrequisclient(PortRequisClient)
	 * @see cs.CsPackage#getClient_Portrequisclient()
	 * @model required="true"
	 * @generated
	 */
	PortRequisClient getPortrequisclient();

	/**
	 * Sets the value of the '{@link cs.Client#getPortrequisclient <em>Portrequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisclient</em>' reference.
	 * @see #getPortrequisclient()
	 * @generated
	 */
	void setPortrequisclient(PortRequisClient value);

	/**
	 * Returns the value of the '<em><b>Portfournisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournisclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournisclient</em>' reference.
	 * @see #setPortfournisclient(PortFourniClient)
	 * @see cs.CsPackage#getClient_Portfournisclient()
	 * @model required="true"
	 * @generated
	 */
	PortFourniClient getPortfournisclient();

	/**
	 * Sets the value of the '{@link cs.Client#getPortfournisclient <em>Portfournisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournisclient</em>' reference.
	 * @see #getPortfournisclient()
	 * @generated
	 */
	void setPortfournisclient(PortFourniClient value);

	/**
	 * Returns the value of the '<em><b>Servicerequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicerequisclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerequisclient</em>' reference.
	 * @see #setServicerequisclient(ServiceRequisClient)
	 * @see cs.CsPackage#getClient_Servicerequisclient()
	 * @model required="true"
	 * @generated
	 */
	ServiceRequisClient getServicerequisclient();

	/**
	 * Sets the value of the '{@link cs.Client#getServicerequisclient <em>Servicerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerequisclient</em>' reference.
	 * @see #getServicerequisclient()
	 * @generated
	 */
	void setServicerequisclient(ServiceRequisClient value);

	/**
	 * Returns the value of the '<em><b>Servicefourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicefourniclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicefourniclient</em>' reference.
	 * @see #setServicefourniclient(ServiceFourniClient)
	 * @see cs.CsPackage#getClient_Servicefourniclient()
	 * @model required="true"
	 * @generated
	 */
	ServiceFourniClient getServicefourniclient();

	/**
	 * Sets the value of the '{@link cs.Client#getServicefourniclient <em>Servicefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicefourniclient</em>' reference.
	 * @see #getServicefourniclient()
	 * @generated
	 */
	void setServicefourniclient(ServiceFourniClient value);

} // Client
