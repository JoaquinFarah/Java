//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//por una E. Ejemplo: 
//0-0-0 
//0-0-1 
//0-0-2 
//0-0-E 
//0-0-4 
//.
//.
//0-1-2 
//0-1-E 
// 
//Nota: investigar función equals() y como convertir números a String.
package Ejercicios;

import java.util.Scanner;

public class ej_18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0, a = 0, b = 0, c = 0;
        char caracter = 'E';

        do {
            System.out.println(a + "-" + b + "-" + c);
            c = c + 1;
            if (c == 10) {
                b = b + 1;              
                c = 0;
            }
            if (b == 10) {
                a = a + 1;
                b = 0;
            }
            if (a == 10) {
                num = 1;
            }

        } while (num < 1);

    }

}
