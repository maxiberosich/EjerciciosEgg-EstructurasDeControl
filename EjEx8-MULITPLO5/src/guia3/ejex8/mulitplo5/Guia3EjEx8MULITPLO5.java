/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
package guia3.ejex8.mulitplo5;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx8MULITPLO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cantPar, cantImpar;
        Scanner leer = new Scanner(System.in);
        
        cantPar = 0;
        cantImpar = 0;
        
        do {            
            System.out.print("Ingrese un numero cualquiera: ");
            num = leer.nextInt();
            if(num % 2 == 0 && num > 0){
                cantPar++;
            }else if(num > 0){
                cantImpar++;
            }
        } while (num % 5 != 0);
        
        System.out.println("-------------------");
        System.out.println("Cantidad de numeros pares ingresados: " + cantPar);
        System.out.println("Cantidad de numeros impares ingresados: " + cantImpar);
        System.out.println("Cantidad de numeros totales ingresados: " + (cantPar+cantImpar));
    }
    
}
