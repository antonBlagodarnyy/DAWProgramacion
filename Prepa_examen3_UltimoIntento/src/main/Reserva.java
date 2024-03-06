package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Reserva {
private Socio socioQueReserva;
private Pista pistaReservada;
private LocalDate fecha;
private LocalTime hora;//TODO la reserva solo dura una hora

public Reserva(Socio socioQueReserva, Pista pistaReservada, LocalDate fecha, LocalTime hora) {
	super();
	this.socioQueReserva = socioQueReserva;
	this.pistaReservada = pistaReservada;
	this.fecha = fecha;
	this.hora = hora;
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

public LocalDate getFecha() {
	return fecha;
}

public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public LocalTime getHora() {
	return hora;
}

public void setHora(LocalTime hora) {
	this.hora = hora;
}

@Override
public String toString() {
	String mensaje="";
	mensaje+="************** Reserva *************************\n";
	mensaje+="Fecha:"+this.getFecha()+"\n"; 
	mensaje+="Socio:"+socioQueReserva.getNombre()+"\n"; 
	mensaje+="Pista:"+pistaReservada.getIdPista()+"\n";
	mensaje+="Hora de comienzo:"+ hora.getHour()+":"+hora.getMinute();
	return mensaje;
}

@Override
public int hashCode() {
	return Objects.hash(fecha, hora, pistaReservada);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Reserva other = (Reserva) obj;
	return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora)
			&& Objects.equals(pistaReservada, other.pistaReservada);
}




}
