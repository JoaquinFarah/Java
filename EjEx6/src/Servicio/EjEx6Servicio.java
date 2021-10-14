package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class EjEx6Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado juego = new Ahorcado();



//• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0. 
    public void crearJuego() {

        int i = 0;

        System.out.println("Palabra a buscar");
        juego.setPalabra(leer.next());
        System.out.println("palabra " + juego.getPalabra());

        System.out.println("Jugadas maximas");
        juego.setCantidadJugadas(leer.nextInt());
        System.out.println("jugadas " + juego.getCantidadJugadas());

//        juego.setLongi(juego.getPalabra().length()); 
//        System.out.println("longi " +juego.getLongi());
//        System.out.println("palabra length " +juego.getPalabra().length());
        String array[] = new String[juego.getLongi()];

        for (i = 0; i < juego.getPalabra().length(); i++) {
            array[i] = juego.getPalabra().substring(i, i + 1);
//            array[i] = juego.getPalabra().substring(k,k+1); 
//            k++;
            System.out.print("[" + array[i] + "]");
        }
    }
    //• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length. 
    public void longitud() {
        juego.getPalabra().length();
        System.out.println("***" +juego.getPalabra().length());
//        juego.setLongi(juego.getPalabra().length());
//        System.out.println("longi " + juego.getLongi());

    }

}
