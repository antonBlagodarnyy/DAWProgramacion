package boletin4;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		/*Escribe un programa que nos diga el horóscopo a partir del día (número) y el mes 
		de nacimiento (String). Por ejemplo: Dime tu mes de nacimiento: enero 
		Hay que trabajar en el programa con la cadena “enero”.*/

		//declaramos las variables
		Scanner s = new Scanner(System.in);
		int dia;
		String mes;

		//pedimos los datos
		System.out.println("¿En qué mes naciste?");
		mes = s.next();
		mes= mes.toLowerCase();//lo pasamos a minuscula
		
		System.out.println("¿Y en qué dia?");
		dia = s.nextInt();

		if (dia<=31 && dia > 0) { //comprobamos que dia no sea superior a 31
			
			switch (mes) {//para cada valor de "mes"
			
			case "enero":
				if(dia <= 20) {
					System.out.println("Eres Capricornio.");
				} else  {
					System.out.println("Eres Acuario.");
				}
				break;
				
			case "febrero":
				if (dia > 29) {
					System.out.println("Valor \"dia\" no valido para el mes de febrero.");//comprobamos que si es febrero dia no sea superior a 29
				} else if(dia <= 19) {
					System.out.println("Eres Acuario");
				}else {
					System.out.println("Eres Piscis.");
				}
				break;
				
			case "marzo":
				if(dia <=20) {
					System.out.println("Eres Piscis.");
				} else {
					System.out.println("Eres Aries.");
				}
				break;
				
			case "abril":
				if (dia > 30) {
					System.out.println("Valor \"dia\" no valido para el mes de abril.");//comprobamos"dia" no sea superior a 30
				} else  if (dia <= 20) {
					System.out.println("Eres Aries.");
				} else {
					System.out.println("Eres Tauro.");
				}
				break;
				
			case "mayo":
				if (dia <= 21) {
					System.out.println("Eres Tauro.");
				} else {
					System.out.println("Eres Géminis.");
				}
				break;
				
			case "junio":
				if (dia > 30) {
					System.out.println("Valor \"dia\" no valido para el mes de junio.");//comprobamos "dia" no sea superior a 30
				} else if (dia <= 21) {
					System.out.println("Eres Géminis");
				} else {
					System.out.println("Eres Cáncer.");
				}
				break;
				
			case "julio":
				if (dia <= 22) {
					System.out.println("Eres Cáncer");
				} else {
					System.out.println("Eres Leo");
				}
				break;
				
			case "agosto":
				if (dia <= 22) {
					System.out.println("Eres Leo.");
				} else {
					System.out.println("Eres Virgo.");
				}
				break;
				
			case "septiembre":
				if (dia > 30) {
					System.out.println("Valor \"dia\" no valido para el mes de septiembre.");//comprobamos "dia" no sea superior a 30
				} else if (dia <= 22) {
					System.out.println("Eres Virgo.");
				} else {
					System.out.println("Eres Libra.");
				}
				break;
				
			case "octubre":
				if (dia <= 22) {
					System.out.println("Eres Libra.");
				} else {
					System.out.println("Eres Escorpio.");
				}
				break;
				
			case "noviembre":
				if (dia > 30) {
					System.out.println("Valor \"dia\" no valido para el mes de noviembre.");//comprobamos "dia" no sea superior a 30
				}else if (dia <= 22) { 
					System.out.println("Eres Escorpio.");
				} else {
					System.out.println("Eres Sagitario.");
				}
				break;
				
			case "diciembre":
				if (dia <= 21) {
					System.out.println("Eres Sagitario.");
				} else {
					System.out.println("Eres Capricornio.");
				}
				break;
				
			default:
				System.out.println( "Valor \"mes\" no valido.");
			}
			
		} else {
			System.out.println("Valor \"dia\" superior a 31 o inferior a 0.");
		}

	}
}
