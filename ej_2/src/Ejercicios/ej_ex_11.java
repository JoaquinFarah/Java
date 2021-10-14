//Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n, c=0;
        
        System.out.println("Ingrese una secuencia de numeros para contarlos");
        n=leer.nextInt();
        
        while (n!=1){
            n=n/10;
            c=c+1;
        }
        System.out.println("Tiene " +(c+1)+ " digitos");
    }
}
