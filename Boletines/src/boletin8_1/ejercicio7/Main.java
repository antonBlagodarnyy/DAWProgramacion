package boletin8_1.ejercicio7;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Ejercicio 7 (Opcional): Basándonos en la siguiente clase

Class Carta
Palo palo
Valor valor 
double sumaTotal
public Carta()
public String toString() 
public double consultarTotal()

El palo y el valor son enumerados. El palo puede ser del tipo COPAS, ESPADAS, BASTOS y OROS.
 El valor puede ser UNO, DOS,….SOTA, CABALLO y REY
 En el constructor de la carta se creará una carta con un palo y un valor. 
 Tanto el palo de la carta como su valor ha de generarse de forma aleatoria, y se puede dar el caso que si creamos varias cartas éstas se puedan repetir
  (en este juego no vamos a controlar la repetición de cartas).

La idea es poder jugar al juego de las 7 y media. En el juego habrá un menú donde el usuario elige qué hacer:
Nueva carta
Plantarse
Cada vez que el usuario pide una nueva carta, se crea una nueva carta, ésta se imprime por pantalla y se muestra el total acumulando 
que se va almacenando en la variable de clase sumaTotal.
Si el usuario se pasa de las 7 y media se le informa por pantalla y se le pregunta si quiere volver a jugar.
Si el usuario decide plantarse antes de llegar a 7 y medio, se le indica que ha terminado el juego, 
pero internamente se pedirá otra carta y se le mostrará para indicarle si ha hecho bien en plantarse o no.
OJO, declarar los métodos privados que sean necesarios dentro de la clase para desarrollar el programa.
 En el cuadro de arriba sólo salen los métodos públicos obligatorios.*/


		boolean end=false;//boolean del juego
		int input;

		do {//loop del juego
			Carta.Menu();//imprime el menu

			input=inputBetween2Num(1,2);//pide 1 num entre el 1 y el 2
			if(input==1) {
				Carta nueva = new Carta();	//creamos carta e imprimimos
				System.out.println(nueva.toString());

				if(Carta.getSumaTotal()>7) {//Si se ha sobrepasado el limite, sysout y fin
					System.out.println("Has perdido");
					end = true;
				}

			} else { //En caso contrario se ha plantado
				System.out.println("Se ha plantado, la siguente carta hubiera sido:");//Lo imprimimos
				Carta nueva = new Carta();	
				System.out.println(nueva.toString());//Enseñamos al usuario que carta le hubiera salido
				end=true;
			}


		}while (!end);



	}
	/**Valida que un valor introducido por teclado este 
	 * comprendido en un tramo determinado.
	 * Valores limites incluidos.
	 * 
	 * @param: int a: valor inicial
	 * @param:int b: valor final
	 * @return:int input: Valor comprendido entre esos 2.
	 */
	public static int inputBetween2Num(int a, int b) {

		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

			input = s.nextInt();
			if (input < a || input > b) {
				System.out.println("valor no valido");

			}
		} while (input<a||input>b);
		return input;
	}
}

