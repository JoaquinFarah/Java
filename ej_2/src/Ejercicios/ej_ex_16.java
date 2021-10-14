//Crea una aplicación que nos pida un número por teclado y con una función se lo
//pasamos por parámetro para que nos indique si es o no un número primo, debe
//devolver	true	si es primo, sino	false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
//no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
package Ejercicios;

import java.util.Scanner;

public class ej_ex_16 {

    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
         
        System.out.println("Ingrese un numero para saber si es primo");
        n=leer.nextInt();
        boolean r = primo(n);
        if (r == true) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }
    }
    public static boolean primo (int n){
        int contador=0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return (contador == 2);
    }
    
}
