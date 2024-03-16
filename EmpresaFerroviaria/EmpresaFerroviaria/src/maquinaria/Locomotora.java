
package maquinaria;

import personal.Mecanico;

public class Locomotora {

    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mec = mec;
        
        Vagon x= new Vagon(111, 150, 250, "frutas");
        
        String z= x.mercancia;
    }

    @Override
    public String toString() {
        return "Locomotora{" + "matricula=" + matricula + ", potencia=" + potencia + ", a\u00f1oFabricacion=" + añoFabricacion + ", mec=" + mec + '}';
    }

   

    
    
    

}


