/**
 */
package cs;

import cosa.EComposant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cs.DataBase#getPortrequisdatabase <em>Portrequisdatabase</em>}</li>
 *   <li>{@link cs.DataBase#getPortfournidatabase <em>Portfournidatabase</em>}</li>
 *   <li>{@link cs.DataBase#getServicerequisdatabase <em>Servicerequisdatabase</em>}</li>
 *   <li>{@link cs.DataBase#getServicefournidatabase <em>Servicefournidatabase</em>}</li>
 * </ul>
 *
 * @see cs.CsPackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends EComposant {
	/**
	 * Returns the value of the '<em><b>Portrequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisdatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisdatabase</em>' reference.
	 * @see #setPortrequisdatabase(PortRequisDataBase)
	 * @see cs.CsPackage#getDataBase_Portrequisdatabase()
	 * @model required="true"
	 * @generated
	 */
	PortRequisDataBase getPortrequisdatabase();

	/**
	 * Sets the value of the '{@link cs.DataBase#getPortrequisdatabase <em>Portrequisdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisdatabase</em>' reference.
	 * @see #getPortrequisdatabase()
	 * @generated
	 */
	void setPortrequisdatabase(PortRequisDataBase value);

	/**
	 * Returns the value of the '<em><b>Portfournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournidatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournidatabase</em>' reference.
	 * @see #setPortfournidatabase(PortFourniDataBase)
	 * @see cs.CsPackage#getDataBase_Portfournidatabase()
	 * @model required="true"
	 * @generated
	 */
	PortFourniDataBase getPortfournidatabase();

	/**
	 * Sets the value of the '{@link cs.DataBase#getPortfournidatabase <em>Portfournidatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournidatabase</em>' reference.
	 * @see #getPortfournidatabase()
	 * @generated
	 */
	void setPortfournidatabase(PortFourniDataBase value);

	/**
	 * Returns the value of the '<em><b>Servicerequisdatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicerequisdatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerequisdatabase</em>' reference.
	 * @see #setServicerequisdatabase(ServiceRequisDataBase)
	 * @see cs.CsPackage#getDataBase_Servicerequisdatabase()
	 * @model required="true"
	 * @generated
	 */
	ServiceRequisDataBase getServicerequisdatabase();

	/**
	 * Sets the value of the '{@link cs.DataBase#getServicerequisdatabase <em>Servicerequisdatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerequisdatabase</em>' reference.
	 * @see #getServicerequisdatabase()
	 * @generated
	 */
	void setServicerequisdatabase(ServiceRequisDataBase value);

	/**
	 * Returns the value of the '<em><b>Servicefournidatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicefournidatabase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicefournidatabase</em>' reference.
	 * @see #setServicefournidatabase(ServiceFourniDataBase)
	 * @see cs.CsPackage#getDataBase_Servicefournidatabase()
	 * @model required="true"
	 * @generated
	 */
	ServiceFourniDataBase getServicefournidatabase();

	/**
	 * Sets the value of the '{@link cs.DataBase#getServicefournidatabase <em>Servicefournidatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicefournidatabase</em>' reference.
	 * @see #getServicefournidatabase()
	 * @generated
	 */
	void setServicefournidatabase(ServiceFourniDataBase value);

} // DataBase
