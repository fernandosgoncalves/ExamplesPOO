/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomodficadoracesso;

import biblioteca.Livro;
import biblioteca.Produto;

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
        
        Livro.imprimir();
        
        //Exemplo Metodo sem retorno Produto
        Produto p = new Produto();
        
        p.setSaldo((float) 8.5);
        p.setV_unit((float) 10.45);
        
        p.calculaSubtotal();
        
        System.out.println(p.toString());
        
        System.out.println("Soma de 5 e 7: " + 
                Produto.soma(5, 7));
    }
    
}
