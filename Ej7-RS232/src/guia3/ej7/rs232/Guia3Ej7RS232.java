/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej7.rs232;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3Ej7RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena, FDE;
        int contadorCorrecto, contadorIncorrecto;
        contadorCorrecto = 0;
        contadorIncorrecto = 0;
        FDE = "&&&&&";
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.print("Ingrese una cadena de tipo RS232: ");
            cadena = leer.nextLine();
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
                contadorCorrecto++;
            }else{
                contadorIncorrecto++;
            }
        } while (!cadena.equals(FDE));
        
        
        System.out.println("Cantidad de RS232 ingresados: " + contadorCorrecto);
        System.out.println("Cantidad de formas incorrectas: " + (contadorIncorrecto-1));
    }
    
}
