//Crea una aplicación que a través de una función nos convierta una cantidad de
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
//converir que será una cadena, este no devolverá ningún valor y mostrará un
//mensaje indicando el cambio (void). 
//El cambio de divisas es:
//  * 0.86 libras es un 1 €
//  * 1.28611 $ es un 1 €
//  * 129.852 yenes es un 1 €
package Ejercicios;

import java.util.Scanner;

public class ej_21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int eu;
        String divisa;

        System.out.println("***Calculadora de divisas*** Ingrese el monto");
        eu = leer.nextInt();
        System.out.println("ELIJA LA DIVISA");
        System.out.println("USD");
        System.out.println("YENES");
        System.out.println("LIBRAS");
        divisa = leer.next();

        switch (divisa) {
            case "USD":
                System.out.println("La conversion a USD: " + eu * 1.28611);
            case "YENES":
                System.out.println("La conversion a YENES: " + eu * 129.852);
            case "LIBRAS":
                System.out.println("La conversion a LIBRAS: " + eu * 0.86);

        }

    }

}
