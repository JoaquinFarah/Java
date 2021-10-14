//Los profesores del curso de programación de Egg necesitan llevar un registro de
//las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
//aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
//notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
//cada nota son: 
//      Primer trabajo práctico evaluativo 10% 
//      Segundo trabajo práctico evaluativo 15% 
//      Primer Integrador 25% 
//      Segundo integrador 50% 
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
//del programa los profesores necesitan obtener por pantalla la cantidad de
//aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
//con promedio mayor o igual al 7 de sus notas del curso. 
package Ejercicios;
import java.util.Scanner;
public class ej_ex_20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double [] array = new double [3];
        int ap=0, desap=0;
        double ptpe=0, stpe=0, pi=0, si=0, nfinal=0;
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ingrese la nota del primer trabajo practico evaluativo");
            ptpe=leer.nextDouble();
            ptpe=(ptpe*10)/100;
            System.out.println("Ingrese la nota del segundo trabajo practico evaluativo");
            stpe=leer.nextDouble();
            stpe=(stpe*15)/100;
            System.out.println("Ingrese la nota del primer integrador");
            pi=leer.nextDouble();
            pi=(pi*25)/100;
            System.out.println("Ingrese la nota del segundo integrador");
            si=leer.nextDouble();
            si=(si*50)/100;
            nfinal=(ptpe+stpe+pi+si);
            array[i]=nfinal;
            System.out.println("La nota final es: " +nfinal+ " del alumno n° " +i);
            if (nfinal >= 7) {
                ap=ap+1;
            } else {
                desap=desap+1;
            }
        }
        System.out.println("La cantidad de aprobados es: " +ap);
        System.out.println("La cantidad de desaprobados es: " +desap);
    }
}
