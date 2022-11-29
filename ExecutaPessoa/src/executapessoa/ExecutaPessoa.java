/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExecutaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rica r = new Rica();
        Pobre p;
        Miseravel m;
        
        int idade;
        String nome;
        
        r.setNome(JOptionPane.showInputDialog(null, "Informe o nome:"));
        r.setIdade(Integer.valueOf(JOptionPane.showInputDialog(null, "Informe a idade:")));
        r.setDinheiro(Double.valueOf(JOptionPane.showInputDialog(null, "Informe o dinheiro:")));
        
        idade = Integer.valueOf(JOptionPane.showInputDialog(null, "Informe a idade: "));
        nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
        
        p = new Pobre(nome, idade);
        
        m = new Miseravel("Fernando", 33);
        
        System.out.println(r.toString());
        r.fazCompras();
        
        System.out.println(p.toString());
        p.trabalha();
        
        System.out.println(m.toString());
        m.mendiga();
    }
    
}
