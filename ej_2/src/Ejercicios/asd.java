//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido 
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class asd {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n,i,j,num;
        Random random = new Random ();
        
        System.out.println("Defina el tamaño del vector: ");
        n = leer.nextInt();
        int [] vector = new int [n];
        
        for (i = 0; i <= n; i++){
            vector[i]= random.nextInt((10-0)+0);
            System.out.println("numeros " + vector[i]);
        }
        
        System.out.println("Ingrese un numero para encontrarlo en el vector");
        num = leer.nextInt();
        
         for (i = 0; i <= n; i++){
             if (num == vector[i]);{
             System.out.println("Se encuentra en el vector: " +vector[i]);
         }
         }
        

    }

}