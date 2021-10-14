//Escribir un programa que pida dos números enteros por teclado y calcule la suma
//de los dos. El programa deberá después mostrar el resultado de la suma 
package Ejercicios;

import java.util.Scanner;

public class ej_02 {

    public static void main(String[] args) {
        int num;
        int num1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros para sumarlos");
        System.out.println("Escriba el primer numero");
        num = leer.nextInt();
        System.out.println("Escriba el segundo numero");
        num1 = leer.nextInt();
        System.out.println("El resultado de la suma de ambos numeros es: " + (num + num1));

    }
}
