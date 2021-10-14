//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_01 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int d=0, hs=0, min;
       
        
        System.out.println("Ingrese los minutos");
        min=leer.nextInt();
        
        d=min/1440;
        do {
           min=min-60;
           hs++;
           if (hs==24){               
               hs=0;
        }
        } while (min>0);
        
        
        System.out.println(d+ " Dias y " + hs + " horas" );
        
        
    }
    
}
