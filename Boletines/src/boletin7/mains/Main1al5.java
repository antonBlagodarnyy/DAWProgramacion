package boletin7.mains;
import java.util.Scanner;

import boletin7.metodos.Metodos1al5;

public class Main1al5 {

	public static void main(String[] args) {
		/* Ejercicio Consulta en internet acerca de:
		1.    La clase ArrayList.
		2.    La clase Iterator.
		5.    ENUM en Java*/
		/*
		 * 1.-ArrayList: Es un Array sin un tamaño fijo, siempre se le puede agregar elementos.
		 * 2.- Iterator: Sirve para acceder a los elementos de un array y añadirlos o eleminarlos
		 * 3.-ENUM: Representa una lista de constantes 
		 */

		//Ejercicio0:
		/* Hacer un método que reciba una array de enteros como parámetro de entrada,
		 *  y que devuelva cuántos números pares contiene dicho array 
		*/
		System.out.println("Ejercicio0:");
		int[] nums = {1, 2, 3, 4, 5, 6};
		Metodos1al5.imprimirArray(nums);
		int pares = Metodos1al5.paresEnArray(nums);
		System.out.println("Numero de pares en el array dado: ");
		System.out.println(pares+"\n");

		//Ejercicio1:
		/* Implementa un método que dado un array cargado aleatoriamente, 
		 * genere a partir de él otro array que contenga los elementos pares que se encuentran en el primero.
		 */
		System.out.println("Ejercicio1:");
		int [] arrayAleatorio = Metodos1al5.arrayAleatorio10Numeros();
		System.out.println("Array aleatorio: ");
		Metodos1al5.imprimirArray(arrayAleatorio);
		
		int [] arrayPar = Metodos1al5.arrayPar(arrayAleatorio);//del array anterior, creamos un array con solo los numeros pares
		System.out.println("Array con los pares del array aleatorio: ");
		Metodos1al5.imprimirArray(arrayPar);
		System.out.println();//salto de linea
		
		//Ejercicio2:
		/* Implementa un método que genere un array de 20 elementos,
		 *  con números aleatorios comprendidos entre 100 y 300, de forma que no se repita ningún elemento.
		 */
		System.out.println("Ejercicio2:");
		int [] array2 = Metodos1al5.array20numsEntre100y300();
		System.out.println("Array con 20 numeros entre 100 y 300:");
		Metodos1al5.imprimirArray(array2);
		System.out.println();//salto de linea
		
		//Ejercicio3:
		/*Ejercicio 3: Implementa un método que genere un array de 20 elementos, 
		 * con números aleatorios comprendidos entre 200 y 400, 
		 * de forma que no se repita ningún elemento
		 */
		System.out.println("Ejercicio3:");
		int [] array3 = Metodos1al5.array20numsEntre200y400();
		System.out.println("Array con 20 numeros entre 200 y 400:");
		Metodos1al5.imprimirArray(array3);
		System.out.println();//salto de linea
		
		//Ejercicio 4: 
		/*Implementa un método que reciba como parámetro de entrada, un array, 
		 * y devuelva otro array (return), con los elementos del primer array al revés (orden inverso).
		 */
		System.out.println("Ejercicio4:");
		int [] array4 = Metodos1al5.arrayAleatorio10Numeros();//obtenemos un array aleatorio
		System.out.println("Array aleatorio:");
		Metodos1al5.imprimirArray(array4);
		
		array4 = Metodos1al5.flipArray(array4);//le damos la vuelta
		System.out.println("Array invertido:");
		Metodos1al5.imprimirArray(array4);
		System.out.println();
		
		//Ejercicio 5:
		/*Deseamos realizar un programa para el cálculo de ciertos valores con las notas de la clase. 
		 * Queremos calcular la nota media, la nota más alta, la más baja, cuántos alumnos tienen una nota 
		 * superior a la media y cuántos tienen una nota inferior a la media. El programa debe presentar un
		 *  menú de opciones para que el usuario elija lo que desee hacer y también se presentarán los 
		 *  resultados. El array de notas se generará aleatoriamente con notas de 1 a 10.
		 */
		System.out.println("Ejercicio5:");
		
		int eleccion = 0;
		int [] notas = Metodos1al5.arrayAleatorio10Numeros();
		
		do {
			System.out.println("Notas:");
			Metodos1al5.imprimirArray(notas);
			System.out.println();//salto de linea
		Metodos1al5.menu();
		eleccion = Metodos1al5.input1to6();
		switch (eleccion){
		case 1://nota media
			System.out.println(Metodos1al5.notaMedia(notas)+"\n"); 
			break;
		case 2 ://nota mas alta
			System.out.println(Metodos1al5.notaMasAlta(notas)+"\n"); 
			break;
		case 3 ://nota mas baja
			System.out.println(Metodos1al5.notaMasBaja(notas)+"\n"); 
			break;
		case 4 ://num estudiantes encima media
			System.out.println(Metodos1al5.numEstudiantesEncimaMedia(notas)+"\n"); 
			break;
		case 5 ://nota mas alta
			System.out.println(Metodos1al5.numEstudiantesDebajoMedia(notas)+"\n"); 
			break;
		case 6 ://fin del programa
			System.out.println("Fin del programa"); 
			break;
		default:
			System.out.println("Error en switch");
		}
		}while(eleccion !=6);
		
		}
}
