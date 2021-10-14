//Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de
//la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:  
//1
//12
//123 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, i, j = 0;

        System.out.println("Dibujaremos una escalera de numeros");
        System.out.println("Ingrese un numero");
        n = leer.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
