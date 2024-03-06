package boletin8_2.ejercicio4;

public class Piso {
		//Atributos
	private int planta, numero ;
	private double precioBase;

	
	//Metodos
	//Constructor
	public Piso(int planta, int numero, int precioBase) {
		super();
		this.planta = planta;
		this.numero = numero;
		this.precioBase = precioBase;
	}
		//Constructor auxiliar
	public Piso() {//Para poder crear un alquiler nulo
		super();
	}
	
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Piso [planta=" + planta + ", numero=" + numero + ", precioBase=" + precioBase + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		
	    if (this == obj) {//si la referencia es la misma
	        equals = true;
	    }else{ 
	    Piso piso = (Piso) obj; //casting de objeto a clase Piso para comprobar la direccion
	    if  (this.numero == piso.getNumero() && this.planta == piso.getPlanta())//Comprueba la planta y la direccion
    	equals = true;
	    }
	   
	    return equals ;
	}
}
