/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import javax.swing.JOptionPane;

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
        
        Pessoa p = null;
        
        int opcao = 0;
        
        opcao = Integer.valueOf(JOptionPane.showInputDialog(null, "1 - PF \n2 - PJ \n3 - P \n4 -F\nInforme a opcao desejada:"));
        
        switch(opcao){
            case 1:
                //Pessoa Fisica
                String cpf = JOptionPane.showInputDialog("Informe o CPF:");
                String nome = JOptionPane.showInputDialog("Informe o nome:");
                
                p = new PessoaFisica(cpf, nome);
                
                //p.setNome(nome);
                //p.setCpf(cpf);
                
                System.out.println(p.getNome());
                
                p.setNome("João");
                
                System.out.println(p.toString());
            break;
            case 2:
                //Pessoa Juridica
                String cnpj = JOptionPane.showInputDialog("Informe o CNPJ:");
                String nomep = JOptionPane.showInputDialog("Informe o nome:");
                
                p = new PessoaJuridica(cnpj, nomep);
                
                System.out.println(p.toString());
            break;
            case 3:
                //Pessoa
                String nomepp = JOptionPane.showInputDialog("Informe o nome:");
                
                p = new Pessoa(nomepp);
                
                System.out.println(p.toString());
            break;
            case 4:
                //Funcionario
                String cpff = JOptionPane.showInputDialog("Informe o CPF:");
                String nomef = JOptionPane.showInputDialog("Informe o nome:");
                int matricula = Integer.valueOf(JOptionPane.showInputDialog("Informe a Matricula:"));
                double salario = Double.valueOf(JOptionPane.showInputDialog("Informe o salario:"));
                
                p = new Funcionario(salario, matricula, cpff, nomef);
                
                System.out.println(p.getClass());
                System.out.println(p.toString());
            break;
        }
        
        /*System.out.println(f.getNome());
        System.out.println(f.getCpf());
        
        System.out.println(pj.toString());
        
        System.out.println(pf.getCpf());*/
    }
    
}
