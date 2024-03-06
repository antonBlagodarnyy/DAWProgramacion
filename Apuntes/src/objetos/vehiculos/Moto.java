package objetos.vehiculos;

import interfaces.IVehiculo;

public class Moto implements IVehiculo{

	private boolean arrancada;
	private int velocidad;
	
	
	
	public Moto(boolean arrancada, int velocidad) {
		super();
		this.arrancada = arrancada;
		this.velocidad = velocidad;
	}

	@Override
	public void arrancar() {
		this.arrancada=true;
		
	}

	@Override
	public void frenar(int intensidad) {
		
	}

	@Override
	public void parar() {
		// 
		
	}

	@Override
	public void acelerar() {
		// 
		
	}

}
