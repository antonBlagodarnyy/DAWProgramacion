package boletin5;
import java.util.Scanner;

public class Boletin5 {
	public static void main(String[] args) {



		//System.out.println("Ejercicio1:"+ejercicio1());

		//System.out.println("Ejercicio2: "+ejercicio2());

		//System.out.println("Ejercicio3: "+ejercicio3());

		//System.out.println("Ejercicio4:"+ejercicio4());

		//System.out.println("Ejercicio5:"+ejercicio5());

		//System.out.println("Ejercicio6: "+ejercicio6()+"\n");

		//System.out.println("Ejercicio7:"); System.out.println(ejercicio7());

		//System.out.println("Ejercicio8:"); System.out.println(ejercicio8());

		//System.out.println(ejercicio9());

		//System.out.println(ejercicio10());

		//System.out.println(ejercicio11());

		//System.out.println(ejercicio12());
		
		//System.out.println(ejercicio13());
		
		//System.out.println(ejercicio14());
		
		//System.out.println(ejercicio15());
		
		//System.out.println(ejercicio16());
		
		//System.out.println(ejercicio17());
		
		//ejercicio18();
		
		//System.out.println(ejercicio19());
		
		//System.out.println(ejercicio20());
	}

	public static String ejercicio1(){
		// Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

		String resultado ="";//iniciamos una string

		for (int i = 0 ; i<=100 ; i +=5  ) {//siendo i igual a 0, mientras i sea menor o igual a 100, incrementalo en 5 en cada iteracion.
			resultado +=  " "+i;//lo imprimimos.
		}

		return resultado;
	}

	public static String ejercicio2() {
		//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

		String resultado = "0";
		int i=0;

		while (i < 100) {
			i+=5;
			resultado += " "+i;
		}
		return resultado;
	}

	public static String ejercicio3() {
		//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle dowhile.

		int i = 0;
		String resultado = "0";

		do {
			i+=5;
			resultado += " "+i;
		} while (i < 100);

		return resultado;
	}

	public static String ejercicio4() {
		//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
		//utilizando un bucle for.
		String resultado = "";
		for (int i = 320 ; i >= 160 ; i-=20) {
			resultado += " "+i;
		}
		return resultado;
	}

	public static String ejercicio5() {
		//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
		//utilizando un bucle while.
		String respuesta = "";
		int i = 320;
		while (i >= 160) {
			respuesta += " "+i;
			i -= 20;

		}
		return respuesta;
	}

	public static  String ejercicio6() {
		//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un
		//bucle do-while.
		int i = 320;
		String resultado = "320";

		do {
			i-=20;
			resultado += " "+i;
		} while (i > 160);

		return resultado;
	}

	public static String ejercicio7() {
		/*Realiza el control de acceso a una caja fuerte. La combinación será un
	número de 4 cifras que estará guardado en una variable.
	El programa nos pedirá la combinación para abrirla. Si no acertamos, se
	nos mostrará el mensaje “Lo siento, esa no es la combinación” y si
	acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
	Tendremos cuatro oportunidades para abrir la caja fuerte*/
		Scanner s = new Scanner(System.in);
		int combinacion = 1234;
		int intento;
		String respuesta;
		System.out.println("Introduzca un numero de 4 cifras:");

		intento = s.nextInt();

		if ( combinacion == intento ) {
			respuesta = "La caja fuerte se ha abierto satisfactoriamente.";	

			return respuesta;
		} else {
			respuesta = "Lo siento, esa no es la combinación.";

			return respuesta;
		}

	}

	public static String ejercicio8() {
		/*Muestra la tabla de multiplicar de un número introducido por teclado.
		Formatea la salida de la siguiente manera:
		2 x 1 = 2
		2 x 2 = 4
		2 x */

		Scanner s = new Scanner(System.in);//Creamos el escaner

		String tabla = "";//Un string para el resultado y un int para la operacion
		int num;

		System.out.println("Introduzca un numero entero para mostrar su tabla de multiplicar.");//pedimos el int
		num = s.nextInt();

		tabla += num+"x1="+num+"\n"
				+num+"x2="+(num*2)+"\n"	
				+num+"x3="+(num*3)+"\n"	
				+num+"x4="+(num*4)+"\n"	
				+num+"x5="+(num*5)+"\n"	
				+num+"x6="+(num*6)+"\n"	
				+num+"x7="+(num*7)+"\n"	
				+num+"x8="+(num*8)+"\n"	
				+num+"x9="+(num*9)+"\n"	
				+num+"x10="+(num*10)+"\n";//creamos la tabla

		return tabla;//lo devolvemos
	}

