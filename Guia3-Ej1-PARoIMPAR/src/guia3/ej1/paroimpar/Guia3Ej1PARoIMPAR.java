/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej1.paroimpar;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar
 * @author Max
 */
public class Guia3Ej1PARoIMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = ingreso.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero ingresado es PAR");
        }else{
            System.out.println("El numero ingresado es IMPAR");
        }
    }
    
}
