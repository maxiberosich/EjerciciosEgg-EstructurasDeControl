/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej5.limite.pos;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor limite positivo, y a
 * continuacion solicite numeros al usuario hasta que la suma de los numeros 
 * introducidos supere el limite inicial.
 * @author Max
 */
public class Guia3Ej5LIMITEPOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite, num, sum;
        sum = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un valor limite a alcanzar: ");
        limite = leer.nextInt();
        
        do {            
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            sum = sum + num;
        } while (limite > sum);
        
        System.out.println("La suma de los numeros ingresados (" + sum + "), supero el limite ingresado inicialmente (" + limite + ").");
    }
    
}
