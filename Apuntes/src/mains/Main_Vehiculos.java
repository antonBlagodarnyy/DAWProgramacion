package mains;

import objetos.vehiculos.Coche;

public class Main_Vehiculos {

	public static void main(String[] args) {
		Coche s = new Coche("Ford Fiesta", "2746M");
		s.setKm(30);
		
		Coche a = new Coche("Nissan", "3123M");
		a.setKm(60);
		
		System.out.println(Coche.getKmTotales());
		System.out.println(Coche.getCochesCreados());
	}

}
