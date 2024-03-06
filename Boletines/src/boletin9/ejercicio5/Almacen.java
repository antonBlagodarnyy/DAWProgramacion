package boletin9.ejercicio5;

import java.util.Arrays;

import boletin9.ejercicio5.interfaces.IAlmacen;

public class Almacen implements IAlmacen {
	//Atributos
	private Estante [] estanteria = new Estante  [NUM_ESTANTE];

	//Metodos
	public Almacen() {
		super();
		for (int i = 0; i < estanteria.length; i++) {
			this.estanteria[i]=new Estante();
		}
	}

	@Override
	public String toString() {
		return "Almacen [estanteria=" + Arrays.toString(estanteria) + "]";
	}

	@Override
	public double getPrecioTotal() {
		double sumatorio=0;
		for (int i = 0; i < estanteria.length; i++) {//bucle de toda la estanteria
			Bebida [] estanteAux = estanteria[i].getEstante();
			for (int j = 0; j < estanteria[i].getEstante().length; j++) {//Bucle de todo el estante
				if (estanteAux[j]!=null) {
					sumatorio+=estanteAux[j].getPrecioFinal();//pillamos el precio
				}
			}
		}

		return sumatorio;
	}

	@Override
	public double getPrecioEstanteria(int idEstante) {
		double sumatorio=0;
		Bebida [] estanteAux  = new Bebida [NUM_BEBIDAS] ;

		for (int i = 0; i < estanteria.length; i++) {//Buscamos el estante con ese id
			if(estanteria[i].getId()==idEstante) {
				estanteAux = estanteria[i].getEstante();
				break;
			}
		}

		for (int j = 0; j < estanteAux.length; j++) {//Bucle de todo el estante
			if (estanteAux[j]!=null) {
				sumatorio+=estanteAux[j].getPrecioFinal();//pillamos el precio
			}
		}
		return sumatorio;
	}

	@Override
	public void agregarProducto(Bebida bebida) {
		boolean repe = false, asignado=false;

		for (int i = 0; i < estanteria.length; i++) {//bucle de toda la estanteria
			Bebida [] estanteAux = estanteria[i].getEstante();
			for (int j = 0; j < estanteria[i].getEstante().length; j++) {//Comprobamos que no este repetida
				if (estanteAux[j]==bebida) {
					repe=true;
					break;
				}
			}

			if(!repe) {	
				for (int j = 0; j < estanteria[i].getEstante().length; j++) {
					if(estanteAux[j]==null){//Lo asignamos al primer valor disponible
						estanteAux[j]=bebida;
						asignado=true;
						break;
					}
				}
			}
			if(asignado)//Si ya hemos asignado el producto, salimos del bucle para no asignarlo a otra estanteria
				break;
		}
	}



	@Override
	public void eliminarProducto(int idProducto) {
		boolean borrado= false;
		for (int i = 0; i < estanteria.length; i++) {//bucle de toda la estanteria
			while(!borrado) {
				Bebida [] estanteAux = estanteria[i].getEstante();

				for (int j = 0; j < estanteria[i].getEstante().length; j++) {//Bucle de todo el estante
					if (estanteAux[j]!=null) {
						if(estanteAux[j].getId()==idProducto) {
							estanteAux[j] = null;
							borrado=true;
							break;
						}
					}
				}
			}
		}

	}

	@Override
	public void mostrarInventario() {
		toString();
	}

	@Override
	public void ampliarAlmacen() {
		System.out.println("Bajo construccion");

	}

	@Override
	public double getPrecioMarca(Marca marca) {
		double sumatorio=0;

		for (int i = 0; i < estanteria.length; i++) {//bucle de toda la estanteria

			Bebida [] estanteAux = estanteria[i].getEstante();

			for (int j = 0; j < estanteria[i].getEstante().length; j++) {//Bucle de todo el estante
				if (estanteAux[j]!=null) {
					if(estanteAux[j].getMarca()==marca) {
						sumatorio+=estanteAux[j].getPrecioFinal();
					}
				}
			}
		}

		return sumatorio;
	}

}
