/**
 */
package cosa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cosa.CosaPackage
 * @generated
 */
public interface CosaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CosaFactory eINSTANCE = cosa.impl.CosaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>EComposant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComposant</em>'.
	 * @generated
	 */
	EComposant createEComposant();

	/**
	 * Returns a new object of class '<em>EConnecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EConnecteur</em>'.
	 * @generated
	 */
	EConnecteur createEConnecteur();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis</em>'.
	 * @generated
	 */
	PortRequis createPortRequis();

	/**
	 * Returns a new object of class '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni</em>'.
	 * @generated
	 */
	PortFourni createPortFourni();

	/**
	 * Returns a new object of class '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis</em>'.
	 * @generated
	 */
	ServiceRequis createServiceRequis();

	/**
	 * Returns a new object of class '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni</em>'.
	 * @generated
	 */
	ServiceFourni createServiceFourni();

	/**
	 * Returns a new object of class '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis</em>'.
	 * @generated
	 */
	RoleRequis createRoleRequis();

	/**
	 * Returns a new object of class '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni</em>'.
	 * @generated
	 */
	RoleFourni createRoleFourni();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CosaPackage getCosaPackage();

} //CosaFactory
