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
public class Funcionario extends PessoaFisica {
    private double salario;
    private int matricula;

    public Funcionario() {
    }

    public Funcionario(double salario, int matricula, String cpf, String nome) {
        super(cpf, nome);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", matricula=" + matricula + ", nome=" + super.getNome() + ", cpf=" + super.getCpf() + '}';
    }
    
    
    
}
