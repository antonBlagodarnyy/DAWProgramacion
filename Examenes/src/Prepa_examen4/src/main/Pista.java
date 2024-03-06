package main;

import java.util.Objects;

public class Pista {
	public static final int COSTE_DESCUBIERTA=8;
	public static final int COSTE_CUBIERTA=10;

	private int idPista;//TODO hacer unico
	private boolean cubierta;

	public Pista(int idPista, boolean cubierta) {
		super();
		this.idPista = idPista;
		this.cubierta = cubierta;
	}
	public int getIdPista() {
		return idPista;
	}
	public void setIdPista(int idPista) {
		this.idPista = idPista;
	}
	public boolean isCubierta() {
		return cubierta;
	}
	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	//TODO Hacer bonito
	@Override
	public String toString() {
		return "Pista [idPista=" + idPista + ", cubierta=" + cubierta + "]";
	}

	//TODO checkar id
	@Override
	public int hashCode() {
		return Objects.hash(cubierta, idPista);
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
		return cubierta == other.cubierta && idPista == other.idPista;
	}

	public int getPrecio() {
		int coste=0;
		if(cubierta) {
			coste=	COSTE_CUBIERTA;
		} else {
			coste = COSTE_DESCUBIERTA;
		}
		return coste;
	}


}
