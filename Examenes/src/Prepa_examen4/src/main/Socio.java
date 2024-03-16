package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Socio {
	private int idSocio;//TODO hacer unico
	private String nombre;
	public Socio(int idSocio, String nombre) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
	}
	//TODO retocar get n set
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//TODO hacer bonito
	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocio + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idSocio, nombre);
	}
	//TODO comparar solo id
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return idSocio == other.idSocio && Objects.equals(nombre, other.nombre);
	}
	
	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double precio=-1;
		if(pista!=null) {
			if(disponible(pista,fechaReserva,horaReserva)) {
				Club.abrirReserva(this, pista, fechaReserva, horaReserva);
				precio=pista.getPrecio();
			}	
		}	
		return precio;
	}
	
	private boolean disponible(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		boolean disponible=true;
		if(pista!=null) {
			for (int i = 0; i < Club.getReservasHechas().length; i++) {
				Reserva reservaAux =Club.getReservasHechas()[i];
				if(reservaAux!=null) {
					if(reservaAux.getPistaReservada().equals(pista)
							&&reservaAux.getFecha().equals(fechaReserva)
							&&reservaAux.getHora().equals(horaReserva)) {
						disponible=false;
					}
				}
			}
		}
		return disponible;
	}
	

}
