//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener 
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se 
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set.  Deberá además implementar los siguientes métodos:  
//•- Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package Ej09;

import Ej09.Entidad.Matematica;
import Ej09.Servicio.MatServicio;

public class Main {

    public static void main(String[] args) {
        
        Matematica hoja = new Matematica();
        MatServicio op = new MatServicio();
        
        op.crearNumero(0);
        
        
       
        System.out.println("Numero 1: " + hoja.getNum1());
        System.out.println("Numero 2: " + hoja.getNum2());
    
//        op.calcularPotencia(double num1, double num2);
        
        
        
        
        
    }
    
}
