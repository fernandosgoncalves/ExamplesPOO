/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaconstrutor;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class PraticaConstrutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        
        String raca, porte, sexo;
        float peso, altura;
        
        System.out.println("Informe a Raça:");
        raca = lerString.next();
        
        System.out.println("Informe a Porte:");
        porte = lerString.next();
        
        System.out.println("Informe a Sexo:");
        sexo = lerString.next();
        
        System.out.println("Informe a peso:");
        peso = ler.nextFloat();
        
        System.out.println("Informe a altura:");
        altura = ler.nextFloat();
                
        Animal a1 = new Animal(raca, peso, porte, sexo, altura);
        
        System.out.println("Informe a Raça:");
        raca = lerString.next();
        
        System.out.println("Informe a Porte:");
        porte = lerString.next();
        
        System.out.println("Informe a Sexo:");
        sexo = lerString.next();
        
        System.out.println("Informe a peso:");
        peso = ler.nextFloat();
        
        System.out.println("Informe a altura:");
        altura = ler.nextFloat();
                
        Animal a2 = new Animal(raca, peso, porte, sexo, altura);
        
        System.out.println("Informe a Raça:");
        raca = lerString.next();
        
        System.out.println("Informe a Porte:");
        porte = lerString.next();
        
        System.out.println("Informe a Sexo:");
        sexo = lerString.next();
        
        System.out.println("Informe a peso:");
        peso = ler.nextFloat();
        
        System.out.println("Informe a altura:");
        altura = ler.nextFloat();
                
        Animal a3 = new Animal(raca, peso, porte, sexo, altura);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
    
}
