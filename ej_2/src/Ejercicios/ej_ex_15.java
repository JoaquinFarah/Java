//Diseñe una función que pida el nombre y la edad de N personas e imprima los
//datos de las personas ingresadas por teclado e indique si son mayores o menores
//de edad. Después de cada persona, el programa debe preguntarle al usuario si
//quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
//“No”.
package Ejercicios;

import java.util.Scanner;

public class ej_ex_15 {

    public static void main(String[] args) {
        datos();
    } 
    public static void datos () {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n=0, c=0, t=0;
        String nombre,continuar;
        
        System.out.println("Cantidad de personas");
        t=leer.nextInt();
        do{ 
            c=c+1;
            System.out.println("Ingrese el nombre");
            nombre=leer.next();
            System.out.println("Edad");
            n=leer.nextInt();
            if (n<=18){
                System.out.println("Es menor de edad");
            } else{
                System.out.println("Es mayor de edad");
            }
            System.out.println("Continuar? S/N");
            continuar=leer.next();
        }while (continuar.equals("S") && (t>c));
    }
}


