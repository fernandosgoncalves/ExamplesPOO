/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class BuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[10000];
        int pos = -1;
        
        for(int i=0; i<10000; i++){
            lista[i] = (int) (Math.random()*1000);
            System.out.println(lista[i]);
        }
        
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Informe um valor"));
        
        for(int i=0; i<10000; i++){
            if(lista[i] == valor){
                pos = i;
                break;
            }
        }
        
        System.out.println(pos);
        
        pos = -1;
        
        Arrays.sort(lista);
        pos = Arrays.binarySearch(lista, valor);
        
        System.out.println(pos);
    }
    
}
