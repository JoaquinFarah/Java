//Una obra social tiene tres clases de socios:
//
//  o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos. 
//  o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A. 
//  o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//dichos tratamientos. 
//
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//que represente el costo del tratamiento (previo al descuento) y determine el importe
//en efectivo a pagar por dicho socio. 
package Ejercicios;

import java.util.Scanner;

public class ej_ex_05 {
 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        String letra;
        
        System.out.println("Elija su categoria (A, B o C)");
        letra= leer.next();
        System.out.println("Ingrese el monto para aplicar el descuento");
        num=leer.nextInt();
        
        switch (letra){
            case "A":
                System.out.println("Categoria <A>. El costo es de: $" +num);
                num= num-(num*50/100);
                System.out.println("Descuento del 50%: $" +num );
                break;
            case "B":
                System.out.println("Categoria <B>. El costo es de: $" +num);
                num=num-(num*35/100);
                System.out.println("Descuento del 35%: $" +num);
                break;
            case "C":
                System.out.println("Categoria <C>. El costo es de: $" +num);
                System.out.println("Esta categoria no posee descuento");
                break;
        }
    }
}
