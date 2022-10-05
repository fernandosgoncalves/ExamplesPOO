/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplometodosoutrasclasses;

import funcoes.UsoMetodos;

/**
 *
 * @author professor
 */
public class ExemploMetodosOutrasClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsoMetodos.imprimir("Meu texto Teste");
        
        System.out.println(UsoMetodos.diaSemana(3));
        
        System.out.println(UsoMetodos.lerNumeroFloat(0, 10));
        
        System.out.println(UsoMetodos.calculaMedia(10, (float)5.5, (float)8.33));
    }   
}
