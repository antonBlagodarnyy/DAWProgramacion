package main;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
//Commit para realizar push de un cambio en el nombre del archivo
	public static void main(String[] args) {
		Club.agregarSocioFundacional("Pedro",10,LocalDate.of(2024, 2, 21));
		Club.getSocioFundacionalClub(10).invitarSocio("Ana",2);
		Club.agregarPista(1, true);

		System.out.println(
				Club.getSocioClub(2).reservarPista(Club.getPista(1), LocalDate.of(2024, 2, 29), LocalTime.of(10, 0))
				);
		System.out.println(
				Club.getSocioClub(10).reservarPista(Club.getPista(1), LocalDate.of(2024, 2, 29), LocalTime.of(10, 0))
				);
		System.out.println(
				Club.getSocioClub(10).reservarPista(Club.getPista(1), LocalDate.of(2024, 2, 29), LocalTime.of(11, 0))
				);
		
	}
	
	public SocioFundacional getSocioMasAntiguo() {
		SocioFundacional socioFundacionalMasAntiguo=null;
		LocalDate fechaMasAntiguo=LocalDate.now();
		Socio[] socios=Club.getSociosClub();
		for (int i = 0; i < socios.length; i++) {
			Socio socio = socios[i];
			if(socio instanceof SocioFundacional) {
				SocioFundacional socioAux=(SocioFundacional)socios[i];
				if(socioAux.getFechaInscripcion().isBefore(fechaMasAntiguo)) {
					socioFundacionalMasAntiguo=socioAux;
					fechaMasAntiguo=socioAux.getFechaInscripcion();
				}
			}
		}
		return socioFundacionalMasAntiguo;
	}
}
