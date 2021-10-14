//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta. 
package Ejercicios;

import java.util.Scanner;

public class ej_13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;

        do {
            System.out.println("Ingrese un numero del 0 al 10");
            num = leer.nextInt();
            if (num >= 0 && num <= 10) {
                System.out.println("El numero es correcto");
                break;
            } else {
                System.out.println("No corresponde el numero");
            }
        } while ((num < 0) || (num > 10));

    }

}
