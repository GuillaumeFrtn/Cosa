/**
 */
package cs.impl;

import cosa.CosaPackage;

import cosa.impl.CosaPackageImpl;

import cs.AttachCONNECTIONsql;
import cs.AttachClientrpc;
import cs.AttachDBsql;
import cs.AttachServeurrpc;
import cs.BindingServeurConnectionM;
import cs.Client;
import cs.ConnectionManager;
import cs.CsFactory;
import cs.CsPackage;
import cs.DataBase;
import cs.GlueRPC;
import cs.GlueSQLquery;
import cs.PortFourniClient;
import cs.PortFourniConnectionM;
import cs.PortFourniDataBase;
import cs.PortFourniServeur;
import cs.PortRequisClient;
import cs.PortRequisConnectionM;
import cs.PortRequisDataBase;
import cs.PortRequisServeur;
import cs.RoleFourniRPC;
import cs.RoleFourniSQLquery;
import cs.RoleRequisRPC;
import cs.RoleRequisSQLquery;
import cs.SQLquery;
import cs.Serveur;
import cs.ServiceFourniClient;
import cs.ServiceFourniConnectionM;
import cs.ServiceFourniDataBase;
import cs.ServiceFourniServeur;
import cs.ServiceRequisClient;
import cs.ServiceRequisConnectionM;
import cs.ServiceRequisDataBase;
import cs.ServiceRequisServeur;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisConnectionMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniConnectionMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisConnectionMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniConnectionMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisDataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniDataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisDataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniDataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqLqueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueSQLqueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequisSQLqueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFourniSQLqueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachCONNECTIONsqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachDBsqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingServeurConnectionMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequisRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFourniRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachClientrpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachServeurrpcEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CsPackageImpl theCsPackage = registeredCsPackage instanceof CsPackageImpl ? (CsPackageImpl)registeredCsPackage : new CsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI);
		CosaPackageImpl theCosaPackage = (CosaPackageImpl)(registeredPackage instanceof CosaPackageImpl ? registeredPackage : CosaPackage.eINSTANCE);

		// Create package meta-data objects
		theCsPackage.createPackageContents();
		theCosaPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();
		theCosaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeur() {
		return serveurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Portrequisserveur() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Portfourniserveur() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Servicerequisserveur() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Servicefourniserveur() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Connectionmanager() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Database() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Sqlquery() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Attachconnectionsql() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Attachdbsql() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeur_Bindingserveurconnectionm() {
		return (EReference)serveurEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequisServeur() {
		return portRequisServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFourniServeur() {
		return portFourniServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequisServeur() {
		return serviceRequisServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisServeur__ReceptionRequeteClient() {
		return serviceRequisServeurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisServeur__ReceptionReponseConnectionM() {
		return serviceRequisServeurEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFourniServeur() {
		return serviceFourniServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniServeur__EnvoieReponseClient() {
		return serviceFourniServeurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniServeur__EnvoieRequeteConnectionM() {
		return serviceFourniServeurEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portrequisserveurcm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portrequisdatabasecm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portfournicmserveur() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Portfournicmdatabase() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Servicerequisconnectionm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Servicefourniconnectionm() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequisConnectionM() {
		return portRequisConnectionMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFourniConnectionM() {
		return portFourniConnectionMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequisConnectionM() {
		return serviceRequisConnectionMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisConnectionM__ReceptionRequeteServeur() {
		return serviceRequisConnectionMEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisConnectionM__ReceptionReponseDataBase() {
		return serviceRequisConnectionMEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFourniConnectionM() {
		return serviceFourniConnectionMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniConnectionM__EnvoieReponseServeur() {
		return serviceFourniConnectionMEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniConnectionM__EnvoieRequeteDataBase() {
		return serviceFourniConnectionMEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Portrequisdatabase() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Portfournidatabase() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Servicerequisdatabase() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBase_Servicefournidatabase() {
		return (EReference)dataBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequisDataBase() {
		return portRequisDataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFourniDataBase() {
		return portFourniDataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequisDataBase() {
		return serviceRequisDataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisDataBase__ReceptionRequeteConnectionM() {
		return serviceRequisDataBaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFourniDataBase() {
		return serviceFourniDataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniDataBase__EnvoieReponseConnectionM() {
		return serviceFourniDataBaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLquery() {
		return sqLqueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLquery_Gluesqlquery() {
		return (EReference)sqLqueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLquery_Rolerequiscmsqlquery() {
		return (EReference)sqLqueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLquery_Rolerequisdbsqlquery() {
		return (EReference)sqLqueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLquery_Rolefournisqlquerycm() {
		return (EReference)sqLqueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLquery_Rolefournisqlquerydb() {
		return (EReference)sqLqueryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSQLquery__TransfertMessageSQLquery() {
		return sqLqueryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueSQLquery() {
		return glueSQLqueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlueSQLquery__MatchRolesSQLquery() {
		return glueSQLqueryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequisSQLquery() {
		return roleRequisSQLqueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFourniSQLquery() {
		return roleFourniSQLqueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachCONNECTIONsql() {
		return attachCONNECTIONsqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachCONNECTIONsql_Portfournicmdatabase() {
		return (EReference)attachCONNECTIONsqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachCONNECTIONsql_Rolerequiscmsqlquery() {
		return (EReference)attachCONNECTIONsqlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachCONNECTIONsql_Rolefournisqlquerycm() {
		return (EReference)attachCONNECTIONsqlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachCONNECTIONsql_Portrequisdatabasecm() {
		return (EReference)attachCONNECTIONsqlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachDBsql() {
		return attachDBsqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachDBsql_Rolefournisqlquerydb() {
		return (EReference)attachDBsqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachDBsql_Portrequisdatabase() {
		return (EReference)attachDBsqlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachDBsql_Portfournidatabase() {
		return (EReference)attachDBsqlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachDBsql_Rolerequisdbsqlquery() {
		return (EReference)attachDBsqlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingServeurConnectionM() {
		return bindingServeurConnectionMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServeurConnectionM_Portrequisserveur() {
		return (EReference)bindingServeurConnectionMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServeurConnectionM_Portrequisserveurcm() {
		return (EReference)bindingServeurConnectionMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServeurConnectionM_Portfournicmserveur() {
		return (EReference)bindingServeurConnectionMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingServeurConnectionM_Portfourniserveur() {
		return (EReference)bindingServeurConnectionMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portrequisclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Portfournisclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Servicerequisclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Servicefourniclient() {
		return (EReference)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequisClient() {
		return portRequisClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFourniClient() {
		return portFourniClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRequisClient() {
		return serviceRequisClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceRequisClient__ReceptionRequeteClient() {
		return serviceRequisClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFourniClient() {
		return serviceFourniClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceFourniClient__EnvoieRequeteClient() {
		return serviceFourniClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Gluerpc() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Rolerequisclient() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Rolerequisserveur() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Rolefourniclient() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Rolefourniserveur() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRPC__TransfertMessageRPC() {
		return rpcEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueRPC() {
		return glueRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlueRPC__MatchRolesRPC() {
		return glueRPCEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequisRPC() {
		return roleRequisRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFourniRPC() {
		return roleFourniRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachClientrpc() {
		return attachClientrpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachClientrpc_Portrequisclient() {
		return (EReference)attachClientrpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachClientrpc_Rolefourniclient() {
		return (EReference)attachClientrpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachClientrpc_Rolerequisclient() {
		return (EReference)attachClientrpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachClientrpc_Portfourniclient() {
		return (EReference)attachClientrpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachServeurrpc() {
		return attachServeurrpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachServeurrpc_Portrequisserveur() {
		return (EReference)attachServeurrpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachServeurrpc_Rolefourniserveur() {
		return (EReference)attachServeurrpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachServeurrpc_Rolerequisserveur() {
		return (EReference)attachServeurrpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachServeurrpc_Portfourniserveur() {
		return (EReference)attachServeurrpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serveurEClass = createEClass(SERVEUR);
		createEReference(serveurEClass, SERVEUR__PORTREQUISSERVEUR);
		createEReference(serveurEClass, SERVEUR__PORTFOURNISERVEUR);
		createEReference(serveurEClass, SERVEUR__SERVICEREQUISSERVEUR);
		createEReference(serveurEClass, SERVEUR__SERVICEFOURNISERVEUR);
		createEReference(serveurEClass, SERVEUR__CONNECTIONMANAGER);
		createEReference(serveurEClass, SERVEUR__DATABASE);
		createEReference(serveurEClass, SERVEUR__SQLQUERY);
		createEReference(serveurEClass, SERVEUR__ATTACHCONNECTIONSQL);
		createEReference(serveurEClass, SERVEUR__ATTACHDBSQL);
		createEReference(serveurEClass, SERVEUR__BINDINGSERVEURCONNECTIONM);

		portRequisServeurEClass = createEClass(PORT_REQUIS_SERVEUR);

		portFourniServeurEClass = createEClass(PORT_FOURNI_SERVEUR);

		serviceRequisServeurEClass = createEClass(SERVICE_REQUIS_SERVEUR);
		createEOperation(serviceRequisServeurEClass, SERVICE_REQUIS_SERVEUR___RECEPTION_REQUETE_CLIENT);
		createEOperation(serviceRequisServeurEClass, SERVICE_REQUIS_SERVEUR___RECEPTION_REPONSE_CONNECTION_M);

		serviceFourniServeurEClass = createEClass(SERVICE_FOURNI_SERVEUR);
		createEOperation(serviceFourniServeurEClass, SERVICE_FOURNI_SERVEUR___ENVOIE_REPONSE_CLIENT);
		createEOperation(serviceFourniServeurEClass, SERVICE_FOURNI_SERVEUR___ENVOIE_REQUETE_CONNECTION_M);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTREQUISSERVEURCM);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTREQUISDATABASECM);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTFOURNICMSERVEUR);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__PORTFOURNICMDATABASE);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__SERVICEREQUISCONNECTIONM);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__SERVICEFOURNICONNECTIONM);

		portRequisConnectionMEClass = createEClass(PORT_REQUIS_CONNECTION_M);

		portFourniConnectionMEClass = createEClass(PORT_FOURNI_CONNECTION_M);

		serviceRequisConnectionMEClass = createEClass(SERVICE_REQUIS_CONNECTION_M);
		createEOperation(serviceRequisConnectionMEClass, SERVICE_REQUIS_CONNECTION_M___RECEPTION_REQUETE_SERVEUR);
		createEOperation(serviceRequisConnectionMEClass, SERVICE_REQUIS_CONNECTION_M___RECEPTION_REPONSE_DATA_BASE);

		serviceFourniConnectionMEClass = createEClass(SERVICE_FOURNI_CONNECTION_M);
		createEOperation(serviceFourniConnectionMEClass, SERVICE_FOURNI_CONNECTION_M___ENVOIE_REPONSE_SERVEUR);
		createEOperation(serviceFourniConnectionMEClass, SERVICE_FOURNI_CONNECTION_M___ENVOIE_REQUETE_DATA_BASE);

		dataBaseEClass = createEClass(DATA_BASE);
		createEReference(dataBaseEClass, DATA_BASE__PORTREQUISDATABASE);
		createEReference(dataBaseEClass, DATA_BASE__PORTFOURNIDATABASE);
		createEReference(dataBaseEClass, DATA_BASE__SERVICEREQUISDATABASE);
		createEReference(dataBaseEClass, DATA_BASE__SERVICEFOURNIDATABASE);

		portRequisDataBaseEClass = createEClass(PORT_REQUIS_DATA_BASE);

		portFourniDataBaseEClass = createEClass(PORT_FOURNI_DATA_BASE);

		serviceRequisDataBaseEClass = createEClass(SERVICE_REQUIS_DATA_BASE);
		createEOperation(serviceRequisDataBaseEClass, SERVICE_REQUIS_DATA_BASE___RECEPTION_REQUETE_CONNECTION_M);

		serviceFourniDataBaseEClass = createEClass(SERVICE_FOURNI_DATA_BASE);
		createEOperation(serviceFourniDataBaseEClass, SERVICE_FOURNI_DATA_BASE___ENVOIE_REPONSE_CONNECTION_M);

		sqLqueryEClass = createEClass(SQ_LQUERY);
		createEReference(sqLqueryEClass, SQ_LQUERY__GLUESQLQUERY);
		createEReference(sqLqueryEClass, SQ_LQUERY__ROLEREQUISCMSQLQUERY);
		createEReference(sqLqueryEClass, SQ_LQUERY__ROLEREQUISDBSQLQUERY);
		createEReference(sqLqueryEClass, SQ_LQUERY__ROLEFOURNISQLQUERYCM);
		createEReference(sqLqueryEClass, SQ_LQUERY__ROLEFOURNISQLQUERYDB);
		createEOperation(sqLqueryEClass, SQ_LQUERY___TRANSFERT_MESSAGE_SQ_LQUERY);

		glueSQLqueryEClass = createEClass(GLUE_SQ_LQUERY);
		createEOperation(glueSQLqueryEClass, GLUE_SQ_LQUERY___MATCH_ROLES_SQ_LQUERY);

		roleRequisSQLqueryEClass = createEClass(ROLE_REQUIS_SQ_LQUERY);

		roleFourniSQLqueryEClass = createEClass(ROLE_FOURNI_SQ_LQUERY);

		attachCONNECTIONsqlEClass = createEClass(ATTACH_CONNECTIO_NSQL);
		createEReference(attachCONNECTIONsqlEClass, ATTACH_CONNECTIO_NSQL__PORTFOURNICMDATABASE);
		createEReference(attachCONNECTIONsqlEClass, ATTACH_CONNECTIO_NSQL__ROLEREQUISCMSQLQUERY);
		createEReference(attachCONNECTIONsqlEClass, ATTACH_CONNECTIO_NSQL__ROLEFOURNISQLQUERYCM);
		createEReference(attachCONNECTIONsqlEClass, ATTACH_CONNECTIO_NSQL__PORTREQUISDATABASECM);

		attachDBsqlEClass = createEClass(ATTACH_DBSQL);
		createEReference(attachDBsqlEClass, ATTACH_DBSQL__ROLEFOURNISQLQUERYDB);
		createEReference(attachDBsqlEClass, ATTACH_DBSQL__PORTREQUISDATABASE);
		createEReference(attachDBsqlEClass, ATTACH_DBSQL__PORTFOURNIDATABASE);
		createEReference(attachDBsqlEClass, ATTACH_DBSQL__ROLEREQUISDBSQLQUERY);

		bindingServeurConnectionMEClass = createEClass(BINDING_SERVEUR_CONNECTION_M);
		createEReference(bindingServeurConnectionMEClass, BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEUR);
		createEReference(bindingServeurConnectionMEClass, BINDING_SERVEUR_CONNECTION_M__PORTREQUISSERVEURCM);
		createEReference(bindingServeurConnectionMEClass, BINDING_SERVEUR_CONNECTION_M__PORTFOURNICMSERVEUR);
		createEReference(bindingServeurConnectionMEClass, BINDING_SERVEUR_CONNECTION_M__PORTFOURNISERVEUR);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__PORTREQUISCLIENT);
		createEReference(clientEClass, CLIENT__PORTFOURNISCLIENT);
		createEReference(clientEClass, CLIENT__SERVICEREQUISCLIENT);
		createEReference(clientEClass, CLIENT__SERVICEFOURNICLIENT);

		portRequisClientEClass = createEClass(PORT_REQUIS_CLIENT);

		portFourniClientEClass = createEClass(PORT_FOURNI_CLIENT);

		serviceRequisClientEClass = createEClass(SERVICE_REQUIS_CLIENT);
		createEOperation(serviceRequisClientEClass, SERVICE_REQUIS_CLIENT___RECEPTION_REQUETE_CLIENT);

		serviceFourniClientEClass = createEClass(SERVICE_FOURNI_CLIENT);
		createEOperation(serviceFourniClientEClass, SERVICE_FOURNI_CLIENT___ENVOIE_REQUETE_CLIENT);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__GLUERPC);
		createEReference(rpcEClass, RPC__ROLEREQUISCLIENT);
		createEReference(rpcEClass, RPC__ROLEREQUISSERVEUR);
		createEReference(rpcEClass, RPC__ROLEFOURNICLIENT);
		createEReference(rpcEClass, RPC__ROLEFOURNISERVEUR);
		createEOperation(rpcEClass, RPC___TRANSFERT_MESSAGE_RPC);

		glueRPCEClass = createEClass(GLUE_RPC);
		createEOperation(glueRPCEClass, GLUE_RPC___MATCH_ROLES_RPC);

		roleRequisRPCEClass = createEClass(ROLE_REQUIS_RPC);

		roleFourniRPCEClass = createEClass(ROLE_FOURNI_RPC);

		attachClientrpcEClass = createEClass(ATTACH_CLIENTRPC);
		createEReference(attachClientrpcEClass, ATTACH_CLIENTRPC__PORTREQUISCLIENT);
		createEReference(attachClientrpcEClass, ATTACH_CLIENTRPC__ROLEFOURNICLIENT);
		createEReference(attachClientrpcEClass, ATTACH_CLIENTRPC__ROLEREQUISCLIENT);
		createEReference(attachClientrpcEClass, ATTACH_CLIENTRPC__PORTFOURNICLIENT);

		attachServeurrpcEClass = createEClass(ATTACH_SERVEURRPC);
		createEReference(attachServeurrpcEClass, ATTACH_SERVEURRPC__PORTREQUISSERVEUR);
		createEReference(attachServeurrpcEClass, ATTACH_SERVEURRPC__ROLEFOURNISERVEUR);
		createEReference(attachServeurrpcEClass, ATTACH_SERVEURRPC__ROLEREQUISSERVEUR);
		createEReference(attachServeurrpcEClass, ATTACH_SERVEURRPC__PORTFOURNISERVEUR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CosaPackage theCosaPackage = (CosaPackage)EPackage.Registry.INSTANCE.getEPackage(CosaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serveurEClass.getESuperTypes().add(theCosaPackage.getConfiguration());
		portRequisServeurEClass.getESuperTypes().add(theCosaPackage.getPortRequis());
		portFourniServeurEClass.getESuperTypes().add(theCosaPackage.getPortFourni());
		serviceRequisServeurEClass.getESuperTypes().add(theCosaPackage.getServiceRequis());
		serviceFourniServeurEClass.getESuperTypes().add(theCosaPackage.getServiceFourni());
		connectionManagerEClass.getESuperTypes().add(theCosaPackage.getEComposant());
		portRequisConnectionMEClass.getESuperTypes().add(theCosaPackage.getPortRequis());
		portFourniConnectionMEClass.getESuperTypes().add(theCosaPackage.getPortFourni());
		serviceRequisConnectionMEClass.getESuperTypes().add(theCosaPackage.getServiceRequis());
		serviceFourniConnectionMEClass.getESuperTypes().add(theCosaPackage.getServiceFourni());
		dataBaseEClass.getESuperTypes().add(theCosaPackage.getEComposant());
		portRequisDataBaseEClass.getESuperTypes().add(theCosaPackage.getPortRequis());
		portFourniDataBaseEClass.getESuperTypes().add(theCosaPackage.getPortFourni());
		serviceRequisDataBaseEClass.getESuperTypes().add(theCosaPackage.getServiceRequis());
		serviceFourniDataBaseEClass.getESuperTypes().add(theCosaPackage.getServiceFourni());
		sqLqueryEClass.getESuperTypes().add(theCosaPackage.getEConnecteur());
		glueSQLqueryEClass.getESuperTypes().add(theCosaPackage.getGlue());
		roleRequisSQLqueryEClass.getESuperTypes().add(theCosaPackage.getRoleRequis());
		roleFourniSQLqueryEClass.getESuperTypes().add(theCosaPackage.getRoleFourni());
		attachCONNECTIONsqlEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		attachDBsqlEClass.getESuperTypes().add(theCosaPackage.getAttachment());
		bindingServeurConnectionMEClass.getESuperTypes().add(theCosaPackage.getBinding());
		clientEClass.getESuperTypes().add(theCosaPackage.getEComposant());
		portRequisClientEClass.getESuperTypes().add(theCosaPackage.getPortRequis());
		portFourniClientEClass.getESuperTypes().add(theCosaPackage.getPortFourni());
		serviceRequisClientEClass.getESuperTypes().add(theCosaPackage.getServiceRequis());
		serviceFourniClientEClass.getESuperTypes().add(theCosaPackage.getServiceFourni());
		rpcEClass.getESuperTypes().add(theCosaPackage.getEConnecteur());
		glueRPCEClass.getESuperTypes().add(theCosaPackage.getGlue());
		roleRequisRPCEClass.getESuperTypes().add(theCosaPackage.getRoleRequis());
		roleFourniRPCEClass.getESuperTypes().add(theCosaPackage.getRoleFourni());

		// Initialize classes, features, and operations; add parameters
		initEClass(serveurEClass, Serveur.class, "Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeur_Portrequisserveur(), this.getPortRequisServeur(), null, "portrequisserveur", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Portfourniserveur(), this.getPortFourniServeur(), null, "portfourniserveur", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Servicerequisserveur(), this.getServiceRequisServeur(), null, "servicerequisserveur", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Servicefourniserveur(), this.getServiceFourniServeur(), null, "servicefourniserveur", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Database(), this.getDataBase(), null, "database", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Sqlquery(), this.getSQLquery(), null, "sqlquery", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Attachconnectionsql(), this.getAttachCONNECTIONsql(), null, "attachconnectionsql", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Attachdbsql(), this.getAttachDBsql(), null, "attachdbsql", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Bindingserveurconnectionm(), this.getBindingServeurConnectionM(), null, "bindingserveurconnectionm", null, 1, 1, Serveur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRequisServeurEClass, PortRequisServeur.class, "PortRequisServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFourniServeurEClass, PortFourniServeur.class, "PortFourniServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRequisServeurEClass, ServiceRequisServeur.class, "ServiceRequisServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceRequisServeur__ReceptionRequeteClient(), null, "receptionRequeteClient", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceRequisServeur__ReceptionReponseConnectionM(), null, "receptionReponseConnectionM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceFourniServeurEClass, ServiceFourniServeur.class, "ServiceFourniServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceFourniServeur__EnvoieReponseClient(), null, "envoieReponseClient", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceFourniServeur__EnvoieRequeteConnectionM(), null, "envoieRequeteConnectionM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Portrequisserveurcm(), this.getPortRequisConnectionM(), null, "portrequisserveurcm", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portrequisdatabasecm(), this.getPortRequisConnectionM(), null, "portrequisdatabasecm", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portfournicmserveur(), this.getPortFourniConnectionM(), null, "portfournicmserveur", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Portfournicmdatabase(), this.getPortFourniConnectionM(), null, "portfournicmdatabase", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Servicerequisconnectionm(), this.getServiceRequisConnectionM(), null, "servicerequisconnectionm", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Servicefourniconnectionm(), this.getServiceFourniConnectionM(), null, "servicefourniconnectionm", null, 1, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRequisConnectionMEClass, PortRequisConnectionM.class, "PortRequisConnectionM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFourniConnectionMEClass, PortFourniConnectionM.class, "PortFourniConnectionM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRequisConnectionMEClass, ServiceRequisConnectionM.class, "ServiceRequisConnectionM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceRequisConnectionM__ReceptionRequeteServeur(), null, "receptionRequeteServeur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceRequisConnectionM__ReceptionReponseDataBase(), null, "receptionReponseDataBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceFourniConnectionMEClass, ServiceFourniConnectionM.class, "ServiceFourniConnectionM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceFourniConnectionM__EnvoieReponseServeur(), null, "envoieReponseServeur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getServiceFourniConnectionM__EnvoieRequeteDataBase(), null, "envoieRequeteDataBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataBase_Portrequisdatabase(), this.getPortRequisDataBase(), null, "portrequisdatabase", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Portfournidatabase(), this.getPortFourniDataBase(), null, "portfournidatabase", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Servicerequisdatabase(), this.getServiceRequisDataBase(), null, "servicerequisdatabase", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataBase_Servicefournidatabase(), this.getServiceFourniDataBase(), null, "servicefournidatabase", null, 1, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRequisDataBaseEClass, PortRequisDataBase.class, "PortRequisDataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFourniDataBaseEClass, PortFourniDataBase.class, "PortFourniDataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRequisDataBaseEClass, ServiceRequisDataBase.class, "ServiceRequisDataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceRequisDataBase__ReceptionRequeteConnectionM(), null, "receptionRequeteConnectionM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceFourniDataBaseEClass, ServiceFourniDataBase.class, "ServiceFourniDataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceFourniDataBase__EnvoieReponseConnectionM(), null, "envoieReponseConnectionM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sqLqueryEClass, SQLquery.class, "SQLquery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLquery_Gluesqlquery(), this.getGlueSQLquery(), null, "gluesqlquery", null, 1, 1, SQLquery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLquery_Rolerequiscmsqlquery(), this.getRoleRequisSQLquery(), null, "rolerequiscmsqlquery", null, 1, 1, SQLquery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLquery_Rolerequisdbsqlquery(), this.getRoleRequisSQLquery(), null, "rolerequisdbsqlquery", null, 1, 1, SQLquery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLquery_Rolefournisqlquerycm(), this.getRoleFourniSQLquery(), null, "rolefournisqlquerycm", null, 1, 1, SQLquery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLquery_Rolefournisqlquerydb(), this.getRoleFourniSQLquery(), null, "rolefournisqlquerydb", null, 1, 1, SQLquery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSQLquery__TransfertMessageSQLquery(), null, "transfertMessageSQLquery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(glueSQLqueryEClass, GlueSQLquery.class, "GlueSQLquery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGlueSQLquery__MatchRolesSQLquery(), theCosaPackage.getRoleFourni(), "matchRolesSQLquery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleRequisSQLqueryEClass, RoleRequisSQLquery.class, "RoleRequisSQLquery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFourniSQLqueryEClass, RoleFourniSQLquery.class, "RoleFourniSQLquery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachCONNECTIONsqlEClass, AttachCONNECTIONsql.class, "AttachCONNECTIONsql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachCONNECTIONsql_Portfournicmdatabase(), this.getPortFourniConnectionM(), null, "portfournicmdatabase", null, 1, 1, AttachCONNECTIONsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachCONNECTIONsql_Rolerequiscmsqlquery(), this.getRoleRequisSQLquery(), null, "rolerequiscmsqlquery", null, 1, 1, AttachCONNECTIONsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachCONNECTIONsql_Rolefournisqlquerycm(), this.getRoleFourniSQLquery(), null, "rolefournisqlquerycm", null, 1, 1, AttachCONNECTIONsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachCONNECTIONsql_Portrequisdatabasecm(), this.getPortRequisConnectionM(), null, "portrequisdatabasecm", null, 1, 1, AttachCONNECTIONsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachDBsqlEClass, AttachDBsql.class, "AttachDBsql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachDBsql_Rolefournisqlquerydb(), this.getRoleFourniSQLquery(), null, "rolefournisqlquerydb", null, 1, 1, AttachDBsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachDBsql_Portrequisdatabase(), this.getPortRequisDataBase(), null, "portrequisdatabase", null, 1, 1, AttachDBsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachDBsql_Portfournidatabase(), this.getPortFourniDataBase(), null, "portfournidatabase", null, 1, 1, AttachDBsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachDBsql_Rolerequisdbsqlquery(), this.getRoleRequisSQLquery(), null, "rolerequisdbsqlquery", null, 1, 1, AttachDBsql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingServeurConnectionMEClass, BindingServeurConnectionM.class, "BindingServeurConnectionM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingServeurConnectionM_Portrequisserveur(), this.getPortRequisServeur(), null, "portrequisserveur", null, 1, 1, BindingServeurConnectionM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeurConnectionM_Portrequisserveurcm(), this.getPortRequisConnectionM(), null, "portrequisserveurcm", null, 1, 1, BindingServeurConnectionM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeurConnectionM_Portfournicmserveur(), this.getPortFourniConnectionM(), null, "portfournicmserveur", null, 1, 1, BindingServeurConnectionM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeurConnectionM_Portfourniserveur(), this.getPortFourniServeur(), null, "portfourniserveur", null, 1, 1, BindingServeurConnectionM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Portrequisclient(), this.getPortRequisClient(), null, "portrequisclient", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Portfournisclient(), this.getPortFourniClient(), null, "portfournisclient", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Servicerequisclient(), this.getServiceRequisClient(), null, "servicerequisclient", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Servicefourniclient(), this.getServiceFourniClient(), null, "servicefourniclient", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRequisClientEClass, PortRequisClient.class, "PortRequisClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFourniClientEClass, PortFourniClient.class, "PortFourniClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceRequisClientEClass, ServiceRequisClient.class, "ServiceRequisClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceRequisClient__ReceptionRequeteClient(), null, "receptionRequeteClient", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceFourniClientEClass, ServiceFourniClient.class, "ServiceFourniClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceFourniClient__EnvoieRequeteClient(), null, "envoieRequeteClient", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rpcEClass, cs.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Gluerpc(), this.getGlueRPC(), null, "gluerpc", null, 1, 1, cs.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rolerequisclient(), this.getRoleRequisRPC(), null, "rolerequisclient", null, 1, 1, cs.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rolerequisserveur(), this.getRoleRequisRPC(), null, "rolerequisserveur", null, 1, 1, cs.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rolefourniclient(), this.getRoleFourniRPC(), null, "rolefourniclient", null, 1, 1, cs.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rolefourniserveur(), this.getRoleFourniRPC(), null, "rolefourniserveur", null, 1, 1, cs.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRPC__TransfertMessageRPC(), null, "transfertMessageRPC", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(glueRPCEClass, GlueRPC.class, "GlueRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGlueRPC__MatchRolesRPC(), theCosaPackage.getRoleFourni(), "matchRolesRPC", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleRequisRPCEClass, RoleRequisRPC.class, "RoleRequisRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFourniRPCEClass, RoleFourniRPC.class, "RoleFourniRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachClientrpcEClass, AttachClientrpc.class, "AttachClientrpc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachClientrpc_Portrequisclient(), this.getPortRequisClient(), null, "portrequisclient", null, 1, 1, AttachClientrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachClientrpc_Rolefourniclient(), this.getRoleFourniRPC(), null, "rolefourniclient", null, 1, 1, AttachClientrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachClientrpc_Rolerequisclient(), this.getRoleRequisRPC(), null, "rolerequisclient", null, 1, 1, AttachClientrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachClientrpc_Portfourniclient(), this.getPortFourniClient(), null, "portfourniclient", null, 1, 1, AttachClientrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachServeurrpcEClass, AttachServeurrpc.class, "AttachServeurrpc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachServeurrpc_Portrequisserveur(), this.getPortRequisServeur(), null, "portrequisserveur", null, 1, 1, AttachServeurrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachServeurrpc_Rolefourniserveur(), this.getRoleFourniRPC(), null, "rolefourniserveur", null, 1, 1, AttachServeurrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachServeurrpc_Rolerequisserveur(), this.getRoleRequisRPC(), null, "rolerequisserveur", null, 1, 1, AttachServeurrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachServeurrpc_Portfourniserveur(), this.getPortFourniServeur(), null, "portfourniserveur", null, 1, 1, AttachServeurrpc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CsPackageImpl
