package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class EjEx4Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF doc1 = new NIF();
    int calculo;

    public void crearNif(){
        System.out.println("Ingrese DNI");
        doc1.setDNI(leer.nextInt());
        doc1.setAux(doc1.getDNI()%23);
        System.out.println("resto " +doc1.getAux());
    }
    
    public void tabla(){
        String cadena [] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };
        int posicion = (int)doc1.getAux();
        System.out.println("***NIF***");
        System.out.println(doc1.getDNI()+"-"+cadena[posicion]);        
    } 
}