	public static String ejercicio9() {
		/*Realiza un programa que nos diga cuántos dígitos tiene un número
		introducido por teclado. Hacer uso de while o do-while*/
		Scanner s = new Scanner(System.in);
		int num, contador = 1; //Un int para el numero introducido por teclado y otro para contar sus cifras
		//como no existen numeros sin cifras lo iniciamos en 1.

		String respuesta = "";//String para devolver el resultado

		System.out.println("Introduzca un numero entero por teclado.");//pedimos el num
		num = s.nextInt();

		while(num > 9) {//mientras num tenga mas de 1 cifra, dividirlo entre 10
			num /= 10;
			contador ++;
		}

		respuesta += "Ese numero tiene "+contador+" cifras";//Creamos la respuesta.

		return respuesta;//la enviamos.
	}

	public static String ejercicio10() {
		/*Escribe un programa que calcule la media de un conjunto de números
		positivos introducidos por teclado. A priori, el programa no sabe cuántos
		números se introducirán. El usuario indicará que ha terminado de
		introducir los datos cuando meta un número negativo.*/

		//PARAMETROS:
		//Entrada
		Scanner s = new Scanner(System.in);
		int num = 0;
		int suma= 0;
		int media = 0;
		int contador = 0;

		//Salida
		String respuesta = "";

		//BUCLE:
		System.out.println("Introduzca un numero positivo para calcular la media de todos los numeros introducidos.\n"
				+ "Introduciendo uno negativo mostrara el resultado.");
		while(num >= 0) {//entramos en el bucle siempre que sea positivo
			num = s.nextInt();

			if (num == 0) {
				System.out.println("Valor nulo.");//En caso de que el valor sea 0
			}else if(num >0 ){//evitamos la ultima iteracion en caso de que sea negativo
				suma += num;
				contador ++;
				System.out.println("Valor añadido.");
			}
		}
		media = suma / contador;

		//SALIDA:
		System.out.println("Ha introducido "+contador+" numeros positivos.");//imprimimos las variables para comprobar que el codigo recibe valores correctos.
		System.out.println("La suma de ellos es "+suma);
		respuesta += "La media de los numeros positivos introducidos es "+media;//concatenamos y devolvemos el resultado
		return respuesta;
	}

	public static String ejercicio11() {
		/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo
de los 5 siguientes números enteros a partir de uno que se introduce por
teclado.
Ejemplo: 
numero 13
Numero Cuadrado Cubo
13 26 39
14 28 42*/
		//PARAMETROS:
		//entrada:
		Scanner s = new Scanner(System.in);
		int num;


		//salida
		String respuesta = "";

		//CUERPO:
		System.out.println("Introduzca un numero:");//pedimos el valor
		num = s.nextInt();

		System.out.println("Numero "+num);
		respuesta += "Numero Cuadrado Cubo\n"
				+ num +" "+ (int)(Math.pow(num, 2)) +" "+ (int)(Math.pow(num, 3))+"\n";//calculamos el 1 numero

		for (int i = 1; i < 6 ; i++) {//concatenamos los 5 numeros siguientes
			respuesta += + (num+i) +" "+ (int)(Math.pow((num+i), 2)) +" "+ (int)(Math.pow((num+i), 3)) +"\n";
		}

		return respuesta;		
	}

	public static String ejercicio12() {
		/*Visualiza por pantalla la suma de los números pares y la suma de los
	impares desde 1 hasta 100*/
		//PARAMETROS:
		int sumaPar =0, sumaImpar =0;
		String numPar = "", numImpar = "",  respuesta = "";

		//CUERPO
		for (int i = 2 ; i <= 100 ; i += 2) {//bucle para los pares
			numPar += " " + i;
			sumaPar += i;
		}
		for (int i = 1 ; i <= 100 ; i += 2) {//impares
			numImpar += " " + i;
			sumaImpar += i;
		}

		respuesta += "Numeros pares:\n"//concatenamos la respuesta
				+ numPar +"\n"
				+ "Suma de numeros pares hasta 100:\n"
				+ sumaPar +"\n"
				+ "Numeros impares:\n"
				+ numImpar +"\n"
				+ "Suma de numeros impares hasta 100:\n"
				+ sumaImpar;

		return respuesta;

	}

