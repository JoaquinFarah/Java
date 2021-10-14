package ejex4.Servicio;

import ejex4.Entidad.Rectangulo;
import java.util.Scanner;

public class EjEx4Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo rec = new Rectangulo();
    
    public void llenarDatos(){
        System.out.println("Base");
        rec.setBase(leer.nextInt());
        System.out.println("Altura");
        rec.setAltura(leer.nextInt());
    }
    public void superficie(){
        int sup = rec.getBase()*rec.getAltura();
        System.out.println("Superficie: " +sup);
    }
    public void perimetro(){
        int per = (rec.getBase()*rec.getBase()) + (rec.getAltura()*rec.getAltura());
        System.out.println("Perimetro: " +per);       
    }
    public void dibujo(){
        for (int i = 0; i < rec.getBase(); i++) {
            System.out.print("*");
            for (int j = 0; j < rec.getAltura(); j++) {
                System.out.println("*");
                
            }
             
        }
    }
    
    
}
