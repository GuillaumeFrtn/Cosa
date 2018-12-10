/**
 */
package cs.util;

import cosa.Attachment;
import cosa.Binding;
import cosa.Configuration;
import cosa.EComposant;
import cosa.EConnecteur;
import cosa.Element;
import cosa.Glue;
import cosa.Interface;
import cosa.InterfaceComposant;
import cosa.InterfaceConnecteur;
import cosa.Port;
import cosa.PortFourni;
import cosa.PortRequis;
import cosa.Role;
import cosa.RoleFourni;
import cosa.RoleRequis;
import cosa.Service;
import cosa.ServiceFourni;
import cosa.ServiceRequis;

import cs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public class CsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsSwitch<Adapter> modelSwitch =
		new CsSwitch<Adapter>() {
			@Override
			public Adapter caseServeur(Serveur object) {
				return createServeurAdapter();
			}
			@Override
			public Adapter casePortRequisServeur(PortRequisServeur object) {
				return createPortRequisServeurAdapter();
			}
			@Override
			public Adapter casePortFourniServeur(PortFourniServeur object) {
				return createPortFourniServeurAdapter();
			}
			@Override
			public Adapter caseServiceRequisServeur(ServiceRequisServeur object) {
				return createServiceRequisServeurAdapter();
			}
			@Override
			public Adapter caseServiceFourniServeur(ServiceFourniServeur object) {
				return createServiceFourniServeurAdapter();
			}
			@Override
			public Adapter caseConnectionManager(ConnectionManager object) {
				return createConnectionManagerAdapter();
			}
			@Override
			public Adapter casePortRequisConnectionM(PortRequisConnectionM object) {
				return createPortRequisConnectionMAdapter();
			}
			@Override
			public Adapter casePortFourniConnectionM(PortFourniConnectionM object) {
				return createPortFourniConnectionMAdapter();
			}
			@Override
			public Adapter caseServiceRequisConnectionM(ServiceRequisConnectionM object) {
				return createServiceRequisConnectionMAdapter();
			}
			@Override
			public Adapter caseServiceFourniConnectionM(ServiceFourniConnectionM object) {
				return createServiceFourniConnectionMAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter casePortRequisDataBase(PortRequisDataBase object) {
				return createPortRequisDataBaseAdapter();
			}
			@Override
			public Adapter casePortFourniDataBase(PortFourniDataBase object) {
				return createPortFourniDataBaseAdapter();
			}
			@Override
			public Adapter caseServiceRequisDataBase(ServiceRequisDataBase object) {
				return createServiceRequisDataBaseAdapter();
			}
			@Override
			public Adapter caseServiceFourniDataBase(ServiceFourniDataBase object) {
				return createServiceFourniDataBaseAdapter();
			}
			@Override
			public Adapter caseSQLquery(SQLquery object) {
				return createSQLqueryAdapter();
			}
			@Override
			public Adapter caseGlueSQLquery(GlueSQLquery object) {
				return createGlueSQLqueryAdapter();
			}
			@Override
			public Adapter caseRoleRequisSQLquery(RoleRequisSQLquery object) {
				return createRoleRequisSQLqueryAdapter();
			}
			@Override
			public Adapter caseRoleFourniSQLquery(RoleFourniSQLquery object) {
				return createRoleFourniSQLqueryAdapter();
			}
			@Override
			public Adapter caseAttachCONNECTIONsql(AttachCONNECTIONsql object) {
				return createAttachCONNECTIONsqlAdapter();
			}
			@Override
			public Adapter caseAttachDBsql(AttachDBsql object) {
				return createAttachDBsqlAdapter();
			}
			@Override
			public Adapter caseBindingServeurConnectionM(BindingServeurConnectionM object) {
				return createBindingServeurConnectionMAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter casePortRequisClient(PortRequisClient object) {
				return createPortRequisClientAdapter();
			}
			@Override
			public Adapter casePortFourniClient(PortFourniClient object) {
				return createPortFourniClientAdapter();
			}
			@Override
			public Adapter caseServiceRequisClient(ServiceRequisClient object) {
				return createServiceRequisClientAdapter();
			}
			@Override
			public Adapter caseServiceFourniClient(ServiceFourniClient object) {
				return createServiceFourniClientAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseGlueRPC(GlueRPC object) {
				return createGlueRPCAdapter();
			}
			@Override
			public Adapter caseRoleRequisRPC(RoleRequisRPC object) {
				return createRoleRequisRPCAdapter();
			}
			@Override
			public Adapter caseRoleFourniRPC(RoleFourniRPC object) {
				return createRoleFourniRPCAdapter();
			}
			@Override
			public Adapter caseAttachClientrpc(AttachClientrpc object) {
				return createAttachClientrpcAdapter();
			}
			@Override
			public Adapter caseAttachServeurrpc(AttachServeurrpc object) {
				return createAttachServeurrpcAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceComposant(InterfaceComposant object) {
				return createInterfaceComposantAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortRequis(PortRequis object) {
				return createPortRequisAdapter();
			}
			@Override
			public Adapter casePortFourni(PortFourni object) {
				return createPortFourniAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceRequis(ServiceRequis object) {
				return createServiceRequisAdapter();
			}
			@Override
			public Adapter caseServiceFourni(ServiceFourni object) {
				return createServiceFourniAdapter();
			}
			@Override
			public Adapter caseEComposant(EComposant object) {
				return createEComposantAdapter();
			}
			@Override
			public Adapter caseEConnecteur(EConnecteur object) {
				return createEConnecteurAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseInterfaceConnecteur(InterfaceConnecteur object) {
				return createInterfaceConnecteurAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleRequis(RoleRequis object) {
				return createRoleRequisAdapter();
			}
			@Override
			public Adapter caseRoleFourni(RoleFourni object) {
				return createRoleFourniAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cs.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.Serveur
	 * @generated
	 */
	public Adapter createServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortRequisServeur <em>Port Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortRequisServeur
	 * @generated
	 */
	public Adapter createPortRequisServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortFourniServeur <em>Port Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortFourniServeur
	 * @generated
	 */
	public Adapter createPortFourniServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceRequisServeur <em>Service Requis Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceRequisServeur
	 * @generated
	 */
	public Adapter createServiceRequisServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceFourniServeur <em>Service Fourni Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceFourniServeur
	 * @generated
	 */
	public Adapter createServiceFourniServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ConnectionManager
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortRequisConnectionM <em>Port Requis Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortRequisConnectionM
	 * @generated
	 */
	public Adapter createPortRequisConnectionMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortFourniConnectionM <em>Port Fourni Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortFourniConnectionM
	 * @generated
	 */
	public Adapter createPortFourniConnectionMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceRequisConnectionM <em>Service Requis Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceRequisConnectionM
	 * @generated
	 */
	public Adapter createServiceRequisConnectionMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceFourniConnectionM <em>Service Fourni Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceFourniConnectionM
	 * @generated
	 */
	public Adapter createServiceFourniConnectionMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortRequisDataBase <em>Port Requis Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortRequisDataBase
	 * @generated
	 */
	public Adapter createPortRequisDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortFourniDataBase <em>Port Fourni Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortFourniDataBase
	 * @generated
	 */
	public Adapter createPortFourniDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceRequisDataBase <em>Service Requis Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceRequisDataBase
	 * @generated
	 */
	public Adapter createServiceRequisDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceFourniDataBase <em>Service Fourni Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceFourniDataBase
	 * @generated
	 */
	public Adapter createServiceFourniDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.SQLquery <em>SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.SQLquery
	 * @generated
	 */
	public Adapter createSQLqueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.GlueSQLquery <em>Glue SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.GlueSQLquery
	 * @generated
	 */
	public Adapter createGlueSQLqueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.RoleRequisSQLquery <em>Role Requis SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.RoleRequisSQLquery
	 * @generated
	 */
	public Adapter createRoleRequisSQLqueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.RoleFourniSQLquery <em>Role Fourni SQ Lquery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.RoleFourniSQLquery
	 * @generated
	 */
	public Adapter createRoleFourniSQLqueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.AttachCONNECTIONsql <em>Attach CONNECTIO Nsql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.AttachCONNECTIONsql
	 * @generated
	 */
	public Adapter createAttachCONNECTIONsqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.AttachDBsql <em>Attach DBsql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.AttachDBsql
	 * @generated
	 */
	public Adapter createAttachDBsqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.BindingServeurConnectionM <em>Binding Serveur Connection M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.BindingServeurConnectionM
	 * @generated
	 */
	public Adapter createBindingServeurConnectionMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortRequisClient <em>Port Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortRequisClient
	 * @generated
	 */
	public Adapter createPortRequisClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.PortFourniClient <em>Port Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.PortFourniClient
	 * @generated
	 */
	public Adapter createPortFourniClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceRequisClient <em>Service Requis Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceRequisClient
	 * @generated
	 */
	public Adapter createServiceRequisClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.ServiceFourniClient <em>Service Fourni Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.ServiceFourniClient
	 * @generated
	 */
	public Adapter createServiceFourniClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.GlueRPC <em>Glue RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.GlueRPC
	 * @generated
	 */
	public Adapter createGlueRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.RoleRequisRPC <em>Role Requis RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.RoleRequisRPC
	 * @generated
	 */
	public Adapter createRoleRequisRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.RoleFourniRPC <em>Role Fourni RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.RoleFourniRPC
	 * @generated
	 */
	public Adapter createRoleFourniRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.AttachClientrpc <em>Attach Clientrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.AttachClientrpc
	 * @generated
	 */
	public Adapter createAttachClientrpcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cs.AttachServeurrpc <em>Attach Serveurrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cs.AttachServeurrpc
	 * @generated
	 */
	public Adapter createAttachServeurrpcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.InterfaceComposant <em>Interface Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.InterfaceComposant
	 * @generated
	 */
	public Adapter createInterfaceComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.PortRequis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.PortRequis
	 * @generated
	 */
	public Adapter createPortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.PortFourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.PortFourni
	 * @generated
	 */
	public Adapter createPortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ServiceRequis
	 * @generated
	 */
	public Adapter createServiceRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.ServiceFourni
	 * @generated
	 */
	public Adapter createServiceFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.EComposant <em>EComposant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.EComposant
	 * @generated
	 */
	public Adapter createEComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.EConnecteur <em>EConnecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.EConnecteur
	 * @generated
	 */
	public Adapter createEConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.InterfaceConnecteur <em>Interface Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.InterfaceConnecteur
	 * @generated
	 */
	public Adapter createInterfaceConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.RoleRequis
	 * @generated
	 */
	public Adapter createRoleRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.RoleFourni
	 * @generated
	 */
	public Adapter createRoleFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cosa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cosa.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CsAdapterFactory