	public static String ejercicio13() {
		/*Escribe un programa que lea una lista de diez números y determine
		cuántos son positivos, y cuántos son negativos.*/
		//PARAMETROS
		Scanner s = new Scanner(System.in);
		int num;
		String negativo = "", positivo = "", resultado ="";
		
		System.out.println("Introduzca a continuacion 10 numeros enteros uno por uno.");
		
		for(int i = 10; i>=1; i--) {//loop con 10 iteraciones descendientes
			
			 if (i<10) {//contamos los numeros que quedan por introducir
				 System.out.println("Quedan "+ i +" numeros por introducir");
				 System.out.println("Introduzca otro valor");
			 }
			 
			 num = s.nextInt();
			if (num  > 0) {
				positivo += num + " ";//agregamos el numero a un string u otro
			} else {
				negativo += num + " ";
			}
			
		}
		resultado += "Positivos:\n"//concatenamos los 2 String en 1
				+ positivo +"\n"
				+ "Negativos:\n"
				+ negativo;
		
		return resultado;//devolvemos el resultado
		
	}

	public static String ejercicio14() {
		/*Haz una función que dados 3 números a, b y c introducidos por teclado devuelva
cuál es el mayor.*/
	Scanner s = new Scanner(System.in);
	int a, b, c;
	String resultado = "El mayor es ";
	
	System.out.println("Introduzca el primer numero.");
	a = s.nextInt();
	
	System.out.println("Introduzca el segundo numero.");
	b = s.nextInt();
	
	System.out.println("Introduzca el tercer numero.");
	c = s.nextInt();
	
	if ( a > b && a > c) {
	resultado += a; 
	} else if ( b > c && b > a) {
		resultado += b;
	}else {
		resultado += c;
	}
	return resultado;
	}

	public static String ejercicio15() {
		/*Un ordenador se deprecia cada año un 40% sobre el valor del año
		anterior. Obtener un listado de la depreciación a lo largo de los años,
		suponiendo que por debajo de 300 euros no se deprecia. La salida podría
		ser:
		PRECIO ADQUISICIÓN 2000
		AÑOS VALOR_ORDENADOR
		1 1200
		2 720
		3 432
		4 259,2
		El ordenador se depreció en 4 años.*/
		//PARAMETROS
		int precio = 2000;
		int contador = 0;
		String resultado = "PRECIO ADQUISICIÓN: "+ precio+"\n"
				+ "AÑOS VALOR_ORDENADOR\n";
	
		while (precio > 300) {
			contador++;
			precio -= precio*0.4;
			resultado += contador+ " " + precio+"\n";
			
		}
		resultado += "El ordenador se desprecio en "+ contador+" años.";
		return resultado;
	}

	public static String ejercicio16() {
		/*Programa que visualice todos los años bisiestos comprendidos entre 2000
		y 2100, ambos inclusive.
		Un año es bisiesto si es divisible entre 4 y no es divisible entre 100 o si es
		divisible entre 400.
		Un número es divisible por otro si el resto de la división es 0*/
		
		String añoBisiesto = "Años bisiestos: ";
		int año = 2000;
		
		while (año <= 2100) {
			if ( año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
				añoBisiesto += año + " \n"; 
			}
			año++;
		} return añoBisiesto;
		
	}

	public static String ejercicio17() {
		/*Escribe un programa que diga si un número introducido por teclado es o
no primo. Un número primo es aquel que sólo es divisible entre él mismo
y la unidad. Por ejemplo el 7. Pues recorriendo desde el 1 hasta el 7 veo
que 7 solo es divisible por 1 y por 7  es primo.*/
		
		//PARAMETROS
		Scanner s = new Scanner(System.in);
		boolean primo = true;//suponemos que es true
		String respuesta = "";
		
	System.out.println("Introduzca un numero");
	int n = s.nextInt();
	
	for (int i = 2 ; i < n ; i++) {//recorremos todos los numeros desde 2 hasta n-1
		if (n % i ==0) {//si n es divisible entre cualquiera de esos numeros
			primo = false;//ya no es primo
			break;
		}
	}
	if (primo) {//concatenamos la respuesta y la devolvemos
		respuesta += "Es primo";
	} else {
		respuesta += "No es primo";
	}
	return respuesta;
	}

