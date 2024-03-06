package boletin4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Escribe un programa que pinte una pirámide rellena con un carácter
		introducido por teclado que podrá ser una letra, un número o un símbolo
		como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un
		menú elegir si el vértice de la pirámide está apuntando hacia arriba o
		hacia abajo.
		Pistas:
		El programa: Como qué carácter quieres rellenar la pirámide?
		El usuario contesta:
		El programa: Hacia dónde quieres que apunte la pirámide:
		1. Hacia arriba
		2. Hacia abajo
		Respuesta: (el usuario contestaría aquí con 1 o con 2)
		Podeis usar un String para guardar un carácter. Si quereis usar el tipo de
		dato char para guardar el carácter teneis que usar el siguiente método:
		String s;
		Char c = s.charAt(0); // con esto se obtiene el primer character de s.
*/
		
		Scanner s = new Scanner(System.in);
		String caracter;
		String piramide;
		int direccion;
		System.out.println("Con qué carácter quieres rellenar la pirámide?");
		caracter = s.next();
		System.out.printf("¿Hacia dónde quieres que apunte la piramide?\n"
				+ "1.-Arriba\n"
				+ "2.-Derecha\n"
				+ "3.-Izquierda\n"
				+ "4.-Abajo\n");
		direccion = s.nextInt();
		 
		switch (direccion) {
		case 1: 
			 piramide = "    "+caracter+"\n" +
                    "   "+caracter+caracter+caracter+"\n" +
                    "  "+caracter+caracter+caracter+caracter+caracter+"\n" +
                    " "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"";
			System.out.println(piramide);
			break;
		case 2: 
			 piramide = ""+caracter+"\n" +
                    ""+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+"\n" +
                    ""+caracter+"\n" ;
			break;
		case 3: 
			 piramide = "        "+caracter+"\n" +
                    "      "+caracter+caracter+caracter+"\n" +
                    "    "+caracter+caracter+caracter+caracter+caracter+"\n" +
                    "  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    "  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
                    "    "+caracter+caracter+caracter+caracter+caracter+"\n" +
                    "      "+caracter+caracter+caracter+"\n" +
                    "        "+caracter+"\n" ;
			System.out.println(piramide);
			break;
		case 4:
			 piramide = ""+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
					" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"\n" +
					"  "+caracter+caracter+caracter+caracter+caracter+"\n" +
					"   "+caracter+caracter+caracter+"\n" +
					 "    "+caracter+"\n" ;
			System.out.println(piramide);
			break;
			
			default: 
				System.out.println("Valor \"direccion\" equivocado.");
		}
		
	}	
}


