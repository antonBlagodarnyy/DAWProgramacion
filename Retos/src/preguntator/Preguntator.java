package preguntator;
import java.util.Scanner;

public class Preguntator {

	public static void main(String[] args) {
		//Preguntator: Programa para escoger alumno aleatorio de clase
Scanner s = new Scanner (System.in);
int n= 0;
int random = 0;
boolean programa = true;

System.out.println("¿Cuantos alumnos va a introducir?");
n = s.nextInt();
		String []clase = new String [n] ;//creamos el array con un tamaño determinado
		for (int i = 0; i <n; i++) {
clase [i]= "Alumno "+i;//asignamos alumnos genericos
			}
		imprimirArray(clase);//mostramos el array
		
		do {//loop de la pregunta 
			
			int input =0;
		do {//comprobamos que el valor sea valido
			System.out.println("Escoja una opcion:\n"
					+ "1.-Escoger un alumno.\n"
					+ "2.-Salir del programa.\n");
			 input = s.nextInt();
			if (input < 1||input>2) {
				System.out.println("Valor no valido");
				}
			
		}while(input<1||input>2);
		if (input==1) {
			
			boolean repe= false;
			int [] numerosRepe = new int[n];
			for(int i= 0; i<n; i++) {
				numerosRepe[i]=-1;
			}
			do {
			random=numeroAleatorioMenor(n);//creamos un numero aleatorio dentro del margen

			for (int i = 0; i<n;i++) {
				if (random==numerosRepe[i]) {
					repe=true;
				}
			}
			}while(repe);
			
			mostrarAlumno(random,clase);//mostramos el alumno escogido
		}
		if (input == 2) {
			programa=false;
			}
		}while(programa);
}
	public static void imprimirArray(String []array) {
		for (int i = 0; i <array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public static int numeroAleatorioMenor (int n) {
		int numeroAleatorio=(int)Math.floor(Math.random()*n);
		return numeroAleatorio;
	}
	public static void mostrarAlumno(int n, String [] alumnos) {
		System.out.println(alumnos[n]);
	}
}


