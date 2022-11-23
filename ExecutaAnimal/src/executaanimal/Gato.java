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
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome) {
        super(nome);
    }
    
    public String mia(){
        return "O gato " + super.getNome() + " miou!";
    }
}
