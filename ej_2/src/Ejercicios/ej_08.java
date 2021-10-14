//Crear un programa que dado un numero determine si es par o impar.
package Ejercicios;

import java.util.Scanner;

public class ej_08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Escriba un numero para saber si es PAR o IMPAR");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }

    }

}
