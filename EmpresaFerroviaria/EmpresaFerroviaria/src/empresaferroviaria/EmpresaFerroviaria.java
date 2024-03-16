/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaferroviaria;

/**
 *
 * @author martarobina
 */

/* Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias (sólo implementar los atributos y los constructores) para gestionar una empresa ferroviaria, en la que se distinguen dos grandes grupos (paquetes): el personal y la maquinaria. En el primero se ubican todos los empleados de la empresa, que se clasifican en tres grupos: maquinistas, mecánicos y jefes de estación. De cada uno de ellos es necesario guardar:
- Maquinistas: nombre, DNI, sueldo, rango que tiene adquirido (tipo String).
- Mecánicos: nombre, teléfono (para contactar en caso de urgencia) y en qué especialidad desarrolla su trabajo (ésta puede ser: frenos, hidráulica, electricidad o motor).
- Jefes de estación: nombre, DNI y la fecha en la que fue nombrado jefe de estación (tipo LocalDate).

En la parte de maquinaria podemos encontrar: trenes, locomotoras y vagones. De cada uno de ellos hay que considerar:
- Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga actual y el tipo de mercancía con el que están cargados.
- Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus motores y una antigüedad (año de fabricación). Además, cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
- Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un maquinista que es responsable de él. Los objetos de tipo Tren, al crearse, no tienen ningún vagón enganchado (nº de vagones por defecto a 0 y tabla de vagones de tamaño 5 vacía, que se crea en el constructor). Habrá que crear un método, dentro de la clase Tren, que se llame enganchaVagon, que gestione añadir un objeto Vagon al objeto Tren. Los vagones se enganchan al final del tren (justo después del último vagón enganchado).

Todas las clases correspondientes al personal (Maquinista, Mecanico y JefeEstacion) serán de uso público. Entre las clases relativas a la maquinaria sólo será posible construir, desde clases externas, objetos de tipo Tren y de tipo Locomotora. La clase Vagon será sólo visible por sus clases vecinas.
No hace falta implementar el main, sólo las clases.
*/

public class EmpresaFerroviaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
    }
    
}
