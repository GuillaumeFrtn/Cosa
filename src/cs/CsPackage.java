/**
 */
package cs;

import cosa.CosaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cs.CsFactory
 * @model kind="package"
 * @generated
 */
public interface CsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsPackage eINSTANCE = cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cs.impl.ServeurImpl <em>Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServeurImpl
	 * @see cs.impl.CsPackageImpl#getServeur()
	 * @generated
	 */
	int SERVEUR = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__NOM = CosaPackage.CONFIGURATION__NOM;

	/**
	 * The feature id for the '<em><b>Interfaceconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__INTERFACECONFIG = CosaPackage.CONFIGURATION__INTERFACECONFIG;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ELEMENT = CosaPackage.CONFIGURATION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Ecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ECOMPOSANT = CosaPackage.CONFIGURATION__ECOMPOSANT;

	/**
	 * The feature id for the '<em><b>Econnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ECONNECTEUR = CosaPackage.CONFIGURATION__ECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ATTACHMENT = CosaPackage.CONFIGURATION__ATTACHMENT;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__BINDING = CosaPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Portrequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__PORTREQUISSERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__PORTFOURNISERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Servicerequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__SERVICEREQUISSERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Servicefourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__SERVICEFOURNISERVEUR = CosaPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__CONNECTIONMANAGER = CosaPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__DATABASE = CosaPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__SQLQUERY = CosaPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attachconnectionsql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ATTACHCONNECTIONSQL = CosaPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachdbsql</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ATTACHDBSQL = CosaPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bindingserveurconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__BINDINGSERVEURCONNECTIONM = CosaPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_FEATURE_COUNT = CosaPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OPERATION_COUNT = CosaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortRequisServeurImpl <em>Port Requis Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortRequisServeurImpl
	 * @see cs.impl.CsPackageImpl#getPortRequisServeur()
	 * @generated
	 */
	int PORT_REQUIS_SERVEUR = 1;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__NOM_INTERFACE = CosaPackage.PORT_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR__NOM_PORT = CosaPackage.PORT_REQUIS__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SERVEUR_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortFourniServeurImpl <em>Port Fourni Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortFourniServeurImpl
	 * @see cs.impl.CsPackageImpl#getPortFourniServeur()
	 * @generated
	 */
	int PORT_FOURNI_SERVEUR = 2;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__NOM_INTERFACE = CosaPackage.PORT_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR__NOM_PORT = CosaPackage.PORT_FOURNI__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_SERVEUR_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceRequisServeurImpl <em>Service Requis Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceRequisServeurImpl
	 * @see cs.impl.CsPackageImpl#getServiceRequisServeur()
	 * @generated
	 */
	int SERVICE_REQUIS_SERVEUR = 3;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR__NOM_INTERFACE = CosaPackage.SERVICE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR__NOM_SERVICE = CosaPackage.SERVICE_REQUIS__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR_FEATURE_COUNT = CosaPackage.SERVICE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Requete Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR___RECEPTION_REQUETE_CLIENT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Reponse Connection M</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR___RECEPTION_REPONSE_CONNECTION_M = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Requis Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_SERVEUR_OPERATION_COUNT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceFourniServeurImpl <em>Service Fourni Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceFourniServeurImpl
	 * @see cs.impl.CsPackageImpl#getServiceFourniServeur()
	 * @generated
	 */
	int SERVICE_FOURNI_SERVEUR = 4;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR__NOM_INTERFACE = CosaPackage.SERVICE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR__NOM_SERVICE = CosaPackage.SERVICE_FOURNI__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR_FEATURE_COUNT = CosaPackage.SERVICE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Reponse Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR___ENVOIE_REPONSE_CLIENT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Requete Connection M</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR___ENVOIE_REQUETE_CONNECTION_M = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Fourni Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_SERVEUR_OPERATION_COUNT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ConnectionManagerImpl
	 * @see cs.impl.CsPackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__NOM = CosaPackage.ECOMPOSANT__NOM;

	/**
	 * The feature id for the '<em><b>Interfacecomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACECOMP = CosaPackage.ECOMPOSANT__INTERFACECOMP;

	/**
	 * The feature id for the '<em><b>Portrequisserveurcm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTREQUISSERVEURCM = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequisdatabasecm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTREQUISDATABASECM = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournicmserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTFOURNICMSERVEUR = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portfournicmdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PORTFOURNICMDATABASE = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Servicerequisconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Servicefourniconnectionm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = CosaPackage.ECOMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortRequisConnectionMImpl <em>Port Requis Connection M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortRequisConnectionMImpl
	 * @see cs.impl.CsPackageImpl#getPortRequisConnectionM()
	 * @generated
	 */
	int PORT_REQUIS_CONNECTION_M = 6;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_M__NOM_INTERFACE = CosaPackage.PORT_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_M__NOM_PORT = CosaPackage.PORT_REQUIS__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Requis Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_M_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_M_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortFourniConnectionMImpl <em>Port Fourni Connection M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortFourniConnectionMImpl
	 * @see cs.impl.CsPackageImpl#getPortFourniConnectionM()
	 * @generated
	 */
	int PORT_FOURNI_CONNECTION_M = 7;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CONNECTION_M__NOM_INTERFACE = CosaPackage.PORT_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CONNECTION_M__NOM_PORT = CosaPackage.PORT_FOURNI__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Fourni Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CONNECTION_M_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CONNECTION_M_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceRequisConnectionMImpl <em>Service Requis Connection M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceRequisConnectionMImpl
	 * @see cs.impl.CsPackageImpl#getServiceRequisConnectionM()
	 * @generated
	 */
	int SERVICE_REQUIS_CONNECTION_M = 8;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M__NOM_INTERFACE = CosaPackage.SERVICE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M__NOM_SERVICE = CosaPackage.SERVICE_REQUIS__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Requis Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M_FEATURE_COUNT = CosaPackage.SERVICE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Requete Serveur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M___RECEPTION_REQUETE_SERVEUR = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Reponse Data Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M___RECEPTION_REPONSE_DATA_BASE = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Requis Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CONNECTION_M_OPERATION_COUNT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceFourniConnectionMImpl <em>Service Fourni Connection M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceFourniConnectionMImpl
	 * @see cs.impl.CsPackageImpl#getServiceFourniConnectionM()
	 * @generated
	 */
	int SERVICE_FOURNI_CONNECTION_M = 9;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M__NOM_INTERFACE = CosaPackage.SERVICE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M__NOM_SERVICE = CosaPackage.SERVICE_FOURNI__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Fourni Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M_FEATURE_COUNT = CosaPackage.SERVICE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Reponse Serveur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M___ENVOIE_REPONSE_SERVEUR = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Requete Data Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M___ENVOIE_REQUETE_DATA_BASE = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Fourni Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CONNECTION_M_OPERATION_COUNT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cs.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.DataBaseImpl
	 * @see cs.impl.CsPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NOM = CosaPackage.ECOMPOSANT__NOM;

	/**
	 * The feature id for the '<em><b>Interfacecomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__INTERFACECOMP = CosaPackage.ECOMPOSANT__INTERFACECOMP;

	/**
	 * The feature id for the '<em><b>Portrequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PORTREQUISDATABASE = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__PORTFOURNIDATABASE = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Servicerequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__SERVICEREQUISDATABASE = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Servicefournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__SERVICEFOURNIDATABASE = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = CosaPackage.ECOMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortRequisDataBaseImpl <em>Port Requis Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortRequisDataBaseImpl
	 * @see cs.impl.CsPackageImpl#getPortRequisDataBase()
	 * @generated
	 */
	int PORT_REQUIS_DATA_BASE = 11;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATA_BASE__NOM_INTERFACE = CosaPackage.PORT_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATA_BASE__NOM_PORT = CosaPackage.PORT_REQUIS__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Requis Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATA_BASE_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATA_BASE_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortFourniDataBaseImpl <em>Port Fourni Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortFourniDataBaseImpl
	 * @see cs.impl.CsPackageImpl#getPortFourniDataBase()
	 * @generated
	 */
	int PORT_FOURNI_DATA_BASE = 12;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DATA_BASE__NOM_INTERFACE = CosaPackage.PORT_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DATA_BASE__NOM_PORT = CosaPackage.PORT_FOURNI__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Fourni Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DATA_BASE_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_DATA_BASE_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceRequisDataBaseImpl <em>Service Requis Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceRequisDataBaseImpl
	 * @see cs.impl.CsPackageImpl#getServiceRequisDataBase()
	 * @generated
	 */
	int SERVICE_REQUIS_DATA_BASE = 13;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_DATA_BASE__NOM_INTERFACE = CosaPackage.SERVICE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_DATA_BASE__NOM_SERVICE = CosaPackage.SERVICE_REQUIS__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Requis Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_DATA_BASE_FEATURE_COUNT = CosaPackage.SERVICE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Requete Connection M</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_DATA_BASE___RECEPTION_REQUETE_CONNECTION_M = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_DATA_BASE_OPERATION_COUNT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceFourniDataBaseImpl <em>Service Fourni Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceFourniDataBaseImpl
	 * @see cs.impl.CsPackageImpl#getServiceFourniDataBase()
	 * @generated
	 */
	int SERVICE_FOURNI_DATA_BASE = 14;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_DATA_BASE__NOM_INTERFACE = CosaPackage.SERVICE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_DATA_BASE__NOM_SERVICE = CosaPackage.SERVICE_FOURNI__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Fourni Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_DATA_BASE_FEATURE_COUNT = CosaPackage.SERVICE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Reponse Connection M</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_DATA_BASE___ENVOIE_REPONSE_CONNECTION_M = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_DATA_BASE_OPERATION_COUNT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.SQLqueryImpl <em>SQ Lquery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.SQLqueryImpl
	 * @see cs.impl.CsPackageImpl#getSQLquery()
	 * @generated
	 */
	int SQ_LQUERY = 15;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__NOM = CosaPackage.ECONNECTEUR__NOM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__GLUE = CosaPackage.ECONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__INTERFACECONNECTEUR = CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Gluesqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__GLUESQLQUERY = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequiscmsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__ROLEREQUISCMSQLQUERY = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rolerequisdbsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__ROLEREQUISDBSQLQUERY = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rolefournisqlquerycm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__ROLEFOURNISQLQUERYCM = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rolefournisqlquerydb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY__ROLEFOURNISQLQUERYDB = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY_FEATURE_COUNT = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Transfert Message SQ Lquery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY___TRANSFERT_MESSAGE_SQ_LQUERY = CosaPackage.ECONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQ_LQUERY_OPERATION_COUNT = CosaPackage.ECONNECTEUR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.GlueSQLqueryImpl <em>Glue SQ Lquery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.GlueSQLqueryImpl
	 * @see cs.impl.CsPackageImpl#getGlueSQLquery()
	 * @generated
	 */
	int GLUE_SQ_LQUERY = 16;

	/**
	 * The number of structural features of the '<em>Glue SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SQ_LQUERY_FEATURE_COUNT = CosaPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match Roles SQ Lquery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SQ_LQUERY___MATCH_ROLES_SQ_LQUERY = CosaPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Glue SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SQ_LQUERY_OPERATION_COUNT = CosaPackage.GLUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.RoleRequisSQLqueryImpl <em>Role Requis SQ Lquery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.RoleRequisSQLqueryImpl
	 * @see cs.impl.CsPackageImpl#getRoleRequisSQLquery()
	 * @generated
	 */
	int ROLE_REQUIS_SQ_LQUERY = 17;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SQ_LQUERY__NOM_INTERFACE = CosaPackage.ROLE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SQ_LQUERY__NOM_ROLE = CosaPackage.ROLE_REQUIS__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Requis SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SQ_LQUERY_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SQ_LQUERY_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.RoleFourniSQLqueryImpl <em>Role Fourni SQ Lquery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.RoleFourniSQLqueryImpl
	 * @see cs.impl.CsPackageImpl#getRoleFourniSQLquery()
	 * @generated
	 */
	int ROLE_FOURNI_SQ_LQUERY = 18;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_SQ_LQUERY__NOM_INTERFACE = CosaPackage.ROLE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_SQ_LQUERY__NOM_ROLE = CosaPackage.ROLE_FOURNI__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Fourni SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_SQ_LQUERY_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni SQ Lquery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_SQ_LQUERY_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.AttachCONNECTIONsqlImpl <em>Attach CONNECTIO Nsql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.AttachCONNECTIONsqlImpl
	 * @see cs.impl.CsPackageImpl#getAttachCONNECTIONsql()
	 * @generated
	 */
	int ATTACH_CONNECTIO_NSQL = 19;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__INTERFACECONNECTEUR = CosaPackage.ATTACHMENT__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Portfournicmdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequiscmsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rolefournisqlquerycm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portrequisdatabasecm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM = CosaPackage.ATTACHMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attach CONNECTIO Nsql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attach CONNECTIO Nsql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CONNECTIO_NSQL_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.AttachDBsqlImpl <em>Attach DBsql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.AttachDBsqlImpl
	 * @see cs.impl.CsPackageImpl#getAttachDBsql()
	 * @generated
	 */
	int ATTACH_DBSQL = 20;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__INTERFACECONNECTEUR = CosaPackage.ATTACHMENT__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__PORT = CosaPackage.ATTACHMENT__PORT;

	/**
	 * The feature id for the '<em><b>Rolefournisqlquerydb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__ROLEFOURNISQLQUERYDB = CosaPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__PORTREQUISDATABASE = CosaPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__PORTFOURNIDATABASE = CosaPackage.ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rolerequisdbsqlquery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL__ROLEREQUISDBSQLQUERY = CosaPackage.ATTACHMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attach DBsql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL_FEATURE_COUNT = CosaPackage.ATTACHMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attach DBsql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_DBSQL_OPERATION_COUNT = CosaPackage.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.BindingServeurConnectionMImpl <em>Binding Serveur Connection M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.BindingServeurConnectionMImpl
	 * @see cs.impl.CsPackageImpl#getBindingServeurConnectionM()
	 * @generated
	 */
	int BINDING_SERVEUR_CONNECTION_M = 21;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M__PORT = CosaPackage.BINDING__PORT;

	/**
	 * The feature id for the '<em><b>Portrequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR = CosaPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequisserveurcm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM = CosaPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournicmserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR = CosaPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portfourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR = CosaPackage.BINDING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding Serveur Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M_FEATURE_COUNT = CosaPackage.BINDING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Binding Serveur Connection M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_CONNECTION_M_OPERATION_COUNT = CosaPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ClientImpl
	 * @see cs.impl.CsPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 22;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = CosaPackage.ECOMPOSANT__NOM;

	/**
	 * The feature id for the '<em><b>Interfacecomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INTERFACECOMP = CosaPackage.ECOMPOSANT__INTERFACECOMP;

	/**
	 * The feature id for the '<em><b>Portrequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTREQUISCLIENT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfournisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PORTFOURNISCLIENT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Servicerequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SERVICEREQUISCLIENT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Servicefourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SERVICEFOURNICLIENT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = CosaPackage.ECOMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = CosaPackage.ECOMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortRequisClientImpl <em>Port Requis Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortRequisClientImpl
	 * @see cs.impl.CsPackageImpl#getPortRequisClient()
	 * @generated
	 */
	int PORT_REQUIS_CLIENT = 23;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__NOM_INTERFACE = CosaPackage.PORT_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT__NOM_PORT = CosaPackage.PORT_REQUIS__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT_FEATURE_COUNT = CosaPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CLIENT_OPERATION_COUNT = CosaPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.PortFourniClientImpl <em>Port Fourni Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PortFourniClientImpl
	 * @see cs.impl.CsPackageImpl#getPortFourniClient()
	 * @generated
	 */
	int PORT_FOURNI_CLIENT = 24;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__NOM_INTERFACE = CosaPackage.PORT_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT__NOM_PORT = CosaPackage.PORT_FOURNI__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT_FEATURE_COUNT = CosaPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_CLIENT_OPERATION_COUNT = CosaPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceRequisClientImpl <em>Service Requis Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceRequisClientImpl
	 * @see cs.impl.CsPackageImpl#getServiceRequisClient()
	 * @generated
	 */
	int SERVICE_REQUIS_CLIENT = 25;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CLIENT__NOM_INTERFACE = CosaPackage.SERVICE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CLIENT__NOM_SERVICE = CosaPackage.SERVICE_REQUIS__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CLIENT_FEATURE_COUNT = CosaPackage.SERVICE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reception Requete Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CLIENT___RECEPTION_REQUETE_CLIENT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_CLIENT_OPERATION_COUNT = CosaPackage.SERVICE_REQUIS_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.ServiceFourniClientImpl <em>Service Fourni Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.ServiceFourniClientImpl
	 * @see cs.impl.CsPackageImpl#getServiceFourniClient()
	 * @generated
	 */
	int SERVICE_FOURNI_CLIENT = 26;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CLIENT__NOM_INTERFACE = CosaPackage.SERVICE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CLIENT__NOM_SERVICE = CosaPackage.SERVICE_FOURNI__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CLIENT_FEATURE_COUNT = CosaPackage.SERVICE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Envoie Requete Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CLIENT___ENVOIE_REQUETE_CLIENT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_CLIENT_OPERATION_COUNT = CosaPackage.SERVICE_FOURNI_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.RPCImpl
	 * @see cs.impl.CsPackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 27;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NOM = CosaPackage.ECONNECTEUR__NOM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = CosaPackage.ECONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INTERFACECONNECTEUR = CosaPackage.ECONNECTEUR__INTERFACECONNECTEUR;

	/**
	 * The feature id for the '<em><b>Gluerpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUERPC = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLEREQUISCLIENT = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rolerequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLEREQUISSERVEUR = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rolefourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLEFOURNICLIENT = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rolefourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLEFOURNISERVEUR = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = CosaPackage.ECONNECTEUR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Transfert Message RPC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC___TRANSFERT_MESSAGE_RPC = CosaPackage.ECONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = CosaPackage.ECONNECTEUR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.GlueRPCImpl <em>Glue RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.GlueRPCImpl
	 * @see cs.impl.CsPackageImpl#getGlueRPC()
	 * @generated
	 */
	int GLUE_RPC = 28;

	/**
	 * The number of structural features of the '<em>Glue RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_RPC_FEATURE_COUNT = CosaPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Match Roles RPC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_RPC___MATCH_ROLES_RPC = CosaPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Glue RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_RPC_OPERATION_COUNT = CosaPackage.GLUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cs.impl.RoleRequisRPCImpl <em>Role Requis RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.RoleRequisRPCImpl
	 * @see cs.impl.CsPackageImpl#getRoleRequisRPC()
	 * @generated
	 */
	int ROLE_REQUIS_RPC = 29;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC__NOM_INTERFACE = CosaPackage.ROLE_REQUIS__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC__NOM_ROLE = CosaPackage.ROLE_REQUIS__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Requis RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_FEATURE_COUNT = CosaPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC_OPERATION_COUNT = CosaPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.RoleFourniRPCImpl <em>Role Fourni RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.RoleFourniRPCImpl
	 * @see cs.impl.CsPackageImpl#getRoleFourniRPC()
	 * @generated
	 */
	int ROLE_FOURNI_RPC = 30;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC__NOM_INTERFACE = CosaPackage.ROLE_FOURNI__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC__NOM_ROLE = CosaPackage.ROLE_FOURNI__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Fourni RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_FEATURE_COUNT = CosaPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC_OPERATION_COUNT = CosaPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.AttachClientrpcImpl <em>Attach Clientrpc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.AttachClientrpcImpl
	 * @see cs.impl.CsPackageImpl#getAttachClientrpc()
	 * @generated
	 */
	int ATTACH_CLIENTRPC = 31;

	/**
	 * The feature id for the '<em><b>Portrequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC__PORTREQUISCLIENT = 0;

	/**
	 * The feature id for the '<em><b>Rolefourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC__ROLEFOURNICLIENT = 1;

	/**
	 * The feature id for the '<em><b>Rolerequisclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC__ROLEREQUISCLIENT = 2;

	/**
	 * The feature id for the '<em><b>Portfourniclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC__PORTFOURNICLIENT = 3;

	/**
	 * The number of structural features of the '<em>Attach Clientrpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attach Clientrpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_CLIENTRPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.AttachServeurrpcImpl <em>Attach Serveurrpc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.AttachServeurrpcImpl
	 * @see cs.impl.CsPackageImpl#getAttachServeurrpc()
	 * @generated
	 */
	int ATTACH_SERVEURRPC = 32;

	/**
	 * The feature id for the '<em><b>Portrequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC__PORTREQUISSERVEUR = 0;

	/**
	 * The feature id for the '<em><b>Rolefourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC__ROLEFOURNISERVEUR = 1;

	/**
	 * The feature id for the '<em><b>Rolerequisserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC__ROLEREQUISSERVEUR = 2;

	/**
	 * The feature id for the '<em><b>Portfourniserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC__PORTFOURNISERVEUR = 3;

	/**
	 * The number of structural features of the '<em>Attach Serveurrpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attach Serveurrpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_SERVEURRPC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cs.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur</em>'.
	 * @see cs.Serveur
	 * @generated
	 */
	EClass getServeur();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getPortrequisserveur <em>Portrequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisserveur</em>'.
	 * @see cs.Serveur#getPortrequisserveur()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Portrequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getPortfourniserveur <em>Portfourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniserveur</em>'.
	 * @see cs.Serveur#getPortfourniserveur()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Portfourniserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getServicerequisserveur <em>Servicerequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicerequisserveur</em>'.
	 * @see cs.Serveur#getServicerequisserveur()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Servicerequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getServicefourniserveur <em>Servicefourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicefourniserveur</em>'.
	 * @see cs.Serveur#getServicefourniserveur()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Servicefourniserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectionmanager</em>'.
	 * @see cs.Serveur#getConnectionmanager()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Connectionmanager();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see cs.Serveur#getDatabase()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Database();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getSqlquery <em>Sqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sqlquery</em>'.
	 * @see cs.Serveur#getSqlquery()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Sqlquery();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getAttachconnectionsql <em>Attachconnectionsql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachconnectionsql</em>'.
	 * @see cs.Serveur#getAttachconnectionsql()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Attachconnectionsql();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getAttachdbsql <em>Attachdbsql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachdbsql</em>'.
	 * @see cs.Serveur#getAttachdbsql()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Attachdbsql();

	/**
	 * Returns the meta object for the reference '{@link cs.Serveur#getBindingserveurconnectionm <em>Bindingserveurconnectionm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindingserveurconnectionm</em>'.
	 * @see cs.Serveur#getBindingserveurconnectionm()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Bindingserveurconnectionm();

	/**
	 * Returns the meta object for class '{@link cs.PortRequisServeur <em>Port Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Serveur</em>'.
	 * @see cs.PortRequisServeur
	 * @generated
	 */
	EClass getPortRequisServeur();

	/**
	 * Returns the meta object for class '{@link cs.PortFourniServeur <em>Port Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Serveur</em>'.
	 * @see cs.PortFourniServeur
	 * @generated
	 */
	EClass getPortFourniServeur();

	/**
	 * Returns the meta object for class '{@link cs.ServiceRequisServeur <em>Service Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis Serveur</em>'.
	 * @see cs.ServiceRequisServeur
	 * @generated
	 */
	EClass getServiceRequisServeur();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisServeur#receptionRequeteClient() <em>Reception Requete Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Requete Client</em>' operation.
	 * @see cs.ServiceRequisServeur#receptionRequeteClient()
	 * @generated
	 */
	EOperation getServiceRequisServeur__ReceptionRequeteClient();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisServeur#receptionReponseConnectionM() <em>Reception Reponse Connection M</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Reponse Connection M</em>' operation.
	 * @see cs.ServiceRequisServeur#receptionReponseConnectionM()
	 * @generated
	 */
	EOperation getServiceRequisServeur__ReceptionReponseConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.ServiceFourniServeur <em>Service Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni Serveur</em>'.
	 * @see cs.ServiceFourniServeur
	 * @generated
	 */
	EClass getServiceFourniServeur();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniServeur#envoieReponseClient() <em>Envoie Reponse Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Reponse Client</em>' operation.
	 * @see cs.ServiceFourniServeur#envoieReponseClient()
	 * @generated
	 */
	EOperation getServiceFourniServeur__EnvoieReponseClient();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniServeur#envoieRequeteConnectionM() <em>Envoie Requete Connection M</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Requete Connection M</em>' operation.
	 * @see cs.ServiceFourniServeur#envoieRequeteConnectionM()
	 * @generated
	 */
	EOperation getServiceFourniServeur__EnvoieRequeteConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see cs.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getPortrequisserveurcm <em>Portrequisserveurcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisserveurcm</em>'.
	 * @see cs.ConnectionManager#getPortrequisserveurcm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portrequisserveurcm();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisdatabasecm</em>'.
	 * @see cs.ConnectionManager#getPortrequisdatabasecm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portrequisdatabasecm();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getPortfournicmserveur <em>Portfournicmserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournicmserveur</em>'.
	 * @see cs.ConnectionManager#getPortfournicmserveur()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portfournicmserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getPortfournicmdatabase <em>Portfournicmdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournicmdatabase</em>'.
	 * @see cs.ConnectionManager#getPortfournicmdatabase()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Portfournicmdatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getServicerequisconnectionm <em>Servicerequisconnectionm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicerequisconnectionm</em>'.
	 * @see cs.ConnectionManager#getServicerequisconnectionm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Servicerequisconnectionm();

	/**
	 * Returns the meta object for the reference '{@link cs.ConnectionManager#getServicefourniconnectionm <em>Servicefourniconnectionm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicefourniconnectionm</em>'.
	 * @see cs.ConnectionManager#getServicefourniconnectionm()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Servicefourniconnectionm();

	/**
	 * Returns the meta object for class '{@link cs.PortRequisConnectionM <em>Port Requis Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Connection M</em>'.
	 * @see cs.PortRequisConnectionM
	 * @generated
	 */
	EClass getPortRequisConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.PortFourniConnectionM <em>Port Fourni Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Connection M</em>'.
	 * @see cs.PortFourniConnectionM
	 * @generated
	 */
	EClass getPortFourniConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.ServiceRequisConnectionM <em>Service Requis Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis Connection M</em>'.
	 * @see cs.ServiceRequisConnectionM
	 * @generated
	 */
	EClass getServiceRequisConnectionM();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisConnectionM#receptionRequeteServeur() <em>Reception Requete Serveur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Requete Serveur</em>' operation.
	 * @see cs.ServiceRequisConnectionM#receptionRequeteServeur()
	 * @generated
	 */
	EOperation getServiceRequisConnectionM__ReceptionRequeteServeur();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisConnectionM#receptionReponseDataBase() <em>Reception Reponse Data Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Reponse Data Base</em>' operation.
	 * @see cs.ServiceRequisConnectionM#receptionReponseDataBase()
	 * @generated
	 */
	EOperation getServiceRequisConnectionM__ReceptionReponseDataBase();

	/**
	 * Returns the meta object for class '{@link cs.ServiceFourniConnectionM <em>Service Fourni Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni Connection M</em>'.
	 * @see cs.ServiceFourniConnectionM
	 * @generated
	 */
	EClass getServiceFourniConnectionM();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniConnectionM#envoieReponseServeur() <em>Envoie Reponse Serveur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Reponse Serveur</em>' operation.
	 * @see cs.ServiceFourniConnectionM#envoieReponseServeur()
	 * @generated
	 */
	EOperation getServiceFourniConnectionM__EnvoieReponseServeur();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniConnectionM#envoieRequeteDataBase() <em>Envoie Requete Data Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Requete Data Base</em>' operation.
	 * @see cs.ServiceFourniConnectionM#envoieRequeteDataBase()
	 * @generated
	 */
	EOperation getServiceFourniConnectionM__EnvoieRequeteDataBase();

	/**
	 * Returns the meta object for class '{@link cs.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see cs.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the reference '{@link cs.DataBase#getPortrequisdatabase <em>Portrequisdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisdatabase</em>'.
	 * @see cs.DataBase#getPortrequisdatabase()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Portrequisdatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.DataBase#getPortfournidatabase <em>Portfournidatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournidatabase</em>'.
	 * @see cs.DataBase#getPortfournidatabase()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Portfournidatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.DataBase#getServicerequisdatabase <em>Servicerequisdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicerequisdatabase</em>'.
	 * @see cs.DataBase#getServicerequisdatabase()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Servicerequisdatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.DataBase#getServicefournidatabase <em>Servicefournidatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicefournidatabase</em>'.
	 * @see cs.DataBase#getServicefournidatabase()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Servicefournidatabase();

	/**
	 * Returns the meta object for class '{@link cs.PortRequisDataBase <em>Port Requis Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Data Base</em>'.
	 * @see cs.PortRequisDataBase
	 * @generated
	 */
	EClass getPortRequisDataBase();

	/**
	 * Returns the meta object for class '{@link cs.PortFourniDataBase <em>Port Fourni Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Data Base</em>'.
	 * @see cs.PortFourniDataBase
	 * @generated
	 */
	EClass getPortFourniDataBase();

	/**
	 * Returns the meta object for class '{@link cs.ServiceRequisDataBase <em>Service Requis Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis Data Base</em>'.
	 * @see cs.ServiceRequisDataBase
	 * @generated
	 */
	EClass getServiceRequisDataBase();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisDataBase#receptionRequeteConnectionM() <em>Reception Requete Connection M</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Requete Connection M</em>' operation.
	 * @see cs.ServiceRequisDataBase#receptionRequeteConnectionM()
	 * @generated
	 */
	EOperation getServiceRequisDataBase__ReceptionRequeteConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.ServiceFourniDataBase <em>Service Fourni Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni Data Base</em>'.
	 * @see cs.ServiceFourniDataBase
	 * @generated
	 */
	EClass getServiceFourniDataBase();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniDataBase#envoieReponseConnectionM() <em>Envoie Reponse Connection M</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Reponse Connection M</em>' operation.
	 * @see cs.ServiceFourniDataBase#envoieReponseConnectionM()
	 * @generated
	 */
	EOperation getServiceFourniDataBase__EnvoieReponseConnectionM();

	/**
	 * Returns the meta object for class '{@link cs.SQLquery <em>SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQ Lquery</em>'.
	 * @see cs.SQLquery
	 * @generated
	 */
	EClass getSQLquery();

	/**
	 * Returns the meta object for the reference '{@link cs.SQLquery#getGluesqlquery <em>Gluesqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gluesqlquery</em>'.
	 * @see cs.SQLquery#getGluesqlquery()
	 * @see #getSQLquery()
	 * @generated
	 */
	EReference getSQLquery_Gluesqlquery();

	/**
	 * Returns the meta object for the reference '{@link cs.SQLquery#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequiscmsqlquery</em>'.
	 * @see cs.SQLquery#getRolerequiscmsqlquery()
	 * @see #getSQLquery()
	 * @generated
	 */
	EReference getSQLquery_Rolerequiscmsqlquery();

	/**
	 * Returns the meta object for the reference '{@link cs.SQLquery#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisdbsqlquery</em>'.
	 * @see cs.SQLquery#getRolerequisdbsqlquery()
	 * @see #getSQLquery()
	 * @generated
	 */
	EReference getSQLquery_Rolerequisdbsqlquery();

	/**
	 * Returns the meta object for the reference '{@link cs.SQLquery#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournisqlquerycm</em>'.
	 * @see cs.SQLquery#getRolefournisqlquerycm()
	 * @see #getSQLquery()
	 * @generated
	 */
	EReference getSQLquery_Rolefournisqlquerycm();

	/**
	 * Returns the meta object for the reference '{@link cs.SQLquery#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournisqlquerydb</em>'.
	 * @see cs.SQLquery#getRolefournisqlquerydb()
	 * @see #getSQLquery()
	 * @generated
	 */
	EReference getSQLquery_Rolefournisqlquerydb();

	/**
	 * Returns the meta object for the '{@link cs.SQLquery#transfertMessageSQLquery() <em>Transfert Message SQ Lquery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfert Message SQ Lquery</em>' operation.
	 * @see cs.SQLquery#transfertMessageSQLquery()
	 * @generated
	 */
	EOperation getSQLquery__TransfertMessageSQLquery();

	/**
	 * Returns the meta object for class '{@link cs.GlueSQLquery <em>Glue SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue SQ Lquery</em>'.
	 * @see cs.GlueSQLquery
	 * @generated
	 */
	EClass getGlueSQLquery();

	/**
	 * Returns the meta object for the '{@link cs.GlueSQLquery#matchRolesSQLquery() <em>Match Roles SQ Lquery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match Roles SQ Lquery</em>' operation.
	 * @see cs.GlueSQLquery#matchRolesSQLquery()
	 * @generated
	 */
	EOperation getGlueSQLquery__MatchRolesSQLquery();

	/**
	 * Returns the meta object for class '{@link cs.RoleRequisSQLquery <em>Role Requis SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis SQ Lquery</em>'.
	 * @see cs.RoleRequisSQLquery
	 * @generated
	 */
	EClass getRoleRequisSQLquery();

	/**
	 * Returns the meta object for class '{@link cs.RoleFourniSQLquery <em>Role Fourni SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni SQ Lquery</em>'.
	 * @see cs.RoleFourniSQLquery
	 * @generated
	 */
	EClass getRoleFourniSQLquery();

	/**
	 * Returns the meta object for class '{@link cs.AttachCONNECTIONsql <em>Attach CONNECTIO Nsql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach CONNECTIO Nsql</em>'.
	 * @see cs.AttachCONNECTIONsql
	 * @generated
	 */
	EClass getAttachCONNECTIONsql();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachCONNECTIONsql#getPortfournicmdatabase <em>Portfournicmdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournicmdatabase</em>'.
	 * @see cs.AttachCONNECTIONsql#getPortfournicmdatabase()
	 * @see #getAttachCONNECTIONsql()
	 * @generated
	 */
	EReference getAttachCONNECTIONsql_Portfournicmdatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachCONNECTIONsql#getRolerequiscmsqlquery <em>Rolerequiscmsqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequiscmsqlquery</em>'.
	 * @see cs.AttachCONNECTIONsql#getRolerequiscmsqlquery()
	 * @see #getAttachCONNECTIONsql()
	 * @generated
	 */
	EReference getAttachCONNECTIONsql_Rolerequiscmsqlquery();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachCONNECTIONsql#getRolefournisqlquerycm <em>Rolefournisqlquerycm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournisqlquerycm</em>'.
	 * @see cs.AttachCONNECTIONsql#getRolefournisqlquerycm()
	 * @see #getAttachCONNECTIONsql()
	 * @generated
	 */
	EReference getAttachCONNECTIONsql_Rolefournisqlquerycm();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachCONNECTIONsql#getPortrequisdatabasecm <em>Portrequisdatabasecm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisdatabasecm</em>'.
	 * @see cs.AttachCONNECTIONsql#getPortrequisdatabasecm()
	 * @see #getAttachCONNECTIONsql()
	 * @generated
	 */
	EReference getAttachCONNECTIONsql_Portrequisdatabasecm();

	/**
	 * Returns the meta object for class '{@link cs.AttachDBsql <em>Attach DBsql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach DBsql</em>'.
	 * @see cs.AttachDBsql
	 * @generated
	 */
	EClass getAttachDBsql();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachDBsql#getRolefournisqlquerydb <em>Rolefournisqlquerydb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournisqlquerydb</em>'.
	 * @see cs.AttachDBsql#getRolefournisqlquerydb()
	 * @see #getAttachDBsql()
	 * @generated
	 */
	EReference getAttachDBsql_Rolefournisqlquerydb();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachDBsql#getPortrequisdatabase <em>Portrequisdatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisdatabase</em>'.
	 * @see cs.AttachDBsql#getPortrequisdatabase()
	 * @see #getAttachDBsql()
	 * @generated
	 */
	EReference getAttachDBsql_Portrequisdatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachDBsql#getPortfournidatabase <em>Portfournidatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournidatabase</em>'.
	 * @see cs.AttachDBsql#getPortfournidatabase()
	 * @see #getAttachDBsql()
	 * @generated
	 */
	EReference getAttachDBsql_Portfournidatabase();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachDBsql#getRolerequisdbsqlquery <em>Rolerequisdbsqlquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisdbsqlquery</em>'.
	 * @see cs.AttachDBsql#getRolerequisdbsqlquery()
	 * @see #getAttachDBsql()
	 * @generated
	 */
	EReference getAttachDBsql_Rolerequisdbsqlquery();

	/**
	 * Returns the meta object for class '{@link cs.BindingServeurConnectionM <em>Binding Serveur Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur Connection M</em>'.
	 * @see cs.BindingServeurConnectionM
	 * @generated
	 */
	EClass getBindingServeurConnectionM();

	/**
	 * Returns the meta object for the reference '{@link cs.BindingServeurConnectionM#getPortrequisserveur <em>Portrequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisserveur</em>'.
	 * @see cs.BindingServeurConnectionM#getPortrequisserveur()
	 * @see #getBindingServeurConnectionM()
	 * @generated
	 */
	EReference getBindingServeurConnectionM_Portrequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.BindingServeurConnectionM#getPortrequisserveurcm <em>Portrequisserveurcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisserveurcm</em>'.
	 * @see cs.BindingServeurConnectionM#getPortrequisserveurcm()
	 * @see #getBindingServeurConnectionM()
	 * @generated
	 */
	EReference getBindingServeurConnectionM_Portrequisserveurcm();

	/**
	 * Returns the meta object for the reference '{@link cs.BindingServeurConnectionM#getPortfournicmserveur <em>Portfournicmserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournicmserveur</em>'.
	 * @see cs.BindingServeurConnectionM#getPortfournicmserveur()
	 * @see #getBindingServeurConnectionM()
	 * @generated
	 */
	EReference getBindingServeurConnectionM_Portfournicmserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.BindingServeurConnectionM#getPortfourniserveur <em>Portfourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniserveur</em>'.
	 * @see cs.BindingServeurConnectionM#getPortfourniserveur()
	 * @see #getBindingServeurConnectionM()
	 * @generated
	 */
	EReference getBindingServeurConnectionM_Portfourniserveur();

	/**
	 * Returns the meta object for class '{@link cs.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see cs.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference '{@link cs.Client#getPortrequisclient <em>Portrequisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisclient</em>'.
	 * @see cs.Client#getPortrequisclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portrequisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.Client#getPortfournisclient <em>Portfournisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournisclient</em>'.
	 * @see cs.Client#getPortfournisclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Portfournisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.Client#getServicerequisclient <em>Servicerequisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicerequisclient</em>'.
	 * @see cs.Client#getServicerequisclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Servicerequisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.Client#getServicefourniclient <em>Servicefourniclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicefourniclient</em>'.
	 * @see cs.Client#getServicefourniclient()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Servicefourniclient();

	/**
	 * Returns the meta object for class '{@link cs.PortRequisClient <em>Port Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Client</em>'.
	 * @see cs.PortRequisClient
	 * @generated
	 */
	EClass getPortRequisClient();

	/**
	 * Returns the meta object for class '{@link cs.PortFourniClient <em>Port Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Client</em>'.
	 * @see cs.PortFourniClient
	 * @generated
	 */
	EClass getPortFourniClient();

	/**
	 * Returns the meta object for class '{@link cs.ServiceRequisClient <em>Service Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis Client</em>'.
	 * @see cs.ServiceRequisClient
	 * @generated
	 */
	EClass getServiceRequisClient();

	/**
	 * Returns the meta object for the '{@link cs.ServiceRequisClient#receptionRequeteClient() <em>Reception Requete Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reception Requete Client</em>' operation.
	 * @see cs.ServiceRequisClient#receptionRequeteClient()
	 * @generated
	 */
	EOperation getServiceRequisClient__ReceptionRequeteClient();

	/**
	 * Returns the meta object for class '{@link cs.ServiceFourniClient <em>Service Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni Client</em>'.
	 * @see cs.ServiceFourniClient
	 * @generated
	 */
	EClass getServiceFourniClient();

	/**
	 * Returns the meta object for the '{@link cs.ServiceFourniClient#envoieRequeteClient() <em>Envoie Requete Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envoie Requete Client</em>' operation.
	 * @see cs.ServiceFourniClient#envoieRequeteClient()
	 * @generated
	 */
	EOperation getServiceFourniClient__EnvoieRequeteClient();

	/**
	 * Returns the meta object for class '{@link cs.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see cs.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the reference '{@link cs.RPC#getGluerpc <em>Gluerpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gluerpc</em>'.
	 * @see cs.RPC#getGluerpc()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Gluerpc();

	/**
	 * Returns the meta object for the reference '{@link cs.RPC#getRolerequisclient <em>Rolerequisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisclient</em>'.
	 * @see cs.RPC#getRolerequisclient()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rolerequisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.RPC#getRolerequisserveur <em>Rolerequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisserveur</em>'.
	 * @see cs.RPC#getRolerequisserveur()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rolerequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.RPC#getRolefourniclient <em>Rolefourniclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefourniclient</em>'.
	 * @see cs.RPC#getRolefourniclient()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rolefourniclient();

	/**
	 * Returns the meta object for the reference '{@link cs.RPC#getRolefourniserveur <em>Rolefourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefourniserveur</em>'.
	 * @see cs.RPC#getRolefourniserveur()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rolefourniserveur();

	/**
	 * Returns the meta object for the '{@link cs.RPC#transfertMessageRPC() <em>Transfert Message RPC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfert Message RPC</em>' operation.
	 * @see cs.RPC#transfertMessageRPC()
	 * @generated
	 */
	EOperation getRPC__TransfertMessageRPC();

	/**
	 * Returns the meta object for class '{@link cs.GlueRPC <em>Glue RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue RPC</em>'.
	 * @see cs.GlueRPC
	 * @generated
	 */
	EClass getGlueRPC();

	/**
	 * Returns the meta object for the '{@link cs.GlueRPC#matchRolesRPC() <em>Match Roles RPC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match Roles RPC</em>' operation.
	 * @see cs.GlueRPC#matchRolesRPC()
	 * @generated
	 */
	EOperation getGlueRPC__MatchRolesRPC();

	/**
	 * Returns the meta object for class '{@link cs.RoleRequisRPC <em>Role Requis RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC</em>'.
	 * @see cs.RoleRequisRPC
	 * @generated
	 */
	EClass getRoleRequisRPC();

	/**
	 * Returns the meta object for class '{@link cs.RoleFourniRPC <em>Role Fourni RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni RPC</em>'.
	 * @see cs.RoleFourniRPC
	 * @generated
	 */
	EClass getRoleFourniRPC();

	/**
	 * Returns the meta object for class '{@link cs.AttachClientrpc <em>Attach Clientrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Clientrpc</em>'.
	 * @see cs.AttachClientrpc
	 * @generated
	 */
	EClass getAttachClientrpc();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachClientrpc#getPortrequisclient <em>Portrequisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisclient</em>'.
	 * @see cs.AttachClientrpc#getPortrequisclient()
	 * @see #getAttachClientrpc()
	 * @generated
	 */
	EReference getAttachClientrpc_Portrequisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachClientrpc#getRolefourniclient <em>Rolefourniclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefourniclient</em>'.
	 * @see cs.AttachClientrpc#getRolefourniclient()
	 * @see #getAttachClientrpc()
	 * @generated
	 */
	EReference getAttachClientrpc_Rolefourniclient();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachClientrpc#getRolerequisclient <em>Rolerequisclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisclient</em>'.
	 * @see cs.AttachClientrpc#getRolerequisclient()
	 * @see #getAttachClientrpc()
	 * @generated
	 */
	EReference getAttachClientrpc_Rolerequisclient();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachClientrpc#getPortfourniclient <em>Portfourniclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniclient</em>'.
	 * @see cs.AttachClientrpc#getPortfourniclient()
	 * @see #getAttachClientrpc()
	 * @generated
	 */
	EReference getAttachClientrpc_Portfourniclient();

	/**
	 * Returns the meta object for class '{@link cs.AttachServeurrpc <em>Attach Serveurrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Serveurrpc</em>'.
	 * @see cs.AttachServeurrpc
	 * @generated
	 */
	EClass getAttachServeurrpc();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachServeurrpc#getPortrequisserveur <em>Portrequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisserveur</em>'.
	 * @see cs.AttachServeurrpc#getPortrequisserveur()
	 * @see #getAttachServeurrpc()
	 * @generated
	 */
	EReference getAttachServeurrpc_Portrequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachServeurrpc#getRolefourniserveur <em>Rolefourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefourniserveur</em>'.
	 * @see cs.AttachServeurrpc#getRolefourniserveur()
	 * @see #getAttachServeurrpc()
	 * @generated
	 */
	EReference getAttachServeurrpc_Rolefourniserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachServeurrpc#getRolerequisserveur <em>Rolerequisserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequisserveur</em>'.
	 * @see cs.AttachServeurrpc#getRolerequisserveur()
	 * @see #getAttachServeurrpc()
	 * @generated
	 */
	EReference getAttachServeurrpc_Rolerequisserveur();

	/**
	 * Returns the meta object for the reference '{@link cs.AttachServeurrpc#getPortfourniserveur <em>Portfourniserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniserveur</em>'.
	 * @see cs.AttachServeurrpc#getPortfourniserveur()
	 * @see #getAttachServeurrpc()
	 * @generated
	 */
	EReference getAttachServeurrpc_Portfourniserveur();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsFactory getCsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cs.impl.ServeurImpl <em>Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServeurImpl
		 * @see cs.impl.CsPackageImpl#getServeur()
		 * @generated
		 */
		EClass SERVEUR = eINSTANCE.getServeur();

		/**
		 * The meta object literal for the '<em><b>Portrequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__PORTREQUISSERVEUR = eINSTANCE.getServeur_Portrequisserveur();

		/**
		 * The meta object literal for the '<em><b>Portfourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__PORTFOURNISERVEUR = eINSTANCE.getServeur_Portfourniserveur();

		/**
		 * The meta object literal for the '<em><b>Servicerequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__SERVICEREQUISSERVEUR = eINSTANCE.getServeur_Servicerequisserveur();

		/**
		 * The meta object literal for the '<em><b>Servicefourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__SERVICEFOURNISERVEUR = eINSTANCE.getServeur_Servicefourniserveur();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__CONNECTIONMANAGER = eINSTANCE.getServeur_Connectionmanager();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__DATABASE = eINSTANCE.getServeur_Database();

		/**
		 * The meta object literal for the '<em><b>Sqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__SQLQUERY = eINSTANCE.getServeur_Sqlquery();

		/**
		 * The meta object literal for the '<em><b>Attachconnectionsql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__ATTACHCONNECTIONSQL = eINSTANCE.getServeur_Attachconnectionsql();

		/**
		 * The meta object literal for the '<em><b>Attachdbsql</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__ATTACHDBSQL = eINSTANCE.getServeur_Attachdbsql();

		/**
		 * The meta object literal for the '<em><b>Bindingserveurconnectionm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__BINDINGSERVEURCONNECTIONM = eINSTANCE.getServeur_Bindingserveurconnectionm();

		/**
		 * The meta object literal for the '{@link cs.impl.PortRequisServeurImpl <em>Port Requis Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortRequisServeurImpl
		 * @see cs.impl.CsPackageImpl#getPortRequisServeur()
		 * @generated
		 */
		EClass PORT_REQUIS_SERVEUR = eINSTANCE.getPortRequisServeur();

		/**
		 * The meta object literal for the '{@link cs.impl.PortFourniServeurImpl <em>Port Fourni Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortFourniServeurImpl
		 * @see cs.impl.CsPackageImpl#getPortFourniServeur()
		 * @generated
		 */
		EClass PORT_FOURNI_SERVEUR = eINSTANCE.getPortFourniServeur();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceRequisServeurImpl <em>Service Requis Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceRequisServeurImpl
		 * @see cs.impl.CsPackageImpl#getServiceRequisServeur()
		 * @generated
		 */
		EClass SERVICE_REQUIS_SERVEUR = eINSTANCE.getServiceRequisServeur();

		/**
		 * The meta object literal for the '<em><b>Reception Requete Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_SERVEUR___RECEPTION_REQUETE_CLIENT = eINSTANCE.getServiceRequisServeur__ReceptionRequeteClient();

		/**
		 * The meta object literal for the '<em><b>Reception Reponse Connection M</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_SERVEUR___RECEPTION_REPONSE_CONNECTION_M = eINSTANCE.getServiceRequisServeur__ReceptionReponseConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceFourniServeurImpl <em>Service Fourni Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceFourniServeurImpl
		 * @see cs.impl.CsPackageImpl#getServiceFourniServeur()
		 * @generated
		 */
		EClass SERVICE_FOURNI_SERVEUR = eINSTANCE.getServiceFourniServeur();

		/**
		 * The meta object literal for the '<em><b>Envoie Reponse Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_SERVEUR___ENVOIE_REPONSE_CLIENT = eINSTANCE.getServiceFourniServeur__EnvoieReponseClient();

		/**
		 * The meta object literal for the '<em><b>Envoie Requete Connection M</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_SERVEUR___ENVOIE_REQUETE_CONNECTION_M = eINSTANCE.getServiceFourniServeur__EnvoieRequeteConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ConnectionManagerImpl
		 * @see cs.impl.CsPackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Portrequisserveurcm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTREQUISSERVEURCM = eINSTANCE.getConnectionManager_Portrequisserveurcm();

		/**
		 * The meta object literal for the '<em><b>Portrequisdatabasecm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTREQUISDATABASECM = eINSTANCE.getConnectionManager_Portrequisdatabasecm();

		/**
		 * The meta object literal for the '<em><b>Portfournicmserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTFOURNICMSERVEUR = eINSTANCE.getConnectionManager_Portfournicmserveur();

		/**
		 * The meta object literal for the '<em><b>Portfournicmdatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__PORTFOURNICMDATABASE = eINSTANCE.getConnectionManager_Portfournicmdatabase();

		/**
		 * The meta object literal for the '<em><b>Servicerequisconnectionm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM = eINSTANCE.getConnectionManager_Servicerequisconnectionm();

		/**
		 * The meta object literal for the '<em><b>Servicefourniconnectionm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM = eINSTANCE.getConnectionManager_Servicefourniconnectionm();

		/**
		 * The meta object literal for the '{@link cs.impl.PortRequisConnectionMImpl <em>Port Requis Connection M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortRequisConnectionMImpl
		 * @see cs.impl.CsPackageImpl#getPortRequisConnectionM()
		 * @generated
		 */
		EClass PORT_REQUIS_CONNECTION_M = eINSTANCE.getPortRequisConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.PortFourniConnectionMImpl <em>Port Fourni Connection M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortFourniConnectionMImpl
		 * @see cs.impl.CsPackageImpl#getPortFourniConnectionM()
		 * @generated
		 */
		EClass PORT_FOURNI_CONNECTION_M = eINSTANCE.getPortFourniConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceRequisConnectionMImpl <em>Service Requis Connection M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceRequisConnectionMImpl
		 * @see cs.impl.CsPackageImpl#getServiceRequisConnectionM()
		 * @generated
		 */
		EClass SERVICE_REQUIS_CONNECTION_M = eINSTANCE.getServiceRequisConnectionM();

		/**
		 * The meta object literal for the '<em><b>Reception Requete Serveur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_CONNECTION_M___RECEPTION_REQUETE_SERVEUR = eINSTANCE.getServiceRequisConnectionM__ReceptionRequeteServeur();

		/**
		 * The meta object literal for the '<em><b>Reception Reponse Data Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_CONNECTION_M___RECEPTION_REPONSE_DATA_BASE = eINSTANCE.getServiceRequisConnectionM__ReceptionReponseDataBase();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceFourniConnectionMImpl <em>Service Fourni Connection M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceFourniConnectionMImpl
		 * @see cs.impl.CsPackageImpl#getServiceFourniConnectionM()
		 * @generated
		 */
		EClass SERVICE_FOURNI_CONNECTION_M = eINSTANCE.getServiceFourniConnectionM();

		/**
		 * The meta object literal for the '<em><b>Envoie Reponse Serveur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_CONNECTION_M___ENVOIE_REPONSE_SERVEUR = eINSTANCE.getServiceFourniConnectionM__EnvoieReponseServeur();

		/**
		 * The meta object literal for the '<em><b>Envoie Requete Data Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_CONNECTION_M___ENVOIE_REQUETE_DATA_BASE = eINSTANCE.getServiceFourniConnectionM__EnvoieRequeteDataBase();

		/**
		 * The meta object literal for the '{@link cs.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.DataBaseImpl
		 * @see cs.impl.CsPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Portrequisdatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__PORTREQUISDATABASE = eINSTANCE.getDataBase_Portrequisdatabase();

		/**
		 * The meta object literal for the '<em><b>Portfournidatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__PORTFOURNIDATABASE = eINSTANCE.getDataBase_Portfournidatabase();

		/**
		 * The meta object literal for the '<em><b>Servicerequisdatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__SERVICEREQUISDATABASE = eINSTANCE.getDataBase_Servicerequisdatabase();

		/**
		 * The meta object literal for the '<em><b>Servicefournidatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__SERVICEFOURNIDATABASE = eINSTANCE.getDataBase_Servicefournidatabase();

		/**
		 * The meta object literal for the '{@link cs.impl.PortRequisDataBaseImpl <em>Port Requis Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortRequisDataBaseImpl
		 * @see cs.impl.CsPackageImpl#getPortRequisDataBase()
		 * @generated
		 */
		EClass PORT_REQUIS_DATA_BASE = eINSTANCE.getPortRequisDataBase();

		/**
		 * The meta object literal for the '{@link cs.impl.PortFourniDataBaseImpl <em>Port Fourni Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortFourniDataBaseImpl
		 * @see cs.impl.CsPackageImpl#getPortFourniDataBase()
		 * @generated
		 */
		EClass PORT_FOURNI_DATA_BASE = eINSTANCE.getPortFourniDataBase();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceRequisDataBaseImpl <em>Service Requis Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceRequisDataBaseImpl
		 * @see cs.impl.CsPackageImpl#getServiceRequisDataBase()
		 * @generated
		 */
		EClass SERVICE_REQUIS_DATA_BASE = eINSTANCE.getServiceRequisDataBase();

		/**
		 * The meta object literal for the '<em><b>Reception Requete Connection M</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_DATA_BASE___RECEPTION_REQUETE_CONNECTION_M = eINSTANCE.getServiceRequisDataBase__ReceptionRequeteConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceFourniDataBaseImpl <em>Service Fourni Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceFourniDataBaseImpl
		 * @see cs.impl.CsPackageImpl#getServiceFourniDataBase()
		 * @generated
		 */
		EClass SERVICE_FOURNI_DATA_BASE = eINSTANCE.getServiceFourniDataBase();

		/**
		 * The meta object literal for the '<em><b>Envoie Reponse Connection M</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_DATA_BASE___ENVOIE_REPONSE_CONNECTION_M = eINSTANCE.getServiceFourniDataBase__EnvoieReponseConnectionM();

		/**
		 * The meta object literal for the '{@link cs.impl.SQLqueryImpl <em>SQ Lquery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.SQLqueryImpl
		 * @see cs.impl.CsPackageImpl#getSQLquery()
		 * @generated
		 */
		EClass SQ_LQUERY = eINSTANCE.getSQLquery();

		/**
		 * The meta object literal for the '<em><b>Gluesqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQ_LQUERY__GLUESQLQUERY = eINSTANCE.getSQLquery_Gluesqlquery();

		/**
		 * The meta object literal for the '<em><b>Rolerequiscmsqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQ_LQUERY__ROLEREQUISCMSQLQUERY = eINSTANCE.getSQLquery_Rolerequiscmsqlquery();

		/**
		 * The meta object literal for the '<em><b>Rolerequisdbsqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQ_LQUERY__ROLEREQUISDBSQLQUERY = eINSTANCE.getSQLquery_Rolerequisdbsqlquery();

		/**
		 * The meta object literal for the '<em><b>Rolefournisqlquerycm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQ_LQUERY__ROLEFOURNISQLQUERYCM = eINSTANCE.getSQLquery_Rolefournisqlquerycm();

		/**
		 * The meta object literal for the '<em><b>Rolefournisqlquerydb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQ_LQUERY__ROLEFOURNISQLQUERYDB = eINSTANCE.getSQLquery_Rolefournisqlquerydb();

		/**
		 * The meta object literal for the '<em><b>Transfert Message SQ Lquery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQ_LQUERY___TRANSFERT_MESSAGE_SQ_LQUERY = eINSTANCE.getSQLquery__TransfertMessageSQLquery();

		/**
		 * The meta object literal for the '{@link cs.impl.GlueSQLqueryImpl <em>Glue SQ Lquery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.GlueSQLqueryImpl
		 * @see cs.impl.CsPackageImpl#getGlueSQLquery()
		 * @generated
		 */
		EClass GLUE_SQ_LQUERY = eINSTANCE.getGlueSQLquery();

		/**
		 * The meta object literal for the '<em><b>Match Roles SQ Lquery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GLUE_SQ_LQUERY___MATCH_ROLES_SQ_LQUERY = eINSTANCE.getGlueSQLquery__MatchRolesSQLquery();

		/**
		 * The meta object literal for the '{@link cs.impl.RoleRequisSQLqueryImpl <em>Role Requis SQ Lquery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.RoleRequisSQLqueryImpl
		 * @see cs.impl.CsPackageImpl#getRoleRequisSQLquery()
		 * @generated
		 */
		EClass ROLE_REQUIS_SQ_LQUERY = eINSTANCE.getRoleRequisSQLquery();

		/**
		 * The meta object literal for the '{@link cs.impl.RoleFourniSQLqueryImpl <em>Role Fourni SQ Lquery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.RoleFourniSQLqueryImpl
		 * @see cs.impl.CsPackageImpl#getRoleFourniSQLquery()
		 * @generated
		 */
		EClass ROLE_FOURNI_SQ_LQUERY = eINSTANCE.getRoleFourniSQLquery();

		/**
		 * The meta object literal for the '{@link cs.impl.AttachCONNECTIONsqlImpl <em>Attach CONNECTIO Nsql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.AttachCONNECTIONsqlImpl
		 * @see cs.impl.CsPackageImpl#getAttachCONNECTIONsql()
		 * @generated
		 */
		EClass ATTACH_CONNECTIO_NSQL = eINSTANCE.getAttachCONNECTIONsql();

		/**
		 * The meta object literal for the '<em><b>Portfournicmdatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE = eINSTANCE.getAttachCONNECTIONsql_Portfournicmdatabase();

		/**
		 * The meta object literal for the '<em><b>Rolerequiscmsqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY = eINSTANCE.getAttachCONNECTIONsql_Rolerequiscmsqlquery();

		/**
		 * The meta object literal for the '<em><b>Rolefournisqlquerycm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM = eINSTANCE.getAttachCONNECTIONsql_Rolefournisqlquerycm();

		/**
		 * The meta object literal for the '<em><b>Portrequisdatabasecm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM = eINSTANCE.getAttachCONNECTIONsql_Portrequisdatabasecm();

		/**
		 * The meta object literal for the '{@link cs.impl.AttachDBsqlImpl <em>Attach DBsql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.AttachDBsqlImpl
		 * @see cs.impl.CsPackageImpl#getAttachDBsql()
		 * @generated
		 */
		EClass ATTACH_DBSQL = eINSTANCE.getAttachDBsql();

		/**
		 * The meta object literal for the '<em><b>Rolefournisqlquerydb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_DBSQL__ROLEFOURNISQLQUERYDB = eINSTANCE.getAttachDBsql_Rolefournisqlquerydb();

		/**
		 * The meta object literal for the '<em><b>Portrequisdatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_DBSQL__PORTREQUISDATABASE = eINSTANCE.getAttachDBsql_Portrequisdatabase();

		/**
		 * The meta object literal for the '<em><b>Portfournidatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_DBSQL__PORTFOURNIDATABASE = eINSTANCE.getAttachDBsql_Portfournidatabase();

		/**
		 * The meta object literal for the '<em><b>Rolerequisdbsqlquery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_DBSQL__ROLEREQUISDBSQLQUERY = eINSTANCE.getAttachDBsql_Rolerequisdbsqlquery();

		/**
		 * The meta object literal for the '{@link cs.impl.BindingServeurConnectionMImpl <em>Binding Serveur Connection M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.BindingServeurConnectionMImpl
		 * @see cs.impl.CsPackageImpl#getBindingServeurConnectionM()
		 * @generated
		 */
		EClass BINDING_SERVEUR_CONNECTION_M = eINSTANCE.getBindingServeurConnectionM();

		/**
		 * The meta object literal for the '<em><b>Portrequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR = eINSTANCE.getBindingServeurConnectionM_Portrequisserveur();

		/**
		 * The meta object literal for the '<em><b>Portrequisserveurcm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM = eINSTANCE.getBindingServeurConnectionM_Portrequisserveurcm();

		/**
		 * The meta object literal for the '<em><b>Portfournicmserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR = eINSTANCE.getBindingServeurConnectionM_Portfournicmserveur();

		/**
		 * The meta object literal for the '<em><b>Portfourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR = eINSTANCE.getBindingServeurConnectionM_Portfourniserveur();

		/**
		 * The meta object literal for the '{@link cs.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ClientImpl
		 * @see cs.impl.CsPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Portrequisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTREQUISCLIENT = eINSTANCE.getClient_Portrequisclient();

		/**
		 * The meta object literal for the '<em><b>Portfournisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PORTFOURNISCLIENT = eINSTANCE.getClient_Portfournisclient();

		/**
		 * The meta object literal for the '<em><b>Servicerequisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SERVICEREQUISCLIENT = eINSTANCE.getClient_Servicerequisclient();

		/**
		 * The meta object literal for the '<em><b>Servicefourniclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__SERVICEFOURNICLIENT = eINSTANCE.getClient_Servicefourniclient();

		/**
		 * The meta object literal for the '{@link cs.impl.PortRequisClientImpl <em>Port Requis Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortRequisClientImpl
		 * @see cs.impl.CsPackageImpl#getPortRequisClient()
		 * @generated
		 */
		EClass PORT_REQUIS_CLIENT = eINSTANCE.getPortRequisClient();

		/**
		 * The meta object literal for the '{@link cs.impl.PortFourniClientImpl <em>Port Fourni Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PortFourniClientImpl
		 * @see cs.impl.CsPackageImpl#getPortFourniClient()
		 * @generated
		 */
		EClass PORT_FOURNI_CLIENT = eINSTANCE.getPortFourniClient();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceRequisClientImpl <em>Service Requis Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceRequisClientImpl
		 * @see cs.impl.CsPackageImpl#getServiceRequisClient()
		 * @generated
		 */
		EClass SERVICE_REQUIS_CLIENT = eINSTANCE.getServiceRequisClient();

		/**
		 * The meta object literal for the '<em><b>Reception Requete Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_REQUIS_CLIENT___RECEPTION_REQUETE_CLIENT = eINSTANCE.getServiceRequisClient__ReceptionRequeteClient();

		/**
		 * The meta object literal for the '{@link cs.impl.ServiceFourniClientImpl <em>Service Fourni Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.ServiceFourniClientImpl
		 * @see cs.impl.CsPackageImpl#getServiceFourniClient()
		 * @generated
		 */
		EClass SERVICE_FOURNI_CLIENT = eINSTANCE.getServiceFourniClient();

		/**
		 * The meta object literal for the '<em><b>Envoie Requete Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_FOURNI_CLIENT___ENVOIE_REQUETE_CLIENT = eINSTANCE.getServiceFourniClient__EnvoieRequeteClient();

		/**
		 * The meta object literal for the '{@link cs.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.RPCImpl
		 * @see cs.impl.CsPackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Gluerpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__GLUERPC = eINSTANCE.getRPC_Gluerpc();

		/**
		 * The meta object literal for the '<em><b>Rolerequisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__ROLEREQUISCLIENT = eINSTANCE.getRPC_Rolerequisclient();

		/**
		 * The meta object literal for the '<em><b>Rolerequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__ROLEREQUISSERVEUR = eINSTANCE.getRPC_Rolerequisserveur();

		/**
		 * The meta object literal for the '<em><b>Rolefourniclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__ROLEFOURNICLIENT = eINSTANCE.getRPC_Rolefourniclient();

		/**
		 * The meta object literal for the '<em><b>Rolefourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__ROLEFOURNISERVEUR = eINSTANCE.getRPC_Rolefourniserveur();

		/**
		 * The meta object literal for the '<em><b>Transfert Message RPC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RPC___TRANSFERT_MESSAGE_RPC = eINSTANCE.getRPC__TransfertMessageRPC();

		/**
		 * The meta object literal for the '{@link cs.impl.GlueRPCImpl <em>Glue RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.GlueRPCImpl
		 * @see cs.impl.CsPackageImpl#getGlueRPC()
		 * @generated
		 */
		EClass GLUE_RPC = eINSTANCE.getGlueRPC();

		/**
		 * The meta object literal for the '<em><b>Match Roles RPC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GLUE_RPC___MATCH_ROLES_RPC = eINSTANCE.getGlueRPC__MatchRolesRPC();

		/**
		 * The meta object literal for the '{@link cs.impl.RoleRequisRPCImpl <em>Role Requis RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.RoleRequisRPCImpl
		 * @see cs.impl.CsPackageImpl#getRoleRequisRPC()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC = eINSTANCE.getRoleRequisRPC();

		/**
		 * The meta object literal for the '{@link cs.impl.RoleFourniRPCImpl <em>Role Fourni RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.RoleFourniRPCImpl
		 * @see cs.impl.CsPackageImpl#getRoleFourniRPC()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC = eINSTANCE.getRoleFourniRPC();

		/**
		 * The meta object literal for the '{@link cs.impl.AttachClientrpcImpl <em>Attach Clientrpc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.AttachClientrpcImpl
		 * @see cs.impl.CsPackageImpl#getAttachClientrpc()
		 * @generated
		 */
		EClass ATTACH_CLIENTRPC = eINSTANCE.getAttachClientrpc();

		/**
		 * The meta object literal for the '<em><b>Portrequisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CLIENTRPC__PORTREQUISCLIENT = eINSTANCE.getAttachClientrpc_Portrequisclient();

		/**
		 * The meta object literal for the '<em><b>Rolefourniclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CLIENTRPC__ROLEFOURNICLIENT = eINSTANCE.getAttachClientrpc_Rolefourniclient();

		/**
		 * The meta object literal for the '<em><b>Rolerequisclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CLIENTRPC__ROLEREQUISCLIENT = eINSTANCE.getAttachClientrpc_Rolerequisclient();

		/**
		 * The meta object literal for the '<em><b>Portfourniclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_CLIENTRPC__PORTFOURNICLIENT = eINSTANCE.getAttachClientrpc_Portfourniclient();

		/**
		 * The meta object literal for the '{@link cs.impl.AttachServeurrpcImpl <em>Attach Serveurrpc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.AttachServeurrpcImpl
		 * @see cs.impl.CsPackageImpl#getAttachServeurrpc()
		 * @generated
		 */
		EClass ATTACH_SERVEURRPC = eINSTANCE.getAttachServeurrpc();

		/**
		 * The meta object literal for the '<em><b>Portrequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_SERVEURRPC__PORTREQUISSERVEUR = eINSTANCE.getAttachServeurrpc_Portrequisserveur();

		/**
		 * The meta object literal for the '<em><b>Rolefourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_SERVEURRPC__ROLEFOURNISERVEUR = eINSTANCE.getAttachServeurrpc_Rolefourniserveur();

		/**
		 * The meta object literal for the '<em><b>Rolerequisserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_SERVEURRPC__ROLEREQUISSERVEUR = eINSTANCE.getAttachServeurrpc_Rolerequisserveur();

		/**
		 * The meta object literal for the '<em><b>Portfourniserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_SERVEURRPC__PORTFOURNISERVEUR = eINSTANCE.getAttachServeurrpc_Portfourniserveur();

	}

} //CsPackage
