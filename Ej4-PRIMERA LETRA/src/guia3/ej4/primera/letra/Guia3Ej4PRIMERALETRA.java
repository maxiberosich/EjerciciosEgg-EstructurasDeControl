/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej4.primera.letra;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
 * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 * @author Max
 */
public class Guia3Ej4PRIMERALETRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        
        if (frase.substring(0, 1).equals("A")){
            System.out.println("Su palabra inicial comienza con A");
        }else{
            System.out.println("Su palabra inicial comienza con " + frase.substring(0, 1));
        }
    }
    
}
