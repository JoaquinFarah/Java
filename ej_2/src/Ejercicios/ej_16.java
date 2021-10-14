//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break. 
package Ejercicios;

import java.util.Scanner;

public class ej_16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, suma, c;
        suma = 0;
        c = 0;

        System.out.println("Ingresara numeros hasta 20 o hasta capturar el numero 0");

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;

            } else if (num == 0) {
                System.out.println("**Numero 0 capturado**");
                break;
            }
            c++;

        } while (c < 20);
        System.out.println("La suma de los numeros es: " + suma);
    }
}
