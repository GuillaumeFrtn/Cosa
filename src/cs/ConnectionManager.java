/**
 */
package cs;

import cosa.EComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.ConnectionManager#getPortrequisserveurcm <em>Portrequisserveurcm</em>}</li>
 *   <li>{@link cs.ConnectionManager#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}</li>
 *   <li>{@link cs.ConnectionManager#getPortfournicmserveur <em>Portfournicmserveur</em>}</li>
 *   <li>{@link cs.ConnectionManager#getPortfournicmdatabase <em>Portfournicmdatabase</em>}</li>
 *   <li>{@link cs.ConnectionManager#getServicerequisconnectionm <em>Servicerequisconnectionm</em>}</li>
 *   <li>{@link cs.ConnectionManager#getServicefourniconnectionm <em>Servicefourniconnectionm</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getConnectionManager()
 * @model
 * @generated
 */
public interface ConnectionManager extends EComposant {
	/**
	 * Returns the value of the '<em><b>Portrequisserveurcm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisserveurcm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisserveurcm</em>' reference.
	 * @see #setPortrequisserveurcm(PortRequisConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Portrequisserveurcm()
	 * @model required="true"
	 * @generated
	 */
	PortRequisConnectionM getPortrequisserveurcm();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getPortrequisserveurcm <em>Portrequisserveurcm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisserveurcm</em>' reference.
	 * @see #getPortrequisserveurcm()
	 * @generated
	 */
	void setPortrequisserveurcm(PortRequisConnectionM value);

	/**
	 * Returns the value of the '<em><b>Portrequisdatabasecm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisdatabasecm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisdatabasecm</em>' reference.
	 * @see #setPortrequisdatabasecm(PortRequisConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Portrequisdatabasecm()
	 * @model required="true"
	 * @generated
	 */
	PortRequisConnectionM getPortrequisdatabasecm();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisdatabasecm</em>' reference.
	 * @see #getPortrequisdatabasecm()
	 * @generated
	 */
	void setPortrequisdatabasecm(PortRequisConnectionM value);

	/**
	 * Returns the value of the '<em><b>Portfournicmserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicmserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournicmserveur</em>' reference.
	 * @see #setPortfournicmserveur(PortFourniConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Portfournicmserveur()
	 * @model required="true"
	 * @generated
	 */
	PortFourniConnectionM getPortfournicmserveur();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getPortfournicmserveur <em>Portfournicmserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournicmserveur</em>' reference.
	 * @see #getPortfournicmserveur()
	 * @generated
	 */
	void setPortfournicmserveur(PortFourniConnectionM value);

	/**
	 * Returns the value of the '<em><b>Portfournicmdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicmdatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournicmdatabase</em>' reference.
	 * @see #setPortfournicmdatabase(PortFourniConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Portfournicmdatabase()
	 * @model required="true"
	 * @generated
	 */
	PortFourniConnectionM getPortfournicmdatabase();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getPortfournicmdatabase <em>Portfournicmdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournicmdatabase</em>' reference.
	 * @see #getPortfournicmdatabase()
	 * @generated
	 */
	void setPortfournicmdatabase(PortFourniConnectionM value);

	/**
	 * Returns the value of the '<em><b>Servicerequisconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicerequisconnectionm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerequisconnectionm</em>' reference.
	 * @see #setServicerequisconnectionm(ServiceRequisConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Servicerequisconnectionm()
	 * @model required="true"
	 * @generated
	 */
	ServiceRequisConnectionM getServicerequisconnectionm();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getServicerequisconnectionm <em>Servicerequisconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerequisconnectionm</em>' reference.
	 * @see #getServicerequisconnectionm()
	 * @generated
	 */
	void setServicerequisconnectionm(ServiceRequisConnectionM value);

	/**
	 * Returns the value of the '<em><b>Servicefourniconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicefourniconnectionm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicefourniconnectionm</em>' reference.
	 * @see #setServicefourniconnectionm(ServiceFourniConnectionM)
	 * @see cs.CsPackage#getConnectionManager_Servicefourniconnectionm()
	 * @model required="true"
	 * @generated
	 */
	ServiceFourniConnectionM getServicefourniconnectionm();

	/**
	 * Sets the value of the '{@link cs.ConnectionManager#getServicefourniconnectionm <em>Servicefourniconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicefourniconnectionm</em>' reference.
	 * @see #getServicefourniconnectionm()
	 * @generated
	 */
	void setServicefourniconnectionm(ServiceFourniConnectionM value);
	
	void receiveNotify(PortRequisConnectionM portRequis, String message);

} // ConnectionManager
