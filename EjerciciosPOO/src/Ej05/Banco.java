//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:  
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes
//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual.
//• Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package Ej05;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numeroCuenta, DNI;
        float saldoActual, dineroIngresado, dineroRetiro, retiroExpress;
        int seleccion;
        
        System.out.println("Numero de cuenta");
        numeroCuenta=leer.nextInt();
        System.out.println("DNI");
        DNI=leer.nextInt();
        System.out.println("Saldo Actual");
        saldoActual=leer.nextInt();
        Cuenta nuevacuenta = new Cuenta(numeroCuenta, DNI, saldoActual);
        
        System.out.println("");
        System.out.println("Ha creado la siguiente cuenta:");
        System.out.println("Cuenta N°: " +nuevacuenta.getNumeroCuenta());
        System.out.println("Saldo: " + nuevacuenta.getSaldoActual());
        System.out.println("DNI: " +nuevacuenta.getDNI());
        System.out.println("...............................");
        System.out.println("");
        
        do{
        System.out.println("MENU");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extraccion rapida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar sus datos");
        System.out.println("6. Salir");
        seleccion=leer.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("Importe ingresado");
                dineroIngresado=leer.nextFloat();
                nuevacuenta.ingresar(dineroIngresado);
                break;
            case 2:
                System.out.println("Cuanto desea retirar?");
                dineroRetiro=leer.nextFloat();
                nuevacuenta.retirar(dineroRetiro);
                break;
            case 3:
                System.out.println("Retiro Express (max 20%)");
                retiroExpress=leer.nextFloat();
                nuevacuenta.extraccionRapida(retiroExpress);
                break;
            case 4:
                nuevacuenta.consultarSaldo();
                break;
            case 5:
                nuevacuenta.consultarDatos();
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
        }       
        } while (6>seleccion);
    }
}
