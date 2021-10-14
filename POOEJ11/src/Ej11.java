//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.  
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
//Ejemplo fecha actual: Date fechaActual = new Date(); 

import java.util.Date;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int anio,mes,dia;
        
        System.out.println("Ingrese la fehca de su nacimiento:");
        System.out.print("Año: ");
        anio = leer.nextInt()-1900;
        System.out.print("Mes: ");
        mes = leer.nextInt()-1;
        System.out.print("Dia: ");
        dia = leer.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        
        System.out.println("DATE " +fecha);
        int dif=(int)(fecha.getYear()- (int)fechaActual.getYear());
        
        System.out.println("Actual " +fechaActual);
        System.out.println("Diferencia " +dif+ " años.");
    }
}
