package entidad;

import java.util.Scanner;
import superClase.Electrodomestico;

public class Televisor extends Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Integer resolucion;
    protected boolean sintonizador=false;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Integer precio, Integer peso, String color, char letra) {
        super(precio, peso, color, letra);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        System.out.println(" ");
        System.out.println("Televisor");
        String op;
        super.crearElectrodomestico();
        System.out.println("Pulgadas");
        resolucion = leer.nextInt();
        System.out.println("TDT? S/N");
        op = leer.next().toUpperCase();
        if(op.equals("S")){
            sintonizador = true;
        } else {
            sintonizador = false;
        }
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion >40){
            precio = precio + (precio * 30)/100;
        }
    }

    @Override
    public String toString() {
        return "Televisor{ resolucion= " + resolucion + ", sintonizador= " + sintonizador + ", " + super.toString()+'}';
    }
    
    
    
    
}
