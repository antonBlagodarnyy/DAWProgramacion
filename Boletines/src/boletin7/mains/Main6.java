package boletin7.mains;

import java.util.Scanner;

import boletin7.metodos.Metodos6;

public class Main6 {

	public static void main(String[] args) {
		//Ejercicio 6:
		/*(Sistema de Reserva de Vuelos). Una pequeña compañía aérea acaba de comprar un ordenador para su sistema de reserva de vuelos. 
		 * Escribir un programa que asigne asientos para cada vuelo del único avión de la compañía (capacidad: 20 asientos).
		 *  El programa debe contemplar zona de fumadores y no fumadores. Los no fumadores ocuparan los asientos 1-15 y los fumadores el resto.
		Utiliza un array de una dimensión para representar los asientos del avión. Utiliza 0 para indicar asiento vacío y 1 asiento ocupado.
		El programa nunca debe hacer "overbooking", es decir, reasignar un asiento que ya está ocupado.
		 Si la sección de fumadores se llena, el programa debe preguntar al pasajero si desea un asiento en la zona de no fumadores, y viceversa.
		  Si acepta, entonces has de realizar la asignación de asiento correspondiente. Si no acepta, avise de la salida del próximo vuelo.*/
		Scanner s = new Scanner (System.in);
		boolean continuar= true;
		int avion [] = Metodos6.array20con0();//creamos el avion
		System.out.println(Metodos6.welcome());
		
		do {
		boolean fumador = Metodos6.fumador();//preguntamos el tipo de asiento
		
		boolean disponibilidad = Metodos6.disponibilidad(fumador, avion);//revisamos que este disponible
		
			if (disponibilidad == true && fumador==false) {//si esta disponible y no es fumador, lo asignamos
				Metodos6.asignarAsientoNoFumador(avion);
				System.out.println("Su asiento es el numero "+Metodos6.imprimirAsientoNoFumador(avion));
				continuar = Metodos6.continuar();
			} else if (disponibilidad == true && fumador==true) {//si esta disponible y es fumador lo asignamos
				Metodos6.asignarAsientoFumador(avion);
				System.out.println("Su asiento es el numero "+Metodos6.imprimirAsientoFumador(avion));
				continuar = Metodos6.continuar();
			}
			
			else if (disponibilidad==false) {
				
				System.out.println("¿No hay asientos disponibles en su clase, desea cambiar?\n"
						+ "1.-Si.\n"
						+ "2.-No.");
				 int input = 0;
				do {
					 input = s.nextInt();
					if ( input <1|| input > 2) {
						System.out.println("Valor no valido");
					} else if (input == 1) {
							fumador = Metodos6.cambioAsiento(fumador);
							if(fumador == false) {
								Metodos6.asignarAsientoNoFumador(avion);
								System.out.println("Su asiento es el numero "+Metodos6.imprimirAsientoNoFumador(avion));
								continuar = Metodos6.continuar();
							} else  {
								Metodos6.asignarAsientoFumador(avion);
								System.out.println("Su asiento es el numero "+Metodos6.imprimirAsientoFumador(avion));
								continuar = Metodos6.continuar();
							}
					}else if (input == 2){
						Metodos6.proximoVuelo();
						continuar = false;
					}
				} while (input < 1 || input >2);
				
			
			}
		} while (continuar == true);
		
		System.out.println("Fin del programa.");
		}
}


