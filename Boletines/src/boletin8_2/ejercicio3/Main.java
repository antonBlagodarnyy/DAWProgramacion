package boletin8_2.ejercicio3;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int  dia,mes,anio,fecha;
		boolean fechaValida=false;
		do {
			Menu.pedirDia();
			dia = s.nextInt();
			Menu.pedirMes();
			mes = s.nextInt();
			Menu.pedirAnio();
			anio= s.nextInt();
			fechaValida=Inputs.fechaValida(dia, mes, anio);
			if(!fechaValida)
				Menu.fechaNoValida();
		} while(!fechaValida);
		
		ReciboDeLuz reciboDeLuz = new ReciboDeLuz(LocalDate.of(anio,mes,dia));

		System.out.println(reciboDeLuz.toString());
	}

}
