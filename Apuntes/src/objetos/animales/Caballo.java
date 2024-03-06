package objetos.animales;

import interfaces.IVehiculo;

public class Caballo implements IVehiculo{
	private boolean dormido;
	private String tipoPaso;
	
	
	@Override
	public void arrancar() {
		this.dormido=false;
	}

	@Override
	public void frenar(int intensidad) {
	if(intensidad>=1) {
		switch (tipoPaso) {
		case "galope"->{this.tipoPaso="trote";}
		case "trote"->{this.tipoPaso="camino";}
		}
	}
	}
	

	@Override
	public void parar() {
		this.dormido=false;
	}

	@Override
	public void acelerar() {
		
		
	}
}
