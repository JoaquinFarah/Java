package main;

import entidad.Circulo;
import entidad.Rectangulo;
import java.util.*;

public class mainFormas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Rectangulo :");
        Rectangulo rec = new Rectangulo(10.00, 20.00);
        
        System.out.println("Area :" + rec.calcularArea());
        System.out.println("Perimetro :" + rec.calcularPerimetro());
        
        System.out.println("Circulo :");
        Circulo cir = new Circulo(20.00, 50.00);
        
        System.out.println("Area :" + cir.calcularArea());
        System.out.println("Perimetro :" + cir.calcularPerimetro());
    }
}
