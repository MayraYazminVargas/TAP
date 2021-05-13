
package Clases;

public class Hilo1 extends Thread{
   
    private int[] Vector;
    private String Vect;
    private int tam;
    private int suma;
    
    public Hilo1(String Vect, int tam) {
        this.Vect = Vect;
        this.tam = tam;
        this.suma = 0;
        this.Vector = new int[this.tam];
        
        for(int x = 0; x < this.tam; x++) {
         Vector[x] = (int) (Math.random() * 50) + 1;
        
        }
    }
    
    public int getSuma() {
        return (this.suma);
    }
    
    public void run() {
        for (int i = 0; i < this.tam; i++) {
            System.out.println(this.Vect + ": " + i);
            this. suma = Vector[i] + suma;
        }
       // System.out.println("La suma es: "+suma);
    }

}
