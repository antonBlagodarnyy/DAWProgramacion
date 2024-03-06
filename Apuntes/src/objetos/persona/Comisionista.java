package objetos.persona;

import abstracts.Trabajador;

public class Comisionista extends Trabajador{

	public Comisionista() {
		super();
	}

	public double cobrar() {
		return 0;
	}

	@Override
	public double cobrar(double salario) {
		this.setDinero(this.getDinero()+salario);
		return this.getDinero();
	}

	@Override
	public String toString() {
		return "Comisionista [], dinero: "+this.getDinero();
	}

	
	
}
