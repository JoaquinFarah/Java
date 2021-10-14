//Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
package Ejercicios;

import java.util.Scanner;

public class ej_05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int C, F;

        System.out.println("***Calculadora grados farenheit***");
        System.out.println("Ingrese la temperatura en grados centigrados");
        C = leer.nextInt();
        F = (9 * C / 5) + 32;
        System.out.println("Temperatura en Farenheit: " +F);
        
        
        
    }

}
