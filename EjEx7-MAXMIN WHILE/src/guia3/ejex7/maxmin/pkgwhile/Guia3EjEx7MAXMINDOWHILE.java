/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
y el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3.ejex7.maxmin.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3EjEx7MAXMINDOWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantNum, num, mayor = 0, menor = 0, cont;
        float promedio;
        Scanner leer = new Scanner(System.in);
        
        promedio = 0;
        
        System.out.print("Cantidad de numeros que ingresara: ");
        cantNum = leer.nextInt();
        cont = cantNum;
        System.out.println("----------------------------------");
        System.out.println("Ingrese " + cantNum + " numeros, y presione enter");
        
        do{
            num = leer.nextInt();
            if(cont == cantNum){
                menor = num;
                mayor = num;
            }else{
                menor = Math.min(num, menor);
                mayor = Math.max(num, mayor);                
            }      
            promedio = promedio + num;
            cont--;
        }while(cont > 0);
        
        System.out.println("-------------------------");
        System.out.println("El mayor numero ingresado es: " + mayor);
        System.out.println("El menor numero ingresado es: " + menor);
        System.out.println("El promedio de los numeros ingresados es: " + (promedio/cantNum));
    }
    
}
