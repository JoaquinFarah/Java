//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//variable auxiliar. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int a,b,c,d,aux;
        
        System.out.println("Ingrese el valor de A");
        a=leer.nextInt();
        System.out.println("Ingrese el valor de B");
        b=leer.nextInt();
        System.out.println("Ingrese el valor de C");
        c=leer.nextInt();
        System.out.println("Ingrese el valor de D");
        d=leer.nextInt();
        
        System.out.println("NUMEROS INGRESADOS");
        System.out.println("A: " +a+ "   B: " +b);
        System.out.println("C: " +c+ "   D: " +d);
        
        aux=b;
        b=(a+c+d)-a-d;
//        System.out.println("b:" +b);
        c=(a+b+d)-b-d;
//        System.out.println("c:" +c);
        a=(aux+d)-aux;
//        System.out.println("a:" +a);
        d=aux;
//        System.out.println("d:" +d);
        
        System.out.println("NUMEROS INTERCAMBIADOS");
        System.out.println("A<>D: " +a+ "  B<>C: " +b);
        System.out.println("C<>A: " +c+ "  D<>B: " +d);
    }
    
}
