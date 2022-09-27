/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExecutaAluno {
    
    public static void main(String[] args) {
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno();
       
       a1.setNome(JOptionPane.showInputDialog("Informe o Nome:"));
       a1.setAltura(Float.valueOf(JOptionPane.
               showInputDialog("Informe a altura:")));
       a1.setPeso(Float.valueOf(JOptionPane.
               showInputDialog("Informe o peso:")));
       a1.setSexo(JOptionPane.
               showInputDialog("Informe o Sexo F/M:").charAt(0) );
       
       a2.setNome(JOptionPane.showInputDialog("Informe o Nome:"));
       a2.setAltura(Float.valueOf(JOptionPane.
               showInputDialog("Informe a altura:")));
       a2.setPeso(Float.valueOf(JOptionPane.
               showInputDialog("Informe o peso:")));
       a2.setSexo(JOptionPane.
               showInputDialog("Informe o Sexo F/M:").charAt(0) );
       
       a1.calculaImc();
       a2.calculaImc();
       
       System.out.println(a1.mostraDados());
       System.out.println(a2.mostraDados());
    }
}
