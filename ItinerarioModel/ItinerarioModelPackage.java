/**
 */
package ItinerarioModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ItinerarioModel.ItinerarioModelFactory
 * @model kind="package"
 * @generated
 */
public interface ItinerarioModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ItinerarioModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://humboldt/itinerario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "humboldt.itinerario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItinerarioModelPackage eINSTANCE = ItinerarioModel.impl.ItinerarioModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ItinerarioModel.impl.ItinerarioImpl <em>Itinerario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioModel.impl.ItinerarioImpl
	 * @see ItinerarioModel.impl.ItinerarioModelPackageImpl#getItinerario()
	 * @generated
	 */
	int ITINERARIO = 0;

	/**
	 * The feature id for the '<em><b>Pasajero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__PASAJERO = 0;

	/**
	 * The feature id for the '<em><b>Vuelos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO__VUELOS = 1;

	/**
	 * The number of structural features of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Itinerario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ItinerarioModel.impl.VueloImpl <em>Vuelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ItinerarioModel.impl.VueloImpl
	 * @see ItinerarioModel.impl.ItinerarioModelPackageImpl#getVuelo()
	 * @generated
	 */
	int VUELO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__SALIDA = 3;

	/**
	 * The feature id for the '<em><b>Llegada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO__LLEGADA = 4;

	/**
	 * The number of structural features of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vuelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUELO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ItinerarioModel.Itinerario <em>Itinerario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itinerario</em>'.
	 * @see ItinerarioModel.Itinerario
	 * @generated
	 */
	EClass getItinerario();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Itinerario#getPasajero <em>Pasajero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pasajero</em>'.
	 * @see ItinerarioModel.Itinerario#getPasajero()
	 * @see #getItinerario()
	 * @generated
	 */
	EAttribute getItinerario_Pasajero();

	/**
	 * Returns the meta object for the containment reference list '{@link ItinerarioModel.Itinerario#getVuelos <em>Vuelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vuelos</em>'.
	 * @see ItinerarioModel.Itinerario#getVuelos()
	 * @see #getItinerario()
	 * @generated
	 */
	EReference getItinerario_Vuelos();

	/**
	 * Returns the meta object for class '{@link ItinerarioModel.Vuelo <em>Vuelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vuelo</em>'.
	 * @see ItinerarioModel.Vuelo
	 * @generated
	 */
	EClass getVuelo();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Vuelo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ItinerarioModel.Vuelo#getNombre()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Vuelo#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see ItinerarioModel.Vuelo#getOrigen()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Origen();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Vuelo#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destino</em>'.
	 * @see ItinerarioModel.Vuelo#getDestino()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Destino();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Vuelo#getSalida <em>Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salida</em>'.
	 * @see ItinerarioModel.Vuelo#getSalida()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Salida();

	/**
	 * Returns the meta object for the attribute '{@link ItinerarioModel.Vuelo#getLlegada <em>Llegada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Llegada</em>'.
	 * @see ItinerarioModel.Vuelo#getLlegada()
	 * @see #getVuelo()
	 * @generated
	 */
	EAttribute getVuelo_Llegada();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItinerarioModelFactory getItinerarioModelFactory();

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
		 * The meta object literal for the '{@link ItinerarioModel.impl.ItinerarioImpl <em>Itinerario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioModel.impl.ItinerarioImpl
		 * @see ItinerarioModel.impl.ItinerarioModelPackageImpl#getItinerario()
		 * @generated
		 */
		EClass ITINERARIO = eINSTANCE.getItinerario();

		/**
		 * The meta object literal for the '<em><b>Pasajero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITINERARIO__PASAJERO = eINSTANCE.getItinerario_Pasajero();

		/**
		 * The meta object literal for the '<em><b>Vuelos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITINERARIO__VUELOS = eINSTANCE.getItinerario_Vuelos();

		/**
		 * The meta object literal for the '{@link ItinerarioModel.impl.VueloImpl <em>Vuelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ItinerarioModel.impl.VueloImpl
		 * @see ItinerarioModel.impl.ItinerarioModelPackageImpl#getVuelo()
		 * @generated
		 */
		EClass VUELO = eINSTANCE.getVuelo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__NOMBRE = eINSTANCE.getVuelo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__ORIGEN = eINSTANCE.getVuelo_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__DESTINO = eINSTANCE.getVuelo_Destino();

		/**
		 * The meta object literal for the '<em><b>Salida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__SALIDA = eINSTANCE.getVuelo_Salida();

		/**
		 * The meta object literal for the '<em><b>Llegada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUELO__LLEGADA = eINSTANCE.getVuelo_Llegada();

	}

} //ItinerarioModelPackage
