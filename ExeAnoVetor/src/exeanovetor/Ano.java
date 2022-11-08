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
public class Ano {
    private static String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    public Ano(){
    }

    public void mostraMes(int mes){
        if(mes < 0 || mes > 11)
            System.out.println("Mês inválido!");
        else
            System.out.println(this.mes[mes]);
    }
    
}
