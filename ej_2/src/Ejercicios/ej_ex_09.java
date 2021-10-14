//Simular la división usando solamente restas. Dados dos números enteros mayores
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
//restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
//que el divisor, este resultado es el residuo, y el número de restas realizadas es el
//cociente. Por ejemplo: 50 / 13: 
//
//50 – 13 = 37  una resta realizada 
//37 – 13 = 24  dos restas realizadas  
//24 – 13 = 11  tres restas realizadas 
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, n1, c = 0;

        System.out.println("***Division por resta***");
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        System.out.println("Ingrese un numero para restar al primero");
        n1 = leer.nextInt();
        System.out.println("Restaremos " + n + "-" + n1);

        while (n >= n1) {
            n = n - n1;
            c = c + 1;

            System.out.println("parcial " + n);
        }
        System.out.println("cociente " + c);

    }
}
