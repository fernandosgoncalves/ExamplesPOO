/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaconstrutor;

/**
 *
 * @author professor
 */
public class Animal {
    private String raca;
    private float peso;
    private String porte;
    private String sexo;
    private float altura;
    
    public Animal(){
    }

    public Animal(String raca, float peso, String porte, String sexo, float altura) {
        this.raca = raca;
        this.peso = peso;
        this.porte = porte;
        this.sexo = sexo;
        this.altura = altura;
    }
        
    @Override
    public String toString() {
        return "Raca=" + raca + ", peso=" + peso + ", porte=" + porte + ", sexo=" + sexo + ", altura=" + altura;
    }
    
    
    
}
