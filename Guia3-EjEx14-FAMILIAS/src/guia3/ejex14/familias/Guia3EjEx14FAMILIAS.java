/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene 
una M cantidad de hijos. Escriba un programa que pida la cantidad de 
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package guia3.ejex14.familias;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx14FAMILIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int familia, hijos, edad, media, cont;
        Scanner leer = new Scanner(System.in);
        
        media = 0;
        cont = 0;
        
        System.out.print("Cantidad de familias: ");
        familia = leer.nextInt();
        for (int i = 0; i < familia; i++) {
            System.out.print("Cantidad de hijos de la " + (i+1) + "º familia: ");
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.print("Edad del " + (j+1) + "º hijo: ");
                edad = leer.nextInt();
                media += edad;
                cont++;
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("La media de edad de hijos de todas las familias es: " + (media/cont));
    }
    
}
