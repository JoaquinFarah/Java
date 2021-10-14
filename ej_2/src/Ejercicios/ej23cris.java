package Ejercicios;

import java.util.Random;
import java.util.Scanner;


public class ej23cris {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.print("Ingrese el tamaño del vector:");
        int tam=leer.nextInt();
        System.out.print("Ingrese el numero a Buscar:");
        int buscar=leer.nextInt();
        int[] vector= new int[tam];
        for(int i = 0; i <tam; i++) {
            vector[i] = random.nextInt((10 - 0) + 0) ; //random.nextInt((MAX - min) + min)
        }
        
        System.out.println("Vector Generado");
        String aux="";
        for(int elemento : vector)
        {
            aux=aux+"["+elemento+"]";
        }
        System.out.println(aux);
        int contador=0;
         for(int i = 0; i <tam; i++) {
            if(buscar==vector[i])
            {
                System.out.println("*El "+buscar+" se envuenta en v["+i+"]");
                contador=contador+1;
            }
        }
        System.out.println("#El numero "+buscar+" se repite "+contador);
        
    }
    
}