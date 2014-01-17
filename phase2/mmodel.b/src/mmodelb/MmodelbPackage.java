/**
 */
package mmodelb;

import mmodela.MmodelaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mmodelb.MmodelbFactory
 * @model kind="package"
 * @generated
 */
public interface MmodelbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mmodelb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mmodelb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mmodelb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmodelbPackage eINSTANCE = mmodelb.impl.MmodelbPackageImpl.init();

	/**
	 * The meta object id for the '{@link mmodelb.impl.ItemBImpl <em>Item B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmodelb.impl.ItemBImpl
	 * @see mmodelb.impl.MmodelbPackageImpl#getItemB()
	 * @generated
	 */
	int ITEM_B = 0;

	/**
	 * The number of structural features of the '<em>Item B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_B_FEATURE_COUNT = MmodelaPackage.ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_B_OPERATION_COUNT = MmodelaPackage.ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mmodelb.ItemB <em>Item B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item B</em>'.
	 * @see mmodelb.ItemB
	 * @generated
	 */
	EClass getItemB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmodelbFactory getMmodelbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mmodelb.impl.ItemBImpl <em>Item B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmodelb.impl.ItemBImpl
		 * @see mmodelb.impl.MmodelbPackageImpl#getItemB()
		 * @generated
		 */
		EClass ITEM_B = eINSTANCE.getItemB();

	}

} //MmodelbPackage
