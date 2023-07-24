/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package guia3.ejex9.division.restas.sucesivas;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx9DIVISIONRESTASSUCESIVAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividendo, divisor, resto, contador;
        Scanner leer = new Scanner(System.in);
        
        contador = 0;
        
        System.out.print("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        divisor = leer.nextInt();
        
        do {            
            resto = dividendo - divisor;
            System.out.println(dividendo + " - " + divisor + " = " + resto);
            dividendo = resto;
            contador++;            
        } while (resto > divisor);
        
        System.out.println("El cociento es " + contador + " y el residuo es " + resto);
    }
    
}
