/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class UsoMetodos {
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    
    public static String diaSemana(int dia){
        switch(dia){
            case 1: 
                return "Domingo";
            //break;
            case 2: 
                return "Segunda-feira";
            //break;
            case 3: 
                return "Terça-feira";
            //break;
            case 4: 
                return "Quarta-feira";
            //break;
            case 5: 
                return "Quinta-feira";
            //break;
            case 6: 
                return "Sexta-feira";
            //break;
            case 7: 
                return "Sábado";
            //break;
            default:
                return "Dia inválido!";
            //break;
        }
    }
    
        public static float lerNumeroFloat(float min, float max){
        float valor;
        
        do{
        valor = Float.valueOf(JOptionPane.showInputDialog("Informe um valor entre " + 
                min + " - " + max));
        
        }while(valor < min || valor > max);
        
        return valor;
    }
    
    public static float calculaMedia(float n1, float n2, float n3){
        return (n1+n2+n3)/3;
    }
    
}
