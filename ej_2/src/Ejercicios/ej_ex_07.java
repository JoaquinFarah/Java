//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//los números serán introducidos por el usuario. Realice dos versiones del programa,
//una usando el bucle “while” y otra con el bucle “do - while”. 
//package Ejercicios;
//
//import java.util.Scanner;
//
//public class ej_ex_7 {
//
//    public static void main(String[] args) {
//
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//        int n, nu, c = 0, vmax = 0, vmin = 10000, prom = 0;
//
//        System.out.println("Ingrese cantidad de numeros");
//        n = leer.nextInt();
//
//        while (n > c) {
//            System.out.println("Escriba un numero");
//            nu = leer.nextInt();
//            if (nu > 0) {
//                if (nu > vmax) {
//                    vmax = nu;
//                }
//
//                if (nu <= vmin) {
//                    vmin = nu;
//                }
//
//                prom = prom + nu;
//
//                c = c + 1;
//            } else {
//                System.out.println("El numero no es valido, reintente");
//            }
//        }
//        System.out.println("El promedio es: " + (prom / c));
//        System.out.println("El valor maximo es: " + vmax);
//        System.out.println("El valor minimo es: " + vmin);
//    }
//}



package Ejercicios;

import java.util.Scanner;

public class ej_ex_07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, nu, c = 0, vmax = 0, vmin = 10000, prom = 0;

        System.out.println("Ingrese cantidad de numeros");
        n = leer.nextInt();

        do{
            System.out.println("Escriba un numero");
            nu = leer.nextInt();
            if (nu > 0) {
                if (nu > vmax) {
                    vmax = nu;
                }

                if (nu <= vmin) {
                    vmin = nu;
                }

                prom = prom + nu;

                c = c + 1;
            } else {
                System.out.println("El numero no es valido, reintente");
            }
        } while (n > c);
        System.out.println("El promedio es: " + (prom / c));
        System.out.println("El valor maximo es: " + vmax);
        System.out.println("El valor minimo es: " + vmin);
    }
}

