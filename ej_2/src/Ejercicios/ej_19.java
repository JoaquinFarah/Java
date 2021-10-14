//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//
//* * * * 
//*     *
//*     *
//* * * *
package Ejercicios;

import java.util.Scanner;

public class ej_19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, i, j;

        System.out.println("Determine el tamaño del cuadrado de asteriscos");
        n = leer.nextInt();

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
//                if ((i==0 || i== n-1)||(j==0 || j==n-1)){
                System.out.println("*");
                
//            }
                
            }
            System.out.println();
            {

            }
        }

    }

}
//PINCHES ASTERISCOS:
//    public static void main(String[] args) {
//
//        int lado, i, j;
//        Scanner leer = new Scanner(
//System.in
//);
//        System.out.println("Ingrese el número de lados que desea: ");
//        lado = leer.nextInt();
//
//        corte:
//        for (i = 1; i <= lado; i++) {
//            for (j = 1; j <= lado; j++) {
//                if (i == 1 || i == lado) {
//                    System.out.print("*");
//                } else {
//                    if (j >= 2 && j < lado) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                       
//                    }
//                }
//                
//            }
//            System.out.println("");
//        }
//
//    }
//
//}