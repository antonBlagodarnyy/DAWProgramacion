package boletin6;

import java.util.Scanner;

public class metodos {
	//ejercicio0
	public static void escribir(){
		System.out.println("Hola");
	}

	//ejercicio1
	public static int numeroMayorDe3(int a, int b, int c) {
		//param:
		int resultado;

		if (a== b && b == c && a==c) {//en caso de que los 3 num sean iguales
			System.out.println("Los numeros son iguales");
			resultado = 0;

		} else {
			if ( a >= b && a >= c) {
				resultado = a; 
			} else if ( b >= c && b >= a) {
				resultado = b;
			}else {
				resultado = c;
			}
		}

		return resultado;
	}

	//ejercicio2
	public static double circunferencia(int r) {

		Scanner sString = new Scanner (System.in);
		double resultado = 0;
		int eleccion = 0;

		do {
			System.out.println("El radio introducido vale " + r 
					+ "\nQué desea calcular?\n"+
					"1.-Longitud de la circunferencia.\n" +
					"2.-Área de la circunferencia.\n" +
					"3.-Volumen de la esfera.\n");
			eleccion = sString.nextInt();
			switch (eleccion) {
			case 1:
				resultado = (r*2)*Math.PI;
				break;
			case 2:
				resultado = Math.pow(r, 2)*Math.PI;
				break;
			case 3:
				resultado = (4.0/3.0) * Math.PI * Math.pow(r, 3);
				break;
			default:
				System.out.println("Valor no valido."
						+ "Introduzca un numero del 1 al 3 para escoger una operacion.");
				break;
			}
		} while ( !(eleccion>=1 && eleccion <= 3));
		return resultado;
	}

	//ejercicio3
	public static int seleccionFiguraCalculo() {

	 	//parametros:
		Scanner s = new Scanner (System.in);
		boolean figura = true,calculo = true;//true para cono y area y false para cilindro y volumen.
		int input, caso = 0;

		//pedimos la figura
		do {
		System.out.println("¿Qué figura desea calcular?"
				+ "\n1.-Cono."
				+ "\n2.-Cilindro.");
		input = s.nextInt();
		if (input == 1) {
			figura=true;
		} else if(input == 2) {
			figura=false;
		} else {
			System.out.println("Valor no valido");
		}
		}while (input<1 || input>2);
		
		//pedimos el calculo
		do {
		System.out.println("¿Qué calculo desea realizar?"
				+ "\n1.-Area."
				+ "\n2.-Volumen.");
		input = s.nextInt();	
		if (input == 1) {
			calculo=true;
		} else if(input == 2) {
			calculo=false;
		} else {
			System.out.println("Valor no valido");
		}
		}while(input<1 || input >2);
		
		//4posibles casos
		if (figura && calculo) {//cono y area
			caso = 1;
		}else if (figura && !calculo) {//cono y volumen
			caso = 2;
		}else if (!figura && calculo) {//cilindro y area
			caso = 3;
		}else if (!figura && !calculo) {//cilindro y volumen
			caso = 4;
		}
		return caso;
	}

	public static double inputRadio(){
		Scanner s = new Scanner(System.in);
		double r = 0;
		boolean valorValido = true;

		do {
			valorValido = true;
		System.out.println("Introduzca el radio de la base de la figura.");//pedimos los valores geometricos
		r = s.nextInt();
		if (r<=0) {
			System.out.println("radio no valido");
			valorValido = false;
		}
		} while (!valorValido);
		return r;
	}

	public static double inputAltura() {
		Scanner s = new Scanner(System.in);
		double h = 0;
		boolean valorValido = true;
		
		do {
			valorValido = true;
		System.out.println("Introduzca su altura.");
		h = s.nextInt();
		if (h<=0) {
			System.out.println("altura no valida");
			valorValido = false;
		}
		} while (!valorValido);
		return h;
	}
	
	public static double areaCono(double r, double h) {
		double base = Math.PI * Math.pow(r, 2);
		double alturaLateral= Math.sqrt(Math.pow(h, 2)+ Math.pow(r, 2));
		double areaLateral = Math.PI*r*alturaLateral;
		double a = base + areaLateral;
		a = Math.round(a * 100.0) / 100.0;//redondeamos a 0.00
		return a;
	}
	
