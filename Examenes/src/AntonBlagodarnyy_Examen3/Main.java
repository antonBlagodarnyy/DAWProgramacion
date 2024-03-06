package AntonBlagodarnyy_Examen3;
import java.time.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Hotel transilvania = new Hotel("Transilvania",4);
		Hotel bucarest = new Hotel("Bucarest",2);
		
		Viaje viajeTest = new Viaje(LocalDate.now(),4,40,"31906199R",transilvania);
		Viaje viajeTest2 = new Viaje(LocalDate.of(2022, 11, 23),10,20,"31906199R",transilvania);
		Viaje viajeTest3 = new Viaje(LocalDate.of(2018, 10, 13),10,20,"31906459R",bucarest);
		
		System.out.println(transilvania);
		System.out.println(viajeTest);
		System.out.println(viajeTest2);
		double sumatorio = Agencia.getSumatorioTotal(LocalDate.of(2020,10,10),LocalDate.of(2024, 10,10),"Transilvania");
		System.out.println(sumatorio);
		System.out.println(Agencia.historicoViajesToString());
	}

}
