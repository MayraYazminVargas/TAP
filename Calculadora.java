import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora extends JFrame implements ActionListener{

   private JButton suma,resta,mult,div,borrar;
   private JTextField n1,n2,resul;
   
   public Calculadora(){
      setTitle("Caluladora");   
      initComponents();
      
      
      
   }
   
   private void initComponents(){
      setTitle("Caluladora");
      setSize(200,250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel = new JPanel();//crea un contenedor donde se van agregar los componentes 
     
      
      JLabel lbl1 = new JLabel("Numero");
      panel.add(lbl1);
      n1 = new JTextField(10);
      panel.add(n1);
      
      JLabel lbl2 = new JLabel("Numero");
      panel.add(lbl2);
      n2 = new JTextField(10);
      panel.add(n2);
      
      JLabel lbl3 = new JLabel("Resultado");
      panel.add(lbl3);
      resul = new JTextField(10);
      panel.add(resul);
      
      suma = new JButton("+");
      panel.add(suma); 
      suma.addActionListener(this);
      
      resta = new JButton("-");
      panel.add(resta);
      resta.addActionListener(this);
      
      mult = new JButton("x");
      panel.add(mult);
      mult.addActionListener(this);
      
      div = new JButton("/");
      panel.add(div);
      div.addActionListener(this);
      
      borrar = new JButton("Borra");
      panel.add(borrar);
      borrar.addActionListener(this);
      
      
      
      setContentPane(panel);//agregar el panel a la ventana
      setVisible(true);
      
      
   }
   
   public void actionPerformed(ActionEvent e) {
           double  num1,num2,resu;
           String resultado;
        if (e.getSource()==suma) {
            if(n1.getText().equals("") || n2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos Están Incompletos",
                "Error",JOptionPane.ERROR_MESSAGE); 
            }
            else{
                num1=Double.parseDouble(n1.getText());
                num2=Double.parseDouble(n2.getText());
                resu=num1+num2;
                resultado=String.valueOf(resu);
                resul.setText(resultado);
            }                   
        }
        if (e.getSource()==resta) {
            if(n1.getText().equals("") || n2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos Están Incompletos",
                "Error",JOptionPane.ERROR_MESSAGE); 
            }
            else{
                num1=Double.parseDouble(n1.getText());
                num2=Double.parseDouble(n2.getText());
                resu=num1-num2;
                resultado=String.valueOf(resu);
                resul.setText(resultado);
            }                   
        } 
        if (e.getSource()==mult) {
            if(n1.getText().equals("") || n2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos Están Incompletos",
                "Error",JOptionPane.ERROR_MESSAGE); 
            }
            else{
                num1=Double.parseDouble(n1.getText());
                num2=Double.parseDouble(n2.getText());
                resu=num1*num2;
                resultado=String.valueOf(resu);
                resul.setText(resultado);
            }                   
        }
        if (e.getSource()==div) {
            if(n1.getText().equals("") || n2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos Están Incompletos",
                "Error",JOptionPane.ERROR_MESSAGE); 
            }
            else{
                num1=Double.parseDouble(n1.getText());
                num2=Double.parseDouble(n2.getText());
                try{
                    resu=num1/num2;
                    resultado=String.valueOf(resu);
                    resul.setText(resultado);
                }
                catch(ArithmeticException ex){
                        JOptionPane.showMessageDialog(null, "No se Puede Dividir Entre 0",
                        "Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }                   
        }
        if (e.getSource()==borrar){
            n1.setText("");
               n2.setText("");
               resul.setText("");
       }                
    }

}