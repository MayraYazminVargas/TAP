/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mvarg
 */
public class Hilo2 extends Thread{
    private int[] Vector;
    private String Vect;
    private int tam;
    private long sumaCuadrados;
    
    public Hilo2(String Vect, int tam) {
        this.Vect = Vect;
        this.tam = tam;
        this.sumaCuadrados = 0;
        this.Vector = new int[this.tam];
        
        for(int x = 0; x < this.tam; x++) {
         Vector[x] = (int) (Math.random() * 50) + 1;
        
        }
    }
    
    public long getSumaCuadrados() {
        return (this.sumaCuadrados);
    }
    
    public void run() {
        for (int i = 0; i < this.tam; i++) {
            System.out.println(this.Vect + ": " + i);
            this.sumaCuadrados += Vector[i] * Vector[i]; 
        }
      //  System.out.println("La suma de cuadrados es: "+sumaCuadrados);
    }
}
