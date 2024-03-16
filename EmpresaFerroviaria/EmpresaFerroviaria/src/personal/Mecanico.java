/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

/**
 *
 * @author martarobina
 */
public class Mecanico {

    String nombre;
    String telefono;

    enum Especialidad {
        FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR
    }
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }

    @Override
    public String toString() {
        return "Mecanico{" + "nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + '}';
    }
    
}
