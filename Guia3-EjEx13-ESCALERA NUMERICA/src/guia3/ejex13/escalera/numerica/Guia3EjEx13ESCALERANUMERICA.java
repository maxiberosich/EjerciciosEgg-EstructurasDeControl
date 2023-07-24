/*
Crear un programa que dibuje una escalera de números, donde 
cada línea de números comience en uno y termine en el número
de la línea. Solicitar la altura de la escalera al usuario al 
comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
package guia3.ejex13.escalera.numerica;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx13ESCALERANUMERICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese hasta donde quiere que llegue su escalera: ");
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
