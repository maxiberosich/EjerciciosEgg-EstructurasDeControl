/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta
se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java.
 */
package guia3.ejex10.adivinar.multiplo;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx10ADIVINARMULTIPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        int respuesta;
        Scanner leer = new Scanner(System.in);
        
        num1 = Math.random()*10;
        num2 = Math.random()*10;
        System.out.println((int)(num1 * num2));
        System.out.print("Adivine el resultado: ");
        respuesta = leer.nextInt();
        while (respuesta != (int)(num1 * num2)) { 
            System.out.println("Incorrecto");
            System.out.print("Adivine el resultado: ");
            respuesta = leer.nextInt();
        }
        System.out.println("Correcto kpo!!!!!");
        
    }
    
}
