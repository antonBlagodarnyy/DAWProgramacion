package boletin8_1.ejercicio6;

public class Persona {
	//Atributos
	private String nombre, apellidos;
	private int edad;
	private char sexo;
	private Cuenta cuentaCorriente;

	//Metodos
	//Constructor
	public  Persona() {

	}
	public  Persona(String n,String a, int e, char s){
		this.nombre = n;
		this.apellidos = a;
		this.edad=e;
		this.sexo=s;
	}

	@Override
	public String toString() {
		String answer="nombre: "+nombre+"\n"
				+ "Apellidos: "+apellidos+"\n"
				+ "edad: "+edad+"\n"
				+ "sexo: "+sexo+"\n";
		if(this.cuentaCorriente!=null) {
			answer+= "Cuenta bancaria:\n"
					+this.cuentaCorriente.toString();
		} else {
			answer += "Cuenta bancaria: Sin cuenta";
		}
		return answer;
	}
	
	//Setter
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void setApellidos(String a) {
		this.apellidos=a;
	}
	public void setEdad(int e) {
		this.edad=e;
	}
	public void setSexo(char s) {
		this.sexo=s;
	}

	//Getter
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public int getEdad() {
		return this.edad;
	}
	public char getSexo() {
		return this.sexo;
	}
	public Cuenta getCuenta() {
		return this.cuentaCorriente;
	}
	//Acciones
	public void Saludar() {
		System.out.println("Hola");
	}

	/**
	 * Si no tiene una cuenta atribuida, llamamos al constructor, en caso contrario, sysout del suceso
	 * @param iban
	 * @param numeroCuenta
	 * @param interesMensual
	 */
	public void crearCuentaCorriente(String iban, int numeroCuenta, double interesMensual) {
		
		if(this.cuentaCorriente==null) {
			this.cuentaCorriente=new Cuenta(iban,numeroCuenta,interesMensual);
			System.out.println("Cuenta de "+this.nombre+" creada");
		} else {
			System.out.println("El usuario ya tiene una cuenta.");
		}
		
	}

/**
 * llamamos al metodo retirar de cuenta. las comprobacion y sysout se realizan dentro de la clase cuenta
 * @param dinero
 * @return boolean sacarDinero
 */
	public boolean sacarDinero(double dinero) {
		boolean sacarDinero;
		sacarDinero=this.cuentaCorriente.retirar(dinero);

		return sacarDinero;

	}

	/**
	 * Si cantidad es valido y cuentaCorriente existe, realizamos un ingreso(Metodo propio de clase Cuenta
	 * En caso contrario, boolean en false y sysout del suceso
	 * @param cantidad
	 * @return boolean ingresarCantidad
	 */
	public boolean ingresarCantidad(double cantidad) {
		//ingresa dinero de la cuenta 
		boolean ingresarCantidad;
		if(cantidad>0&&this.cuentaCorriente!=null) {
			this.cuentaCorriente.ingresar(cantidad);
			ingresarCantidad=true;
		} else {
			ingresarCantidad=false;
			System.out.println("Operacion no realizada");
		}
		return ingresarCantidad;

	}

	/**
	 * Llamamos a metodo de clase cuenta. Comprobaciones y sysouts dentro de la clase Cuenta.
	 * @param p
	 * @param cantidad
	 * @return boolean hacerTransferenciaA
	 */
	public boolean hacerTransfereciaA(Persona p, double cantidad) {

		boolean hacerTransferenciaA=this.cuentaCorriente.hacerTransferenciaA(p.getCuenta(), cantidad);


		return hacerTransferenciaA;
	}

	public void cerrarCuenta(){
		this.cuentaCorriente=null;
		}
}
