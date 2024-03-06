package boletin4;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Calcula el salario neto que percibirá un trabajador, teniendo en cuenta
		que al salario bruto tenemos que descontarle las retenciones. Éstas
		dependerán del número de hijos de acuerdo con la siguiente tabla:
		Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
		Visualizar: salario bruto, descuento en euros y salario neto.*/
		
		Scanner s = new Scanner(System.in);
		
		float sBruto;
		int nHijos;
		double descuento, sNeto;
		
		System.out.println("Introduzca su salario bruto.");
		sBruto = s.nextFloat();
		
		System.out.println("¿Cuántos hijos tiene?");
		nHijos = s.nextInt();
		
		if (nHijos < 0) {
			System.out.println("Valor \"hijos\" no valido.");
		} else if (nHijos <= 2) {
			descuento = sBruto*0.2;
			sNeto = sBruto - descuento;
			System.out.println("Su salario bruto es de: "+sBruto);
			System.out.println("Su sueldo neto es de: "+sNeto);
			System.out.println("Su descuento de: "+descuento);
		} else if(nHijos < 6) {
			descuento = sBruto*0.15;
			sNeto = sBruto - descuento;
			System.out.println("Su salario bruto es de: "+sBruto);
			System.out.println("Su sueldo neto es de: "+sNeto);
			System.out.println("Su descuento de: "+descuento);
		} else if (nHijos < 8 ) {
			descuento = sBruto*0.1;
			sNeto = sBruto - descuento;
			System.out.println("Su salario bruto es de: "+sBruto);
			System.out.println("Su sueldo neto es de: "+sNeto);
			System.out.println("Su descuento de: "+descuento);
		} else if(nHijos < 10) {
			descuento = sBruto*0.05;
			sNeto = sBruto - descuento;
			System.out.println("Su salario bruto es de: "+sBruto);
			System.out.println("Su sueldo neto es de: "+sNeto);
			System.out.println("Su descuento de: "+descuento);
		} else {
			descuento = 0;
			sNeto = sBruto;
			System.out.println("Su salario bruto es de: "+sBruto);
			System.out.println("Su sueldo neto es de: "+sNeto);
			System.out.println("No tiene descuento");
		}		
	}

}
