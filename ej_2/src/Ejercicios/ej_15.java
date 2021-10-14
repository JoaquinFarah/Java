//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú: 
//  MENU
//  1. Sumar
//  2. Restar
//  3. Multiplicar
//  4. Dividir
//  5. Salir
//  Elija opción: 
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
//del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
//carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package Ejercicios;

import java.util.Scanner;

public class ej_15 {

    public static void main(String[] args) {

        int num, num1, menu;
        String dato;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero positivo");
        num = leer.nextInt();
        System.out.println("Ingrese el segundo numero positivo");
        num1 = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("SUMAR: " + (num + num1));
                    break;
                case 2:
                    System.out.println("RESTAR: " + (num - num1));
                    break;
                case 3:
                    System.out.println("MULTIPLICAR: " + (num * num1));
                    break;
                case 4:
                    System.out.println("DIVIDIR: " + (num / num1));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? S/N");
                    dato = leer.next();
                    if (dato.equals("S")) {
                        menu = 7;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while ((menu < 6));
    }
}
