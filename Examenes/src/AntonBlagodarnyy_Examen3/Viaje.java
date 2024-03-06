package AntonBlagodarnyy_Examen3;
import java.time.*;
public class Viaje {
	//Atributos
	private LocalDate fInicio;
	private int duracionEnNoches;
	private double costeDesplazamiento;
	private String dniContratante;
	private Hotel hotel;
	private int idViaje;

	public static final double DESCUENTO=0.1;

	private static int contadorViajes = 0;

	//Metodos
	//Constructor
	//TO-DO se pueden agregar restricciones para solo admitir valores validos
	public Viaje(LocalDate fInicio, int duracionEnNoches, double costeDesplazamiento, String dniContratante,
			Hotel hotel) {
		super();
		this.fInicio = fInicio;
		this.duracionEnNoches = duracionEnNoches;
		this.costeDesplazamiento = costeDesplazamiento;
		this.dniContratante = dniContratante;
		this.hotel = hotel;
		
		this.idViaje = contadorViajes;//Asignamos su id
		aniadirViajeAHistorico();
		contadorViajes++;//Incrementamos la posicion a la que agregarlo en 1
	}
	private void aniadirViajeAHistorico() {//añadimos el nuevo viaje a la lista de viajes estatica
		Agencia.getHistoricoViajes()[contadorViajes]=this;
	}
	//Set n Get
	public LocalDate getfInicio() {
		return fInicio;
	}
	public void setfInicio(LocalDate fInicio) {
		this.fInicio = fInicio;
	}
	public int getDuracionEnNoches() {
		return duracionEnNoches;
	}
	public void setDuracionEnNoches(int duracionEnNoches) {
		this.duracionEnNoches = duracionEnNoches;
	}
	public double getCosteDesplazamiento() {
		return costeDesplazamiento;
	}
	public void setCosteDesplazamiento(double costeDesplazamiento) {
		this.costeDesplazamiento = costeDesplazamiento;
	}
	public String getDniContratante() {
		return dniContratante;
	}
	public void setDniContratante(String dniContratante) {
		this.dniContratante = dniContratante;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public static int getContadorViajes() {
		return contadorViajes;
	}
	public static void setContadorViajes(int contadorViajes) {
		Viaje.contadorViajes = contadorViajes;
	}
	public int getIdViaje() {
		return idViaje;
	}

	@Override
	public String toString() {
		return "Viaje [fInicio=" + fInicio + ", duracionEnNoches=" + duracionEnNoches + ", costeDesplazamiento="
				+ costeDesplazamiento + ", dniContratante=" + dniContratante + ", hotel=" + hotel + ", idViaje="
				+ idViaje + ", costeTotal: "+getCosteTotal()+"]";
		
	}

	//Atributos derivados
	/**
	 * Calcula el coste de la instancia en funcion de la duracion en noches y el precio del hotel
	 * En caso de tener pocas estrellas y fecha inicio estar en enero o febrero, aplica un descuento
	 * @return double del costeEstancia
	 */
	public double getCosteEstancia() {
		//El coste de la estancia es la duracion en noches multipicada por el precio
		double costeEstancia = getDuracionEnNoches()*Hotel.getPrecioNoche();
		
		//En los hoteles de 2 y 3 estrellas, cuya fecha de inicio es en los meses de enero o febrero, aplicamos el descuento
		if(hotel.getNumEstrellas()>1&&hotel.getNumEstrellas()<4&&(this.fInicio.getMonthValue()==1||this.fInicio.getMonthValue()==2))
		costeEstancia-=costeEstancia*DESCUENTO;
		
		return costeEstancia;
	}
	/**
	 * Llama al metodo costeEstancia y le suma el costeDesplazamiento
	 * @return costeTotal
	 */
	public double getCosteTotal() {
		return costeDesplazamiento + getCosteEstancia();
	}
	
}
