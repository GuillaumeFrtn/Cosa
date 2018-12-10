/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Configuration#getInterfaceconfig <em>Interfaceconfig</em>}</li>
 *   <li>{@link cosa.Configuration#getElement <em>Element</em>}</li>
 *   <li>{@link cosa.Configuration#getEcomposant <em>Ecomposant</em>}</li>
 *   <li>{@link cosa.Configuration#getEconnecteur <em>Econnecteur</em>}</li>
 *   <li>{@link cosa.Configuration#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link cosa.Configuration#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Element {
	/**
	 * Returns the value of the '<em><b>Interfaceconfig</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.InterfaceComposant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconfig</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Interfaceconfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceComposant> getInterfaceconfig();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Ecomposant</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.EComposant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecomposant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecomposant</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Ecomposant()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<EComposant> getEcomposant();

	/**
	 * Returns the value of the '<em><b>Econnecteur</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.EConnecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Econnecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Econnecteur</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Econnecteur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EConnecteur> getEconnecteur();

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Attachment()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Attachment> getAttachment();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see cosa.CosaPackage#getConfiguration_Binding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBinding();

} // Configuration
