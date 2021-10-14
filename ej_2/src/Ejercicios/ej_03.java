//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla. 
package Ejercicios;

import java.util.Scanner;

public class ej_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Se le solicitara el nombre");
        String cadena = leer.next();
        System.out.println("Su nombre es: " + cadena);

    }

}
