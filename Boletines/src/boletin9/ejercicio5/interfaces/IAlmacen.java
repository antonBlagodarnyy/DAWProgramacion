package boletin9.ejercicio5.interfaces;

import boletin9.ejercicio5.Bebida;
import boletin9.ejercicio5.Marca;

public interface IAlmacen {
	//Atributos
	int NUM_BEBIDAS=6;
	int NUM_ESTANTE=5;

	public double getPrecioTotal();
	public double getPrecioEstanteria(int idEstante);
	public double getPrecioMarca(Marca marca);
	public void agregarProducto(Bebida bebida);
	public void eliminarProducto(int idProducto);
	public void mostrarInventario();
	public void ampliarAlmacen();


}
