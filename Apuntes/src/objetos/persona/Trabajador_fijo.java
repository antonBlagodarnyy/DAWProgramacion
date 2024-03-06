package objetos.persona;

import abstracts.Trabajador;

public class Trabajador_fijo extends Trabajador {
	//Atributo
	private double salario;
	
	public Trabajador_fijo(double salario) {
		super();
		this.salario=salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double cobrar() {
		this.setDinero(this.getDinero()+this.getSalario());
		return this.getDinero();
	}

	@Override
	public double cobrar(double salario) {
		return 0;
	}

	@Override
	public String toString() {
		return "Trabajador_fijo [salario=" + salario + "]";
	}

}
