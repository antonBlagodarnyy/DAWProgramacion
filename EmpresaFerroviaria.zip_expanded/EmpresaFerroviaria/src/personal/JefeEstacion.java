/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

import java.time.LocalDate;

/**
 *
 * @author martarobina
 */
public class JefeEstacion {

    String nombre;
    String dni;
    LocalDate nombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }

    @Override
    public String toString() {
        return "JefeEstacion{" + "nombre=" + nombre + ", dni=" + dni + ", nombramiento=" + nombramiento + '}';
    }
    
}
