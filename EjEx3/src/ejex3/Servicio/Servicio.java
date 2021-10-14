package ejex3.Servicio;

import java.util.Scanner;

public class Servicio {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
//• Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c

    public double getDiscriminante(double a, double b, double c) {
        double discriminante;
        discriminante = (Math.pow(b, 2))-4*a*c;
        System.out.println("Discriminante " +discriminante);
        return discriminante;
    }    
    
//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(){
        boolean tiene=false;
        if(){
            
        }
        
        
        
        
        return tiene;
        
    }

    
    
}
