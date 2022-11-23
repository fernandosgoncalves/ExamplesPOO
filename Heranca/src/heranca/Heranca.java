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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camisa c = new Camisa();
        
        System.out.println(c.getClass());
        System.out.println(c.getClass().getSimpleName());
        System.out.println(c.hashCode());
        
        // Classe PESSOA
        
        PessoaFisica pf = new PessoaFisica("123.456.789-00", "Teste Pessoa Fisica");
        PessoaJuridica pj = new PessoaJuridica("123456789", "Empresa teste");
        Funcionario f = new Funcionario(1500, 123, "12345678900", "João");
        
        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        
        System.out.println(pj.toString());
        
        System.out.println(pf.getCpf());
    }
    
}
