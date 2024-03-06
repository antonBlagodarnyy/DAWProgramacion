package abstracts;

public abstract class Trabajador {
	//Atributos
	private double dinero=0;
	
	//Metodos
		//Constructor
	public Trabajador() {

	}
	
	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	abstract public double cobrar() ;
	
	abstract public double cobrar(double salario);


	
}
