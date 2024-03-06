package boletin9.ejercicio5.bebidas;

import boletin9.ejercicio5.Bebida;
import boletin9.ejercicio5.Marca;
import boletin9.ejercicio5.interfaces.IBebida;

public class Azucarada extends Bebida implements IBebida {
//Atributos
	private double porcentajeAzucar;
	private boolean promocion;
	
	
	
	//Metodos
	//Const
	public Azucarada(int litros, double precioBase, double porcentajeAzucar, boolean promocion,Marca marca) {
		super( litros, precioBase, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;

	}

	//Get n Set
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}
	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}
	public boolean isPromocion() {
		return promocion;
	}
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}


	@Override
	public String toString() {
		return super.toString()+"Azucarada [porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion + "  ]";
	}

	@Override
	public double getPrecioFinal() {
		double precioDefinitivo=super.getPrecioFinal();
		if(promocion)
			precioDefinitivo-=super.getPrecioFinal()*AZUCARADA_PROMOCION;
		return precioDefinitivo;
	}
}
