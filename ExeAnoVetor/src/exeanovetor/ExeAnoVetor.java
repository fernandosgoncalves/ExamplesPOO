/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeanovetor;

/**
 *
 * @author professor
 */
public class ExeAnoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ano lista = new Ano();
        
        int valor;
        
        valor = (int) (Math.random() * 12);
        
        lista.mostraMes(valor);
    }
    
}
