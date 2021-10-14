//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
package Ejercicios;

import java.util.Scanner;

public class ej_24 {
 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i;     
        System.out.println("Defina el tamaño del vector");
        int n=leer.nextInt();
        int[]array = new int[n];
        
        for (i=0; i<=n-1;i++) {
            System.out.println("Ingrese un numero de hasta 5 digitos");            
            array[i]=leer.nextInt();
        }
        for (i=0; i<=n-1; i++){
            System.out.println("["+ array[i] +"]");
            System.out.println(" Tiene " + Integer.toString(array[i]).length() + " dígitos");
        }
    }
}
