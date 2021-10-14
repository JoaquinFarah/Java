package Servicio;
import Entidad.Ej4Pelicula;
import java.util.*;

public class Ej4Utilidad {
    
    public static Comparator<Ej4Pelicula> peliculasDesc = new Comparator<Ej4Pelicula>() {
        @Override
        public int compare(Ej4Pelicula p, Ej4Pelicula p1) {
            return p1.getDuracion().compareTo(p.getDuracion());           
        }
    };
    public static Comparator<Ej4Pelicula> peliculasAsc = new Comparator<Ej4Pelicula>() {
        @Override
        public int compare(Ej4Pelicula p, Ej4Pelicula p1) {
            return p.getDuracion().compareTo(p1.getDuracion());           
        }
    };
    public static Comparator<Ej4Pelicula> peliculasDirector = new Comparator<Ej4Pelicula>() {
        @Override
        public int compare(Ej4Pelicula p, Ej4Pelicula p1) {
            return p.getDirector().compareTo(p1.getDirector());
        }
    };
    public static Comparator<Ej4Pelicula> peliculasTitulo = new Comparator<Ej4Pelicula>() {
        @Override
        public int compare(Ej4Pelicula p, Ej4Pelicula p1) {
            return p.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
}
