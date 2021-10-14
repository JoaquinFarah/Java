//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//los muestre por pantalla en orden descendente. 
package Ejercicios;


import java.util.Scanner;

public class ej_22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[100];
        
                
        System.out.println("Espacios " + vector.length);

        for (int i = 0; i <= vector.length-1; i++) {
            vector[i] = i;
            System.out.println("creciente " + vector[i]);
        }

        for (int i = vector.length-1; i >= 0; i--) {
            vector[i] = i;
            System.out.println("decreciente " + vector[i]);
        }

    }
}
