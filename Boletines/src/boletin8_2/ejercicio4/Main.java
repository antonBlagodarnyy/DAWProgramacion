package boletin8_2.ejercicio4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Probamos 1 alquiler
	Inquilino jaime = new Inquilino ("Jaime","12345678X");
	Piso tropical = new Piso (1,3,240);
	Alquiler jaimeTropical = new Alquiler (jaime,tropical,LocalDate.now());
	System.out.println(jaimeTropical.toString());
	
		//Probamos 2 alquileres
	Inquilino manuel = new Inquilino ("manuel","2391829H");
	Piso playa = new Piso (7,1,400);
	Alquiler manuelPlaya = new Alquiler (manuel,playa,LocalDate.now());
	System.out.println(manuelPlaya.toString());
	
		//Probamos 3 alquileres
	Inquilino juan = new Inquilino ("juan","987654J");
	Piso montaña = new Piso (7,1,350);
	Alquiler juanMontaña = new Alquiler (juan,montaña,LocalDate.now());
	System.out.println(juanMontaña.toString());
	
		//Probamos todos los alquileres
	System.out.println(Alquiler.toStringListaAlquileres());
	
		//Probamos el alquiler mas alto
	System.out.println(Alquiler.getAlquilerMasCaro());
	}

}
