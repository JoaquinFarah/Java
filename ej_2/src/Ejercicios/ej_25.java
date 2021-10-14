//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
//muestre traspuesta. 
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej_25 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int[][] matrix=new int [4][4];
        int[][] matrixaux= new int [4][4];
        
        for (int i=0; i<=3; i++){
            for (int j=0; j<=3; j++){
                matrix[i][j]= (int)(Math.random()*10);
                System.out.print("[" + matrix [i][j]+ "]");
            }
            System.out.println("");
        }
        System.out.println("TRASPUESTA");
                
        for (int i=0; i<=3; i++){
            for (int j=0; j<=3; j++){
                matrixaux[i][j]= matrix[j][i];
                System.out.print("[" + matrixaux [i][j]+ "]");
            }
            System.out.println("");            
         }
    }
}
