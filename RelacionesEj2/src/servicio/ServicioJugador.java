/*
disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de 
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false. 
 */
package servicio;

import entidad.RevolverDeAgua;
import java.util.*;
import servicio.ServicioRevolver;
import entidad.Jugador;

public class ServicioJugador {

    ServicioRevolver re = new ServicioRevolver();
    Jugador j = new Jugador();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void disparo(ServicioRevolver re, RevolverDeAgua r) {

        if (re.mojar(r) == true) {
            System.out.println("MOJADO");
            j.setMojado(Boolean.TRUE);
        } else {
            System.out.println("no se mojo");
            re.siguienteChorro(r);
        }
    }
    

}
