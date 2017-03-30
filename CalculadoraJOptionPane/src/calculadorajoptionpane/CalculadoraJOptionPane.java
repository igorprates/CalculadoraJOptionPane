/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CalculadoraJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador=1,resultado=0;
        while(contador!=0){
            
            int primeirooperando = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro Numero!"));
       
            int segundooperando= Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo Numero!"));
        
            String operador= JOptionPane.showInputDialog("Insira o operador!");
       
            switch(operador){
           
           case "*":
              resultado=primeirooperando*segundooperando; 
              break;
          
           case "/":
              resultado=primeirooperando/segundooperando; 
              break;
           
           case "+":
              resultado=primeirooperando+segundooperando; 
              break;
           
           case "-":
              resultado=primeirooperando-segundooperando; 
              break;
           
                            
       }
       JOptionPane.showMessageDialog (null, "O resultado de sua operacao e : "+resultado);
       int opcao= JOptionPane.showConfirmDialog(null,"Deseja efetuar outra operação?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    
        if(opcao==0){
            
            JOptionPane.showMessageDialog(null,"Informe a proxima operação!");
        }
        else{
            contador=0;
            JOptionPane.showMessageDialog(null,"Saida do programa efetuada!");
            
            
        }
            
        }
    }
}
