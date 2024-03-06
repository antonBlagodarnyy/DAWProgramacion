package boletin8_1.ejercicio6;

public class Main {

	public static void main(String[] args) {
		/*Ejercicio 6: Aprovechando la clase persona que hemos desarrollado en el ejercicio3,
		 *  vamos a modificarla para que una persona tenga asociada una cuenta corriente del ejercicio 3. 
		 *  Cread otro proyecto nuevo para este ejercicio, copiad la clase Persona y la clase Cuenta 
		 *  y a partir de ahí trabajar.
Puesto que la persona tiene asociada una cuenta, esa cuenta hay que “construirla” en algún momento, 
para ello nos vamos a declarar un método que sea abrir cuenta y que acepta como parámetros el iban, 
el número de cuenta y el interesMensual. En ese método es donde se llama al constructor de la cuenta.
Habría que declararse además otros métodos para la clase persona. A continuación se resumen:

Añadir el atributo Cuenta cuentaCorriente a Persona.

Añadir los siguientes métodos a Persona:
public void crearCuentaCorriente(String iban, int nc, double interesMensual)
public boolean sacarDinero(double dinero)
public boolean ingresarDinero(double cantidad)
public boolean hacerTransfereciaA(Persona p, double cantidad)
public void cerrarCuenta()

De esta forma, una persona se puede crear una cuenta corriente, sacar o ingresar dinero en su cuenta 
o puede hacer una transferencia a otra persona (se intuye que hace una transferencia 
a la cuenta de la otra persona)
Se da por hecho en este ejercicio que una persona solo puede tener una cuenta, 
que se puede cerrar, y entonces sí se podría crear otra.

Consejos:
En el constructor de la clase Persona, el atributo cuentaCorriente se inicializa a null, y  significa que la cuenta 
no está creada, y que la referencia cuentaCorriente no apunta a ningún sitio.
Cuando se crea la cuenta (crearCuentaCorriente) hay que comprobar si la cuenta ya existe o no. 
Para ello lo comparamos con ==null.
Y para cerrar la cuenta, simplemente hay que asignar el valor null a la cuenta, de esa forma el atributo 
ya no apunta a ningún sitio y el recolector de basura de java liberará la zona de memoria de la cuenta.
		 */
		Persona jaimito = new Persona("Jaimito","Gonzalez",26,'h');//creamos a jaimito

		jaimito.crearCuentaCorriente("ES02", 4309, 0.02);//Le creamos una cuenta bancaria

		jaimito.ingresarCantidad(1000);//Le ingresamos 1000 napos en la cuenta

		Persona manolito = new Persona("Manolito","Gutierrez",30,'h');//creamos a manolito4

		manolito.ingresarCantidad(50);//le intentamos ingresar 50 pavos en la cuenta, pero como no la tiene creada, el metodo nos devuelve, operacion no realizada

		manolito.crearCuentaCorriente("ES02", 5692, 0.02);//Le creamos la cuenta

		manolito.ingresarCantidad(50);//Le volvemos a realizar el ingreso

		manolito.hacerTransfereciaA(jaimito, 100);//le hacemos una transferencia de manolito a jaimito dejandole la cuenta descubierta al primero

		System.out.println(manolito.toString()+"\n");//imprimimos a manolito

		System.out.println(jaimito.toString()+"\n");//imprimimos a jaimito
	}

}
