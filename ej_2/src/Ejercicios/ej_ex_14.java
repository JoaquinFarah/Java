//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//operación matemática y deben devolver sus resultados para imprimirlos en el main.   
package Ejercicios;

import java.util.Scanner;

public class ej_ex_14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n, n1;
        String opcion;
        
        System.out.println("Ingrese 2 numeros");
        n=leer.nextInt();
        n1=leer.nextInt();
        System.out.println("MENU");
        System.out.println("SUMA");
        System.out.println("RESTA");
        System.out.println("MULTIPLICACION");
        System.out.println("DIVISION");
        
        opcion=leer.next();
        
        switch (opcion){
            case "SUMA":
                System.out.println(suma(n,n1));
                break;
            case "RESTA":
                System.out.println(resta(n,n1));
                break;
            case "MULTIPLICACION":
                System.out.println(multiplicacion(n,n1));
                break;
            case "DIVISION":
                System.out.println(division(n,n1));
                break;
        }
}   public static int suma (int n, int n1) {
    return n+n1;
}   public static int resta (int n, int n1) {
    return n-n1;
}   public static int multiplicacion (int n, int n1) {
    return n*n1;    
}   public static int division (int n, int n1) {
    return n/n1;
}
}

