/**
 */
package ItinerarioModel.impl;

import ItinerarioModel.Itinerario;
import ItinerarioModel.ItinerarioModelPackage;
import ItinerarioModel.Vuelo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Itinerario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ItinerarioModel.impl.ItinerarioImpl#getPasajero <em>Pasajero</em>}</li>
 *   <li>{@link ItinerarioModel.impl.ItinerarioImpl#getVuelos <em>Vuelos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItinerarioImpl extends MinimalEObjectImpl.Container implements Itinerario {
	/**
	 * The default value of the '{@link #getPasajero() <em>Pasajero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajero()
	 * @generated
	 * @ordered
	 */
	protected static final String PASAJERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasajero() <em>Pasajero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajero()
	 * @generated
	 * @ordered
	 */
	protected String pasajero = PASAJERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVuelos() <em>Vuelos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVuelos()
	 * @generated
	 * @ordered
	 */
	protected EList<Vuelo> vuelos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItinerarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItinerarioModelPackage.Literals.ITINERARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasajero() {
		return pasajero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasajero(String newPasajero) {
		String oldPasajero = pasajero;
		pasajero = newPasajero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItinerarioModelPackage.ITINERARIO__PASAJERO, oldPasajero, pasajero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vuelo> getVuelos() {
		if (vuelos == null) {
			vuelos = new EObjectContainmentEList<Vuelo>(Vuelo.class, this, ItinerarioModelPackage.ITINERARIO__VUELOS);
		}
		return vuelos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				return ((InternalEList<?>)getVuelos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__PASAJERO:
				return getPasajero();
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				return getVuelos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItinerarioModelPackage.ITINERARIO__PASAJERO:
				setPasajero((String)newValue);
				return;
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
				getVuelos().addAll((Collection<? extends Vuelo>)newValue);
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
			case ItinerarioModelPackage.ITINERARIO__PASAJERO:
				setPasajero(PASAJERO_EDEFAULT);
				return;
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				getVuelos().clear();
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
			case ItinerarioModelPackage.ITINERARIO__PASAJERO:
				return PASAJERO_EDEFAULT == null ? pasajero != null : !PASAJERO_EDEFAULT.equals(pasajero);
			case ItinerarioModelPackage.ITINERARIO__VUELOS:
				return vuelos != null && !vuelos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pasajero: ");
		result.append(pasajero);
		result.append(')');
		return result.toString();
	}

} //ItinerarioImpl
