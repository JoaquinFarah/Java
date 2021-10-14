/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego. 
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar.  Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/ 
package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuego {
    private RevolverDeAgua re;  
    private ServicioRevolver sr;
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Juego j1 = new Juego();
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        
        j1.setJugadores(jugadores);
        j1.setRevolver(re);
    }
    
    public void ronda(RevolverDeAgua re){
        
        re.
        
        
        
      
        
        
        
        
    }
}
