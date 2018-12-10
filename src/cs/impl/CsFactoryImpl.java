/**
 */
package cs.impl;

import cs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory(CsPackage.eNS_URI);
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CsPackage.SERVEUR: return createServeur();
			case CsPackage.PORT_REQUIS_SERVEUR: return createPortRequisServeur();
			case CsPackage.PORT_FOURNI_SERVEUR: return createPortFourniServeur();
			case CsPackage.SERVICE_REQUIS_SERVEUR: return createServiceRequisServeur();
			case CsPackage.SERVICE_FOURNI_SERVEUR: return createServiceFourniServeur();
			case CsPackage.CONNECTION_MANAGER: return createConnectionManager();
			case CsPackage.PORT_REQUIS_CONNECTION_M: return createPortRequisConnectionM();
			case CsPackage.PORT_FOURNI_CONNECTION_M: return createPortFourniConnectionM();
			case CsPackage.SERVICE_REQUIS_CONNECTION_M: return createServiceRequisConnectionM();
			case CsPackage.SERVICE_FOURNI_CONNECTION_M: return createServiceFourniConnectionM();
			case CsPackage.DATA_BASE: return createDataBase();
			case CsPackage.PORT_REQUIS_DATA_BASE: return createPortRequisDataBase();
			case CsPackage.PORT_FOURNI_DATA_BASE: return createPortFourniDataBase();
			case CsPackage.SERVICE_REQUIS_DATA_BASE: return createServiceRequisDataBase();
			case CsPackage.SERVICE_FOURNI_DATA_BASE: return createServiceFourniDataBase();
			case CsPackage.SQ_LQUERY: return createSQLquery();
			case CsPackage.GLUE_SQ_LQUERY: return createGlueSQLquery();
			case CsPackage.ROLE_REQUIS_SQ_LQUERY: return createRoleRequisSQLquery();
			case CsPackage.ROLE_FOURNI_SQ_LQUERY: return createRoleFourniSQLquery();
			case CsPackage.ATTACH_CONNECTIO_NSQL: return createAttachCONNECTIONsql();
			case CsPackage.ATTACH_DBSQL: return createAttachDBsql();
			case CsPackage.BINDING_SERVEUR_CONNECTION_M: return createBindingServeurConnectionM();
			case CsPackage.CLIENT: return createClient();
			case CsPackage.PORT_REQUIS_CLIENT: return createPortRequisClient();
			case CsPackage.PORT_FOURNI_CLIENT: return createPortFourniClient();
			case CsPackage.SERVICE_REQUIS_CLIENT: return createServiceRequisClient();
			case CsPackage.SERVICE_FOURNI_CLIENT: return createServiceFourniClient();
			case CsPackage.RPC: return createRPC();
			case CsPackage.GLUE_RPC: return createGlueRPC();
			case CsPackage.ROLE_REQUIS_RPC: return createRoleRequisRPC();
			case CsPackage.ROLE_FOURNI_RPC: return createRoleFourniRPC();
			case CsPackage.ATTACH_CLIENTRPC: return createAttachClientrpc();
			case CsPackage.ATTACH_SERVEURRPC: return createAttachServeurrpc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur createServeur() {
		ServeurImpl serveur = new ServeurImpl();
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisServeur createPortRequisServeur() {
		PortRequisServeurImpl portRequisServeur = new PortRequisServeurImpl();
		return portRequisServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniServeur createPortFourniServeur() {
		PortFourniServeurImpl portFourniServeur = new PortFourniServeurImpl();
		return portFourniServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisServeur createServiceRequisServeur() {
		ServiceRequisServeurImpl serviceRequisServeur = new ServiceRequisServeurImpl();
		return serviceRequisServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniServeur createServiceFourniServeur() {
		ServiceFourniServeurImpl serviceFourniServeur = new ServiceFourniServeurImpl();
		return serviceFourniServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConnectionM createPortRequisConnectionM() {
		PortRequisConnectionMImpl portRequisConnectionM = new PortRequisConnectionMImpl();
		return portRequisConnectionM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConnectionM createPortFourniConnectionM() {
		PortFourniConnectionMImpl portFourniConnectionM = new PortFourniConnectionMImpl();
		return portFourniConnectionM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisConnectionM createServiceRequisConnectionM() {
		ServiceRequisConnectionMImpl serviceRequisConnectionM = new ServiceRequisConnectionMImpl();
		return serviceRequisConnectionM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniConnectionM createServiceFourniConnectionM() {
		ServiceFourniConnectionMImpl serviceFourniConnectionM = new ServiceFourniConnectionMImpl();
		return serviceFourniConnectionM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisDataBase createPortRequisDataBase() {
		PortRequisDataBaseImpl portRequisDataBase = new PortRequisDataBaseImpl();
		return portRequisDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniDataBase createPortFourniDataBase() {
		PortFourniDataBaseImpl portFourniDataBase = new PortFourniDataBaseImpl();
		return portFourniDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisDataBase createServiceRequisDataBase() {
		ServiceRequisDataBaseImpl serviceRequisDataBase = new ServiceRequisDataBaseImpl();
		return serviceRequisDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniDataBase createServiceFourniDataBase() {
		ServiceFourniDataBaseImpl serviceFourniDataBase = new ServiceFourniDataBaseImpl();
		return serviceFourniDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLquery createSQLquery() {
		SQLqueryImpl sqLquery = new SQLqueryImpl();
		return sqLquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueSQLquery createGlueSQLquery() {
		GlueSQLqueryImpl glueSQLquery = new GlueSQLqueryImpl();
		return glueSQLquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisSQLquery createRoleRequisSQLquery() {
		RoleRequisSQLqueryImpl roleRequisSQLquery = new RoleRequisSQLqueryImpl();
		return roleRequisSQLquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery createRoleFourniSQLquery() {
		RoleFourniSQLqueryImpl roleFourniSQLquery = new RoleFourniSQLqueryImpl();
		return roleFourniSQLquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachCONNECTIONsql createAttachCONNECTIONsql() {
		AttachCONNECTIONsqlImpl attachCONNECTIONsql = new AttachCONNECTIONsqlImpl();
		return attachCONNECTIONsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachDBsql createAttachDBsql() {
		AttachDBsqlImpl attachDBsql = new AttachDBsqlImpl();
		return attachDBsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeurConnectionM createBindingServeurConnectionM() {
		BindingServeurConnectionMImpl bindingServeurConnectionM = new BindingServeurConnectionMImpl();
		return bindingServeurConnectionM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisClient createPortRequisClient() {
		PortRequisClientImpl portRequisClient = new PortRequisClientImpl();
		return portRequisClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniClient createPortFourniClient() {
		PortFourniClientImpl portFourniClient = new PortFourniClientImpl();
		return portFourniClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisClient createServiceRequisClient() {
		ServiceRequisClientImpl serviceRequisClient = new ServiceRequisClientImpl();
		return serviceRequisClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniClient createServiceFourniClient() {
		ServiceFourniClientImpl serviceFourniClient = new ServiceFourniClientImpl();
		return serviceFourniClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueRPC createGlueRPC() {
		GlueRPCImpl glueRPC = new GlueRPCImpl();
		return glueRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC createRoleRequisRPC() {
		RoleRequisRPCImpl roleRequisRPC = new RoleRequisRPCImpl();
		return roleRequisRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC createRoleFourniRPC() {
		RoleFourniRPCImpl roleFourniRPC = new RoleFourniRPCImpl();
		return roleFourniRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachClientrpc createAttachClientrpc() {
		AttachClientrpcImpl attachClientrpc = new AttachClientrpcImpl();
		return attachClientrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachServeurrpc createAttachServeurrpc() {
		AttachServeurrpcImpl attachServeurrpc = new AttachServeurrpcImpl();
		return attachServeurrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
