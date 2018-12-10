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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public class CsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsSwitch() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CsPackage.SERVEUR: {
				Serveur serveur = (Serveur)theEObject;
				T result = caseServeur(serveur);
				if (result == null) result = caseConfiguration(serveur);
				if (result == null) result = caseElement(serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_REQUIS_SERVEUR: {
				PortRequisServeur portRequisServeur = (PortRequisServeur)theEObject;
				T result = casePortRequisServeur(portRequisServeur);
				if (result == null) result = casePortRequis(portRequisServeur);
				if (result == null) result = casePort(portRequisServeur);
				if (result == null) result = caseInterfaceComposant(portRequisServeur);
				if (result == null) result = caseInterface(portRequisServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_FOURNI_SERVEUR: {
				PortFourniServeur portFourniServeur = (PortFourniServeur)theEObject;
				T result = casePortFourniServeur(portFourniServeur);
				if (result == null) result = casePortFourni(portFourniServeur);
				if (result == null) result = casePort(portFourniServeur);
				if (result == null) result = caseInterfaceComposant(portFourniServeur);
				if (result == null) result = caseInterface(portFourniServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_REQUIS_SERVEUR: {
				ServiceRequisServeur serviceRequisServeur = (ServiceRequisServeur)theEObject;
				T result = caseServiceRequisServeur(serviceRequisServeur);
				if (result == null) result = caseServiceRequis(serviceRequisServeur);
				if (result == null) result = caseService(serviceRequisServeur);
				if (result == null) result = caseInterfaceComposant(serviceRequisServeur);
				if (result == null) result = caseInterface(serviceRequisServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_FOURNI_SERVEUR: {
				ServiceFourniServeur serviceFourniServeur = (ServiceFourniServeur)theEObject;
				T result = caseServiceFourniServeur(serviceFourniServeur);
				if (result == null) result = caseServiceFourni(serviceFourniServeur);
				if (result == null) result = caseService(serviceFourniServeur);
				if (result == null) result = caseInterfaceComposant(serviceFourniServeur);
				if (result == null) result = caseInterface(serviceFourniServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.CONNECTION_MANAGER: {
				ConnectionManager connectionManager = (ConnectionManager)theEObject;
				T result = caseConnectionManager(connectionManager);
				if (result == null) result = caseEComposant(connectionManager);
				if (result == null) result = caseElement(connectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_REQUIS_CONNECTION_M: {
				PortRequisConnectionM portRequisConnectionM = (PortRequisConnectionM)theEObject;
				T result = casePortRequisConnectionM(portRequisConnectionM);
				if (result == null) result = casePortRequis(portRequisConnectionM);
				if (result == null) result = casePort(portRequisConnectionM);
				if (result == null) result = caseInterfaceComposant(portRequisConnectionM);
				if (result == null) result = caseInterface(portRequisConnectionM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_FOURNI_CONNECTION_M: {
				PortFourniConnectionM portFourniConnectionM = (PortFourniConnectionM)theEObject;
				T result = casePortFourniConnectionM(portFourniConnectionM);
				if (result == null) result = casePortFourni(portFourniConnectionM);
				if (result == null) result = casePort(portFourniConnectionM);
				if (result == null) result = caseInterfaceComposant(portFourniConnectionM);
				if (result == null) result = caseInterface(portFourniConnectionM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_REQUIS_CONNECTION_M: {
				ServiceRequisConnectionM serviceRequisConnectionM = (ServiceRequisConnectionM)theEObject;
				T result = caseServiceRequisConnectionM(serviceRequisConnectionM);
				if (result == null) result = caseServiceRequis(serviceRequisConnectionM);
				if (result == null) result = caseService(serviceRequisConnectionM);
				if (result == null) result = caseInterfaceComposant(serviceRequisConnectionM);
				if (result == null) result = caseInterface(serviceRequisConnectionM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_FOURNI_CONNECTION_M: {
				ServiceFourniConnectionM serviceFourniConnectionM = (ServiceFourniConnectionM)theEObject;
				T result = caseServiceFourniConnectionM(serviceFourniConnectionM);
				if (result == null) result = caseServiceFourni(serviceFourniConnectionM);
				if (result == null) result = caseService(serviceFourniConnectionM);
				if (result == null) result = caseInterfaceComposant(serviceFourniConnectionM);
				if (result == null) result = caseInterface(serviceFourniConnectionM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = caseEComposant(dataBase);
				if (result == null) result = caseElement(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_REQUIS_DATA_BASE: {
				PortRequisDataBase portRequisDataBase = (PortRequisDataBase)theEObject;
				T result = casePortRequisDataBase(portRequisDataBase);
				if (result == null) result = casePortRequis(portRequisDataBase);
				if (result == null) result = casePort(portRequisDataBase);
				if (result == null) result = caseInterfaceComposant(portRequisDataBase);
				if (result == null) result = caseInterface(portRequisDataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_FOURNI_DATA_BASE: {
				PortFourniDataBase portFourniDataBase = (PortFourniDataBase)theEObject;
				T result = casePortFourniDataBase(portFourniDataBase);
				if (result == null) result = casePortFourni(portFourniDataBase);
				if (result == null) result = casePort(portFourniDataBase);
				if (result == null) result = caseInterfaceComposant(portFourniDataBase);
				if (result == null) result = caseInterface(portFourniDataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_REQUIS_DATA_BASE: {
				ServiceRequisDataBase serviceRequisDataBase = (ServiceRequisDataBase)theEObject;
				T result = caseServiceRequisDataBase(serviceRequisDataBase);
				if (result == null) result = caseServiceRequis(serviceRequisDataBase);
				if (result == null) result = caseService(serviceRequisDataBase);
				if (result == null) result = caseInterfaceComposant(serviceRequisDataBase);
				if (result == null) result = caseInterface(serviceRequisDataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_FOURNI_DATA_BASE: {
				ServiceFourniDataBase serviceFourniDataBase = (ServiceFourniDataBase)theEObject;
				T result = caseServiceFourniDataBase(serviceFourniDataBase);
				if (result == null) result = caseServiceFourni(serviceFourniDataBase);
				if (result == null) result = caseService(serviceFourniDataBase);
				if (result == null) result = caseInterfaceComposant(serviceFourniDataBase);
				if (result == null) result = caseInterface(serviceFourniDataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SQ_LQUERY: {
				SQLquery sqLquery = (SQLquery)theEObject;
				T result = caseSQLquery(sqLquery);
				if (result == null) result = caseEConnecteur(sqLquery);
				if (result == null) result = caseElement(sqLquery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.GLUE_SQ_LQUERY: {
				GlueSQLquery glueSQLquery = (GlueSQLquery)theEObject;
				T result = caseGlueSQLquery(glueSQLquery);
				if (result == null) result = caseGlue(glueSQLquery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ROLE_REQUIS_SQ_LQUERY: {
				RoleRequisSQLquery roleRequisSQLquery = (RoleRequisSQLquery)theEObject;
				T result = caseRoleRequisSQLquery(roleRequisSQLquery);
				if (result == null) result = caseRoleRequis(roleRequisSQLquery);
				if (result == null) result = caseRole(roleRequisSQLquery);
				if (result == null) result = caseInterfaceConnecteur(roleRequisSQLquery);
				if (result == null) result = caseInterface(roleRequisSQLquery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ROLE_FOURNI_SQ_LQUERY: {
				RoleFourniSQLquery roleFourniSQLquery = (RoleFourniSQLquery)theEObject;
				T result = caseRoleFourniSQLquery(roleFourniSQLquery);
				if (result == null) result = caseRoleFourni(roleFourniSQLquery);
				if (result == null) result = caseRole(roleFourniSQLquery);
				if (result == null) result = caseInterfaceConnecteur(roleFourniSQLquery);
				if (result == null) result = caseInterface(roleFourniSQLquery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ATTACH_CONNECTIO_NSQL: {
				AttachCONNECTIONsql attachCONNECTIONsql = (AttachCONNECTIONsql)theEObject;
				T result = caseAttachCONNECTIONsql(attachCONNECTIONsql);
				if (result == null) result = caseAttachment(attachCONNECTIONsql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ATTACH_DBSQL: {
				AttachDBsql attachDBsql = (AttachDBsql)theEObject;
				T result = caseAttachDBsql(attachDBsql);
				if (result == null) result = caseAttachment(attachDBsql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.BINDING_SERVEUR_CONNECTION_M: {
				BindingServeurConnectionM bindingServeurConnectionM = (BindingServeurConnectionM)theEObject;
				T result = caseBindingServeurConnectionM(bindingServeurConnectionM);
				if (result == null) result = caseBinding(bindingServeurConnectionM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseEComposant(client);
				if (result == null) result = caseElement(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_REQUIS_CLIENT: {
				PortRequisClient portRequisClient = (PortRequisClient)theEObject;
				T result = casePortRequisClient(portRequisClient);
				if (result == null) result = casePortRequis(portRequisClient);
				if (result == null) result = casePort(portRequisClient);
				if (result == null) result = caseInterfaceComposant(portRequisClient);
				if (result == null) result = caseInterface(portRequisClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PORT_FOURNI_CLIENT: {
				PortFourniClient portFourniClient = (PortFourniClient)theEObject;
				T result = casePortFourniClient(portFourniClient);
				if (result == null) result = casePortFourni(portFourniClient);
				if (result == null) result = casePort(portFourniClient);
				if (result == null) result = caseInterfaceComposant(portFourniClient);
				if (result == null) result = caseInterface(portFourniClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_REQUIS_CLIENT: {
				ServiceRequisClient serviceRequisClient = (ServiceRequisClient)theEObject;
				T result = caseServiceRequisClient(serviceRequisClient);
				if (result == null) result = caseServiceRequis(serviceRequisClient);
				if (result == null) result = caseService(serviceRequisClient);
				if (result == null) result = caseInterfaceComposant(serviceRequisClient);
				if (result == null) result = caseInterface(serviceRequisClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SERVICE_FOURNI_CLIENT: {
				ServiceFourniClient serviceFourniClient = (ServiceFourniClient)theEObject;
				T result = caseServiceFourniClient(serviceFourniClient);
				if (result == null) result = caseServiceFourni(serviceFourniClient);
				if (result == null) result = caseService(serviceFourniClient);
				if (result == null) result = caseInterfaceComposant(serviceFourniClient);
				if (result == null) result = caseInterface(serviceFourniClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseEConnecteur(rpc);
				if (result == null) result = caseElement(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.GLUE_RPC: {
				GlueRPC glueRPC = (GlueRPC)theEObject;
				T result = caseGlueRPC(glueRPC);
				if (result == null) result = caseGlue(glueRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ROLE_REQUIS_RPC: {
				RoleRequisRPC roleRequisRPC = (RoleRequisRPC)theEObject;
				T result = caseRoleRequisRPC(roleRequisRPC);
				if (result == null) result = caseRoleRequis(roleRequisRPC);
				if (result == null) result = caseRole(roleRequisRPC);
				if (result == null) result = caseInterfaceConnecteur(roleRequisRPC);
				if (result == null) result = caseInterface(roleRequisRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ROLE_FOURNI_RPC: {
				RoleFourniRPC roleFourniRPC = (RoleFourniRPC)theEObject;
				T result = caseRoleFourniRPC(roleFourniRPC);
				if (result == null) result = caseRoleFourni(roleFourniRPC);
				if (result == null) result = caseRole(roleFourniRPC);
				if (result == null) result = caseInterfaceConnecteur(roleFourniRPC);
				if (result == null) result = caseInterface(roleFourniRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ATTACH_CLIENTRPC: {
				AttachClientrpc attachClientrpc = (AttachClientrpc)theEObject;
				T result = caseAttachClientrpc(attachClientrpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ATTACH_SERVEURRPC: {
				AttachServeurrpc attachServeurrpc = (AttachServeurrpc)theEObject;
				T result = caseAttachServeurrpc(attachServeurrpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur(Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisServeur(PortRequisServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniServeur(PortFourniServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequisServeur(ServiceRequisServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourniServeur(ServiceFourniServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Connection M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisConnectionM(PortRequisConnectionM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Connection M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniConnectionM(PortFourniConnectionM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis Connection M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequisConnectionM(ServiceRequisConnectionM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni Connection M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourniConnectionM(ServiceFourniConnectionM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisDataBase(PortRequisDataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniDataBase(PortFourniDataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequisDataBase(ServiceRequisDataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourniDataBase(ServiceFourniDataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQ Lquery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLquery(SQLquery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue SQ Lquery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueSQLquery(GlueSQLquery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis SQ Lquery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequisSQLquery(RoleRequisSQLquery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni SQ Lquery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni SQ Lquery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFourniSQLquery(RoleFourniSQLquery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach CONNECTIO Nsql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach CONNECTIO Nsql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachCONNECTIONsql(AttachCONNECTIONsql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach DBsql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach DBsql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachDBsql(AttachDBsql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur Connection M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur Connection M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingServeurConnectionM(BindingServeurConnectionM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisClient(PortRequisClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniClient(PortFourniClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequisClient(ServiceRequisClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourniClient(ServiceFourniClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueRPC(GlueRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequisRPC(RoleRequisRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFourniRPC(RoleFourniRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach Clientrpc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach Clientrpc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachClientrpc(AttachClientrpc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach Serveurrpc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach Serveurrpc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachServeurrpc(AttachServeurrpc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComposant(InterfaceComposant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis(PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourni(PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequis(ServiceRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFourni(ServiceFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComposant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComposant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComposant(EComposant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EConnecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EConnecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEConnecteur(EConnecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnecteur(InterfaceConnecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFourni(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CsSwitch
