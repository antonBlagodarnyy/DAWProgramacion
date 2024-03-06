package boletin9.ejercicio3;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Pelicula peliculaTest = new Pelicula("Miedo y Asco En las Vegas", "Hunter S. Thompson", Generos.COMEDIA);
		Cliente clienteTest = new Cliente("Blagodarnyy","x3692392h");
		Alquiler alquilerTest = new Alquiler(clienteTest, peliculaTest, LocalDate.now());
		
		System.out.println(peliculaTest.toString());
		System.out.println(clienteTest.toString());
		System.out.println(alquilerTest.toString());
	}

}