	public static double volumenCono(double r, double h) {
		double base = Math.PI * Math.pow(r, 2);
		double v = (1.0/3.0)*base * h;
		v = Math.round(v * 100.0) / 100.0;//redondeamos a 0.00
		return v;
	}

	public static double areaCilindro (double r, double h) {
		double a = 2*Math.PI*r*h+2*Math.PI*Math.pow(r, 2);
		a = Math.round(a * 100.0) / 100.0;//redondeamos a 0.00
		return a;
	}

	public static double volumenCilindro(double r, double h) {
		double v = Math.PI * Math.pow(r, 2)*h;
		v = Math.round(v * 100.0) / 100.0;//redondeamos a 0.00
		return v;
	}
	
	//ejercicio4
	public static String concatenacion(String a, String b) {
		String r = a + b;//Declaro la string que voy a devolver y digo que es la concatenacion de las 2 string metidas

		return r;//la devolvemos

	}
	
	//ejercicio5
	public static int numAleatorio(int a, int b) {
		int num;

		num = (int)Math.floor(Math.random()*b)+a;
		return num;
	}
	
	//ejercicio6
	public static String juegoNumeroAleatorio() {		
		/*Juego para adivinar un numero entre el 1 y el 50*/
		//PARAMETROS
		Scanner sInt = new Scanner (System.in);


		int numeroSecreto = (int)Math.floor(Math.random()*50+1), //creamos un numero aleatorio entre 1 y 50.
				numeroIntroducido = 0, intentos = 5;
		String resultado = "";


		do {//bucle del juego completo


			System.out.println( "Jugador2, pruebe a introducir el numero secreto.");

			while (intentos > 0) {//juega el jugador 2

				numeroIntroducido = sInt.nextInt();

				if (numeroSecreto == numeroIntroducido) {//en caso de que haya adivinado el numero
					resultado = "Ha ganado Jugador2!";
					break;//salimos del bucle de los intentos
				} else {//si ha fallado
					intentos --;//restamos un intento

					if(numeroSecreto>numeroIntroducido && intentos>0){//imprimimos una pista y los intentos restantes
						System.out.println("Numero introducido incorrecto, el numero secreto es mayor. Le quedan "+ intentos +" intentos.\nIntentelo de nuevo.");
					} else if (intentos >0 ) {
						System.out.println("Numero introducido incorrecto, el numero secreto es menor. Le quedan "+ intentos +" intentos.\nIntentelo de nuevo.");
					} else {//en caso de que no le queden intentos
						System.out.println("Ha perdido, no le quedan intentos.");
					}
				} 
			}//aqui termina el bucle de los intentos 

			if (numeroSecreto==numeroIntroducido) {
				break;//salimos del bucle del juego si ha ganado
			}

			intentos = 5;//si continua el juego, reestablecemos los intentos


			System.out.println( "Jugador1 adivina el numero secreto");
			while (intentos > 0) {//juega el jugador1
				numeroIntroducido = sInt.nextInt();
				if (numeroSecreto == numeroIntroducido) {
					resultado += "Ha ganado Jugador1!";
					break;//salimos del bucle de los intentos  si ha ganado
				} else {
					intentos --;
					if(numeroSecreto>numeroIntroducido && intentos>0){//imprimimos una pista y los intentos restantes
						System.out.println("Numero introducido incorrecto, el numero secreto es mayor. Le quedan "+ intentos +" intentos.\nIntentelo de nuevo.");
					} else if (intentos >0 ) {
						System.out.println("Numero introducido incorrecto, el numero secreto es menor. Le quedan "+ intentos +" intentos.\nIntentelo de nuevo.");
					} else {
						System.out.println("Ha perdido, no le quedan intentos.");
					}
				} 
			} 
			intentos = 5;//reestablecemos los intentos una vez pierda el jugador 1

		}while (numeroSecreto!=numeroIntroducido) ;//si no ha ganado ningun jugador, reiniciamos el bucle, si ha ganado el jugador 1, salimos del bucle del juego
		return resultado;
	}
	
