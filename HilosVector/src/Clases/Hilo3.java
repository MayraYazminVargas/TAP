
package Clases;

public class Hilo3 extends Thread {
    private int[] Vector;
    private String Vect;
    private int tam;
    private long sumaCuadrados;
    private int suma;
    private double media;
    
    public Hilo3(String Vect, int tam) {
        this.Vect = Vect;
        this.tam = tam;
        this.suma = 0;
        this.sumaCuadrados = 0;
        this.media = 0.0;
        this.Vector = new int[this.tam];
        
        for(int x = 0; x < this.tam; x++) {
         Vector[x] = (int) (Math.random() * 50) + 1;
        
        }
    }
    
    
    
    public double getMedia() {
        return (this.media);
    }
    
    public void run() {
        for (int i = 0; i < this.tam; i++) {
            System.out.println(this.Vect + ": " + i);
            this.suma += Vector[i]; 
            this.sumaCuadrados += Vector[i] * Vector[i]; 
        }
        this.media = (double) this.suma / (double) this.tam;  
      //  System.out.println("La media es: "+ media);
    }
}
