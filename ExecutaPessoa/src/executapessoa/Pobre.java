/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapessoa;

/**
 *
 * @author professor
 */
public class Pobre extends Pessoa{

    public Pobre() {
        
    }
    
    public Pobre(String nome, int idade){
        super.setIdade(idade);
        super.setNome(nome);
    }
    
    public void trabalha(){
        System.out.println("A pessoa está trabalhando!");
    }

    @Override
    public String toString() {
        return "Pobre: " + super.getNome() + ", " + super.getIdade();
    }
    
    
    
}
