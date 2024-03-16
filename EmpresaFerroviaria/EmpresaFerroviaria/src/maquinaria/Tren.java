
package maquinaria;

import java.util.Arrays;
import personal.Maquinista;

public class Tren {

    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;

        vagones = new Vagon[5];
        numVagones = 0;
    }

    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }
    
    
//    //NO ES CORRECTO
//    public void motrar() {
//        System.out.println("Locomotora: " + locomotora.toString());
//        System.out.println("Responsable: " + responsable.toString());
//        System.out.println("Número de vagones: " + numVagones);
//        System.out.println("Lista de vagones: " + Arrays.toString(vagones));
//        
//        
//        for (int i = 0; i < this.vagones.length; i++) {
//            System.out.println(this.vagones[i]);
//        }
            
//        
//    
//    
//    }

    @Override
    public String toString() {
        return "Tren{" + "locomotora=" + locomotora + ", vagones=" + vagones + ", responsable=" + responsable + ", numVagones=" + numVagones + '}';
    }
    
    
    

 
    
    
}
