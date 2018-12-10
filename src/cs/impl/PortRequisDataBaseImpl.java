/**
 */
package cs.impl;

import cosa.impl.PortRequisImpl;

import cs.CsPackage;
import cs.DataBase;
import cs.PortRequisDataBase;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortRequisDataBaseImpl extends PortRequisImpl implements PortRequisDataBase {
	
	DataBase observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisDataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PORT_REQUIS_DATA_BASE;
	}

	@Override
	public void addObserver(DataBase db) {
		this.observer = db;
		
	}

	@Override
	public void notifyDataBase(String message) {
		this.observer.receiveNotify(this, message);
		
	}

} //PortRequisDataBaseImpl
