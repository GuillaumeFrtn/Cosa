/**
 */
package cosa.impl;

import cosa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CosaFactoryImpl extends EFactoryImpl implements CosaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CosaFactory init() {
		try {
			CosaFactory theCosaFactory = (CosaFactory)EPackage.Registry.INSTANCE.getEFactory(CosaPackage.eNS_URI);
			if (theCosaFactory != null) {
				return theCosaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CosaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CosaPackage.ELEMENT: return createElement();
			case CosaPackage.CONFIGURATION: return createConfiguration();
			case CosaPackage.ECOMPOSANT: return createEComposant();
			case CosaPackage.ECONNECTEUR: return createEConnecteur();
			case CosaPackage.GLUE: return createGlue();
			case CosaPackage.PORT_REQUIS: return createPortRequis();
			case CosaPackage.PORT_FOURNI: return createPortFourni();
			case CosaPackage.SERVICE_REQUIS: return createServiceRequis();
			case CosaPackage.SERVICE_FOURNI: return createServiceFourni();
			case CosaPackage.ROLE_REQUIS: return createRoleRequis();
			case CosaPackage.ROLE_FOURNI: return createRoleFourni();
			case CosaPackage.ATTACHMENT: return createAttachment();
			case CosaPackage.BINDING: return createBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComposant createEComposant() {
		EComposantImpl eComposant = new EComposantImpl();
		return eComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConnecteur createEConnecteur() {
		EConnecteurImpl eConnecteur = new EConnecteurImpl();
		return eConnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis createPortRequis() {
		PortRequisImpl portRequis = new PortRequisImpl();
		return portRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourni createPortFourni() {
		PortFourniImpl portFourni = new PortFourniImpl();
		return portFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequis createServiceRequis() {
		ServiceRequisImpl serviceRequis = new ServiceRequisImpl();
		return serviceRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourni createServiceFourni() {
		ServiceFourniImpl serviceFourni = new ServiceFourniImpl();
		return serviceFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleRequis() {
		RoleRequisImpl roleRequis = new RoleRequisImpl();
		return roleRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFourni createRoleFourni() {
		RoleFourniImpl roleFourni = new RoleFourniImpl();
		return roleFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosaPackage getCosaPackage() {
		return (CosaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CosaPackage getPackage() {
		return CosaPackage.eINSTANCE;
	}

} //CosaFactoryImpl
