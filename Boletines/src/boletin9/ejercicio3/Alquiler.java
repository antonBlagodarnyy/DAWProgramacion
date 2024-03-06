package boletin9.ejercicio3;

import java.time.LocalDate;

public class Alquiler {
//Atributos
	private Cliente cliente;
	private Pelicula pelicula;
	private LocalDate fechaAlquiler;
	public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate fechaAlquiler) {
		
		super();
		this.cliente = cliente;
		this.pelicula = pelicula;
		this.fechaAlquiler = fechaAlquiler;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", pelicula=" + pelicula + ", fechaAlquiler=" + fechaAlquiler + "]";
	}
	

}
