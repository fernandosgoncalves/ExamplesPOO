/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author professor
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> lista = new ArrayList();
        
        lista.add("João");
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Luiza");
        lista.add("Diego");
        lista.add("Marcos");
                
        System.out.println("Lista: " + lista);
        System.out.println(lista.size());
        
        lista.remove("João");
        
        System.out.println("Lista: " + lista);
        
    }
    
}
