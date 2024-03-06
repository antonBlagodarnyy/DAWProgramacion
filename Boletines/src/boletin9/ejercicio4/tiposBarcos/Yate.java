package boletin9.ejercicio4.tiposBarcos;

import boletin9.ejercicio4.Barco;

public class Yate extends Barco {
	//Atributos
	private int potenciaCV, numeroCamarotes;
	
	

	//Metodos
	//constructor
	public Yate(String matricula, int eslora, int anio, int potenciaCV, int numeroCamarotes) {
		super(matricula, eslora, anio);
		this.potenciaCV=potenciaCV;
		this.numeroCamarotes=numeroCamarotes;
	}
	
	//get n set
	public int getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}

	public void setNumeroCamarotes(int numeroCamarotes) {
		this.numeroCamarotes = numeroCamarotes;
	}

	@Override
	public String toString() {
		return "Yate [potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + ","
				+ super.toString() + "]";
	}

	@Override
	public double getModuloFuncion() {
		return this.getEslora()*VALOR_METRO_ESLORA*VALOR_FIJO_ESLORA+this.potenciaCV+this.numeroCamarotes;
	}

}
