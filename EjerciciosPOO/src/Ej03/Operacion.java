package Ej03;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1, num2;
    int suma, resta, multiplicacion, division;
    public void pedirNum(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    public void Operacion (int num1, int num2){
        
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }    
    public void doSumar (){
        suma = num1 + num2;
    }
    public void doRestar (){
        resta = num1 - num2;
    }
    public void doMultiplicar (){
        if (num1>0 && num2>0){
        multiplicacion = num1 * num2;
        } else {
            System.out.println("ERROR");
        }
    }
    public void doDividir (){
        if (num1>0 && num2>0){
        division = num1 / num2;
        } else {
            System.out.println("ERROR");
        }
    }
    public void doMostrar(){
        System.out.println("SUMA " + suma);
        System.out.println("RESTA " + resta);
        System.out.println("MULTIPLICACION " + multiplicacion);
        System.out.println("DIVISION " + division);
        
    }
}
