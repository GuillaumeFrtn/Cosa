/**
 */
package cosa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.Interface#getNomInterface <em>Nom Interface</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Interface</em>' attribute.
	 * @see #setNomInterface(String)
	 * @see cosa.CosaPackage#getInterface_NomInterface()
	 * @model
	 * @generated
	 */
	String getNomInterface();

	/**
	 * Sets the value of the '{@link cosa.Interface#getNomInterface <em>Nom Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Interface</em>' attribute.
	 * @see #getNomInterface()
	 * @generated
	 */
	void setNomInterface(String value);

} // Interface
