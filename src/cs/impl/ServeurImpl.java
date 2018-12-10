/**
 */
package cs.impl;

import cosa.impl.ConfigurationImpl;

import cs.AttachCONNECTIONsql;
import cs.AttachDBsql;
import cs.BindingServeurConnectionM;
import cs.CS;
import cs.ConnectionManager;
import cs.CsPackage;
import cs.DataBase;
import cs.PortFourniConnectionM;
import cs.PortFourniDataBase;
import cs.PortFourniServeur;
import cs.PortRequisConnectionM;
import cs.PortRequisDataBase;
import cs.PortRequisServeur;
import cs.RoleFourniSQLquery;
import cs.RoleRequisSQLquery;
import cs.SQLquery;
import cs.Serveur;
import cs.ServiceFourniServeur;
import cs.ServiceRequisServeur;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cs.impl.ServeurImpl#getPortrequisserveur <em>Portrequisserveur</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getPortfourniserveur <em>Portfourniserveur</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getServicerequisserveur <em>Servicerequisserveur</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getServicefourniserveur <em>Servicefourniserveur</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getSqlquery <em>Sqlquery</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getAttachconnectionsql <em>Attachconnectionsql</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getAttachdbsql <em>Attachdbsql</em>}</li>
 *   <li>{@link cs.impl.ServeurImpl#getBindingserveurconnectionm <em>Bindingserveurconnectionm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurImpl extends ConfigurationImpl implements Serveur {
	/**
	 * The cached value of the '{@link #getPortrequisserveur() <em>Portrequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisserveur()
	 * @generated
	 * @ordered
	 */
	protected PortRequisServeur portrequisserveur;

	/**
	 * The cached value of the '{@link #getPortfourniserveur() <em>Portfourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniserveur()
	 * @generated
	 * @ordered
	 */
	protected PortFourniServeur portfourniserveur;

	/**
	 * The cached value of the '{@link #getServicerequisserveur() <em>Servicerequisserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerequisserveur()
	 * @generated
	 * @ordered
	 */
	protected ServiceRequisServeur servicerequisserveur;

	/**
	 * The cached value of the '{@link #getServicefourniserveur() <em>Servicefourniserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicefourniserveur()
	 * @generated
	 * @ordered
	 */
	protected ServiceFourniServeur servicefourniserveur;

	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected ConnectionManager connectionmanager;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DataBase database;

	/**
	 * The cached value of the '{@link #getSqlquery() <em>Sqlquery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlquery()
	 * @generated
	 * @ordered
	 */
	protected SQLquery sqlquery;

	/**
	 * The cached value of the '{@link #getAttachconnectionsql() <em>Attachconnectionsql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachconnectionsql()
	 * @generated
	 * @ordered
	 */
	protected AttachCONNECTIONsql attachconnectionsql;

	/**
	 * The cached value of the '{@link #getAttachdbsql() <em>Attachdbsql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachdbsql()
	 * @generated
	 * @ordered
	 */
	protected AttachDBsql attachdbsql;

	/**
	 * The cached value of the '{@link #getBindingserveurconnectionm() <em>Bindingserveurconnectionm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingserveurconnectionm()
	 * @generated
	 * @ordered
	 */
	protected BindingServeurConnectionM bindingserveurconnectionm;
	
	private HashMap<RoleFourniSQLquery, AttachCONNECTIONsql> rolesCorrespondanceCM;
	private HashMap<RoleFourniSQLquery, AttachDBsql> rolesCorrespondanceDB;
	private HashMap<PortFourniConnectionM, PortRequisServeur> portCorrespondanceServeur;
	private HashMap<PortFourniConnectionM, RoleRequisSQLquery> portCorrespondanceSQLquery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurImpl() {
		super();
	}
	
	protected ServeurImpl(CS observer) {
		super();
		portrequisserveur = new PortRequisServeurImpl();
		portfourniserveur = new PortFourniServeurImpl();
		
		portrequisserveur.addObserver(this);
		portfourniserveur.addObserver(observer);
		
		servicerequisserveur = new ServiceRequisServeurImpl();
		servicefourniserveur = new ServiceFourniServeurImpl();
		
		connectionmanager = new ConnectionManagerImpl(this);
		database = new DataBaseImpl(this);
		sqlquery = new SQLqueryImpl(this);
		
		attachconnectionsql = new AttachCONNECTIONsqlImpl(connectionmanager.getPortfournicmdatabase(), sqlquery.getRolerequiscmsqlquery(), sqlquery.getRolefournisqlquerycm(), connectionmanager.getPortrequisdatabasecm());
		attachdbsql = new AttachDBsqlImpl(sqlquery.getRolefournisqlquerydb(), database.getPortrequisdatabase(), database.getPortfournidatabase(), sqlquery.getRolerequisdbsqlquery());
		
		bindingserveurconnectionm = new BindingServeurConnectionMImpl(portrequisserveur, connectionmanager.getPortrequisserveurcm(), connectionmanager.getPortfournicmserveur(), portfourniserveur);
		
		rolesCorrespondanceCM = new HashMap<RoleFourniSQLquery, AttachCONNECTIONsql>();
		rolesCorrespondanceDB = new HashMap<RoleFourniSQLquery, AttachDBsql>();
		portCorrespondanceServeur = new HashMap<PortFourniConnectionM, PortRequisServeur>();
		portCorrespondanceSQLquery = new HashMap<PortFourniConnectionM, RoleRequisSQLquery>();
		
		rolesCorrespondanceCM.put(sqlquery.getRolefournisqlquerycm(), attachconnectionsql);
		rolesCorrespondanceDB.put(sqlquery.getRolefournisqlquerydb(), attachdbsql);
		portCorrespondanceServeur.put(connectionmanager.getPortfournicmserveur(), portrequisserveur);
		portCorrespondanceSQLquery.put(connectionmanager.getPortfournicmdatabase(), sqlquery.getRolerequiscmsqlquery());
	}
	
	public void transfert(PortFourniConnectionM port, String message)
	{
		if(portCorrespondanceServeur.containsKey(port))
		{
			portfourniserveur.notifyConfig(message);
		}
		else if (portCorrespondanceSQLquery.containsKey(port))
		{
			attachconnectionsql.getCorrespondance(port).notifySQLquery(message);
		}
	}
	
	public void transfert(PortFourniDataBase port, String message)
	{
		attachdbsql.getCorrespondance(port).notifySQLquery(message);
	}
	
	public void transfert(RoleFourniSQLquery role, String message)
	{
		if(rolesCorrespondanceCM.containsKey(role))
		{
			attachconnectionsql.getCorrespondance(role).notifyConnectionManager(message);
		}
		else if (rolesCorrespondanceDB.containsKey(role))
		{
			attachdbsql.getCorrespondance(role).notifyDataBase(message);
		}
	}
	
	public void transfert(PortRequisServeur port, String message)
	{
		bindingserveurconnectionm.getPortrequisserveurcm().notifyConnectionManager(message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisServeur getPortrequisserveur() {
		if (portrequisserveur != null && portrequisserveur.eIsProxy()) {
			InternalEObject oldPortrequisserveur = (InternalEObject)portrequisserveur;
			portrequisserveur = (PortRequisServeur)eResolveProxy(oldPortrequisserveur);
			if (portrequisserveur != oldPortrequisserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
			}
		}
		return portrequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisServeur basicGetPortrequisserveur() {
		return portrequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisserveur(PortRequisServeur newPortrequisserveur) {
		PortRequisServeur oldPortrequisserveur = portrequisserveur;
		portrequisserveur = newPortrequisserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__PORTREQUISSERVEUR, oldPortrequisserveur, portrequisserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniServeur getPortfourniserveur() {
		if (portfourniserveur != null && portfourniserveur.eIsProxy()) {
			InternalEObject oldPortfourniserveur = (InternalEObject)portfourniserveur;
			portfourniserveur = (PortFourniServeur)eResolveProxy(oldPortfourniserveur);
			if (portfourniserveur != oldPortfourniserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
			}
		}
		return portfourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniServeur basicGetPortfourniserveur() {
		return portfourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniserveur(PortFourniServeur newPortfourniserveur) {
		PortFourniServeur oldPortfourniserveur = portfourniserveur;
		portfourniserveur = newPortfourniserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__PORTFOURNISERVEUR, oldPortfourniserveur, portfourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisServeur getServicerequisserveur() {
		if (servicerequisserveur != null && servicerequisserveur.eIsProxy()) {
			InternalEObject oldServicerequisserveur = (InternalEObject)servicerequisserveur;
			servicerequisserveur = (ServiceRequisServeur)eResolveProxy(oldServicerequisserveur);
			if (servicerequisserveur != oldServicerequisserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__SERVICEREQUISSERVEUR, oldServicerequisserveur, servicerequisserveur));
			}
		}
		return servicerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequisServeur basicGetServicerequisserveur() {
		return servicerequisserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicerequisserveur(ServiceRequisServeur newServicerequisserveur) {
		ServiceRequisServeur oldServicerequisserveur = servicerequisserveur;
		servicerequisserveur = newServicerequisserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__SERVICEREQUISSERVEUR, oldServicerequisserveur, servicerequisserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniServeur getServicefourniserveur() {
		if (servicefourniserveur != null && servicefourniserveur.eIsProxy()) {
			InternalEObject oldServicefourniserveur = (InternalEObject)servicefourniserveur;
			servicefourniserveur = (ServiceFourniServeur)eResolveProxy(oldServicefourniserveur);
			if (servicefourniserveur != oldServicefourniserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__SERVICEFOURNISERVEUR, oldServicefourniserveur, servicefourniserveur));
			}
		}
		return servicefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourniServeur basicGetServicefourniserveur() {
		return servicefourniserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicefourniserveur(ServiceFourniServeur newServicefourniserveur) {
		ServiceFourniServeur oldServicefourniserveur = servicefourniserveur;
		servicefourniserveur = newServicefourniserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__SERVICEFOURNISERVEUR, oldServicefourniserveur, servicefourniserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager getConnectionmanager() {
		if (connectionmanager != null && connectionmanager.eIsProxy()) {
			InternalEObject oldConnectionmanager = (InternalEObject)connectionmanager;
			connectionmanager = (ConnectionManager)eResolveProxy(oldConnectionmanager);
			if (connectionmanager != oldConnectionmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
			}
		}
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager basicGetConnectionmanager() {
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionmanager(ConnectionManager newConnectionmanager) {
		ConnectionManager oldConnectionmanager = connectionmanager;
		connectionmanager = newConnectionmanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DataBase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DataBase newDatabase) {
		DataBase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLquery getSqlquery() {
		if (sqlquery != null && sqlquery.eIsProxy()) {
			InternalEObject oldSqlquery = (InternalEObject)sqlquery;
			sqlquery = (SQLquery)eResolveProxy(oldSqlquery);
			if (sqlquery != oldSqlquery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__SQLQUERY, oldSqlquery, sqlquery));
			}
		}
		return sqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLquery basicGetSqlquery() {
		return sqlquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlquery(SQLquery newSqlquery) {
		SQLquery oldSqlquery = sqlquery;
		sqlquery = newSqlquery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__SQLQUERY, oldSqlquery, sqlquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachCONNECTIONsql getAttachconnectionsql() {
		if (attachconnectionsql != null && attachconnectionsql.eIsProxy()) {
			InternalEObject oldAttachconnectionsql = (InternalEObject)attachconnectionsql;
			attachconnectionsql = (AttachCONNECTIONsql)eResolveProxy(oldAttachconnectionsql);
			if (attachconnectionsql != oldAttachconnectionsql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__ATTACHCONNECTIONSQL, oldAttachconnectionsql, attachconnectionsql));
			}
		}
		return attachconnectionsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachCONNECTIONsql basicGetAttachconnectionsql() {
		return attachconnectionsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachconnectionsql(AttachCONNECTIONsql newAttachconnectionsql) {
		AttachCONNECTIONsql oldAttachconnectionsql = attachconnectionsql;
		attachconnectionsql = newAttachconnectionsql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__ATTACHCONNECTIONSQL, oldAttachconnectionsql, attachconnectionsql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachDBsql getAttachdbsql() {
		if (attachdbsql != null && attachdbsql.eIsProxy()) {
			InternalEObject oldAttachdbsql = (InternalEObject)attachdbsql;
			attachdbsql = (AttachDBsql)eResolveProxy(oldAttachdbsql);
			if (attachdbsql != oldAttachdbsql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__ATTACHDBSQL, oldAttachdbsql, attachdbsql));
			}
		}
		return attachdbsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachDBsql basicGetAttachdbsql() {
		return attachdbsql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachdbsql(AttachDBsql newAttachdbsql) {
		AttachDBsql oldAttachdbsql = attachdbsql;
		attachdbsql = newAttachdbsql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__ATTACHDBSQL, oldAttachdbsql, attachdbsql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeurConnectionM getBindingserveurconnectionm() {
		if (bindingserveurconnectionm != null && bindingserveurconnectionm.eIsProxy()) {
			InternalEObject oldBindingserveurconnectionm = (InternalEObject)bindingserveurconnectionm;
			bindingserveurconnectionm = (BindingServeurConnectionM)eResolveProxy(oldBindingserveurconnectionm);
			if (bindingserveurconnectionm != oldBindingserveurconnectionm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM, oldBindingserveurconnectionm, bindingserveurconnectionm));
			}
		}
		return bindingserveurconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeurConnectionM basicGetBindingserveurconnectionm() {
		return bindingserveurconnectionm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingserveurconnectionm(BindingServeurConnectionM newBindingserveurconnectionm) {
		BindingServeurConnectionM oldBindingserveurconnectionm = bindingserveurconnectionm;
		bindingserveurconnectionm = newBindingserveurconnectionm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM, oldBindingserveurconnectionm, bindingserveurconnectionm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.SERVEUR__PORTREQUISSERVEUR:
				if (resolve) return getPortrequisserveur();
				return basicGetPortrequisserveur();
			case CsPackage.SERVEUR__PORTFOURNISERVEUR:
				if (resolve) return getPortfourniserveur();
				return basicGetPortfourniserveur();
			case CsPackage.SERVEUR__SERVICEREQUISSERVEUR:
				if (resolve) return getServicerequisserveur();
				return basicGetServicerequisserveur();
			case CsPackage.SERVEUR__SERVICEFOURNISERVEUR:
				if (resolve) return getServicefourniserveur();
				return basicGetServicefourniserveur();
			case CsPackage.SERVEUR__CONNECTIONMANAGER:
				if (resolve) return getConnectionmanager();
				return basicGetConnectionmanager();
			case CsPackage.SERVEUR__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case CsPackage.SERVEUR__SQLQUERY:
				if (resolve) return getSqlquery();
				return basicGetSqlquery();
			case CsPackage.SERVEUR__ATTACHCONNECTIONSQL:
				if (resolve) return getAttachconnectionsql();
				return basicGetAttachconnectionsql();
			case CsPackage.SERVEUR__ATTACHDBSQL:
				if (resolve) return getAttachdbsql();
				return basicGetAttachdbsql();
			case CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM:
				if (resolve) return getBindingserveurconnectionm();
				return basicGetBindingserveurconnectionm();
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
			case CsPackage.SERVEUR__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)newValue);
				return;
			case CsPackage.SERVEUR__PORTFOURNISERVEUR:
				setPortfourniserveur((PortFourniServeur)newValue);
				return;
			case CsPackage.SERVEUR__SERVICEREQUISSERVEUR:
				setServicerequisserveur((ServiceRequisServeur)newValue);
				return;
			case CsPackage.SERVEUR__SERVICEFOURNISERVEUR:
				setServicefourniserveur((ServiceFourniServeur)newValue);
				return;
			case CsPackage.SERVEUR__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)newValue);
				return;
			case CsPackage.SERVEUR__DATABASE:
				setDatabase((DataBase)newValue);
				return;
			case CsPackage.SERVEUR__SQLQUERY:
				setSqlquery((SQLquery)newValue);
				return;
			case CsPackage.SERVEUR__ATTACHCONNECTIONSQL:
				setAttachconnectionsql((AttachCONNECTIONsql)newValue);
				return;
			case CsPackage.SERVEUR__ATTACHDBSQL:
				setAttachdbsql((AttachDBsql)newValue);
				return;
			case CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM:
				setBindingserveurconnectionm((BindingServeurConnectionM)newValue);
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
			case CsPackage.SERVEUR__PORTREQUISSERVEUR:
				setPortrequisserveur((PortRequisServeur)null);
				return;
			case CsPackage.SERVEUR__PORTFOURNISERVEUR:
				setPortfourniserveur((PortFourniServeur)null);
				return;
			case CsPackage.SERVEUR__SERVICEREQUISSERVEUR:
				setServicerequisserveur((ServiceRequisServeur)null);
				return;
			case CsPackage.SERVEUR__SERVICEFOURNISERVEUR:
				setServicefourniserveur((ServiceFourniServeur)null);
				return;
			case CsPackage.SERVEUR__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)null);
				return;
			case CsPackage.SERVEUR__DATABASE:
				setDatabase((DataBase)null);
				return;
			case CsPackage.SERVEUR__SQLQUERY:
				setSqlquery((SQLquery)null);
				return;
			case CsPackage.SERVEUR__ATTACHCONNECTIONSQL:
				setAttachconnectionsql((AttachCONNECTIONsql)null);
				return;
			case CsPackage.SERVEUR__ATTACHDBSQL:
				setAttachdbsql((AttachDBsql)null);
				return;
			case CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM:
				setBindingserveurconnectionm((BindingServeurConnectionM)null);
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
			case CsPackage.SERVEUR__PORTREQUISSERVEUR:
				return portrequisserveur != null;
			case CsPackage.SERVEUR__PORTFOURNISERVEUR:
				return portfourniserveur != null;
			case CsPackage.SERVEUR__SERVICEREQUISSERVEUR:
				return servicerequisserveur != null;
			case CsPackage.SERVEUR__SERVICEFOURNISERVEUR:
				return servicefourniserveur != null;
			case CsPackage.SERVEUR__CONNECTIONMANAGER:
				return connectionmanager != null;
			case CsPackage.SERVEUR__DATABASE:
				return database != null;
			case CsPackage.SERVEUR__SQLQUERY:
				return sqlquery != null;
			case CsPackage.SERVEUR__ATTACHCONNECTIONSQL:
				return attachconnectionsql != null;
			case CsPackage.SERVEUR__ATTACHDBSQL:
				return attachdbsql != null;
			case CsPackage.SERVEUR__BINDINGSERVEURCONNECTIONM:
				return bindingserveurconnectionm != null;
		}
		return super.eIsSet(featureID);
	}

} //ServeurImpl
