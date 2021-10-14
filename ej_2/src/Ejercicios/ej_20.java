//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
package Ejercicios;

import java.util.Scanner;

public class ej_20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//         aux1=n1,aux2=n2,aux3=n3,aux4=n4
        int n1, n2, n3, n4, i;
        String cad = "*";

        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3 = leer.nextInt();
        System.out.println("Ingrese el cuarto numero");
        n4 = leer.nextInt();

        
        System.out.println("");
        System.out.print(n1);
        for (i = 1; i <= n1; i++) {

            System.out.print(" *");
        }
        
        System.out.println("");
        System.out.print(n2);
        for (i = 1; i <= n2; i++) {

            System.out.print(" *");
        }
        
        System.out.println("");
        System.out.print(n3);
        for (i = 1; i <= n3; i++) {

            System.out.print(" *");
        }
        
        System.out.println("");
        System.out.print(n4);
        for (i = 1; i <= n4; i++) {

            System.out.print(" *");
        }

    }

}
