package solucion_Profesor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Socio ana=new Socio("Ana", 10);
		Socio[] sociosInvitados=new Socio[SocioFundacional.MAX_INVITADOS];
		sociosInvitados[0]=ana;
		SocioFundacional pedro=new SocioFundacional("Pedro", 2, null, sociosInvitados);
		Pista pista1=new Pista(1, true);
		System.out.println(ana.reservarPista(pista1, LocalDate.of(2024, 2, 29), LocalTime.of(10, 0)));
		Reserva reservaDeAna=new Reserva(ana, pista1, LocalDate.of(2024, 2, 29), LocalTime.of(10, 0));
		Club.getReservas()[0]=reservaDeAna;
		System.out.println(pedro.reservarPista(pista1, LocalDate.of(2024, 2, 29), LocalTime.of(10, 0)));
		System.out.println(pedro.reservarPista(pista1, LocalDate.of(2024, 2, 29), LocalTime.of(11, 0)));
		
	}
	
	public SocioFundacional getSocioMasAntiguo() {
		SocioFundacional socioFundacionalMasAntiguo=null;
		LocalDate fechaMasAntiguo=LocalDate.now();
		Socio[] socios=Club.getSocios();
		for (int i = 0; i < socios.length; i++) {
			Socio socio = socios[i];
			if(socio instanceof SocioFundacional) {
				SocioFundacional socioAux=(SocioFundacional)socios[i];
				if(socioAux.getFechaInicio().isBefore(fechaMasAntiguo)) {
					socioFundacionalMasAntiguo=socioAux;
					fechaMasAntiguo=socioAux.getFechaInicio();
				}
			}
		}
		return socioFundacionalMasAntiguo;
	}
}


