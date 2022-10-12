/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        
        String aux;
        
        Carro c1 = new Carro();
        
        System.out.print("Informe a Marca:");
        aux = lerString.next();
        
        c1.setMarca(aux);
        
        System.out.print("Informe o modelo: ");
        aux = lerString.next();
        
        c1.setModelo(aux);
        
        c1.setLicenciado(true);
        
        System.out.println("Licenciado: " + c1.isLicenciado());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        
    }
    
}
