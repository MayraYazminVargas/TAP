
package Clases;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mvarg
 */
public class ClasePrincipal {
    public static void main(String args[]){
         Scanner leer= new Scanner(System.in);
         
         int tam;
         System.out.print("Ingresa el tamaño del arreglo: ");
         tam= leer.nextInt();
         Hilo1 h1;
         Hilo2 h2;
         Hilo3 h3;
         
         
         h1 = new Hilo1("Primer Hilo", tam);
         h2 = new Hilo2("Segundo Hilo", tam);
         h3 = new Hilo3("Tercer Hilo", tam);

        h1.start();
        h2.start();
        h3.start();

        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Suma hilo 1: " + h1.getSuma()); 
        System.out.println("Suma de cuadrados hilo 2: " + h2.getSumaCuadrados()); 
        System.out.println("Media hilo 3: " + h3.getMedia()); 
          
        
    }
    
}


