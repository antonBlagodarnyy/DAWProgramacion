package solucion_Profesor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

	private Socio socioQueReserva;
	private Pista pistaReservada;
	private LocalDate fechaReserva;
	private LocalTime horaReserva;
	
	
	
	public Reserva(Socio socioQueReserva, Pista pistaReservada, LocalDate fechaReserva, LocalTime horaReserva) {
		super();
		this.socioQueReserva = socioQueReserva;
		this.pistaReservada = pistaReservada;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
	}
	
	public Socio getSocioQueReserva() {
		return socioQueReserva;
	}
	public void setSocioQueReserva(Socio socioQueReserva) {
		this.socioQueReserva = socioQueReserva;
	}
	public Pista getPistaReservada() {
		return pistaReservada;
	}
	public void setPistaReservada(Pista pistaReservada) {
		this.pistaReservada = pistaReservada;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public LocalTime getHoraReserva() {
		return horaReserva;
	}
	public void setHoraReserva(LocalTime horaReserva) {
		this.horaReserva = horaReserva;
	}
	
	@Override
	public String toString() {
		String mensaje="";
		mensaje+="************** Reserva *************************\n";
		mensaje+="Fecha:"+this.getFechaReserva()+"\n"; 
		mensaje+="Socio:"+socioQueReserva.getNombreCompleto()+"\n"; 
		mensaje+="Pista:"+pistaReservada.getIdentificador()+"\n";
		mensaje+="Hora de comienzo:"+ horaReserva.getHour()+":"+horaReserva.getMinute();
		return mensaje;

	}
	
}
