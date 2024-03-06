package boletin8_1.ejercicio2;

public class Main {

	public static void main(String[] args) {
		/*Ejercicio 2:  Implementa una clase Cuadrado, la cual tendrá como atributos: 
int lado
y como métodos:
public Cuadrado()
public void setLado(int lado)
public int getLado()
public int getArea() //Devuelve el área del Cuadrado
public void printCuadrado()// Muestra por pantalla un cuadrado dibujado con *, 
//teniendo en cuenta el valor de su atributo lado
*/
		Cuadrado cuadradoPrototipo = new Cuadrado();//Probamos la clase
		cuadradoPrototipo.setLado(10);//Declaramos su lado en 10
		cuadradoPrototipo.printCuadrado();//Lo pintamos

	}

}
