package objetos.vehiculos;

public class Bicicleta {
	//Atributos
	private int velocidadActual, cadenciaDePedaleoActual, marchaActual;
	//los atributos se inicializan por defecto a 0 en caso de ser int y en Null en caso de ser String
	//se pueden inicializar con otro valor.
	
	//Metodos
	public void acelerar() {
		this.velocidadActual++;
	}
	public void frenar() {
		if(velocidadActual>0) 
			this.velocidadActual--;
	}
	
	public void mostrarEstado() {
		System.out.println("velocidad : "+this.velocidadActual);
		System.out.println("cadenciaPedaleoActual : "+this.cadenciaDePedaleoActual);
		System.out.println("marcha : "+this.marchaActual);
	}
	
	public void subirMarcha() {
		if(marchaActual<6) 
			marchaActual++;
		
	}
	public void bajarMarcha() {
		if(marchaActual>0) 
			marchaActual++;
	}
	
	//Setter y Getter
	public int getVelocidadActual(){
		return this.velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual){
		 this.velocidadActual=velocidadActual;
	}
	
}
