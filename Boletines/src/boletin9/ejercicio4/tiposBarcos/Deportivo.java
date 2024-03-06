package boletin9.ejercicio4.tiposBarcos;

import boletin9.ejercicio4.Barco;

public class Deportivo extends Barco {
	//Atributos
	private int potenciaCV;
	
	//metodos
	//constructor
	public Deportivo(String matricula, int eslora, int anio,int potenciaCV) {
		super(matricula, eslora, anio);
		this.potenciaCV=potenciaCV;
	}

	//get n set
	public int getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	@Override
	public String toString() {
		return "Deportivo [potenciaCV=" + potenciaCV + "," + super.toString() + "]";
	}

	@Override
	public double getModuloFuncion() {
		return this.getEslora()*VALOR_METRO_ESLORA*VALOR_FIJO_ESLORA+this.potenciaCV;
	}



}
