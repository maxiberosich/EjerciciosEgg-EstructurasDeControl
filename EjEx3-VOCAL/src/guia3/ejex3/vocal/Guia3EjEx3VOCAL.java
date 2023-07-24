/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 */
package guia3.ejex3.vocal;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx3VOCAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese una letra");
            letra = leer.next().toLowerCase();  
        } while (letra.length() > 1);
        
        
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("No es una vocal la letra ingresada");
        }
    }
    
}
