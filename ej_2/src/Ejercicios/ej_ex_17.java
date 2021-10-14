//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
//tamaño N, con los valores ingresados por el usuario. 
package Ejercicios;
import java.util.Scanner;
public class ej_ex_17 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n=0, tam=0, suma=0;
        
        System.out.println("Ingrese el tamaño del vector");
        tam=leer.nextInt();
        int[] array = new int [tam];
        
        for (int i = 0; i <= tam-1; i++) {
            System.out.println("Ingrese numeros para llenar el vector");
            n=leer.nextInt();
            array[i]= n;
            System.out.println("El numero " +n+ " se encuentra en la posicion " +i);
            suma=suma+array[i];
            System.out.println("");
        }
        System.out.println("La suma de los elementos es: " +suma);
    }
    
}
