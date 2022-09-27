/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author professor
 */
public class Aluno {
    
    public String nome;
    public char sexo;
    public float altura;
    public float peso;
    public float imc;
    
    public Aluno(){
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float calculaImc(){
        imc = peso / (altura*altura);
        return imc;
    }
    
    public String mostraDados(){
        
    }
    
    
}
