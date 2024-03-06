package main_y_clases;

public class naveNomada extends naveEspacial {
//Atributos
	private double autonomia;
	private double nivelCombustible;
	public static final int POTENCIA_COMBUSTIBLE=5;
	
	public naveNomada(String nombre, int tripulacion, double velocidad, double autonomia, double nivelCombustible) {
		super(nombre, tripulacion, velocidad);
		this.autonomia=autonomia;
		this.nivelCombustible=nivelCombustible;
	}

		public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public double getNivelCombustible() {
		return nivelCombustible;
	}

	public void setNivelCombustible(double nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}

		public double []  calcularRuta() {
			double distancia=0;
			distancia=autonomia*velocidad;
			
			double tiempo=0;
			tiempo = autonomia-velocidad;
			double velocidadMedia=velocidad/this.getNivelCombustible();
			double[] ruta = new double[]{distancia, tiempo, velocidadMedia}; 
	return ruta;
			
		}

		/*revisarSistemas(): String: Verifica si los sistemas de la nave están operativos y devuelve un mensaje indicando su estado
		*/
		@Override
		public String toString() {
			return "naveNomada [autonomia=" + autonomia + ", nivelCombustible=" + nivelCombustible + ", nombre="
					+ nombre + ", tripulacion=" + tripulacion + ", velocidad=" + velocidad + "]";
		}
		
		/*investigar(): int: Realiza una simulación de investigación durante el viaje y devuelve un número aleatorio de descubrimientos realizados.
		 * */
		public int investigar() {
			return (int)(Math.random() * 100) + 1;
		}
		}
	
	

