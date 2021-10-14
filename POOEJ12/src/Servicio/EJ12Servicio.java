package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class EJ12Servicio {
    String nombre;
    int dia, mes, anio;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public void crearPersona(){
        System.out.println("Nombre de la persona: ");
        nombre=leer.next();
        System.out.println("Ingrese la fehca de su nacimiento:");
        System.out.print("Año: ");
        anio = leer.nextInt()-1900;
        System.out.print("Mes: ");
        mes = leer.nextInt()-1;
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.println(""); 
    }
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.   
    public void calcularEdad(){
        Date fechaNacimiento = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        System.out.println("DATE " +fechaNacimiento);
        int edad=(int)(fechaNacimiento.getYear()- (int)fechaActual.getYear());
        System.out.println("Fecha actual " +fechaActual);
        System.out.println("Tiene " +edad+ " años.");   
        System.out.println("");        
    }
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(int comp, int edad){
               
        boolean mayor;
        if(edad>comp){
            return true;                    
        } else {
            return false;
            
        }
        
    }  
}
        
        

  

    
    
    
    
    

