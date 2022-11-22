/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaotrabalho;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class CorrecaoTrabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista();
        
        l.inicializaArrays();
        
        l.mostraDados(0);
        l.mostraDados(1);
        
        System.out.print("Total Pares Lista B: ");
        System.out.println(l.totalPares(1));
        
        System.out.println(l.maiorValor(0));
        
        int codigo = Integer.valueOf(JOptionPane.showInputDialog("Informe a lista (0 - a, 1 - b, 2 - c, 3 - d"));
        System.out.println(l.maiorValor(codigo));
        
        
        System.out.println("Total Iguais: " + l.totalIguais(0, 1));
    }
    
}
