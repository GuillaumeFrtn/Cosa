/**
 */
package cs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public interface CsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsFactory eINSTANCE = cs.impl.CsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur</em>'.
	 * @generated
	 */
	Serveur createServeur();

	/**
	 * Returns a new object of class '<em>Port Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Serveur</em>'.
	 * @generated
	 */
	PortRequisServeur createPortRequisServeur();

	/**
	 * Returns a new object of class '<em>Port Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Serveur</em>'.
	 * @generated
	 */
	PortFourniServeur createPortFourniServeur();

	/**
	 * Returns a new object of class '<em>Service Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis Serveur</em>'.
	 * @generated
	 */
	ServiceRequisServeur createServiceRequisServeur();

	/**
	 * Returns a new object of class '<em>Service Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni Serveur</em>'.
	 * @generated
	 */
	ServiceFourniServeur createServiceFourniServeur();

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	ConnectionManager createConnectionManager();

	/**
	 * Returns a new object of class '<em>Port Requis Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Connection M</em>'.
	 * @generated
	 */
	PortRequisConnectionM createPortRequisConnectionM();

	/**
	 * Returns a new object of class '<em>Port Fourni Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Connection M</em>'.
	 * @generated
	 */
	PortFourniConnectionM createPortFourniConnectionM();

	/**
	 * Returns a new object of class '<em>Service Requis Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis Connection M</em>'.
	 * @generated
	 */
	ServiceRequisConnectionM createServiceRequisConnectionM();

	/**
	 * Returns a new object of class '<em>Service Fourni Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni Connection M</em>'.
	 * @generated
	 */
	ServiceFourniConnectionM createServiceFourniConnectionM();

	/**
	 * Returns a new object of class '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base</em>'.
	 * @generated
	 */
	DataBase createDataBase();

	/**
	 * Returns a new object of class '<em>Port Requis Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Data Base</em>'.
	 * @generated
	 */
	PortRequisDataBase createPortRequisDataBase();

	/**
	 * Returns a new object of class '<em>Port Fourni Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Data Base</em>'.
	 * @generated
	 */
	PortFourniDataBase createPortFourniDataBase();

	/**
	 * Returns a new object of class '<em>Service Requis Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis Data Base</em>'.
	 * @generated
	 */
	ServiceRequisDataBase createServiceRequisDataBase();

	/**
	 * Returns a new object of class '<em>Service Fourni Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni Data Base</em>'.
	 * @generated
	 */
	ServiceFourniDataBase createServiceFourniDataBase();

	/**
	 * Returns a new object of class '<em>SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQ Lquery</em>'.
	 * @generated
	 */
	SQLquery createSQLquery();

	/**
	 * Returns a new object of class '<em>Glue SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue SQ Lquery</em>'.
	 * @generated
	 */
	GlueSQLquery createGlueSQLquery();

	/**
	 * Returns a new object of class '<em>Role Requis SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis SQ Lquery</em>'.
	 * @generated
	 */
	RoleRequisSQLquery createRoleRequisSQLquery();

	/**
	 * Returns a new object of class '<em>Role Fourni SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni SQ Lquery</em>'.
	 * @generated
	 */
	RoleFourniSQLquery createRoleFourniSQLquery();

	/**
	 * Returns a new object of class '<em>Attach CONNECTIO Nsql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach CONNECTIO Nsql</em>'.
	 * @generated
	 */
	AttachCONNECTIONsql createAttachCONNECTIONsql();

	/**
	 * Returns a new object of class '<em>Attach DBsql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach DBsql</em>'.
	 * @generated
	 */
	AttachDBsql createAttachDBsql();

	/**
	 * Returns a new object of class '<em>Binding Serveur Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Serveur Connection M</em>'.
	 * @generated
	 */
	BindingServeurConnectionM createBindingServeurConnectionM();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Port Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Client</em>'.
	 * @generated
	 */
	PortRequisClient createPortRequisClient();

	/**
	 * Returns a new object of class '<em>Port Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni Client</em>'.
	 * @generated
	 */
	PortFourniClient createPortFourniClient();

	/**
	 * Returns a new object of class '<em>Service Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis Client</em>'.
	 * @generated
	 */
	ServiceRequisClient createServiceRequisClient();

	/**
	 * Returns a new object of class '<em>Service Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni Client</em>'.
	 * @generated
	 */
	ServiceFourniClient createServiceFourniClient();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>Glue RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue RPC</em>'.
	 * @generated
	 */
	GlueRPC createGlueRPC();

	/**
	 * Returns a new object of class '<em>Role Requis RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC</em>'.
	 * @generated
	 */
	RoleRequisRPC createRoleRequisRPC();

	/**
	 * Returns a new object of class '<em>Role Fourni RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni RPC</em>'.
	 * @generated
	 */
	RoleFourniRPC createRoleFourniRPC();

	/**
	 * Returns a new object of class '<em>Attach Clientrpc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach Clientrpc</em>'.
	 * @generated
	 */
	AttachClientrpc createAttachClientrpc();

	/**
	 * Returns a new object of class '<em>Attach Serveurrpc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach Serveurrpc</em>'.
	 * @generated
	 */
	AttachServeurrpc createAttachServeurrpc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsPackage getCsPackage();

} //CsFactory
