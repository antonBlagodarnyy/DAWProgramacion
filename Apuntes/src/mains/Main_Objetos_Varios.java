package mains;
import java.time.*;

import enums.Color;
import modelo.Juguete;
import objetos.animales.Perro;
import objetos.persona.Persona;
import objetos.persona.Superheroe;

public class Main_Objetos_Varios {

	public static void main(String[] args) {
		/*	probamos constructor por defecto y metodos simples
		 * 
		 * Vehiculo bicicletaRoja = new Vehiculo();
		bicicletaRoja.acelerar();
		bicicletaRoja.acelerar();
		bicicletaRoja.mostrarEstado();
		 */

		/*comprobamos que los objetos apuntan a una direccion de memoria con atributos,similar a los arrays, y que cuando igualamos 
		 * 2 objetos, el segundo pasa a apuntar a la memoria del primero.
		 * 
		 * Se puede revisar esto debugeando los objetos antes y despues de igualarlos.
		 */
		/*
		 * Libro libro1 = new Libro("13-12321", "Pepe", "La casa", 20);
		 *

		Libro libro2 = new Libro("Manuel", "La isla");

		libro2 = libro1;
		 */
		
		/*Cubo cuboPrototipo = new Cubo();//creamos el cubo vacio
		
		cuboPrototipo.setCapacidadActual(7);//le echamos 7 litros

		System.out.println();
		System.out.println("CuboPrototipo:");//lo imprimimos
		cuboPrototipo.pintar();
		System.out.println("\nSalto de linea");
		
		Cubo cuboSegundo = new Cubo(cuboPrototipo);//creamos un segundo cubo que es una copia del prototipo
		
		cuboSegundo.volcarCubo(cuboPrototipo);//lo volcamos

		//comprobamos que el primer cubo pasa a estar lleno, y al segundo le quedan 4 litros
		System.out.println();
		System.out.println("CuboPrototipo:");
		cuboPrototipo.pintar();
		
		System.out.println();
		System.out.println("CuboSegundo:");
		cuboSegundo.pintar();
*/
		/*LocalDate fechaNacimiento1 = LocalDate.of(1958, Month.JANUARY, 5);
		LocalDate fechaNacimiento2 = LocalDate.of(1832, Month.FEBRUARY, 20);
		
		Persona pepito = new Persona ("pepito", 347289,fechaNacimiento1);
		Persona jaimito = new Persona ("jaimito", 347289,fechaNacimiento2);

	System.out.println(Persona.masJoven(jaimito,pepito));
*/	
		/*Persona [] alumnos;
		alumnos = new Persona[30];
		alumnos[0]= new Persona (LocalDate.of(2004, 3, 31), "John");
		alumnos[1]= new Persona (LocalDate.of(2002, 3, 2), "Alejandro");
		alumnos[2]= new Persona (LocalDate.of(2001, 3, 31), "Pablo");
		alumnos[3]= new Persona (LocalDate.of(2000, 11, 31), "Sergio");
		alumnos[4]= new Persona (LocalDate.of(2005, 3, 31), "Jose Maria");

		for(Persona persona:alumnos) {
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("año: "+persona.getFechaNacimiento().getYear());
		}
	}
	*/
	/*	
	Persona cristian=new Persona("Cristian");
	System.out.println("su nombre "+cristian.getNombre());
		
		Superheroe spiderman=new Superheroe ("Peter","...");
		System.out.println("El nombre del heroe "+spiderman.getNombre());
		*/
		
		Juguete huesoPlastico = new Juguete("hueso de plastico", false, 10);
		Perro perro1 = new Perro("Lia", Color.NEGRO, null );
		Persona p1 = new Persona ("Pepe");
		
		//get dentro de get mejor en un metodo nuevo por no tener los nulls
	}
}
