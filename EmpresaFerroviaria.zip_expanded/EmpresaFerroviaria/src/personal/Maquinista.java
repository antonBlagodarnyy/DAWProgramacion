/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

/**
 *
 * @author martarobina
 */
public class Maquinista {

    String nombre;
    String dni;
    double sueldo;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    
    public void mostrarInformación() {
        /*System.out.println(this.nombre);
        System.out.println(this.dni);
    */
        this.toString();
    }

    @Override
    public String toString() {
        return "Maquinista{" + "nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + ", rango=" + rango + '}';
    }
    
}
