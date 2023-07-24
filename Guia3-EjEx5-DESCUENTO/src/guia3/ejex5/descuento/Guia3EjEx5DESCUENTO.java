/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.
 */
package guia3.ejex5.descuento;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx5DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String socio;
        float costoT;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese el tipo de Socio (A, B o C)");
            socio = leer.next().toUpperCase(); 
        } while (socio.length() > 1);
        
        System.out.println("Ingrese el costo del tratamiento");
        costoT = leer.nextFloat();
        
        switch (socio) {
            case "A":
                System.out.println("El tratamiento le sale: $" + (costoT*0.5));
                break;
            case "B":
                System.out.println("El tratamiento le cuesta: $" + (costoT-(costoT*0.35)));
                break;
            case "C":
                System.out.println("Debido a su categoria de Socio, usted no recibe ningun tipo de descuento.");
                System.out.println("Costo del traramiento: $" + costoT);
                break;
            default:
                System.out.println("El tipo de Socio ingresado no es correcto, vuelva a ejecutar el programa");
                break;
        }
    }
    
}
