/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej2.eureka;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual 
 * a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un 
 * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 * @author Max
 */
public class Guia3Ej2EUREKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase: ");
        frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
