
package main;

import java.util.*;
import servicio.ServicioElectrodomestico;


public class MainElectrodomestico {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioElectrodomestico se = new ServicioElectrodomestico();
        
        se.compras();
    }
}