	//ejercicio7
	public static String fechaValida() {
		//solicite al usuario un día, un mes, y un año,  e indique si dicha fecha es válida.

		//PARAM:
		Scanner s = new Scanner(System.in);
		int dia, mes, año;
		String respuesta = "";

		//banderas:
		boolean diaValido = true, mesValido = true, añoValido = true, bisiesto = false;


		System.out.println("Introduzca un anio en numeros");
		año = s.nextInt();
		if (año < 1 ) {//comprobamos valor año
			añoValido = false;
		}
		if (año % 4 == 0 || año % 1000 == 0 && año % 400 == 0) {
			bisiesto = true;
		}
		System.out.println("Introduzca un mes en numeros");
		mes = s.nextInt();
		if (mes < 1 || mes > 12) {//comprobamos mes
			mesValido = false;
		}

		System.out.println("Introduzca un dia en numeros");
		dia = s.nextInt();
		if (mes == 2) {//comprobacion mes de febrero

			if (bisiesto) {
				if (dia < 1 || dia >29) {//comprobacion febrero bisiesto
					diaValido = false;
				} 
			} else {
				if (dia < 1 || dia > 28) {
					diaValido = false;
				}
			}
		}
		if (!añoValido) {
			respuesta += "Anio no valido.";
		} else if (!mesValido) {
			respuesta += "Mes no valido.";
		} else if (!diaValido) {
			respuesta += "Dia no valido";
		} else {
			respuesta += "Valores correctos";
		}

		return respuesta;	

	}
	
	//ejercicio8
	public static void pintarCuadrado(int a, int h) {
		for ( int i = h; i > 0 ; i--) {//recorremos la altura
			pintaLinea(a);
			System.out.print("\n");
		}
	}
	public static void pintaLinea(int longitudLinea) {//recorremos la anchura
		for (int u = longitudLinea ; u > 0 ; u--) {
			System.out.print("*");
		}
	}
	
	//ejercicio9
	public static int funcionMisteriosa(int m, int n) {
		int resultado;
		if (n == 0) {
			resultado = 0;
		} else if (n == 1) {
			resultado=m;
		} else {
			resultado = m +funcionMisteriosa(m ,n-1);
		}
		return resultado;
	}
	
	public static int funcionMisteriosaLoop(int m, int n) {
		 int num = m;
		for (int i=n; i > 1 ; i--) {
			 num += m;
		 }
		 return num;
	}
	//ejercicio10
	public static String piramideChunga(int f) {
		String piramide = "";
		int asterisco = f, bloque = 1;

		if (f >9) {
			asterisco+=(f-9);//si tenemos mas de 9 asteriscos
			//sumamos la diferencia a los asteriscos
		}
		
		//loop total
		for (int i = f; i> 0 ; i --) {
if (bloque > 9) {//una vez empecemos con las decimas, restamos el asterisco sobrante del loop
	asterisco -=1;
}
			//pintamos la primera parte asterisco
			for(int u = asterisco; u > 0 ; u--) {
				piramide += "*";
			}
			//pintamos primera parte bloque
			for (int u = 1; u < bloque ; u++) {
				if ( u == 1 && bloque >9) {//como en las decimas los numeros se vuelven impares y los asteriscos quedan pares, agregamos un 0 para igualar el rectangulo
					piramide+=0;
				}
				piramide += u;
			}
			//pintamos segunda parte bloque
			for (int u = bloque; u > 0 ; u--) {
				piramide += u;
			}
			//pintamos segunda parte asterisco
			for(int u = asterisco; u > 0 ; u--) {
				piramide += "*";
			}
			//modificamos los contadores
			bloque++;
			asterisco--;
			//agregamos un salto de linea
			piramide += "\n";
		}
		
		//agregamos el ultimo nivel

		if (f >9) {//Si estamos en decimas, agregamos la diferencia en asteriscos
			for (int i = (((f+(f-9))*2)+1) ; i > 0; i--) {
				piramide += "*";
			}
		}else {
			for (int i = ((f*2)+1) ; i > 0; i--) {
				piramide += "*";
			}
		}
		return piramide;
	}
}
