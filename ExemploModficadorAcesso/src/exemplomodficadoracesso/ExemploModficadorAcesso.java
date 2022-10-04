/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomodficadoracesso;

import biblioteca.Livro;

/**
 *
 * @author professor
 */
public class ExemploModficadorAcesso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l = new Livro();
        
        l.titulo = "Java com POO";
        l.setAno(2021);
        l.setAutor("Augusto Cury");
        
        System.out.println(l.toString());
    }
    
}
