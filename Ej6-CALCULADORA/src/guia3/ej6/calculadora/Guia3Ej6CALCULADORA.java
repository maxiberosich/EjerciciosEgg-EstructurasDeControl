/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej6.calculadora;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3Ej6CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc, num1, num2;
        String salir;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = leer.nextInt();
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            opc = leer.nextInt();                    
            switch (opc) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1+num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1-num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (num1*num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + (num1/num2));
                break;
            case 5:
                System.out.println("Seguro desea salir del programa (S/N)");
                salir = leer.next().toLowerCase();
                if (salir.equals("s")){
                    opc = 6;
                }else{
                    opc = 7;
                }
            }
        } while (opc != 6);
        
    }
    
}
