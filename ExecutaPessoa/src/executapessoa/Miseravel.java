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
public class Miseravel extends Pessoa {

    public Miseravel() {
    }
    
    public Miseravel(String nome, int idade) {
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    public void mendiga(){
        System.out.println("A pessoa está mendigando!");
    }

    @Override
    public String toString() {
        return "Miseravel: " + super.getNome() + ", " + super.getIdade();
    }
    
}
