/**
 */
package cs;

import cosa.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.Serveur#getPortrequisserveur <em>Portrequisserveur</em>}</li>
 *   <li>{@link cs.Serveur#getPortfourniserveur <em>Portfourniserveur</em>}</li>
 *   <li>{@link cs.Serveur#getServicerequisserveur <em>Servicerequisserveur</em>}</li>
 *   <li>{@link cs.Serveur#getServicefourniserveur <em>Servicefourniserveur</em>}</li>
 *   <li>{@link cs.Serveur#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cs.Serveur#getDatabase <em>Database</em>}</li>
 *   <li>{@link cs.Serveur#getSqlquery <em>Sqlquery</em>}</li>
 *   <li>{@link cs.Serveur#getAttachconnectionsql <em>Attachconnectionsql</em>}</li>
 *   <li>{@link cs.Serveur#getAttachdbsql <em>Attachdbsql</em>}</li>
 *   <li>{@link cs.Serveur#getBindingserveurconnectionm <em>Bindingserveurconnectionm</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getServeur()
 * @model
 * @generated
 */
public interface Serveur extends Configuration {
	/**
	 * Returns the value of the '<em><b>Portrequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisserveur</em>' reference.
	 * @see #setPortrequisserveur(PortRequisServeur)
	 * @see cs.CsPackage#getServeur_Portrequisserveur()
	 * @model required="true"
	 * @generated
	 */
	PortRequisServeur getPortrequisserveur();

	/**
	 * Sets the value of the '{@link cs.Serveur#getPortrequisserveur <em>Portrequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisserveur</em>' reference.
	 * @see #getPortrequisserveur()
	 * @generated
	 */
	void setPortrequisserveur(PortRequisServeur value);

	/**
	 * Returns the value of the '<em><b>Portfourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniserveur</em>' reference.
	 * @see #setPortfourniserveur(PortFourniServeur)
	 * @see cs.CsPackage#getServeur_Portfourniserveur()
	 * @model required="true"
	 * @generated
	 */
	PortFourniServeur getPortfourniserveur();

	/**
	 * Sets the value of the '{@link cs.Serveur#getPortfourniserveur <em>Portfourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourniserveur</em>' reference.
	 * @see #getPortfourniserveur()
	 * @generated
	 */
	void setPortfourniserveur(PortFourniServeur value);

	/**
	 * Returns the value of the '<em><b>Servicerequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicerequisserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerequisserveur</em>' reference.
	 * @see #setServicerequisserveur(ServiceRequisServeur)
	 * @see cs.CsPackage#getServeur_Servicerequisserveur()
	 * @model required="true"
	 * @generated
	 */
	ServiceRequisServeur getServicerequisserveur();

	/**
	 * Sets the value of the '{@link cs.Serveur#getServicerequisserveur <em>Servicerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerequisserveur</em>' reference.
	 * @see #getServicerequisserveur()
	 * @generated
	 */
	void setServicerequisserveur(ServiceRequisServeur value);

	/**
	 * Returns the value of the '<em><b>Servicefourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicefourniserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicefourniserveur</em>' reference.
	 * @see #setServicefourniserveur(ServiceFourniServeur)
	 * @see cs.CsPackage#getServeur_Servicefourniserveur()
	 * @model required="true"
	 * @generated
	 */
	ServiceFourniServeur getServicefourniserveur();

	/**
	 * Sets the value of the '{@link cs.Serveur#getServicefourniserveur <em>Servicefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicefourniserveur</em>' reference.
	 * @see #getServicefourniserveur()
	 * @generated
	 */
	void setServicefourniserveur(ServiceFourniServeur value);

	/**
	 * Returns the value of the '<em><b>Connectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager</em>' reference.
	 * @see #setConnectionmanager(ConnectionManager)
	 * @see cs.CsPackage#getServeur_Connectionmanager()
	 * @model required="true"
	 * @generated
	 */
	ConnectionManager getConnectionmanager();

	/**
	 * Sets the value of the '{@link cs.Serveur#getConnectionmanager <em>Connectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionmanager</em>' reference.
	 * @see #getConnectionmanager()
	 * @generated
	 */
	void setConnectionmanager(ConnectionManager value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(DataBase)
	 * @see cs.CsPackage#getServeur_Database()
	 * @model required="true"
	 * @generated
	 */
	DataBase getDatabase();

	/**
	 * Sets the value of the '{@link cs.Serveur#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DataBase value);

	/**
	 * Returns the value of the '<em><b>Sqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlquery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqlquery</em>' reference.
	 * @see #setSqlquery(SQLquery)
	 * @see cs.CsPackage#getServeur_Sqlquery()
	 * @model required="true"
	 * @generated
	 */
	SQLquery getSqlquery();

	/**
	 * Sets the value of the '{@link cs.Serveur#getSqlquery <em>Sqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqlquery</em>' reference.
	 * @see #getSqlquery()
	 * @generated
	 */
	void setSqlquery(SQLquery value);

	/**
	 * Returns the value of the '<em><b>Attachconnectionsql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachconnectionsql</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachconnectionsql</em>' reference.
	 * @see #setAttachconnectionsql(AttachCONNECTIONsql)
	 * @see cs.CsPackage#getServeur_Attachconnectionsql()
	 * @model required="true"
	 * @generated
	 */
	AttachCONNECTIONsql getAttachconnectionsql();

	/**
	 * Sets the value of the '{@link cs.Serveur#getAttachconnectionsql <em>Attachconnectionsql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachconnectionsql</em>' reference.
	 * @see #getAttachconnectionsql()
	 * @generated
	 */
	void setAttachconnectionsql(AttachCONNECTIONsql value);

	/**
	 * Returns the value of the '<em><b>Attachdbsql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachdbsql</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachdbsql</em>' reference.
	 * @see #setAttachdbsql(AttachDBsql)
	 * @see cs.CsPackage#getServeur_Attachdbsql()
	 * @model required="true"
	 * @generated
	 */
	AttachDBsql getAttachdbsql();

	/**
	 * Sets the value of the '{@link cs.Serveur#getAttachdbsql <em>Attachdbsql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachdbsql</em>' reference.
	 * @see #getAttachdbsql()
	 * @generated
	 */
	void setAttachdbsql(AttachDBsql value);

	/**
	 * Returns the value of the '<em><b>Bindingserveurconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingserveurconnectionm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingserveurconnectionm</em>' reference.
	 * @see #setBindingserveurconnectionm(BindingServeurConnectionM)
	 * @see cs.CsPackage#getServeur_Bindingserveurconnectionm()
	 * @model required="true"
	 * @generated
	 */
	BindingServeurConnectionM getBindingserveurconnectionm();

	/**
	 * Sets the value of the '{@link cs.Serveur#getBindingserveurconnectionm <em>Bindingserveurconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingserveurconnectionm</em>' reference.
	 * @see #getBindingserveurconnectionm()
	 * @generated
	 */
	void setBindingserveurconnectionm(BindingServeurConnectionM value);
	
	void transfert(PortFourniConnectionM port, String message);
	void transfert(PortFourniDataBase port, String message);
	void transfert(RoleFourniSQLquery role, String message);
	void transfert(PortRequisServeur port, String message);

} // Serveur
