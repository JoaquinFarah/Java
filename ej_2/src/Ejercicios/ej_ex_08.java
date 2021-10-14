//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num,c=0, i=0, suma=0, par=0, impar=0;
        
        System.out.println("Ingrese la cantidad de numeros del programa");
        num=leer.nextInt();
        
        do{ 
            i=i+1;
            suma=c+c;            
            if (c%2==0){
                par=par+1;                
            }
            if (c%2!=0) {
                impar=impar+1;
            }
            if ((c/5)==0){
                System.out.println("El numero " +num+ " es multiplo de 5");
                System.out.println("cantidad de numeros leidos: " +c);
                System.out.println("Cantidad de numeros pares: " +par );
                System.out.println("Cantidad de numeros impares: " +impar );
                System.out.println("La suma de todos los numeros: " +suma);
                break;
            }
            
            
           
        } while (num>i);
        
       
        
        
       
    }
    
}
