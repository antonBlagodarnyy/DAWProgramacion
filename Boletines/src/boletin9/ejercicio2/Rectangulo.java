package boletin9.ejercicio2;

public class Rectangulo implements IFigura {
	//Atributos
	private double ancho, alto;
	
	//Metodos
		//Constructor
	public Rectangulo(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	
	//Get n Set
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}


	@Override
	public double getArea() {
		return this.alto*this.ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ",area="+getArea()+"]";
	}

	
	
	
}
