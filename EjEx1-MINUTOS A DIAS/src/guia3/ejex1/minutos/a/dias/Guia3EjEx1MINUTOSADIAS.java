/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas
 */
package guia3.ejex1.minutos.a.dias;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx1MINUTOSADIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int minutos, dia, horas, min;
       Scanner leer = new Scanner(System.in);
       
       
       
       System.out.print("Ingrese una cantidad de minutos que desee: ");
       minutos = leer.nextInt();
       
       dia = minutos / 1440;
       horas = (minutos % 1440)/60;
       min = (minutos % 1440)%60;
       
       System.out.println(dia + " dia, " + horas + " horas, " + min + " minutos");
    }
    
}
