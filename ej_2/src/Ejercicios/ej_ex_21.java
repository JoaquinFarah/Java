//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
//y muestre la suma de sus elementos. 
package Ejercicios;
import java.util.Scanner;
public class ej_ex_21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int tam;
        System.out.println("Defina el tamaño de la matrix cuadrada");
        tam=leer.nextInt();
        int[][]matrix = new int [tam][tam];
        
        for (int i = 0; i <= tam-1; i++) {
            for (int j = 0; j <= tam-1; j++) {
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i <= tam-1; i++) {
            for (int j = 0; j <= tam-1; j++) {
                System.out.print("[" +matrix [i][j]+ "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i <= tam-1; i++) {
            for (int j = 0; j <= tam-1; j++) {
                matrix[i][j]=matrix[i][j] + matrix[i][j];
                System.out.print("[" +matrix [i][j]+ "]");
            }
            System.out.println("");
        }
    }
}
