/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios. 
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package servicio;

import entidad.RevolverDeAgua;
import java.util.*;

public class ServicioRevolver {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarRevolver(RevolverDeAgua re){
        int pos = (int)(Math.random()*6+1);
        int agua = (int) (Math.random()*6+1);
        
        re.setPosActual(pos);
        re.setPosAgua(agua);        
    }
    
    public boolean mojar(RevolverDeAgua re){
        int posAc = re.getPosActual();
        int posAg = re.getPosAgua();
        
        return posAc == posAg;        
    }
                
    public void siguienteChorro(RevolverDeAgua re){
        int posAc = re.getPosActual();
        if (posAc == 6){
            posAc = 1;
            re.setPosActual(posAc);
            
        }else {
            posAc = posAc+1;
            re.setPosActual(posAc);
        }        
    }
}
