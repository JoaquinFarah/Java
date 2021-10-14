//Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla.
package Ejercicios;

import java.util.Scanner;

public class ej_07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, num1;
        System.out.println("Ingrese dos numeros para saber el mayor y el menor");
        System.out.println("**Escriba el primer numero**");
        num = leer.nextInt();
        System.out.println("**Escriba el segundo numero**");
        num1 = leer.nextInt();
        if (num > num1) {
            System.out.println("Este es el numero mayor " + num);
        } else {
            System.out.println("Este es el numero mayor" + num1);

        }

    }

}
