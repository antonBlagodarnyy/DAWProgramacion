package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
//To change folder name
public abstract class Club {
	//Atributos
	public static final int CAPACIDAD_RESERVAS = 100;
	public static final int CAPACIDAD_SOCIOS = 100;
	public static final int CAPACIDAD_PISTAS = 100;

	private static int contadorReservas=0;
	private static Reserva [] reservasHechas = new Reserva [CAPACIDAD_RESERVAS];
	private static int contadorSocios=0;
	private static Socio [] sociosClub  = new Socio [CAPACIDAD_SOCIOS];
	private static int contadorPista=0;
	private static Pista [] pistasClub = new Pista [CAPACIDAD_PISTAS];

	//Metodos
	//Get n set
	public static Reserva[] getReservasHechas() {
		return reservasHechas;
	}
	public static void setReservasHechas(Reserva[] reservasHechas) {
		Club.reservasHechas = reservasHechas;
	}
	public static Socio[] getSociosClub() {
		return sociosClub;
	}
	public static void setSociosClub(Socio[] sociosClub) {
		Club.sociosClub = sociosClub;
	}
	public static int getContadorReservas() {
		return contadorReservas;
	}
	public static void setContadorReservas(int contadorReservas) {
		Club.contadorReservas = contadorReservas;
	}
	public static int getContadorSocios() {
		return contadorSocios;
	}
	public static void setContadorSocios(int contadorSocios) {
		Club.contadorSocios = contadorSocios;
	}
	public static Socio getSocioClub(int idSocio) {
		int bandera=-1;
		for (int i = 0; i < sociosClub.length; i++) {
			if(sociosClub[i]!=null) {
				if(sociosClub[i].getIdSocio()==idSocio) {
					bandera=i;
					break;
				}
			}
		}
		return sociosClub[bandera];
	}	
	public static SocioFundacional getSocioFundacionalClub(int idSocio) {
		int bandera=-1;
		for (int i = 0; i < sociosClub.length; i++) {
			if(sociosClub[i]!=null) {
			if(sociosClub[i].getIdSocio()==idSocio) {
				bandera=i;
				break;
			}
			}
		}
		return (SocioFundacional)sociosClub[bandera];
	}	

	public static  Pista getPista(int idPista) {
		int bandera=-1;
		for (int i = 0; i < pistasClub.length; i++) {
			if(pistasClub[i].getIdPista()==idPista) {
				bandera=i;
				break;
			}
		}
		return pistasClub[bandera];
	}
	//Funcionalidades
	public static void agregarSocioNormal(Socio socioNuevo) {
		for (Socio socio : sociosClub) {

			if(socio!=null) {
				sociosClub[contadorSocios]=socioNuevo;
				contadorSocios++;
				break;
			}
		}
	}

	public static void agregarSocioFundacional(String nombre, int idSocio,LocalDate fechaInscripcion) {
		for (Socio socio : sociosClub) {

			if(socio!=null) {
				if(socio.getIdSocio()==idSocio) {
					break;
				}
			}
				else {
					SocioFundacional socioNuevo = new SocioFundacional(idSocio,nombre,fechaInscripcion);
					sociosClub[contadorSocios]=socioNuevo;
					contadorSocios++;
					break;
				}
			}
		
	}

	public static void agregarPista(int idPista, boolean cubierta) {
		boolean yaExiste=false;
		for (Pista pista : pistasClub) {
			if(pista!=null) {
				if(pista.getIdPista()==idPista);
				yaExiste=true;
			}
		}
		if(!yaExiste) {
			Pista pistaNueva = new Pista(idPista,cubierta);
			pistasClub[contadorPista]=pistaNueva;
			contadorPista++;
		}
	}

	public static void abrirReserva(Socio socio,Pista pista, LocalDate fechaReserva, LocalTime horaReserva) {
		Reserva reservaAux = new Reserva(socio,pista,fechaReserva,horaReserva);
		reservasHechas[contadorReservas]=reservaAux;
		contadorReservas++;
	}


}
