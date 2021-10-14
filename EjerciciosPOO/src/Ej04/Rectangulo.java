package Ej04;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double base, altura;
    double sup, per;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void pedirDatos() {
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura"));
    }

    public void superficie() {
        sup = base * altura;
        System.out.println("SUPERFICIE " + sup);
    }

    public void perimetro() {
        per = (base + altura) * 2;
        System.out.println("PERIMETRO " + per);
    }

    public void dibujo() {
        for (int i = 0; i < base; i++) {
            if (i == base - 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (j == base - 1) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 0; i < base; i++) {
            if (i == base - 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }

        }

    }

}
