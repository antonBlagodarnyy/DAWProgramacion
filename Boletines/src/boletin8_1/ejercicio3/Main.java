package boletin8_1.ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*Ejercicio 3: Implementa una clase Persona
		 *  con los siguientes atributos y métodos.
		 *   Escribe una clase Main para poder probar la clase anterior donde se pidan los datos 
		 *   por teclado de dos personas. 
		 *   Una persona se creará con el constructor sin parámetros y la otra con el constructor 
		 *   con parámetros. 
		 *   Hacer uso de los métodos desarrollados. 
		 */
		Scanner sString = new Scanner(System.in);
		Scanner sInt = new Scanner(System.in);

		Persona personaUno = new Persona();//Persona creada con el constructor sin parametros

		System.out.println("Introduzca el nombre de la primera persona:");
		personaUno.setNombre(sString.nextLine());

		System.out.println("Introduzca el apellido de la primera persona:");
		personaUno.setApellidos(sString.nextLine());

		System.out.println("Introduzca la edad de la primera persona:");
		personaUno.setEdad(sInt.nextInt());

		System.out.println("Introduzca el sexo de la primera persona:");
		personaUno.setSexo(sString.nextLine().charAt(0));

		String nombreDos, apellidosDos;
		int edadDos;
		char sexoDos;

		System.out.println("Introduzca el nombre de la segunda persona:");
		nombreDos = sString.nextLine();

		System.out.println("Introduzca el apellido de la segunda persona:");
		apellidosDos = sString.nextLine();

		System.out.println("Introduzca la edad de la segunda persona:");
		edadDos = sInt.nextInt();

		System.out.println("Introduzca el sexo de la segunda persona:");
		sexoDos = sString.next().charAt(0);

		Persona personaDos = new Persona (nombreDos,apellidosDos,edadDos,sexoDos);//Persona creada con el constructor con parametros

		personaUno.Saludar();
		personaDos.Saludar();
	}

}
