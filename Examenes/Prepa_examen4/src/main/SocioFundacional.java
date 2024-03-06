package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class SocioFundacional extends Socio{
	public static final int MAX_INVITADOS=5;
	
	private LocalDate fechaInscripcion;
	private static int contadorSociosInvitados;
	private Socio [] sociosInvitados = new Socio [MAX_INVITADOS];
	
	public SocioFundacional(int idSocio, String nombre, LocalDate fechaInscripcion) {
		super(idSocio, nombre);
		this.fechaInscripcion = fechaInscripcion;
	}
	//TODO retocar get n set
	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public Socio[] getSociosInvitados() {
		return sociosInvitados;
	}
	public void setSociosInvitados(Socio[] sociosInvitados) {
		this.sociosInvitados = sociosInvitados;
	}
//TODO aniadir super
	@Override
	public String toString() {
		return "SocioFundacional [fechaInscripcion=" + fechaInscripcion + ", sociosInvitados="
				+ Arrays.toString(sociosInvitados) + "]";
	}
	
	@Override
	public double reservarPista(Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		double precio=super.reservarPista(pista, fechaReserva, horaReserva);
	
		if(precio>=0) {
		precio-=precio*this.getDescuento()/100;
		}
		return precio;
	}
	
	public int getDescuento() {
		int contador = 0;
		for (Socio socio : sociosInvitados) {
			if(socio!=null) {
				contador++;
			}
		}
		return contador;
	}
	public void invitarSocio(String nombre, int idSocio) {
		boolean yaExiste=false;
		for (Socio socio : Club.getSociosClub()) {
			if(socio!=null) {
				if(socio.getIdSocio()==idSocio) {
					yaExiste=true;
					break;
				}
			}
		}
		if(!yaExiste&&contadorSociosInvitados<5) {
			Socio socioNuevo = new Socio(idSocio,nombre);
			this.sociosInvitados[contadorSociosInvitados]=socioNuevo;
			Club.agregarSocioNormal(socioNuevo);
			contadorSociosInvitados++;
		}
	}

}
