//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial.  
package Ejercicios;

import java.util.Scanner;

public class ej_14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int vl, num, suma;
        suma = 0;

        System.out.println("Ingrese el valor limite");
        vl = leer.nextInt();
        do {
            System.out.println("Ingrese numero a sumar");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma < vl);

        System.out.println("El valor de la suma de todos los numeros es: " + suma);

    }

}
