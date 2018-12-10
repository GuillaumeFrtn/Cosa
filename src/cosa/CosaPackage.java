/**
 */
package cosa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see cosa.CosaFactory
 * @model kind="package"
 * @generated
 */
public interface CosaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cosa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cosa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cosa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CosaPackage eINSTANCE = cosa.impl.CosaPackageImpl.init();

	/**
	 * The meta object id for the '{@link cosa.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ElementImpl
	 * @see cosa.impl.CosaPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ConfigurationImpl
	 * @see cosa.impl.CosaPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NOM = ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Interfaceconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACECONFIG = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecomposant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ECOMPOSANT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Econnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ECONNECTEUR = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ATTACHMENT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BINDING = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.EComposantImpl <em>EComposant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.EComposantImpl
	 * @see cosa.impl.CosaPackageImpl#getEComposant()
	 * @generated
	 */
	int ECOMPOSANT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSANT__NOM = ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Interfacecomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSANT__INTERFACECOMP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EComposant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSANT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EComposant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSANT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.EConnecteurImpl <em>EConnecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.EConnecteurImpl
	 * @see cosa.impl.CosaPackageImpl#getEConnecteur()
	 * @generated
	 */
	int ECONNECTEUR = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTEUR__NOM = ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTEUR__GLUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTEUR__INTERFACECONNECTEUR = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EConnecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTEUR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EConnecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONNECTEUR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.GlueImpl
	 * @see cosa.impl.CosaPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 4;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.InterfaceImpl
	 * @see cosa.impl.CosaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOM_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.InterfaceComposantImpl <em>Interface Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.InterfaceComposantImpl
	 * @see cosa.impl.CosaPackageImpl#getInterfaceComposant()
	 * @generated
	 */
	int INTERFACE_COMPOSANT = 6;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT__NOM_INTERFACE = INTERFACE__NOM_INTERFACE;

	/**
	 * The number of structural features of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANT_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.InterfaceConnecteurImpl <em>Interface Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.InterfaceConnecteurImpl
	 * @see cosa.impl.CosaPackageImpl#getInterfaceConnecteur()
	 * @generated
	 */
	int INTERFACE_CONNECTEUR = 7;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR__NOM_INTERFACE = INTERFACE__NOM_INTERFACE;

	/**
	 * The number of structural features of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTEUR_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.PortImpl
	 * @see cosa.impl.CosaPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 8;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM_INTERFACE = INTERFACE_COMPOSANT__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM_PORT = INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.PortRequisImpl <em>Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.PortRequisImpl
	 * @see cosa.impl.CosaPackageImpl#getPortRequis()
	 * @generated
	 */
	int PORT_REQUIS = 9;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__NOM_INTERFACE = PORT__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__NOM_PORT = PORT__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.PortFourniImpl <em>Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.PortFourniImpl
	 * @see cosa.impl.CosaPackageImpl#getPortFourni()
	 * @generated
	 */
	int PORT_FOURNI = 10;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__NOM_INTERFACE = PORT__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__NOM_PORT = PORT__NOM_PORT;

	/**
	 * The number of structural features of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ServiceImpl
	 * @see cosa.impl.CosaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NOM_INTERFACE = INTERFACE_COMPOSANT__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NOM_SERVICE = INTERFACE_COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ServiceRequisImpl
	 * @see cosa.impl.CosaPackageImpl#getServiceRequis()
	 * @generated
	 */
	int SERVICE_REQUIS = 12;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__NOM_INTERFACE = SERVICE__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__NOM_SERVICE = SERVICE__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.ServiceFourniImpl
	 * @see cosa.impl.CosaPackageImpl#getServiceFourni()
	 * @generated
	 */
	int SERVICE_FOURNI = 13;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__NOM_INTERFACE = SERVICE__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__NOM_SERVICE = SERVICE__NOM_SERVICE;

	/**
	 * The number of structural features of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.RoleImpl
	 * @see cosa.impl.CosaPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 14;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NOM_INTERFACE = INTERFACE_CONNECTEUR__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NOM_ROLE = INTERFACE_CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INTERFACE_CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = INTERFACE_CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.RoleRequisImpl <em>Role Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.RoleRequisImpl
	 * @see cosa.impl.CosaPackageImpl#getRoleRequis()
	 * @generated
	 */
	int ROLE_REQUIS = 15;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__NOM_INTERFACE = ROLE__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__NOM_ROLE = ROLE__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.RoleFourniImpl
	 * @see cosa.impl.CosaPackageImpl#getRoleFourni()
	 * @generated
	 */
	int ROLE_FOURNI = 16;

	/**
	 * The feature id for the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__NOM_INTERFACE = ROLE__NOM_INTERFACE;

	/**
	 * The feature id for the '<em><b>Nom Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__NOM_ROLE = ROLE__NOM_ROLE;

	/**
	 * The number of structural features of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cosa.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.AttachmentImpl
	 * @see cosa.impl.CosaPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 17;

	/**
	 * The feature id for the '<em><b>Interfaceconnecteur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__INTERFACECONNECTEUR = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PORT = 1;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cosa.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cosa.impl.BindingImpl
	 * @see cosa.impl.CosaPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 18;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORT = 0;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cosa.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see cosa.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link cosa.Element#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cosa.Element#getNom()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Nom();

	/**
	 * Returns the meta object for class '{@link cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cosa.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getInterfaceconfig <em>Interfaceconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconfig</em>'.
	 * @see cosa.Configuration#getInterfaceconfig()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interfaceconfig();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see cosa.Configuration#getElement()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getEcomposant <em>Ecomposant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecomposant</em>'.
	 * @see cosa.Configuration#getEcomposant()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Ecomposant();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getEconnecteur <em>Econnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Econnecteur</em>'.
	 * @see cosa.Configuration#getEconnecteur()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Econnecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see cosa.Configuration#getAttachment()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Attachment();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.Configuration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see cosa.Configuration#getBinding()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Binding();

	/**
	 * Returns the meta object for class '{@link cosa.EComposant <em>EComposant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComposant</em>'.
	 * @see cosa.EComposant
	 * @generated
	 */
	EClass getEComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.EComposant#getInterfacecomp <em>Interfacecomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecomp</em>'.
	 * @see cosa.EComposant#getInterfacecomp()
	 * @see #getEComposant()
	 * @generated
	 */
	EReference getEComposant_Interfacecomp();

	/**
	 * Returns the meta object for class '{@link cosa.EConnecteur <em>EConnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EConnecteur</em>'.
	 * @see cosa.EConnecteur
	 * @generated
	 */
	EClass getEConnecteur();

	/**
	 * Returns the meta object for the containment reference '{@link cosa.EConnecteur#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue</em>'.
	 * @see cosa.EConnecteur#getGlue()
	 * @see #getEConnecteur()
	 * @generated
	 */
	EReference getEConnecteur_Glue();

	/**
	 * Returns the meta object for the containment reference list '{@link cosa.EConnecteur#getInterfaceconnecteur <em>Interfaceconnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconnecteur</em>'.
	 * @see cosa.EConnecteur#getInterfaceconnecteur()
	 * @see #getEConnecteur()
	 * @generated
	 */
	EReference getEConnecteur_Interfaceconnecteur();

	/**
	 * Returns the meta object for class '{@link cosa.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see cosa.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for class '{@link cosa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see cosa.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link cosa.Interface#getNomInterface <em>Nom Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Interface</em>'.
	 * @see cosa.Interface#getNomInterface()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_NomInterface();

	/**
	 * Returns the meta object for class '{@link cosa.InterfaceComposant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Composant</em>'.
	 * @see cosa.InterfaceComposant
	 * @generated
	 */
	EClass getInterfaceComposant();

	/**
	 * Returns the meta object for class '{@link cosa.InterfaceConnecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connecteur</em>'.
	 * @see cosa.InterfaceConnecteur
	 * @generated
	 */
	EClass getInterfaceConnecteur();

	/**
	 * Returns the meta object for class '{@link cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cosa.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link cosa.Port#getNomPort <em>Nom Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Port</em>'.
	 * @see cosa.Port#getNomPort()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_NomPort();

	/**
	 * Returns the meta object for class '{@link cosa.PortRequis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis</em>'.
	 * @see cosa.PortRequis
	 * @generated
	 */
	EClass getPortRequis();

	/**
	 * Returns the meta object for class '{@link cosa.PortFourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni</em>'.
	 * @see cosa.PortFourni
	 * @generated
	 */
	EClass getPortFourni();

	/**
	 * Returns the meta object for class '{@link cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see cosa.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link cosa.Service#getNomService <em>Nom Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Service</em>'.
	 * @see cosa.Service#getNomService()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_NomService();

	/**
	 * Returns the meta object for class '{@link cosa.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis</em>'.
	 * @see cosa.ServiceRequis
	 * @generated
	 */
	EClass getServiceRequis();

	/**
	 * Returns the meta object for class '{@link cosa.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni</em>'.
	 * @see cosa.ServiceFourni
	 * @generated
	 */
	EClass getServiceFourni();

	/**
	 * Returns the meta object for class '{@link cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cosa.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link cosa.Role#getNomRole <em>Nom Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Role</em>'.
	 * @see cosa.Role#getNomRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_NomRole();

	/**
	 * Returns the meta object for class '{@link cosa.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis</em>'.
	 * @see cosa.RoleRequis
	 * @generated
	 */
	EClass getRoleRequis();

	/**
	 * Returns the meta object for class '{@link cosa.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni</em>'.
	 * @see cosa.RoleFourni
	 * @generated
	 */
	EClass getRoleFourni();

	/**
	 * Returns the meta object for class '{@link cosa.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see cosa.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference list '{@link cosa.Attachment#getInterfaceconnecteur <em>Interfaceconnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaceconnecteur</em>'.
	 * @see cosa.Attachment#getInterfaceconnecteur()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Interfaceconnecteur();

	/**
	 * Returns the meta object for the reference list '{@link cosa.Attachment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see cosa.Attachment#getPort()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Port();

	/**
	 * Returns the meta object for class '{@link cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see cosa.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference list '{@link cosa.Binding#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see cosa.Binding#getPort()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CosaFactory getCosaFactory();

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
		 * The meta object literal for the '{@link cosa.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ElementImpl
		 * @see cosa.impl.CosaPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NOM = eINSTANCE.getElement_Nom();

		/**
		 * The meta object literal for the '{@link cosa.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ConfigurationImpl
		 * @see cosa.impl.CosaPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Interfaceconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACECONFIG = eINSTANCE.getConfiguration_Interfaceconfig();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ELEMENT = eINSTANCE.getConfiguration_Element();

		/**
		 * The meta object literal for the '<em><b>Ecomposant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ECOMPOSANT = eINSTANCE.getConfiguration_Ecomposant();

		/**
		 * The meta object literal for the '<em><b>Econnecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ECONNECTEUR = eINSTANCE.getConfiguration_Econnecteur();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ATTACHMENT = eINSTANCE.getConfiguration_Attachment();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BINDING = eINSTANCE.getConfiguration_Binding();

		/**
		 * The meta object literal for the '{@link cosa.impl.EComposantImpl <em>EComposant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.EComposantImpl
		 * @see cosa.impl.CosaPackageImpl#getEComposant()
		 * @generated
		 */
		EClass ECOMPOSANT = eINSTANCE.getEComposant();

		/**
		 * The meta object literal for the '<em><b>Interfacecomp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPOSANT__INTERFACECOMP = eINSTANCE.getEComposant_Interfacecomp();

		/**
		 * The meta object literal for the '{@link cosa.impl.EConnecteurImpl <em>EConnecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.EConnecteurImpl
		 * @see cosa.impl.CosaPackageImpl#getEConnecteur()
		 * @generated
		 */
		EClass ECONNECTEUR = eINSTANCE.getEConnecteur();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONNECTEUR__GLUE = eINSTANCE.getEConnecteur_Glue();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONNECTEUR__INTERFACECONNECTEUR = eINSTANCE.getEConnecteur_Interfaceconnecteur();

		/**
		 * The meta object literal for the '{@link cosa.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.GlueImpl
		 * @see cosa.impl.CosaPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '{@link cosa.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.InterfaceImpl
		 * @see cosa.impl.CosaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Nom Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NOM_INTERFACE = eINSTANCE.getInterface_NomInterface();

		/**
		 * The meta object literal for the '{@link cosa.impl.InterfaceComposantImpl <em>Interface Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.InterfaceComposantImpl
		 * @see cosa.impl.CosaPackageImpl#getInterfaceComposant()
		 * @generated
		 */
		EClass INTERFACE_COMPOSANT = eINSTANCE.getInterfaceComposant();

		/**
		 * The meta object literal for the '{@link cosa.impl.InterfaceConnecteurImpl <em>Interface Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.InterfaceConnecteurImpl
		 * @see cosa.impl.CosaPackageImpl#getInterfaceConnecteur()
		 * @generated
		 */
		EClass INTERFACE_CONNECTEUR = eINSTANCE.getInterfaceConnecteur();

		/**
		 * The meta object literal for the '{@link cosa.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.PortImpl
		 * @see cosa.impl.CosaPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Nom Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NOM_PORT = eINSTANCE.getPort_NomPort();

		/**
		 * The meta object literal for the '{@link cosa.impl.PortRequisImpl <em>Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.PortRequisImpl
		 * @see cosa.impl.CosaPackageImpl#getPortRequis()
		 * @generated
		 */
		EClass PORT_REQUIS = eINSTANCE.getPortRequis();

		/**
		 * The meta object literal for the '{@link cosa.impl.PortFourniImpl <em>Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.PortFourniImpl
		 * @see cosa.impl.CosaPackageImpl#getPortFourni()
		 * @generated
		 */
		EClass PORT_FOURNI = eINSTANCE.getPortFourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ServiceImpl
		 * @see cosa.impl.CosaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Nom Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NOM_SERVICE = eINSTANCE.getService_NomService();

		/**
		 * The meta object literal for the '{@link cosa.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ServiceRequisImpl
		 * @see cosa.impl.CosaPackageImpl#getServiceRequis()
		 * @generated
		 */
		EClass SERVICE_REQUIS = eINSTANCE.getServiceRequis();

		/**
		 * The meta object literal for the '{@link cosa.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.ServiceFourniImpl
		 * @see cosa.impl.CosaPackageImpl#getServiceFourni()
		 * @generated
		 */
		EClass SERVICE_FOURNI = eINSTANCE.getServiceFourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.RoleImpl
		 * @see cosa.impl.CosaPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Nom Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NOM_ROLE = eINSTANCE.getRole_NomRole();

		/**
		 * The meta object literal for the '{@link cosa.impl.RoleRequisImpl <em>Role Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.RoleRequisImpl
		 * @see cosa.impl.CosaPackageImpl#getRoleRequis()
		 * @generated
		 */
		EClass ROLE_REQUIS = eINSTANCE.getRoleRequis();

		/**
		 * The meta object literal for the '{@link cosa.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.RoleFourniImpl
		 * @see cosa.impl.CosaPackageImpl#getRoleFourni()
		 * @generated
		 */
		EClass ROLE_FOURNI = eINSTANCE.getRoleFourni();

		/**
		 * The meta object literal for the '{@link cosa.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.AttachmentImpl
		 * @see cosa.impl.CosaPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnecteur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__INTERFACECONNECTEUR = eINSTANCE.getAttachment_Interfaceconnecteur();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PORT = eINSTANCE.getAttachment_Port();

		/**
		 * The meta object literal for the '{@link cosa.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cosa.impl.BindingImpl
		 * @see cosa.impl.CosaPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORT = eINSTANCE.getBinding_Port();

	}

} //CosaPackage
