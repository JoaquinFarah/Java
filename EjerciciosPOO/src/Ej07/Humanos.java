package Ej07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Humanos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        String sexo;
        int edad, a = 0, b = 0, c = 0, adulto = 0, menor = 0;
        boolean mEdad = false;
        double altura, peso, IMC = 0;

        try {

            System.out.println("PERSONA1");
            System.out.println("Nombre");
            nombre = leer.next();
            System.out.println("Sexo");
            sexo = leer.next();
            System.out.println("Peso");
            peso = leer.nextDouble();

            System.out.println("Edad");
            edad = leer.nextInt();
            System.out.println("Altura en mts");
            altura = leer.nextDouble();

            Persona persona1 = new Persona(nombre, sexo, edad, peso, altura);
        persona1 = null;
        try{
            System.out.println("Sin nombre " + persona1.getNombre());
        }catch (NullPointerException e){
            System.out.println("Error por escrito " +e.toString());
        
            
            System.out.println("");
            System.out.println("PERSONA1");
            System.out.println("Nombre " + persona1.getNombre());
            System.out.println("Sexo " + persona1.getSexo());
            System.out.println("Peso " + persona1.getPeso());
            System.out.println("Edad " + persona1.getEdad());
            System.out.println("Altura " + persona1.getAltura());
            persona1.calcularIMC(IMC, a, b, c);
            System.out.println("Es mayor de edad?");
            persona1.esMayorDeEdad(mEdad, adulto, menor);
        } catch (InputMismatchException e) {
            System.out.println("Error tipografico");
        } finally {
            System.out.println("SALIENDO...");
        }

//
//        System.out.println("");
//        System.out.println("PERSONA2");
//        System.out.println("Nombre");
//        nombre = leer.next();
//        System.out.println("Sexo");
//        sexo = leer.next();
//        System.out.println("Peso");
//        peso = leer.nextDouble();
//        System.out.println("Edad");
//        edad = leer.nextInt();
//        System.out.println("Altura");
//        altura = leer.nextDouble();
//        Persona persona2 = new Persona(nombre, sexo, edad, peso, altura);
//        System.out.println("");
//        System.out.println("PERSONA2");
//        System.out.println("Nombre " + persona2.getNombre());
//        System.out.println("Sexo " + persona2.getSexo());
//        System.out.println("Peso " + persona2.getPeso());
//        System.out.println("Edad " + persona2.getEdad());
//        System.out.println("Altura " + persona2.getAltura());
//        persona2.calcularIMC(IMC, a, b, c);
//        System.out.println("Es mayor de edad?");
//        persona2.esMayorDeEdad(mEdad, adulto, menor);
//
//        System.out.println("");
//        System.out.println("PERSONA3");
//        System.out.println("Nombre");
//        nombre = leer.next();
//        System.out.println("Sexo");
//        sexo = leer.next();
//        System.out.println("Peso");
//        peso = leer.nextDouble();
//        System.out.println("Edad");
//        edad = leer.nextInt();
//        System.out.println("Altura");
//        altura = leer.nextDouble();
//        Persona persona3 = new Persona(nombre, sexo, edad, peso, altura);
//        System.out.println("");
//        System.out.println("PERSONA3");
//        System.out.println("Nombre " + persona3.getNombre());
//        System.out.println("Sexo " + persona3.getSexo());
//        System.out.println("Peso " + persona3.getPeso());
//        System.out.println("Edad " + persona3.getEdad());
//        System.out.println("Altura " + persona3.getAltura());
//        persona3.calcularIMC(IMC, a, b, c);
//        System.out.println("Es mayor de edad?");
//        persona3.esMayorDeEdad(mEdad, adulto, menor);
//
//        System.out.println("");
//        System.out.println("PERSONA4");
//        System.out.println("Nombre");
//        nombre = leer.next();
//        System.out.println("Sexo");
//        sexo = leer.next();
//        System.out.println("Peso");
//        peso = leer.nextDouble();
//        System.out.println("Edad");
//        edad = leer.nextInt();
//        System.out.println("Altura");
//        altura = leer.nextDouble();
//        Persona persona4 = new Persona(nombre, sexo, edad, peso, altura);
//        System.out.println("");
//        System.out.println("PERSONA4");
//        System.out.println("Nombre " + persona4.getNombre());
//        System.out.println("Sexo " + persona4.getSexo());
//        System.out.println("Peso " + persona4.getPeso());
//        System.out.println("Edad " + persona4.getEdad());
//        System.out.println("Altura " + persona4.getAltura());
//        persona4.calcularIMC(IMC, a, b, c);
//        System.out.println("Es mayor de edad?");
//        persona4.esMayorDeEdad(mEdad, adulto, menor);
//        
//     
//        System.out.println("Porcentaje de personas con desnutricion: " + a);
//        System.out.println("Porcentaje de personas en peso ideal: " + b);
//        System.out.println("Porcentaje de personas con sobrepeso: " + c);
//        System.out.println("Porcentaje de personas mayores de edad: " + adulto);
//        System.out.println("Porcentaje de personas menores de edad: " + menor);
    }

}
//
//// creo un vector para imc y edades para guardar todos los valores
//        imc[0] = a.calcularIMC();    
//        imc[1] = b.calcularIMC();    
//        imc[2] = c.calcularIMC();    
//        imc[3] = d.calcularIMC();
//        
//        for (int i = 0; i < imc.length; i++) {
//            switch (imc[i]) {
//                case -1:
//                    contador_imc_bajo += 1;
//                    break;
//                case 0:
//                    contador_imc_normal += 1;
//                    break;
//                case 1:
//                    contador_imc_alto += 1;
//                    break;
//            } 
//        }
//        
//        edades[0] = a.getEdad();
//        edades[1] = b.getEdad();
//        edades[2] = c.getEdad();
//        edades[3] = d.getEdad();
//        
//        for (int i = 0; i < edades.length; i++) {
//            if(edades[i] >= 18){
//                mayores =  mayores + 1;
//            } 
//        }
//        System.out.println("El porcentaje de personas que están por debajo de su peso normal es: " + (contador_imc_bajo*100)/4 + "%" );
//        System.out.println("El porcentaje de personas que están en su peso normal es: " + (contador_imc_normal*100)/4 + "%" );
//        System.out.println("El porcentaje de personas que están por encima de su peso normal es: " + (contador_imc_alto*100)/4 + "%" );
//        System.out.println("El porcentaje de personas mayores de edad es del: " + (mayores*100)/4 + "%");
//        System.out.println("El porcentaje de personas menores de edad es del: " + (100-(mayores*100)/4) + "%");
