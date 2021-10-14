//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
//que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, 
//pero cambiada de signo. Es decir, A es anti simétrica si A = -At.
//La matriz traspuesta de una matriz A se denota por At
//y se obtiene cambiando sus filas por columnas (o viceversa). 
//Ejemplo: 
//  0 -2  4    0  2 -4          
//  2  0  2   -2  0 -2
// -4 -2  0    4  2  0
//En este caso la matriz es anti simétrica. 
package Ejercicios;

import java.util.Scanner;

public class ej_26 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matrix[][] = new int[3][3];
        int matrixT[][] = new int[3][3];
        int num, c=0;

        System.out.println("Ingrese los numeros de la matrix");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                num = leer.nextInt();
                matrix[i][j] = num;
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix traspuesta");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("[" + matrixT[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (matrix[i][j] == (matrixT[i][j]*(-1))) {
                    c = 0;
                } else {
                    c = 1;
                    break;
                }
            }
            }
        if (c==0){
            System.out.println("Es anti simetrica");
        } else {
            System.out.println("No es anti simetrica");
        }
        }
    
}
