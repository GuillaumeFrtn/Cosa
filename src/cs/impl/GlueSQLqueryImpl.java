/**
 */
package cs.impl;

import cosa.RoleFourni;

import cosa.impl.GlueImpl;

import cs.CsPackage;
import cs.GlueSQLquery;
import cs.RoleFourniSQLquery;
import cs.RoleRequisSQLquery;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue SQ Lquery</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlueSQLqueryImpl extends GlueImpl implements GlueSQLquery {
	
	private HashMap<RoleRequisSQLquery, RoleFourniSQLquery> roleCorrespondant;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueSQLqueryImpl() {
		super();
		this.roleCorrespondant = new HashMap<RoleRequisSQLquery, RoleFourniSQLquery>(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.GLUE_SQ_LQUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RoleFourniSQLquery matchRolesSQLquery(RoleRequisSQLquery key) {
		return roleCorrespondant.get(key);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniSQLquery matchRolesSQLquery() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void addCorrespondance(RoleRequisSQLquery roleRequis, RoleFourniSQLquery roleFourni)
	{
		roleCorrespondant.put(roleRequis, roleFourni);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.GLUE_SQ_LQUERY___MATCH_ROLES_SQ_LQUERY:
				return matchRolesSQLquery();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlueSQLqueryImpl
