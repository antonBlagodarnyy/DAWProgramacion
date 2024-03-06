package boletin8_1.ejercicio3;

public class Persona {
//Atributos
	String nombre, apellidos;
	int edad;
	char sexo;
	
	//Metodos
		//Constructor
	public  Persona() {//Constructor sin parametros
	}
	
public  Persona(String n,String a, int e, char s){//Constructor con parametros
	this.nombre = n;
	this.apellidos = a;
	this.edad=e;
	this.sexo=s;
}
		
//Setter
public void setNombre(String n) {
	this.nombre=n;
}
public void setApellidos(String a) {
	this.apellidos=a;
}
public void setEdad(int e) {
	if(e>0) {
		this.edad=e;
	}
}
public void setSexo(char s) {
	if(s=='h'||s=='m') {
		this.sexo=s;
	}
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

//Acciones
public void Saludar() {
	System.out.println("Hola");
}
	}

