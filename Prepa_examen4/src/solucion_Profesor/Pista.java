package solucion_Profesor;

import java.util.Objects;

public class Pista {
	private int identificador;
	private boolean estaCubierta;
	public static final int PRECIO_CUBIERTA=10;
	public static final int PRECIO_ABIERTA=8;
	
	
	
	public Pista(int identificador, boolean estaCubierta) {
		super();
		this.identificador = identificador;
		this.estaCubierta = estaCubierta;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public boolean isEstaCubierta() {
		return estaCubierta;
	}
	public void setEstaCubierta(boolean estaCubierta) {
		this.estaCubierta = estaCubierta;
	}
	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pista other = (Pista) obj;
		return identificador == other.identificador;
	}
	@Override
	public String toString() {
		return "Pista [identificador=" + identificador + ", estaCubierta=" + estaCubierta + "]";
	}
	public double getPrecio() {
		double precio=Pista.PRECIO_ABIERTA;
		if(this.isEstaCubierta()) {
			precio=Pista.PRECIO_CUBIERTA;
		}
		return precio;
	}

	
	
}
