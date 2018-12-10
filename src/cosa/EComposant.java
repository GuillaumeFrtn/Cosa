/**
 */
package cosa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComposant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cosa.EComposant#getInterfacecomp <em>Interfacecomp</em>}</li>
 * </ul>
 *
 * @see cosa.CosaPackage#getEComposant()
 * @model
 * @generated
 */
public interface EComposant extends Element {
	/**
	 * Returns the value of the '<em><b>Interfacecomp</b></em>' containment reference list.
	 * The list contents are of type {@link cosa.InterfaceComposant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacecomp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecomp</em>' containment reference list.
	 * @see cosa.CosaPackage#getEComposant_Interfacecomp()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceComposant> getInterfacecomp();

} // EComposant
