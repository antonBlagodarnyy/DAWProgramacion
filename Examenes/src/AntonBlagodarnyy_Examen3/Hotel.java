package AntonBlagodarnyy_Examen3;

public class Hotel {
	//Atributos
	public static final double PRECIO_NOCHE = 30;
	public static final int ESTRELLAS_MAX = 5, ESTRELLAS_MIN = 1;
	
	private String nombreHotel;
	private int numEstrellas;
	
	//Metodos
	//Constructores
	public Hotel() {
	}
	public Hotel(String nombreHotel, int numEstrellas) {
		super();
		this.nombreHotel = nombreHotel;
		if(numEstrellas<=ESTRELLAS_MAX&&numEstrellas>=ESTRELLAS_MIN)
		this.numEstrellas = numEstrellas;
		//TO-DO Aqui se podria poner un else que lanze una excepcion en caso de valor no valido para estrellas
	}
	
	//Setter n Getter
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public int getNumEstrellas() {
		return numEstrellas;
	}
	public void setNumEstrellas(int numEstrellas) {
		if(numEstrellas<ESTRELLAS_MAX&&numEstrellas>ESTRELLAS_MIN)
			this.numEstrellas = numEstrellas;
			//TO-DO Aqui se podria poner un else que lance una excepcion en caso de valor no valido para estrellas
	}
	public static double getPrecioNoche() {
		return PRECIO_NOCHE;
	}
	@Override
	public String toString() {
		return "Hotel =" + nombreHotel + ", numEstrellas=" + numEstrellas;
	}
	
	
	
	
	
}
