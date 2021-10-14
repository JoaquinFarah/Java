//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos). 
package Ejercicios;
import java.util.Scanner;
public class ej_ex_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, tam=0;
        
        System.out.println("Defina el tamaño de los 2 vectores");
        tam=leer.nextInt();
        int[] array = new int [tam];
        int[] array1 = new int [tam];
        
        System.out.println("**Primer vector**");
        for (int i = 0; i <= tam-1; i++) {
            System.out.println("Digite un numero");
            n=leer.nextInt();
            array[i]=n;
        }
        System.out.println("**Segundo vector**");
        for (int j = 0; j <= tam-1; j++) {
            System.out.println("Digite un numero");
            n=leer.nextInt();
            array1[j]=n;
        }  
        
        System.out.println("**Muestra de ambos vectores**");
        for (int i = 0; i <= tam-1; i++) {
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
        for (int j = 0; j <= tam-1; j++) {
            System.out.print("["+array1[j]+"]");   
        }
        System.out.println("");
        
        System.out.println("**Comparacion de vectores**");
        for (int i = 0; i <= tam-1; i++) {
            if (array[i]== array1[i]) {
                System.out.println("El numero en la posicion " +i+ " de ambos vectores es igual, continuar" );
            } else {
                System.out.println("El valor de la posicion " +i+ " es distinto. ALTO");
                break;
            }
        }
    }
}
