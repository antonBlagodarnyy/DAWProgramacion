package AntonBlagodarnyy_Examen3;
import java.time.*;

public class Agencia {
	//Atributos
	private static Viaje [] historicoViajes = new Viaje[200];

	//Metodos
	//Get n Set
	public static Viaje[] getHistoricoViajes() {
		return historicoViajes;
	}
	public static void setHistoricoViajes(Viaje[] historicoViajes) {
		Agencia.historicoViajes = historicoViajes;
	}

	public static String historicoViajesToString() {
		String answer = "Viajes Gestionados: \n";
		for (int i = 0; i< historicoViajes.length;i++) {//Recorremos el array y concatenamos los viajes que contiene hasta que encuentre uno nulo
			if(historicoViajes[i]==null)
				break;
			answer += historicoViajes[i]+"\n";
		}
		return answer;
	}
	
	/*Como esta clase la usamos solo con valores y metodos estaticos, la impresion del array que lleva mejor realizarla en un metodo estatico aparte.
	 * @Override
	public String toString() {
		String answer = "Viajes Gestionados: \n";
		for (int i = 0; i< historicoViajes.length;i++) {
			if(historicoViajes[i]!=null)
				break;
			answer += historicoViajes[i];
		}
		return answer;
	}*/
	
	/**
	 * Obtiene la suma de todos los costes totales en viajes con fechas dentro de un tramo y un nombre especifico
	 * @param fechaInicio
	 * @param fechaFin
	 * @param nombreHotel
	 * @return suma de los costes totales
	 */
	public static double getSumatorioTotal(LocalDate fechaInicio, LocalDate fechaFin, String nombreHotel) {
		double suma = 0;
		for (int i = 0; i< historicoViajes.length;i++) {//recorremos el array
			if(historicoViajes[i]==null)//si encontramos un elemento vacio, salimos del bucle
				break;
			else {
				if(historicoViajes[i].getfInicio().isAfter(fechaInicio)//Si la fecha es posterior a la fecha de inicio
						&&historicoViajes[i].getfInicio().isBefore(fechaFin)//Si es anterior a la fecha final
							&&historicoViajes[i].getHotel().getNombreHotel().equals(nombreHotel)) //Si el nombre es el indicado
					suma += historicoViajes[i].getCosteTotal();//sumamos su valor a suma
			}	
		}
		return suma;
	}
	
	
	
}
