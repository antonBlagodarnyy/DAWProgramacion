package boletin9.ejercicio4.tiposBarcos;

import boletin9.ejercicio4.Barco;

public class Velero extends Barco {
	//Atributos
	private int numeroMastiles;
	
	//Metodos
	//constructor
	public Velero(String matricula, int eslora, int anio, int numeroMastiles) {
		super(matricula, eslora, anio);
		this.numeroMastiles=numeroMastiles;
	}

	//get n set
	public int getNumeroMastiles() {
		return numeroMastiles;
	}
	public void setNumeroMastiles(int numeroMastiles) {
		this.numeroMastiles = numeroMastiles;
	}
	
	@Override
	public String toString() {
		return "Velero [numeroMastiles=" + numeroMastiles + "," + super.toString() + "]";
	}

	@Override
	public double getModuloFuncion() {
		return this.getEslora()*VALOR_METRO_ESLORA*VALOR_FIJO_ESLORA+numeroMastiles;
	}
	

}
