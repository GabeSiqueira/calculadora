import javax.swing.*;

public class Calculadora {
   public static void main (String [] args){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Valor"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Valor"));
      System.out.println("Calculadora" + "\nSoma" + "\nResultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
      JOptionPane.showMessageDialog(null, "Calculadora" + "\nSoma" + "\nResultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
   }
}