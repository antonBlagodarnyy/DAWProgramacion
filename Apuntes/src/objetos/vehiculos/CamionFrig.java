package objetos.vehiculos;

import abstracts.vehiculo;
import interfaces.IFrigorifico;
import interfaces.IVehiculo;

public class CamionFrig extends vehiculo implements IVehiculo, IFrigorifico{
	//Atributos propios
	private int temperatura=0;
	private boolean estadoFrigorifico = false;

	//Metodos
	//Constructor
	public CamionFrig(String matricula) {
		super(matricula);
	}

	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public boolean isEstadoFrigorifico() {
		return estadoFrigorifico;
	}
	public void setEstadoFrigorifico(boolean estadoFrigorifico) {
		this.estadoFrigorifico = estadoFrigorifico;
	}

	//IVehiculo
	@Override
	public void arrancar() {
		if(! this.isEstado())
			this.setEstado(true);
	}
	@Override
	public void acelerar() {
		if(this.isEstado())
			this.setVelocidad(this.getVelocidad()+1);	
	}
	@Override
	public void parar() {
		if(this.getVelocidad()>0)
			this.setVelocidad(0);	
	}
	@Override
	public void frenar(int intensidad) {
		if(this.isEstado()&&this.getVelocidad()>0)
			this.setVelocidad(getVelocidad()-intensidad);
	}

	//IFrigorifico
	@Override
	public void encender() {
		if(!this.estadoFrigorifico)
			this.estadoFrigorifico=true;
	}
	@Override
	public void regularTemp(int temperatura) {
		if(this.isEstadoFrigorifico())
			this.setTemperatura(temperatura);	
	}
	@Override
	public void apagar() {
		if(this.isEstadoFrigorifico())
			this.estadoFrigorifico=false;
	}

	@Override
	public String toString() {
		String answer=super.toString();
		answer += "CamionFrig [temperatura=" + temperatura + ", estadoFrigorifico=" + estadoFrigorifico + "]";
		return answer;
	}

	
	
	
	

	
}