	public static void ejercicio18() {
		/*Realiza un programa que pinte una pirámide por pantalla. La altura de la
		pirámide se debe pedir por teclado. El carácter con el que se pinta la
		pirámide también se debe pedir por teclado.*/
	/*
		//PARAMETROS 
		Scanner sChar = new Scanner(System.in);
		Scanner sInt = new Scanner(System.in);
		
		String resultado = "";
		String caracter;
		int alturaPiramide, anchuraPiramide = 1;
		
		//pedimos los datos
		System.out.println("¿Con que caracter pinto la piramide?");
		caracter = sChar.nextLine();
	
		System.out.println("¿Cuantas lineas debe de tener?");
		alturaPiramide = sInt.nextInt();
		
	//para pintar el lado izquierdo
		for (int i = 0 ; i < alturaPiramide ; i++) {//recorremos la altura
			for (int u = anchuraPiramide ; u > 0 ; u--) {//pintamos el caracter
				resultado += caracter;
			}
			
			anchuraPiramide++;
			resultado += "\n";//agregamos un salto de linea
		}
		
		for (int i = anchuraPiramide ; i>0; i--) {//pintamos el pico
			resultado+= caracter;
		}
		resultado += "\n";
		
	//pintamos el lado inverso
		for (int i = 0 ; i < alturaPiramide ; i++) {//recorremos la altura
			for (int u = anchuraPiramide ; u > 1 ; u--) {//pintamos el caracter
				resultado += caracter;
			}
			
			anchuraPiramide--;
			resultado += "\n";//agregamos un salto de linea
		}
			return resultado;
		}*/



// Realiza un programa que pinte una pirámide por pantalla. La altura de la

// pirámide se debe pedir por teclado. El carácter con el que se pinta la

// pirámide también se debe pedir por teclado

Scanner teclado= new Scanner(System.in);//Declaro los Scanners que voy a usar

Scanner teclado1= new Scanner(System.in);

//Declaro las variables

String caracter;

int altura,alturaAux;

//Controlo la entrada de datos en este caso es la altura de la pirámide

do {

System.out.println("¿Qué altura quieres que tenga la pirámide?");//pido que se introduzca la altura de la pirámide

altura=teclado1.nextInt();//recojo la altura y la almaceno en la variable

if(altura<2) {//Si la altura es inferior a 2 el mensaje se muestra

System.out.println("ERROR.La altura debe ser mínimo de 2");

}

}while(altura<2);//Si la altura es inferior a 2 el bucle se repite

alturaAux=altura;//asigno el valor de altura a alturaAux

do {

System.out.println("¿Con qué carácter quieres rellenar la pirámide?");//Pregunto con qué caracter se quiere rellenar la pirámide

caracter=teclado.nextLine();//Recojo el caracter y lo almaceno en la variable caracter

if (caracter.length()>1||caracter.equals(" ")||caracter.isEmpty()) {//Aqui compruebo con length()que solo se introduce un caracter.

//También, compruebo que ese caracter no sea un espacio en blanco

//Y tambíen compruebo que se introduzca algun caracter y no se deje en blanco con isEmpty()

System.out.println("ERROR. Debes introducir un caracter; No puedes introducir más de un carácter ni un espacio en blanco.");



}

}while(caracter.length()>1||caracter.equals(" ")||caracter.isEmpty());//Si la cadena que se introduce mide más de 1 caracter o el carácter es un espacio en blanco o el carácter está vacío el bucle se vuelve a ejecutar.

for(int i=1 ;i<=altura;i++) {//Este bucle se usa para crear las filas de la pirámide

String cadena="";

for (int j = alturaAux; j >0 ; j--) {//Este bucle se usa para rellenar las filas de la pirámide

if (i==j) {

cadena += " "+caracter;//Mientras se cumpla la condición la cadena se rellena con un espacio en blanco y un carácter

}else if(i<j){

cadena += " ";//Mientras se cumpla la condición la cadena se rellena con espacios en blanco

}else if(i>j) {

cadena +=" "+caracter;//cuando se cumpla la condición la cadena se rellena con el carácter elegido más un espacio

}

}



System.out.println(cadena);//Mostramos la cadena que correspondería a la pirámide

}

teclado.close();

teclado1.close();

}

