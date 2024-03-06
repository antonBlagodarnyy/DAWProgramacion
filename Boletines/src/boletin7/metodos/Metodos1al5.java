package boletin7.metodos;

import java.util.Scanner;

public class Metodos1al5 {
	//Metodos utiles:
		public static void imprimirArray(int [] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	
	//Ejercicio 0:
/* Hacer un método que reciba una array de enteros como parámetro de entrada,
 *  y que devuelva cuántos números pares contiene dicho array 
*/
	public static int paresEnArray (int [] nums) {//contador de pares en un array
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				counter++;
			}
		}
		return counter;
	}
	
	//Ejercicio1:
	/* Implementa un método que dado un array cargado aleatoriamente, 
	 * genere a partir de él otro array que contenga los elementos pares que se encuentran en el primero.
	 */
	
	public static int [] arrayAleatorio10Numeros  () {//metodo que genera un array aleatorio de 10 numeros del 1 al 10
		int [] array = new int [10];
		
		for (int i = 0; i<array.length; i++) {//lo recorremos
			array [i] = (int)Math.floor(Math.random()*10)+1;//a cada posicion le asignamos un numero del 1 al 10
		}
		
		return array;
	}
	
	public static int [] arrayPar ( int array []) {//genera un array con los numeros pares de un array introducido
		
		int counterPar = 0;//contador de los numeros pares para asignar el numero a la posicion correcta
		
		int [] arrayPar = new int [paresEnArray(array)] ;//creamos el array con el numero de pares indicados
		for (int i = 0; i < array.length; i++) {//recorremos el array dado
			if(array[i]%2==0) {//si es par lo añadimos al arraypar
				arrayPar[counterPar]=array[i];
				counterPar ++;
			}
		}
		return arrayPar;
	}
	
	/*Ejercicio 2:   Implementa un método que genere un array de 20 elementos,
	 *  con números aleatorios comprendidos entre 100 y 300, de forma que no se repita ningún elemento.
	 */
	public static int [] array20numsEntre100y300() {
		
		int  [] array = new int [20];//creamos el array
		boolean repe = false;//bandera para los numeros repetidos
		
		for (int i = 0; i<20; i++) {//recorremos el array
			
		do {//bucle para numero repetido
		repe=false;//reseteamos la bandera en caso de que haya saltado
		int n = (int)Math.floor(Math.random()*200)+100;//creamos valor aleatorio
		array[i]=n;//asignamos el valor
		
			for (int u = 0; u<i ; u++) {//recorremos todos los valores del array hasta el actual
				if (array[u]==n) {//comprobamos que no se haya repetido
					repe = true;
					break;//si se ha repetido una vez, no necesitamos comprobar los demas valores
				}
			}
			} while (repe);//en caso de valor repetido, repetimos el bucle
		}
		return array;
		}
	
	//Ejercicio3:
			/*Ejercicio 3: Implementa un método que genere un array de 20 elementos, 
			 * con números aleatorios comprendidos entre 200 y 400, 
			 * de forma que no se repita ningún elemento
			 */
	public static int [] array20numsEntre200y400() {
		
		int  [] array = new int [20];//creamos el array
		boolean repe = false;//bandera para los numeros repetidos
		
		for (int i = 0; i<20; i++) {//recorremos el array
			
		do {//bucle para numero repetido
		repe=false;//reseteamos la bandera en caso de que haya saltado
		int n = (int)Math.floor(Math.random()*200)+200;//creamos valor aleatorio
		array[i]=n;//asignamos el valor
		
			for (int u = 0; u<i ; u++) {//recorremos todos los valores del array hasta el actual
				if (array[u]==n) {//comprobamos que no se haya repetido
					repe = true;
					break;//si se ha repetido una vez, no necesitamos comprobar los demas valores
				}
			}
			} while (repe);//en caso de valor repetido, repetimos el bucle
		}
		return array;
		}
	
	//Ejercicio 4: 
			/*Implementa un método que reciba como parámetro de entrada, un array, 
			 * y devuelva otro array (return), con los elementos del primer array al revés (orden inverso).
			 */
	public static int [] flipArray (int [] array1) {
		int l = array1.length;//pillamos la longitud del array
		int [] array2 = new int [l];//creamos el array a devolver
		int counter = l-1;//contador para asignar el valor inverso
		
		for (int i = 0; i < l; i++) {
			array2 [i] = array1 [counter];
			counter--;
		}
		return array2;
	}
	
	//Ejercicio5:
	public static void menu() {
		System.out.println("¿Qué desea hacer?\r\n"
				+ "1.-Calcular nota media\r\n"
				+ "2.-Ver la nota más alta\r\n"
				+ "3.-Ver la nota más baja\r\n"
				+ "4.-Número de alumnos por encima de la media\r\n"
				+ "5.-Número de alumnos por debajo de la media\r\n"
				+ "6.-Salir del programa.");
	}

	public static int input1to6 () {
		Scanner s = new Scanner (System.in);
		int input = 0;
		do {
		input = s.nextInt();
		if(input <1 ||input> 6) {
			System.out.println("Valor no valido, introduzca un valor del 1 al 5");
		}
	} while (input <1 || input>6) ;
		return input;
}

	public static double notaMedia (int []notas) {
		int sum = 0;
		double media = 0;
		for (int i = 0; i< notas.length; i++) {
			sum += notas [i];
		}
		media =((double) sum) / notas.length;
		return media;
	}

	public static int notaMasAlta (int [] notas) {
		int notaAlta=notas[0];
		for (int i = 0; i<notas.length;i++) {
			if (notaAlta<notas[i]) {
				notaAlta = notas[i];
			}
		}
		return notaAlta;
	}
	
	public static int notaMasBaja (int [] notas) {
		int notaBaja=notas[0];
		for (int i = 0; i<notas.length;i++) {
			if (notaBaja>notas[i]) {
				notaBaja = notas[i];
			}
		}
		return notaBaja;
	}
	
	public static int numEstudiantesEncimaMedia(int [] notas) {
		double media = notaMedia(notas);
		int counter = 0;
		for (int i = 0; i<notas.length;i++) {
			if(notas[i]>media) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int numEstudiantesDebajoMedia(int [] notas) {
		double media = notaMedia(notas);
		int counter = 0;
		for (int i = 0; i<notas.length;i++) {
			if(notas[i]<media) {
				counter++;
			}
		}
		return counter;
	}
}