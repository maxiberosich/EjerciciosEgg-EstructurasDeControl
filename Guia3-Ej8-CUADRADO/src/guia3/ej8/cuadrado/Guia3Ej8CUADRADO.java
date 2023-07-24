/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia3.ej8.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3Ej8CUADRADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de los lados del cuadrado: ");
        lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado-1){
                    System.out.print("* ");
                }else if(j == 0 || j == lado-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
