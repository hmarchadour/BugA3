/**
 */
package mmodelb.impl;

import mmodela.MmodelaPackage;

import mmodelb.ItemB;
import mmodelb.MmodelbFactory;
import mmodelb.MmodelbPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmodelbPackageImpl extends EPackageImpl implements MmodelbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemBEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mmodelb.MmodelbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MmodelbPackageImpl() {
		super(eNS_URI, MmodelbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MmodelbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MmodelbPackage init() {
		if (isInited) return (MmodelbPackage)EPackage.Registry.INSTANCE.getEPackage(MmodelbPackage.eNS_URI);

		// Obtain or create and register package
		MmodelbPackageImpl theMmodelbPackage = (MmodelbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MmodelbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MmodelbPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MmodelaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMmodelbPackage.createPackageContents();

		// Initialize created meta-data
		theMmodelbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMmodelbPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MmodelbPackage.eNS_URI, theMmodelbPackage);
		return theMmodelbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemB() {
		return itemBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmodelbFactory getMmodelbFactory() {
		return (MmodelbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		itemBEClass = createEClass(ITEM_B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MmodelaPackage theMmodelaPackage = (MmodelaPackage)EPackage.Registry.INSTANCE.getEPackage(MmodelaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemBEClass.getESuperTypes().add(theMmodelaPackage.getItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(itemBEClass, ItemB.class, "ItemB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MmodelbPackageImpl
