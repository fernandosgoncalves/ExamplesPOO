/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author professor
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    public String toString() {
        return super.getNome() + " cnpj: " + cnpj;
    }

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    
    
}
