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
public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome) {
        super(nome);
    }
    
    public String late(){
        return "O cachorro latiu!";
    }
}
