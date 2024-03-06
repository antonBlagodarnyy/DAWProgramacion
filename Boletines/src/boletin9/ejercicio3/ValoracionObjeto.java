package boletin9.ejercicio3;
import java.time.*;
public class ValoracionObjeto {
	
//Atributos
	private int estrellas;
	private LocalDate fechaPublicacion;
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	//Metodos
	public ValoracionObjeto(int estrellas, LocalDate fechaPublicacion) {

		this.estrellas = estrellas;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	

	
}
