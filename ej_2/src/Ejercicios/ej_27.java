//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este
//cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9. 
package Ejercicios;

import java.util.Scanner;

public class ej_27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matrix = new int[3][3];
        int num, c=0, i, j, sumaf1 = 0, sumaf2 = 0, sumaf3 = 0, sumac1 = 0, sumac2 = 0, sumac3 = 0, sumadp = 0, sumads = 0;

        System.out.println("Rellenar matriz");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                num = leer.nextInt();
                matrix[i][j] = num;
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        
        //suma columnas
        for (i = 0; i < 3; i++) {
            sumac1 = sumac1 + matrix[i][0];
        }
        System.out.println("La suma de la primera columna es " + sumac1);

        for (i = 0; i < 3; i++) {
            sumac2 = sumac2 + matrix[i][1];
        }
        System.out.println("La suma de la segunda columna es " + sumac2);

        for (i = 0; i < 3; i++) {
            sumac3 = sumac3 + matrix[i][2];
        }
        System.out.println("La suma de la tercera columna es " + sumac3);
        
        if ((sumac1==sumac2)&&(sumac2==sumac3)){
           c=c+1;
        }
        System.out.println("1° check! " +c);
        
        //suma filas        
        for (j = 0; j < 3; j++) {
            sumaf1 = sumaf1 + matrix[0][j];
        }
        System.out.println("La suma de la primera fila es " + sumaf1);

        for (j = 0; j < 3; j++) {
            sumaf2 = sumaf2 + matrix[1][j];
        }
        System.out.println("La suma de la segunda fila es " + sumaf2);

        for (j = 0; j < 3; j++) {
            sumaf3 = sumaf3 + matrix[2][j];
        }
        System.out.println("La suma de la tercera fila es " + sumaf3);
        
        if ((sumaf1==sumaf2)&&(sumaf2==sumaf3)){
            c=c+1;
        }
        System.out.println("2° check! " +c);
        
        //sumadiagonales
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    sumadp = sumadp + matrix[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es " + sumadp);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumads = sumads + matrix[i][j];
                }
            }
            
        }
        System.out.println("La suma de la diagonal secundaria es " +sumads);
        
        if (sumadp==sumads){
            c=c+1;
        }
        System.out.println("3° check! " +c);
        
        if (c==3){
            System.out.println("***Es magica***");
        }else{
            System.out.println("--No es magica--");
       
        }
    }

}
