package boletin3;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Desarrolla un programa que calcule el sueldo liquido a percibir por un vendedor sabiendo que el
	sueldo total incluye los siguientes conceptos:
	-Sueldo fijo.
	-Comision: 5% sobre el importe de ventas.
	-Kilometraje: 1 euro por Kilómetro.
	-Dietas: 60 euros por día de desplazamiento.
	
	A la suma de estos conceptos se le debe descontar:
	-La retención de la Seguridad social (150 euros).
	
	Al sueldo fijo se le debe descontar:
	-La retención del IRPF: 18%.
	
	Declara las variables necesarias y asigna los valores que consideres convenientes (importe de ventas, número de
	km realizados, días de desplazamiento).
*/
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el sueldo fijo:");
		double sueldoFijo = s.nextDouble();
		
		sueldoFijo -= 0.18*sueldoFijo;//aplicamos la retencion IRPF
		
		System.out.println("¿Cual es el importe de ventas?");
		sueldoFijo += 0.05*s.nextDouble();//aplicamos el importe de ventas
		
		System.out.println("¿Cual es el kilometraje?");//aplicamos el kilometraje
		sueldoFijo += s.nextDouble();
		
		System.out.println("¿Cuantos dias se ha desplazado?");//aplicamos los desplazamientos
		sueldoFijo += 60*s.nextInt();
		
		sueldoFijo -= 150;//restamos la retencion de la ss
		
		
		System.out.println("Sueldo liquido: "+sueldoFijo);
	}

}
