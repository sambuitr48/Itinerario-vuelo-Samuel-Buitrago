/**
 */
package ItinerarioModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioModel.Itinerario#getPasajero <em>Pasajero</em>}</li>
 *   <li>{@link ItinerarioModel.Itinerario#getVuelos <em>Vuelos</em>}</li>
 * </ul>
 *
 * @see ItinerarioModel.ItinerarioModelPackage#getItinerario()
 * @model
 * @generated
 */
public interface Itinerario extends EObject {
	/**
	 * Returns the value of the '<em><b>Pasajero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pasajero</em>' attribute.
	 * @see #setPasajero(String)
	 * @see ItinerarioModel.ItinerarioModelPackage#getItinerario_Pasajero()
	 * @model
	 * @generated
	 */
	String getPasajero();

	/**
	 * Sets the value of the '{@link ItinerarioModel.Itinerario#getPasajero <em>Pasajero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pasajero</em>' attribute.
	 * @see #getPasajero()
	 * @generated
	 */
	void setPasajero(String value);

	/**
	 * Returns the value of the '<em><b>Vuelos</b></em>' containment reference list.
	 * The list contents are of type {@link ItinerarioModel.Vuelo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vuelos</em>' containment reference list.
	 * @see ItinerarioModel.ItinerarioModelPackage#getItinerario_Vuelos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vuelo> getVuelos();

} // Itinerario
