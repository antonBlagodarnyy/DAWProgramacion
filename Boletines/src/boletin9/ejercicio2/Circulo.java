package boletin9.ejercicio2;

public class Circulo implements IFigura {
	//Atributos
		private double radio;
		
	//Metodos
		//Constructor
		public Circulo(double radio) {
			super();
			this.radio = radio;
		}
		
		//Get n Set
	public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
		
	@Override
	public double getArea() {
		return PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ",area="+getArea()+"]";
	}

}
