//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
package Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ej_04 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese frase o palabra");
        String cadena = leer.next();
        
        System.out.println("Frase o palabra en mayusculas " + toUpperCase(cadena));
        System.out.println("Frase o palabra en minusculas " + toLowerCase(cadena));
    }
    
}
