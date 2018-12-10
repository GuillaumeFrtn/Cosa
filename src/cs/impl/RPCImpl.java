/**
 */
package cs.impl;

import cosa.impl.EConnecteurImpl;
import cs.CS;
import cs.CsPackage;
import cs.GlueRPC;
import cs.RPC;
import cs.RoleFourniRPC;
import cs.RoleRequisRPC;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.RPCImpl#getGluerpc <em>Gluerpc</em>}</li>
 *   <li>{@link cs.impl.RPCImpl#getRolerequisclient <em>Rolerequisclient</em>}</li>
 *   <li>{@link cs.impl.RPCImpl#getRolerequisserveur <em>Rolerequisserveur</em>}</li>
 *   <li>{@link cs.impl.RPCImpl#getRolefourniclient <em>Rolefourniclient</em>}</li>
 *   <li>{@link cs.impl.RPCImpl#getRolefourniserveur <em>Rolefourniserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends EConnecteurImpl implements RPC {
	/**
	 * The cached value of the '{@link #getGluerpc() <em>Gluerpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluerpc()
	 * @generated
	 * @ordered
	 */
	protected GlueRPC gluerpc;

	/**
	 * The cached value of the '{@link #getRolerequisclient() <em>Rolerequisclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisclient()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisRPC rolerequisclient;

	/**
	 * The cached value of the '{@link #getRolerequisserveur() <em>Rolerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequisserveur()
	 * @generated
	 * @ordered
	 */
	protected RoleRequisRPC rolerequisserveur;

	/**
	 * The cached value of the '{@link #getRolefourniclient() <em>Rolefourniclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefourniclient()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniRPC rolefourniclient;

	/**
	 * The cached value of the '{@link #getRolefourniserveur() <em>Rolefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefourniserveur()
	 * @generated
	 * @ordered
	 */
	protected RoleFourniRPC rolefourniserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl(CS observer) {
		super();
		gluerpc = new GlueRPCImpl();
		
		rolerequisclient = new RoleRequisRPCImpl();
		rolerequisserveur = new RoleRequisRPCImpl();
		rolefourniclient = new RoleFourniRPCImpl();
		rolefourniserveur = new RoleFourniRPCImpl();
		
		rolerequisclient.addObserver(this);
		rolerequisserveur.addObserver(this);
		rolefourniclient.addObserver(observer);
		rolefourniserveur.addObserver(observer);
		
		gluerpc.addCorrespondance(rolerequisclient, rolefourniserveur);
		gluerpc.addCorrespondance(rolerequisserveur, rolefourniclient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueRPC getGluerpc() {
		if (gluerpc != null && gluerpc.eIsProxy()) {
			InternalEObject oldGluerpc = (InternalEObject)gluerpc;
			gluerpc = (GlueRPC)eResolveProxy(oldGluerpc);
			if (gluerpc != oldGluerpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.RPC__GLUERPC, oldGluerpc, gluerpc));
			}
		}
		return gluerpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueRPC basicGetGluerpc() {
		return gluerpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluerpc(GlueRPC newGluerpc) {
		GlueRPC oldGluerpc = gluerpc;
		gluerpc = newGluerpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RPC__GLUERPC, oldGluerpc, gluerpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC getRolerequisclient() {
		if (rolerequisclient != null && rolerequisclient.eIsProxy()) {
			InternalEObject oldRolerequisclient = (InternalEObject)rolerequisclient;
			rolerequisclient = (RoleRequisRPC)eResolveProxy(oldRolerequisclient);
			if (rolerequisclient != oldRolerequisclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.RPC__ROLEREQUISCLIENT, oldRolerequisclient, rolerequisclient));
			}
		}
		return rolerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC basicGetRolerequisclient() {
		return rolerequisclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequisclient(RoleRequisRPC newRolerequisclient) {
		RoleRequisRPC oldRolerequisclient = rolerequisclient;
		rolerequisclient = newRolerequisclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RPC__ROLEREQUISCLIENT, oldRolerequisclient, rolerequisclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC getRolerequisserveur() {
		if (rolerequisserveur != null && rolerequisserveur.eIsProxy()) {
			InternalEObject oldRolerequisserveur = (InternalEObject)rolerequisserveur;
			rolerequisserveur = (RoleRequisRPC)eResolveProxy(oldRolerequisserveur);
			if (rolerequisserveur != oldRolerequisserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.RPC__ROLEREQUISSERVEUR, oldRolerequisserveur, rolerequisserveur));
			}
		}
		return rolerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequisRPC basicGetRolerequisserveur() {
		return rolerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequisserveur(RoleRequisRPC newRolerequisserveur) {
		RoleRequisRPC oldRolerequisserveur = rolerequisserveur;
		rolerequisserveur = newRolerequisserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RPC__ROLEREQUISSERVEUR, oldRolerequisserveur, rolerequisserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC getRolefourniclient() {
		if (rolefourniclient != null && rolefourniclient.eIsProxy()) {
			InternalEObject oldRolefourniclient = (InternalEObject)rolefourniclient;
			rolefourniclient = (RoleFourniRPC)eResolveProxy(oldRolefourniclient);
			if (rolefourniclient != oldRolefourniclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.RPC__ROLEFOURNICLIENT, oldRolefourniclient, rolefourniclient));
			}
		}
		return rolefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC basicGetRolefourniclient() {
		return rolefourniclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefourniclient(RoleFourniRPC newRolefourniclient) {
		RoleFourniRPC oldRolefourniclient = rolefourniclient;
		rolefourniclient = newRolefourniclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RPC__ROLEFOURNICLIENT, oldRolefourniclient, rolefourniclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC getRolefourniserveur() {
		if (rolefourniserveur != null && rolefourniserveur.eIsProxy()) {
			InternalEObject oldRolefourniserveur = (InternalEObject)rolefourniserveur;
			rolefourniserveur = (RoleFourniRPC)eResolveProxy(oldRolefourniserveur);
			if (rolefourniserveur != oldRolefourniserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.RPC__ROLEFOURNISERVEUR, oldRolefourniserveur, rolefourniserveur));
			}
		}
		return rolefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourniRPC basicGetRolefourniserveur() {
		return rolefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefourniserveur(RoleFourniRPC newRolefourniserveur) {
		RoleFourniRPC oldRolefourniserveur = rolefourniserveur;
		rolefourniserveur = newRolefourniserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.RPC__ROLEFOURNISERVEUR, oldRolefourniserveur, rolefourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void transfertMessageRPC() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	public void transfertMessageRPCy(RoleRequisRPC role, String message) {
		RoleFourniRPC newrole = (RoleFourniRPC) gluerpc.matchRolesRPC(role);
		newrole.notifyConfig(newrole, message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.RPC__GLUERPC:
				if (resolve) return getGluerpc();
				return basicGetGluerpc();
			case CsPackage.RPC__ROLEREQUISCLIENT:
				if (resolve) return getRolerequisclient();
				return basicGetRolerequisclient();
			case CsPackage.RPC__ROLEREQUISSERVEUR:
				if (resolve) return getRolerequisserveur();
				return basicGetRolerequisserveur();
			case CsPackage.RPC__ROLEFOURNICLIENT:
				if (resolve) return getRolefourniclient();
				return basicGetRolefourniclient();
			case CsPackage.RPC__ROLEFOURNISERVEUR:
				if (resolve) return getRolefourniserveur();
				return basicGetRolefourniserveur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.RPC__GLUERPC:
				setGluerpc((GlueRPC)newValue);
				return;
			case CsPackage.RPC__ROLEREQUISCLIENT:
				setRolerequisclient((RoleRequisRPC)newValue);
				return;
			case CsPackage.RPC__ROLEREQUISSERVEUR:
				setRolerequisserveur((RoleRequisRPC)newValue);
				return;
			case CsPackage.RPC__ROLEFOURNICLIENT:
				setRolefourniclient((RoleFourniRPC)newValue);
				return;
			case CsPackage.RPC__ROLEFOURNISERVEUR:
				setRolefourniserveur((RoleFourniRPC)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.RPC__GLUERPC:
				setGluerpc((GlueRPC)null);
				return;
			case CsPackage.RPC__ROLEREQUISCLIENT:
				setRolerequisclient((RoleRequisRPC)null);
				return;
			case CsPackage.RPC__ROLEREQUISSERVEUR:
				setRolerequisserveur((RoleRequisRPC)null);
				return;
			case CsPackage.RPC__ROLEFOURNICLIENT:
				setRolefourniclient((RoleFourniRPC)null);
				return;
			case CsPackage.RPC__ROLEFOURNISERVEUR:
				setRolefourniserveur((RoleFourniRPC)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.RPC__GLUERPC:
				return gluerpc != null;
			case CsPackage.RPC__ROLEREQUISCLIENT:
				return rolerequisclient != null;
			case CsPackage.RPC__ROLEREQUISSERVEUR:
				return rolerequisserveur != null;
			case CsPackage.RPC__ROLEFOURNICLIENT:
				return rolefourniclient != null;
			case CsPackage.RPC__ROLEFOURNISERVEUR:
				return rolefourniserveur != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CsPackage.RPC___TRANSFERT_MESSAGE_RPC:
				transfertMessageRPC();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RPCImpl
