package abstracts;

public abstract class vehiculo {
	private String matricula;
	private int velocidad=0;
	private boolean estado = false;
	
	public vehiculo(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + ", velocidad=" + velocidad + ", estado=" + estado + "]\n";
	}

	
	
}
