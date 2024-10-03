package defaultPackage;

import ItinerarioModel.Itinerario;
import ItinerarioModel.ItinerarioModelFactory;
import ItinerarioModel.Vuelo;

public class Main {
	public static void main(String[] arg) {
		
		Itinerario itinerario = ItinerarioModelFactory.eINSTANCE.createItinerario();
		itinerario.setPasajero("Juan Pérez");

		Vuelo vuelo1 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo1.setNombre("AA123");
		vuelo1.setOrigen("Madrid");
		vuelo1.setDestino("Nueva York");

		Vuelo vuelo2 = ItinerarioModelFactory.eINSTANCE.createVuelo();
		vuelo2.setNombre("AA456");
		vuelo2.setOrigen("Nueva York");
		vuelo2.setDestino("Los Ángeles");


		itinerario.getVuelos().add(vuelo1);
		itinerario.getVuelos().add(vuelo2);
		
		System.out.print(vuelo1);
		System.out.print(vuelo2);

	}

}