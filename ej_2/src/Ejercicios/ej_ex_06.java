//Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_06 {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int p, c=0, t=0;
        double estatura, prom=0;
        
        System.out.println("Ingrese el numero de personas");
        p=leer.nextInt();
        
        do {
            System.out.println("Escriba su estatura");
            estatura=leer.nextDouble();
            if (estatura<1.60){
                c=c+1;
            }
            prom= prom+estatura;
            t=t+1;
            
        } while (p>t);
        System.out.println("la estatura promedio es: " + (prom/p) +" mts");
        System.out.println("La cantidad de personas por debajo del 1.60 es: " +c);
       
        
    }
    
}
