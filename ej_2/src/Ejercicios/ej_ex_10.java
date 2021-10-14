//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//realizar este ejercicio investigue como utilizar la función Math.random() de Java. 
package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class ej_ex_10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
         
        int n, n1, multi=0, adivina;
         
        System.out.println("Adivine el resultado!");
        System.out.println("Pista 1: los numeros a multiplicar son del 1 al 10");
        System.out.println("Pista 2: en caso de no acertar podra volver a intentarlo hasta lograrlo");
        
        n= (int) (Math.random()*10);
        System.out.println("1°n " +n);
        n1= (int) (Math.random()*10);
        System.out.println("2°n " +n1);
        multi=n*n1;
        
        do{
            System.out.println("**Adivine el resultado**");
            adivina=leer.nextInt();
        } while (adivina != multi);
        System.out.println("ADIVINASTE! ERA: " +adivina);
        
    }
    
}
