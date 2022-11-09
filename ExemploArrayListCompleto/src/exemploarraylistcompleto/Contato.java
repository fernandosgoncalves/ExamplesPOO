/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistcompleto;

/**
 *
 * @author professor
 */
public class Contato {
    private String nome;
    private int fone;
    private String endereco;

    public Contato(String nome, int fone, String endereco) {
        this.nome = nome;
        this.fone = fone;
        this.endereco = endereco;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", fone=" + fone + ", endereco=" + endereco + '}';
    }
    
    
    
}
