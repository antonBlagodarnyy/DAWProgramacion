package boletin9.ejercicio4;

import boletin9.ejercicio4.interfaces.IBarco;

public class Barco implements IBarco {
	//Atributos
	private String matricula;
	private int eslora, anio;
	
	public Barco(String matricula, int eslora, int anio) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anio = anio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public double getModuloFuncion() {
		return this.getEslora()*VALOR_METRO_ESLORA*VALOR_FIJO_ESLORA;
	}
	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + "]";
	}
	

}
