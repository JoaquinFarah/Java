//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
//frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.  
package Ejercicios;

import java.util.Scanner;

public class ej_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase o palabra para encontrar la letra *A*");
        String fop = leer.next();
        String aux = fop.substring(0, 1);

        if (aux.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
