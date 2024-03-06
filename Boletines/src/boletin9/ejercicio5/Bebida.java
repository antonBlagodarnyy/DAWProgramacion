package boletin9.ejercicio5;

import boletin9.ejercicio5.interfaces.IBebida;

public abstract class Bebida implements IBebida {
	//Atributos
	private int id, litros;
	private double precioBase;
	private Marca marca;
	private static int contadorBebidaId=1;
	//Metodos
	//Const
	public Bebida( int litros, double precioBase, Marca marca) {
		super();
		this.id = contadorBebidaId;
		contadorBebidaId++;
		this.litros = litros;
		this.precioBase = precioBase;
		this.marca=marca;
	}
	
	//Get n Set
	
	public int getId() {
		return id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getLitros() {
		return litros;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Bebida [id=" + id + ", litros=" + litros + ", precioBase=" + precioBase + ", marca= "+marca+"]";
	}

	@Override
	public double getPrecioFinal() {
		return this.getPrecioBase()+this.getPrecioBase()*IVA;
	}

}
