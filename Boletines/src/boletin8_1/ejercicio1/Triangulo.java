package boletin8_1.ejercicio1;

public class Triangulo {
	/*Implementa una clase Triangulo, la cual tendrá como atributos: 
double base
double altura

		y como métodos:
public Triangulo()
public void setBase(double base)
public void setAltura(double altura)
public double getBase()
public double getAltura()

	 */

	//Atributos
	double base,altura;

	//Metodos
	public Triangulo(){
		this.base=3;
		this.altura=3;
	}
	public void setBase(double base) {
		this.base=base;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public double getBase() {
		return this.base;
	}
	public double getAltura() {
		return this.altura;
	}
}
