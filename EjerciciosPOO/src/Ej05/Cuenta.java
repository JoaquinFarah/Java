package Ej05;
public class Cuenta {
    int numeroCuenta, DNI;
    float saldoActual;

    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, int DNI, float saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public float getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }
    public void ingresar(float dineroIngresado){
        this.saldoActual=saldoActual+dineroIngresado;
    }
    public void retirar(float dineroRetiro){
        if(dineroRetiro>saldoActual){
            saldoActual=0;
        }else{
            this.saldoActual=saldoActual-dineroRetiro;
        }
    }
    public void extraccionRapida(float retiroExpress){
        if (retiroExpress>(saldoActual*20/100)){
            System.out.println("No puede retirar mas del 20%");
        }else{
            this.saldoActual=saldoActual-retiroExpress;
        }
   }
    public void consultarSaldo(){
        System.out.println("Su saldo es: " +getSaldoActual());
    }
    public void consultarDatos(){
        System.out.println("Datos de la cuenta");
        System.out.println("DNI: " + getDNI());
        System.out.println("N° cuenta: " + getNumeroCuenta());        
    }    
}
