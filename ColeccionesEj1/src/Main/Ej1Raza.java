//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList. 

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada. 
package Main;

import Servicio.Ej1Service;
import java.util.Scanner;

public class Ej1Raza {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ej1Service s = new Ej1Service();

        System.out.println("Desea crear un perro: S/N");
        String option = leer.next().toUpperCase();
        if (option.equals("S")) {
            s.crearPerro();
            s.eliminarRepetidos();
            s.encontrarPerro();
            
            
        }
    }
}
