package superClase;

import java.util.*;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer precio;
    protected Integer peso;
    protected String color;
    protected char letra;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso, String color, char letra) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.letra = letra;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return letra;
    }

    public void setConsumo(char letra) {
        this.letra = letra;
    }

    public String comprobarColor(String color) {
        color = leer.next().toUpperCase();
        if (color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
            this.color = color;
        } else {
            this.color = "BLANCO";
        }
        return color;
    }

    public char comprobarConsumoEnergetico(char letra) {
        letra = leer.next().toUpperCase().charAt(0);
        if ((letra == 'A') || (letra == 'B') || (letra == 'C') || (letra == 'D') || (letra == 'E') || (letra == 'F')) {
            this.letra = letra;
        } else {
            this.letra = 'F';
        }
        return letra;
    }

    public void crearElectrodomestico() {
        
        System.out.println("Indique el color");
        comprobarColor(color);
        System.out.println("Consumo electrico: A,B,C,D,E,F");
        comprobarConsumoEnergetico(letra);
        System.out.println("Peso del electrodomestico");
        this.peso = leer.nextInt();
        System.out.println("Precio base = $1000");
        this.precio = 1000;
        
    }

    public void precioFinal() {
       
        System.out.println("***PRECIO FINAL***");

        switch (this.letra) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            default:
                this.precio += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
        
    }

    @Override
    public String toString() {
        return " precio= " + precio + ", peso= " + peso + ", color= " + color + ", letra= " + letra + '}';
        
    }
    
    
    
}
