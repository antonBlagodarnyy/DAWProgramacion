package boletin9.ejercicio3;

public class Pelicula extends Producto {
//Atributos
	private String titulo, director;
	private Generos genero;
	
	public Pelicula(String titulo,  String autor, Generos genero) {
		super();
		this.titulo=titulo;
		this.director= autor;
		this.genero=genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return director;
	}

	public void setAutor(String autor) {
		this.director = autor;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return super.toString()+"Pelicula [titulo=" + titulo + ", director=" + director + ", genero=" + genero + "]";
	}
	
	

}
