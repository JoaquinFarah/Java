//Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto. 
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
//Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
//país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
//en el conjunto se le informará al usuario.
package Main;

import Servicio.Ej5Servicio;
import java.util.*;

public class Ej5Main {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ej5Servicio s = new Ej5Servicio();
        
        System.out.println("Desea agregar un pais? S/N");
        String option = leer.next().toUpperCase();
        if (option.equals("S")) {
            s.crearPais();                    
        }
        System.out.println("");
        
        System.out.println("Desea eliminar un pais? S/N");
        String op =  leer.next().toUpperCase();
        if(op.equals("S")){
            System.out.println("Pais a eliminar");
            String pais = leer.next();
            s.eliminarPais(pais);
            
        }else{
            System.out.println("Lista final de paises. Bye bye...");
            s.mostrarPaises();
        }
    }
}
