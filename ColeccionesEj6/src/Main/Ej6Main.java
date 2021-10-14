//Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas. 
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su
//precio, eliminar un producto y mostrar los productos que tenemos con su precio
//(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
//el precio. Realizar un menú para lograr todas las acciones previamente
//mencionadas.  
package Main;

import Servicio.Ej6Servicio;
import java.util.*;

public class Ej6Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ej6Servicio s = new Ej6Servicio();
        
        s.menu();
        System.out.println("******************");
        
        
    }
    
}
