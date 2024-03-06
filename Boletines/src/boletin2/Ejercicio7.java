package boletin2;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Desarrolla un programa que calcula como aumentaría el valor de una inversión de 10000
		* euros a un 10% el primer año, pierde un valor de 500 euros durante el segundo y aumenta un 12%
		* durante el tercero. Utiliza operadores de asignación ampliada para realizar los cálculos.*/
		double inversion = 10000;
		
		 inversion += inversion*0.1;
		 inversion -= 500;
		 inversion += inversion*0.12;
		 
		 System.out.println("La inversion ha aumentado a un total de: "+inversion);
		

	}

}
