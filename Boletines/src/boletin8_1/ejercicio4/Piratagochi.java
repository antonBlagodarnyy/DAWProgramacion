package boletin8_1.ejercicio4;

public class Piratagochi {
	//Atributos
	private String nombre;
	private int energia;// Siempre será un valor entre 1 y 10
	private boolean estaHambriento;
	private int nivelFelicidad;// Siempre será un valor entre 1 y 10
	public static final int VALOR_MAXIMO = 10;
	public static final int VALOR_MINIMO = 1;

	//Metodos
	//constructor
	/**
	 * Constructor del piratagochi
	 * Solo se le pasa como parametro el nombre, 
	 * el resto de atributos son aleatorios, energia y felicidad entre 1 y 10
	 * @param nombre 
	 * @return piratagochi
	 */
	public Piratagochi(String nombre) {//Al resto de atributos se le asigna un valor válido de forma aleatoria
		this.nombre=nombre;
		this.energia=(int)Math.floor(Math.random()*VALOR_MAXIMO) + 1;// Siempre será un valor entre 1 y 10
		double random = Math. random();
		if (random<0.5) {
			this.estaHambriento=true;
		} else {
			this.estaHambriento=false;
		}
		this.nivelFelicidad=(int)Math.floor(Math.random()*VALOR_MAXIMO) + 1;// Siempre será un valor entre 1 y 10
	}


	/**
	 * toString del piratagochi
	 */
	@Override
	public String toString() {
		String answer="Nombre: "+nombre+"\n"
				+ "Energia: "+energia+"\n"
				+ "Esta Hambriento: "+estaHambriento+"\n"
				+ "Nivel Felicidad: "+nivelFelicidad+"\n";
		return answer;
	}

	/**
	 * Cambia el estado de estaHambriento o le resta a felicidad
	 * 
	 */
	public void comer(){

		if(estaHambriento) {
			this.estaHambriento=false;
		}else {
			this.nivelFelicidad--;
		}
	}

	/**Aumenta el nivel de energía por cada hora dormida. 
	Sin embargo, si se llega al nivel máximo de energía, 10, cada hora de más dormida, se resta del nivel de felicidad. 
	Es decir, si por ejemplo el nivel de energía es 9, el nivel de felicidad 4, y se duermen 3 horas, el nivel de energía sería 10, y el nivel de felicidad 2. 
	 *
	 *@param int horasDurmiendo
	 */
	public void dormir(int horasDurmiendo){

		for(int i = horasDurmiendo; i>0;i--) {
			if(energia<10) {
				this.energia++;
			} else {
				this.nivelFelicidad--;
			}
		}

	}

	public void jugar(int horasJugando){
		/**
		 * Si estaHambriento es false, aumenta el nivel de felicidad las horas que está jugando, 
		hasta un máximo de 10, y se resta ese mismo numero de la energia, 
		y estaHambriento se pone a true.  Si por el contrario, estaHambriento es true,
		se resta el número de horas de la energia, y de la felicidad.
		 *@param int horasJugando
		 */
		if(this.estaHambriento==false) {
			for (int i = horasJugando; i>0; i--) {
				if(this.nivelFelicidad<10) {
					System.out.println("*jugando*");
					nivelFelicidad++;
					energia--;
					this.estaHambriento=true;
				} else {
					System.out.println("No quiero jugar! Tengo hambre!");
					this.energia-=horasJugando;
					this.nivelFelicidad-=horasJugando;
				}
			}
		}

	}

	/**
	 * El método devolverá un String en el que se indicará que es lo que le gustaría hacer al Piratagochi,
	 *	según su estado (Pensad en las posiblidades). 
	 *@return string en funcion del estado del piratagochi
	 */
	public String getNecesidades(){

		String necesidades="";
		if (this.estaHambriento) {
			necesidades+="Tengo hambre!!\n";
		}
		if(this.energia<4) {
			necesidades+="Estoy cansado!! Necesito descansar!!";
		}
		if(this.nivelFelicidad<4) {
			necesidades+="Me aburro, quiero jugar!!";
		}
		return necesidades;
	}
	//Por ejemplo: “¡Lucas quiere jugar! 😺”

}
