/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exenotas;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExeNotas {
    static float[] notas = new float[5];
        
    public static void main(String[] args) {
        // Entrada de dados
        for(int i=0; i<5; i++){
            notas[i] = Float.valueOf(JOptionPane.showInputDialog("Informe o valor " + i));
        }
        
        ordenaDecrescente(notas);
        calculaMedia(notas);
        
    }

    private static void calculaMedia(float[] notas) {
        float media = 0;
        for(int i=0; i<5; i++){
            media += notas[i];
        }
        media = media/5;
        System.out.println("Media: " + media);
    }

    private static void ordenaDecrescente(float[] notas) {
        float aux;
        for(int i = 1; i<5; i++){
            for(int j=0; j<i; j++){
                if(notas[j] < notas[i]){
                    aux = notas[j];
                    notas[j] = notas[i];
                    notas[i] = aux;
                }
            }
        }
       
        for(int i=0; i<5; i++){
            System.out.println(notas[i] + " ");
        }
    }
}
