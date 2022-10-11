/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author professor
 */
public class Paciente {
    
    private String nome;
    private int idade;
    private String sexo;
    private float peso;
    private float altura;
    
    public Paciente(){
        
    }

    public Paciente(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Paciente(String nome, int idade, String sexo, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade 
                + ", Sexo: " + sexo + ", Peso: " + peso 
                + ", Altura: " + altura;
    }
    
    
    
    
    
}
