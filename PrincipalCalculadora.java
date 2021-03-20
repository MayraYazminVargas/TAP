import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
public class PrincipalCalculadora{
   public static void main(String args[]){
      JFrame.setDefaultLookAndFeelDecorated(true);
      Calculadora calcu = new Calculadora();
      calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}