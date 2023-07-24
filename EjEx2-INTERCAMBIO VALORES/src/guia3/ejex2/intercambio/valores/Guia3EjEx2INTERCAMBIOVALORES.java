/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
 */
package guia3.ejex2.intercambio.valores;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx2INTERCAMBIOVALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B, C, D, aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 valores diferentes, luego de cada ingreso presiona enter");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        
        System.out.println("---------------------");
        System.out.println("VALORES INICIALES");
        System.out.println("---------------------");
        System.out.println("1º INGRESO: " + A);
        System.out.println("2º INGRESO: " + B);
        System.out.println("3º INGRESO: " + C);
        System.out.println("4º INGRESO: " + D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("---------------------");
        System.out.println("VALORES INTERCAMBIADOS");
        System.out.println("---------------------");
        System.out.println("1º INGRESO: " + A);
        System.out.println("2º INGRESO: " + B);
        System.out.println("3º INGRESO: " + C);
        System.out.println("4º INGRESO: " + D);
    }
    
}
