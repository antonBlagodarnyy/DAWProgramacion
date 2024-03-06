package boletin9.ejercicio1;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		//test creacion de relojes
		RelojDigital testDigital = new RelojDigital (true,LocalTime.of(16, 23));
		RelojAnalogico testAnalogico = new RelojAnalogico (true,LocalTime.of(12, 25));
		System.out.println(testDigital.toString());
		System.out.println(testAnalogico.toString());

		//test mostrar hora y activar/desactivar alarma
		System.out.println("Hora inicial: y alarma activa:");
		System.out.println(testDigital.mostrarHora());
		
		System.out.println("Hora inicial y alarma desactivada:");
		testDigital.desactivarAlarma();
		System.out.println(testDigital.mostrarHora());
		
		System.out.println("Volvemos a activar la alarma:");
		testDigital.activarAlarma();
		System.out.println(testDigital.mostrarHora());
		
		//test estableceAlarma
		System.out.println("Cambiamos la hora de la alarma:");
		testDigital.establecerAlarma(12, 50);
		System.out.println(testDigital.mostrarHora());
	}

}
