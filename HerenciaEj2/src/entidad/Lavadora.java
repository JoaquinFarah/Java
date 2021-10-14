package entidad;

import java.util.*;
import superClase.Electrodomestico;

public class Lavadora extends Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, Integer peso, String color, char letra) {
        super(precio, peso, color, letra);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println(" ");
        System.out.println("Lavadora");
        super.crearElectrodomestico();
        System.out.println("Cantidad de carga");
        this.carga = leer.nextInt();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (carga > 30){
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{ carga= " + carga + ", " + super.toString()+'}';
    }
    
}
