package boletin8_1.ejercicio5;

public class Cuenta {
	//Atributos
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private boolean descubierta  ;//Es derivado
	private double interesMensual;

	//Metodos
	//constructor
	/**
	 * Inicializamos la cuenta como NO descubierta y sin atribuir un saldo
	 * @param iban
	 * @param nc
	 * @param interesMensual
	 */
	Cuenta(String iban, int nc, double interesMensual){
		this.iban=iban;
		this.numeroCuenta=nc;
		this.interesMensual=interesMensual;
		this.descubierta=false;
	}

	//get 
	public String getIban() {
		return this.iban;
	}
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public boolean getDescubierta() {
		return this.descubierta;
	}
	public double getInteresMensual() {
		return this.interesMensual;
	}

	//set
	public void setIban(String iban) {
		this.iban=iban;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	/**
	 * como descubierta depende del saldo,alteramos el boolean en funcion de su cantidad
	 * @param int saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo=saldo;
		if(saldo<0) {
			this.descubierta=true;	
			} else {
				this.descubierta=false;		
			}
	}
	public void interesMensual(int interesMensual) {
		this.interesMensual=interesMensual;
	}

	@Override
	public String toString() {
		String answer="Iban: "+iban+"\n"
				+ "Numero Cuenta: "+numeroCuenta+"\n"
				+ "Saldo: "+saldo+"\n"
				+ "Descubierta: "+descubierta+"\n"
				+"Interes mensual: "+interesMensual;
		return answer;
	}

	/**
	 * sumamos al saldo, imprimimos la cuenta y el ingreso 
	 * y alteramos el estado de descubierta si necesario
	 * @param double dinero
	 */
	public void ingresar(double dinero) {
		this.saldo+=dinero;
		System.out.println("Ingreso realizado. "
				+ "El saldo en "+this.iban+this.numeroCuenta+" es de "+this.saldo+"\n");
		if (saldo>=0) {
			this.descubierta=false;
		}
	}

/**
 * si no esta descubierta, resta al saldo e imprime la operacion, en caso contrario, 
 * imprime el suceso y asigna false al boolean que return
 * despues comprueba el saldo restante y altera descubierta si necesario
 * @param double dinero
 * @return boolean en funcion del exito de la operacion
 */
	public boolean retirar(double dinero) {
		boolean retirar = true;
		if (this.descubierta==false||dinero>0) {
			this.saldo-=dinero;
			System.out.println("Retiro realizado. "
					+  "El saldo en "+this.iban+this.numeroCuenta+" es de "+this.saldo+"\n");

		}else {
			System.out.println("Retiro no realizada."
					+  "El saldo en "+this.iban+this.numeroCuenta+" es de "+this.saldo+"\n");
			retirar=false;
		}
		if (saldo<0) {
			this.descubierta=true;
		}
		return retirar;
	}
	
	/**Si esta descubierta imprime el estado de la cuenta y set el boolean a false
	 * 
	 * En caso contrario, resta la cantidad a cuenta origen, set a descubierta si necesario, realiza ingreso, 
	 * imprime resultado y set del boolean a true
	 * @param Cuenta c
	 * @param double cantidad
	 * @return boolean hacerTransferenciaA
	 */
	public boolean hacerTransferenciaA(Cuenta c, double cantidad) {
		boolean realizada;
		if(this.descubierta) {//en caso de estar descubierta
			System.out.println("El saldo en "+this.iban+this.numeroCuenta+" es insuficiente para realizar la transferencia.");
			realizada=false;
		} else {
			this.saldo-=cantidad;//retiramos la cantidad de la cuenta

			if (this.saldo<0) {//si el saldo queda en negativo, la marcamos descubierta
				this.descubierta=true;
			}
			System.out.println("Transferencia de "+this.iban+this.numeroCuenta+" a "+c.getIban()+c.getNumeroCuenta()+":");
			c.ingresar(cantidad);//ingresamos la suma en la nueva cuenta
			System.out.println("Saldo en "+this.iban+this.numeroCuenta+": "+this.saldo+"\n");
			realizada=true;
		}
		return realizada;
	}
	
	/**
	 * Calcula los beneficios a obtener segun el interes
	 * Si descubierta o valor numMeses no valido, beneficiosFuturos es 0,
	 * En caso contrario, multiplica interes con saldo con meses y lo devuelve
	 * 
	 * @param numMeses
	 * @return
	 */
	public double beneficiosFuturos(int numMeses) {
		double beneficiosFuturos;
		if(descubierta||numMeses<0) {
			beneficiosFuturos=0;
		}else {
			beneficiosFuturos = this.interesMensual*this.saldo*numMeses;
		}
		return beneficiosFuturos;
	}

}
