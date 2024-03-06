
import java.time.LocalDate;
import maquinaria.Locomotora;
import maquinaria.Tren;
import personal.JefeEstacion;
import personal.Maquinista;
import personal.Mecanico;


public class Ejercicio_EmpresaFerroviaria {
    public static void main(String[] args) {
        
        //objetos personal
        Maquinista maq= new Maquinista("Nelson", "66666", 1500, 
                "Encargado");
        
        //maq.mostrarInformación();
        
        Mecanico mec= new Mecanico("Nestor", "6028024", "FRENOS");
        
        JefeEstacion jef= new JefeEstacion("Hector", "7777", LocalDate.now());
        
        
        //objetos paquete maquinaria
        Locomotora l= new Locomotora("758464", 
                150, 1994, mec); 
        
        Tren t= new Tren(l, maq);
        
       
        
        t.enganchaVagon(5, 2, "fruta");
        t.enganchaVagon(3, 3, "coco");
        t.enganchaVagon(2, 2, "arepa");
        
        System.out.println(t.toString());
                
        
      
      //  t.motrar();
                        
        
        
        
        

    }
    
    	
    
}
