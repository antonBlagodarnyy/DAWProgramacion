package solucion_Profesor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Socio {
	private String nombreCompleto;
	private int numeroSocio;



	public Socio(String nombreCompleto, int numeroSocio) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.numeroSocio = numeroSocio;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroSocio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return numeroSocio == other.numeroSocio;
	}
	@Override
	public String toString() {
		return "Socio [nombreCompleto=" + nombreCompleto + ", numeroSocio=" + numeroSocio + "]";
	}

	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double precio=-1;
		if(pista!=null) {
			if(disponible(pista,fechaReserva, horaReserva))
				precio=pista.getPrecio();
		}
		return precio;
	}
	private boolean disponible(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		boolean disponible=true;
		if(pista!=null && fechaReserva!=null && horaReserva!=null&&Club.getReservas()!=null) {
			for(int i=0;i<Club.getReservas().length && disponible;i++) {
				Reserva reserva=Club.getReservas()[i];
				if(reserva!=null) {
					if(reserva.getPistaReservada().equals(pista)) {
						if(reserva.getFechaReserva().equals(fechaReserva) && reserva.getHoraReserva().equals(horaReserva)) {
							disponible=false;
						}
					}
				}
			}
		}
		else {
			disponible=false;
		}
		return disponible;
	}


}
