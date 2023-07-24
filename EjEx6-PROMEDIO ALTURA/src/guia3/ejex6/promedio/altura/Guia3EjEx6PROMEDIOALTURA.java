/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia3.ejex6.promedio.altura;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx6PROMEDIOALTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantPersonas;
        float promedio, promedioGral, altura, contPromedio;
        Scanner leer = new Scanner(System.in);
        
        contPromedio = 0;
        promedio = 0;
        promedioGral = 0;
        
        System.out.print("Cantidad de personas: ");
        cantPersonas = leer.nextInt();
        System.out.println("-----------------------");
        
        for (int i = 0; i < cantPersonas; i++) {
            System.out.print("Ingrese la altura de la " + (i+1) + "º persona en metros: ");
            altura = leer.nextFloat();
            promedioGral = promedioGral + altura;
            if(altura < 1.60){
                contPromedio++;
                promedio = promedio + altura;
            }            
        }
        
        System.out.println("---------------------");
        System.out.println("El promedio de altura de todas las personas ingresadas es de: " + (promedioGral/cantPersonas) + "%");
        System.out.println("---------------------");
        System.out.println("El promedio de altura de las personas que miden menos de 1.60m es de: " + (contPromedio/cantPersonas) + "%");
        System.out.println("La cantidad de personas con menos de 1.60m es de: " + contPromedio);
    }
    
}
