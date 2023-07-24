/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre
su equivalente en romano.
 */
package guia3.ejex4.nº.romanos;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx4NºROMANOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese un numero entre 1 y 10");
            num = leer.nextInt();
        } while (num > 10 || num < 1);
        
        switch (num) {
            case 1:
                System.out.println(num + " en romano se escribe I");
                break;
            case 2:
                System.out.println(num + " en romano se escribe II");
                break;
            case 3:
                System.out.println(num + " en romano se escribe III");
                break;
            case 4:
                System.out.println(num + " en romano se escribe IV");
                break;
            case 5:
                System.out.println(num + " en romano se escribe V");
                break;
            case 6:
                System.out.println(num + " en romano se escribe VI");
                break;
            case 7:
                System.out.println(num + " en romano se escribe VII");
                break;
            case 8:
                System.out.println(num + " en romano se escribe VIII");
                break;
            case 9:
                System.out.println(num + " en romano se escribe IX");
                break;
            case 10:
                System.out.println(num + " en romano se escribe X");
                break;
        }
    }
    
}
