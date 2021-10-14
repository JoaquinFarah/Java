//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
//P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
//contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
//submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
//columnas, existe al menos una que coincida con la matriz P. En ese caso, el
//programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
//primer elemento de la submatriz P.
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ej_28 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        
        int [][]matrixM = new int [10][10];
        int [][]matrixP = new int [3][3];
        int i,j,k,l,num,c=0;
        
        System.out.println("Llenado de matriz M");
        for (i=0; i<10; i++){
            for (j=0; j<10; j++){
                matrixM[i][j]= (int) (Math.random()*1000);
                System.out.print("[" + matrixM[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Llenado de matriz P");
        for (k=0; k<3; k++){
            for (l=0; l<3; l++){
                num=leer.nextInt();
                matrixP[k][l]=num;
            }
        }
        System.out.println("Llenado de matriz P");
        for (k=0; k<3; k++){
            for (l=0; l<3; l++){
                System.out.print("[" + matrixP[k][l] + "]");
            }
            System.out.println("");
        }
        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                if(matrixM[i][j]==matrixP[0][0]){
                    
//                    
//                     if(matM[i][j]==matP[0][0]){
//                    if(matM[i][j+1]==matP[0][1]&&matM[i][j+2]==matP[0][2]){
//                        if(matM[i+1][j]==matP[1][0]&&matM[i+1][j+1]==matP[1][1]&&matM[i+1][j+2]==matP[1][2]){
//                        if(matM[i+2][j]==matP[2][0]&&matM[i+2][j+1]==matP[2][1]&&matM[i+2][j+2]==matP[2][2]){
//                            System.out.println("La matriz se encuentra en la matriz grande");
//                            System.out.println("En la posición "+i+","+j);
//                        }
//                    
                    
                    
                    
                    
                }                
            }
        }
        
        
        
        

    }

}
