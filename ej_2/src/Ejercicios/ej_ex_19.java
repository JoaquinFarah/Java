//Crear una función rellene un vector con números aleatorios, pasándole un arreglo
//por parámetro. Después haremos otra función o procedimiento que imprima el
//vector. 
package Ejercicios;
import java.util.Scanner;
public class ej_ex_19 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int n;
       int[] array= new int [10];
       
        for (int i = 0; i <= 10; i++) {
            array[i]=aleatorio();
            System.out.print("[" + array[i] + "]");
        }
        
    }
    
    public static int aleatorio () {
       
        return ((int) (Math.random() * (10 - 0 + 1) + 0));
    }
    
    private static void mostrar(int[] array) {
        for (int i = 0; i <= 10; i++) {
            System.out.print("[" + array[i] + "]");
        }
        
    }
}

    
    

