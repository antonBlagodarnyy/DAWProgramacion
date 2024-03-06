package boletin8_1.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Escribe una clase llamada Cuenta, y otra clase que haga uso de dicha clase 
		 * pidiendo los datos de varias cuentas y creando dichas cuentas
			Tened en cuenta que:
			Saldo puede ser negativo o positivo, pero si es negativo la cuenta estará “descubierta”.
			Si una cuenta está descubierta sólo se podrá ingresar dinero o recibir una transferencia, nunca retirar dinero o hacer una transferencia.
			Las operaciones de retirar y hacerTransferenciaA devuelven un boolean indicando si la operación se ha podido hacer correctamente o no.
			El método beneficiosFuturos devuelve los beneficios en función de los meses que se hayan pasado como parámetro. Si la cuenta está descubierta o el número de meses es negativo, los beneficios son 0.
			Los métodos de ingresar, retirar, hacerTransferenciaA y beneficiosFuturos deben de imprimir un mensaje diciendo el saldo final de la cuenta después de realizar la operación.
			Nuestra clase Cuenta permite dejar la cuenta muy muy descubierta :P
		 */

		Cuenta ES02_1234 = new Cuenta ("ES02" ,1234, 0.03);//creamos una cuenta

		System.out.println(ES02_1234.toString()+"\n");

		Cuenta ES02_2345 = new Cuenta ("ES02", 2345, 0.03);

		System.out.println(ES02_2345.toString()+"\n");

		ES02_1234.retirar(5);//le  retiramos 5

		ES02_1234.retirar(5);//le intentamos retirar otros 5

		ES02_1234.ingresar(1000);//le ingresamos 1000

		//System.out.println(ES02_1234.toString()+"\n");

		ES02_2345.ingresar(1000);//le ingresamos 1000 a la segunda cuenta

		ES02_2345.hacerTransferenciaA(ES02_1234, 500);//transferimos 500 napos

		ES02_2345.hacerTransferenciaA(ES02_1234, 4000);// transferimos mucho dinero

		ES02_2345.ingresar(5000);//le ingresamos 5000 napos a 2345

		System.out.println("Beneficios futuros de ES02_2345 para 6 meses: " +ES02_2345.beneficiosFuturos(6));//sus beneficios en 6 meses
	}

}
