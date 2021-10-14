//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//clase String. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String caract;
        
        System.out.println("Ingrese un caracter para saber si es una vocal");
        caract= leer.next();
        
        if (caract.equals("a")||caract.equals("e")||caract.equals("i")||caract.equals("o")||caract.equals("u")){
            System.out.println("es vocal");
        } else {
            System.out.println("no es vocal");
        }
    }
}
