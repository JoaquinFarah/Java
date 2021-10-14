//Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().
package Ejercicios;

import java.util.Scanner;

public class ej_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, doble, triple, raiz;
        System.out.println("Ingrese un numero para computar");
        num = leer.nextInt();
        System.out.println("El numero al cuadrado es: " + (num * num));
        System.out.println("El numero al cubo es: " + (num * num * num));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));

    }

}
