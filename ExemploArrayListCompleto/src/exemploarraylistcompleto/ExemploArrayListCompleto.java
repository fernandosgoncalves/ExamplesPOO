/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistcompleto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploArrayListCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contato> agenda = new ArrayList();
        
        Contato aux = new Contato("nome", 123456, "Rua 2");
        
        agenda.add(aux);
        
        aux = new Contato("Fernando", 333333, "Rua 456");
        
        agenda.add(aux);
        
        System.out.println(agenda.size());
        
        for(Contato c : agenda){
            System.out.println(c.toString());
            
            if(c.getNome().equalsIgnoreCase("Fernando")){
                c.setNome("Miguel");
                c.setEndereco("IFSC");
                c.setFone(66666);
            }
        }
        
        agenda.remove(0);
        
        aux = new Contato("Maria", 998877, "Rua Dez");
        
        agenda.add(aux);
        
        String auxNome = JOptionPane.showInputDialog("Informe o Nome");
        int auxFone = Integer.valueOf(JOptionPane.showInputDialog("Informe o Fone"));
        String auxEnde = JOptionPane.showInputDialog("Informe o Endereço");
                
        aux = new Contato(auxNome, auxFone, auxEnde);
        agenda.add(aux);
        
        auxNome = JOptionPane.showInputDialog("Informe o Nome");
        auxFone = Integer.valueOf(JOptionPane.showInputDialog("Informe o Fone"));
        auxEnde = JOptionPane.showInputDialog("Informe o Endereço");
        
        aux = new Contato();
        aux.setNome(auxNome);
        aux.setEndereco(auxEnde);
        aux.setFone(auxFone);
        
        agenda.add(aux);
                
        System.out.println(agenda.size());
        
        System.out.println(agenda);
    }
    
}
