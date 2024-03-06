package solucion_Profesor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class SocioFundacional extends Socio{
	private LocalDate fechaInicio;
	public static final int MAX_INVITADOS=5;
	private Socio[] sociosInvitados=new Socio[MAX_INVITADOS];



	public SocioFundacional(String nombreCompleto, int numeroSocio, LocalDate fechaInicio, Socio[] sociosInvitados) {
		super(nombreCompleto, numeroSocio);
		this.fechaInicio = fechaInicio;
		this.sociosInvitados = sociosInvitados;
	}
	
	
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public Socio[] getSociosInvitados() {
		return sociosInvitados;
	}



	public void setSociosInvitados(Socio[] sociosInvitados) {
		this.sociosInvitados = sociosInvitados;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(sociosInvitados);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SocioFundacional other = (SocioFundacional) obj;
		return this.getNumeroSocio()== other.getNumeroSocio();
	}
	@Override
	public String toString() {
		return "SocioFundacional [fechaInicio=" + fechaInicio + ", sociosInvitados=" + Arrays.toString(sociosInvitados)
		+ ", getNombreCompleto()=" + getNombreCompleto() + ", getNumeroSocio()=" + getNumeroSocio()
		+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	public int getDescuento() {
		int contador=0;
		for (Socio socio : sociosInvitados) {
			if(socio!=null) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double costeReserva=super.reservarPista(pista, fechaReserva, horaReserva);
		if(costeReserva>=0) {
			costeReserva-=costeReserva*this.getDescuento()/100.0;
		}
		return costeReserva;
	}

}
