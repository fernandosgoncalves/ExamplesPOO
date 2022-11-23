/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaanimal;

/**
 *
 * @author professor
 */
public class ExecutaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato("Joaquim");
        Cachorro cachorro = new Cachorro("Sofia");
        
        System.out.println(gato.caminha());
        System.out.println(gato.mia());
        System.out.println(gato.getNome());
        
        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());
        System.out.println(cachorro.getNome());
    }
    
}
