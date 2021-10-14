package Ej02;
import java.util.Scanner;
public class Circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;
    private double area;
    private double perimetro;

    public void radio(){        
    }
    public void crearCircunferencia(){
        System.out.println("Definir radio");
        this.radio = leer.nextDouble(); 
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void area(){
        this.area= 3.1416*Math.pow(radio,2);
//        System.out.println(area);
    }
    public void perimetro(){
        this.perimetro= 2*3.1416*radio;
        
    }
    public void mostrar(){
        System.out.println("Radio " + radio);
        System.out.println("Perimetro " + perimetro);
        System.out.println("Area " + area);
    }
}
