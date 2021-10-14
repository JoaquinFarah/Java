//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//todas las familias. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n, m, e, c=0, t=0, i, j;
       
        System.out.println("Ingrese la cantidad de familias");
        n=leer.nextInt();
        
        for (i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la "+(i+1)+ "° familia");
            m=leer.nextInt();
            
            for (j = 0; j < m; j++) {
                System.out.println("Ingrese las edades");
                e=leer.nextInt();
                c=c+1;
                t=t+e;
            }
        }
        
        System.out.println("La cantidad de niños es: " +c);
        System.out.println("La edad promedio de los niños es: " +(t/c));
    }
}