	public static String ejercicio19() {
		/*Programa que pida por teclado:
• Un valor inicial (inicial).
• Un factor de incremento (incremento).
Los dos valores deben ser mayores que cero y de tipo entero. Si son
menores o iguales que cero se pedirán de nuevo.
Se desea:
Visualizar una serie de 5 números, comenzando en inicial e
incrementando según el factor de incremento.
Visualizar el resultado de sumar los 5 números.*/
		
		//PARAMETROS
		//@input:
			Scanner s = new Scanner (System.in);
			int num, incremento, suma = 0;
		//@output:
			String respuesta = "";
			
			System.out.println("Introduzca el valor numero:");
			num = s.nextInt();
			while(num<=0) {
				System.out.println("Valor introducido no valido.\n"
						+ "Introduzca el valor numero:");
				num = s.nextInt();
			}
			
			System.out.println("Introduzca el valor incremento:");
			incremento = s.nextInt();
			while(num<=0) {
				System.out.println("Valor introducido no valido.\n"
						+ "Introduzca el valor incremento:");
				incremento = s.nextInt();
			}
			respuesta += num;//concatenamos el primer numero para evitar el espacio inicial
			
			for (int i = 0 ; i < 4 ; i++) {//loop con 5 iteraciones
				num += incremento;//sumamos incremento
				suma += num;
				respuesta += " "+num;//concatenamos el numero sumado
				
			}
			respuesta += "\n"
					+ "la suma de los numeros es:" +suma;
			return respuesta;
		}

	public static String ejercicio20() {		
	/*Programa que permita el siguiente juego: Un primer jugador teclea un
número entre 1 y 50 (debe comprobarse que sea correcto). El segundo
jugador intentará adivinarlo.
Para ello tendrá como máximo 5 intentos y el programa irá sacando
mensajes indicando si el número a adivinar es mayor o menor al número
introducido por el jugador 2. Al final se indicará si el jugador ganó o
perdió. Si se adivina el número antes de que finalicen los 5 intentos el
programa finaliza.*/
	//PARAMETROS
	Scanner sInt = new Scanner (System.in);
	Scanner sString = new Scanner (System.in);
	
	 int numeroSecreto = 0, numeroIntroducido = 0, intentos = 5;
	 String resultado = "", jugador1 = "", jugador2 = "";

	 //pedimos el nombre de los jugadores:
	 	System.out.println("Jugador 1: Introduzca su nombre");
	 jugador1 += sString.nextLine();
	 System.out.println("Jugador 2: Introduzca su nombre");
	 jugador2 += sString.nextLine();
	 
	 do {//bucle del juego completo
		 
			 System.out.println( jugador1+" introduce un numero secreto.");
			 numeroSecreto = sInt.nextInt();
			 
			 for (int i = 1; i < 50; i++) {
				 System.out.print("\n");//ocultamos el numero secreto
			 }
			 
			 System.out.println( jugador2+" adivina el numero secreto");
			 
			 while (intentos > 0) {//juega el jugador 2
				 
				 numeroIntroducido = sInt.nextInt();
				 
				 if (numeroSecreto == numeroIntroducido) {//en caso de que haya adivinado el numero
					 resultado = "Ha ganado "+jugador2+"!";
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
			 
		 System.out.println(jugador2+" introduce un numero secreto.");
		 numeroSecreto = sInt.nextInt();
		 for (int i = 1; i < 50; i++) {
			 System.out.print("\n");//ocultamos el numero secreto
		 }
		 
		 System.out.println( jugador1+" adivina el numero secreto");
		 while (intentos > 0) {//juega el jugador1
			 numeroIntroducido = sInt.nextInt();
			 if (numeroSecreto == numeroIntroducido) {
				 resultado += "Ha ganado "+jugador1+"!";
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
}

	 
	 







