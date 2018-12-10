/**
 */
package cosa.util;

import cosa.*;

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
 * @see cosa.CosaPackage
 * @generated
 */
public class CosaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CosaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaSwitch() {
		if (modelPackage == null) {
			modelPackage = CosaPackage.eINSTANCE;
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
			case CosaPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ECOMPOSANT: {
				EComposant eComposant = (EComposant)theEObject;
				T result = caseEComposant(eComposant);
				if (result == null) result = caseElement(eComposant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ECONNECTEUR: {
				EConnecteur eConnecteur = (EConnecteur)theEObject;
				T result = caseEConnecteur(eConnecteur);
				if (result == null) result = caseElement(eConnecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.GLUE: {
				Glue glue = (Glue)theEObject;
				T result = caseGlue(glue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE_COMPOSANT: {
				InterfaceComposant interfaceComposant = (InterfaceComposant)theEObject;
				T result = caseInterfaceComposant(interfaceComposant);
				if (result == null) result = caseInterface(interfaceComposant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.INTERFACE_CONNECTEUR: {
				InterfaceConnecteur interfaceConnecteur = (InterfaceConnecteur)theEObject;
				T result = caseInterfaceConnecteur(interfaceConnecteur);
				if (result == null) result = caseInterface(interfaceConnecteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseInterfaceComposant(port);
				if (result == null) result = caseInterface(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT_REQUIS: {
				PortRequis portRequis = (PortRequis)theEObject;
				T result = casePortRequis(portRequis);
				if (result == null) result = casePort(portRequis);
				if (result == null) result = caseInterfaceComposant(portRequis);
				if (result == null) result = caseInterface(portRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.PORT_FOURNI: {
				PortFourni portFourni = (PortFourni)theEObject;
				T result = casePortFourni(portFourni);
				if (result == null) result = casePort(portFourni);
				if (result == null) result = caseInterfaceComposant(portFourni);
				if (result == null) result = caseInterface(portFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseInterfaceComposant(service);
				if (result == null) result = caseInterface(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE_REQUIS: {
				ServiceRequis serviceRequis = (ServiceRequis)theEObject;
				T result = caseServiceRequis(serviceRequis);
				if (result == null) result = caseService(serviceRequis);
				if (result == null) result = caseInterfaceComposant(serviceRequis);
				if (result == null) result = caseInterface(serviceRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.SERVICE_FOURNI: {
				ServiceFourni serviceFourni = (ServiceFourni)theEObject;
				T result = caseServiceFourni(serviceFourni);
				if (result == null) result = caseService(serviceFourni);
				if (result == null) result = caseInterfaceComposant(serviceFourni);
				if (result == null) result = caseInterface(serviceFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseInterfaceConnecteur(role);
				if (result == null) result = caseInterface(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE_REQUIS: {
				RoleRequis roleRequis = (RoleRequis)theEObject;
				T result = caseRoleRequis(roleRequis);
				if (result == null) result = caseRole(roleRequis);
				if (result == null) result = caseInterfaceConnecteur(roleRequis);
				if (result == null) result = caseInterface(roleRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ROLE_FOURNI: {
				RoleFourni roleFourni = (RoleFourni)theEObject;
				T result = caseRoleFourni(roleFourni);
				if (result == null) result = caseRole(roleFourni);
				if (result == null) result = caseInterfaceConnecteur(roleFourni);
				if (result == null) result = caseInterface(roleFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CosaPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //CosaSwitch
