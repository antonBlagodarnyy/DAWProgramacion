package solucion_Profesor;

public class Club {
	
	public static final int TAM=5;
	private static Reserva[] reservas=new Reserva[TAM];
	private static Socio[] socios=new Socio[TAM];
	
	
	
	public static Reserva[] getReservas() {
		return reservas;
	}
	public static void setReservas(Reserva[] reservas) {
		Club.reservas = reservas;
	}
	public static Socio[] getSocios() {
		return socios;
	}
	public static void setSocios(Socio[] socios) {
		Club.socios = socios;
	}
	
	
}
