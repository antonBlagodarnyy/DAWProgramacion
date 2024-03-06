package boletin9.ejercicio4;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

import boletin9.ejercicio4.interfaces.IAlquiler;

public class Alquiler implements IAlquiler{
	//Atributos
	private Cliente cliente;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private int  []  posicion = new int [2];
	private Barco barco;
	
	//metodos
	//construcor
	public Alquiler(String nombre, String dni, LocalDate fechaInicio, LocalDate fechaFinal, int posicionX, int posicionY, Barco barco) {
		super();
		this.cliente = new Cliente(nombre,dni);
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.posicion = new int [] {posicionX,posicionY};// 
		this.barco = barco;
	}
	
	//get n set
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public int[] getPosicion() {
		return posicion;
	}
	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}
	public Barco getBarco() {
		return barco;
	}
	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal
				+ ", posicion=" + Arrays.toString(posicion) + "," + barco + ", PrecioAlquiler()="
				+ getPrecioAlquiler() + "]";
	}

	@Override
	public double getPrecioAlquiler() {	
		double precioAlquiler=(double)getDiasOcupacion()*getBarco().getModuloFuncion();
		return precioAlquiler;
	}
	
	@Override
	public int getDiasOcupacion() {
		int daysBetween = (int)ChronoUnit.DAYS.between(getFechaInicio(), getFechaFinal());
		return daysBetween;
	}

}
