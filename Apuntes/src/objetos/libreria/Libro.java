package objetos.libreria;

public class Libro {
	
	
//Atributos
	private String isbn, autor, titulo;
	private int numeroPaginas;
	public static final String VALOR_POR_DEFECTO="No tiene";
	
	//Metodos
	public Libro(int numPaginas) {//estos 2 metodos son constructores
		this.isbn=VALOR_POR_DEFECTO;
		this.autor=VALOR_POR_DEFECTO;
		this.numeroPaginas=numPaginas;
	}
	
	public Libro(String isbn,String autor, String titulo, int numeroPaginas) {//constructor
		this.isbn=isbn;//el this. Se refiere al atributo del metodo. Se usa para evitar duplicidades.
		this.autor=autor;
		this.titulo=titulo;
		this.numeroPaginas=numeroPaginas;
	}
	
	public Libro(String autor, String titulo) {//constructor
		
		this.autor=autor;
		this.titulo=titulo;

	}
}
