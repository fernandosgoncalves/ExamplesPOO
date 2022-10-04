/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author professor
 */
public class Livro {
    public String titulo;
    protected int ano;
    private String autor;
    
    
    public Livro(){
        
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Autor: " + this.autor + " Ano: " + this.ano 
                + " Titulo: " + this.titulo;
    }
    
    
}
