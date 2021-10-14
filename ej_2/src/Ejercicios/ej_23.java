//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido 
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej_23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.println("Defina el tamaño del vector: ");
        int tam = leer.nextInt();

        int[] vector = new int[tam];
        int i;
        int cont = 0;

        System.out.println("Vector Generado");

        for (i = 0; i <= tam - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Que numero desea econtrar?");
        int buscar = leer.nextInt();

        for (i = 0; i <= tam - 1; i++) {
            if (buscar == vector[i]) {
                System.out.println("El N° " + buscar + " se encuentra en la posición " + i + " del vector");
                cont = cont + 1;
            }
        }
            if (cont == 0) {
                System.out.println("El N° " + buscar + " no se encuentra en el vector");
            } else if (cont == 1) {
                System.out.println("El N° " + buscar + " se encontro " + cont + " en la posicion " + i + " de el vector de " + tam + " posciones");
            } else {
                System.out.println("El N° " + buscar + " se encontro " + cont + " veces en el vector de " + tam + " posciones");
            }

        }

    }
