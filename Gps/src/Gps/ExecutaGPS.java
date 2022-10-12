/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gps;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class ExecutaGPS {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String rota;
        
        System.out.print("Informe a rota:");
        rota = ler.next();
        
        GPS g1 = new GPS();
        g1.setIdioma("Portugues");
        g1.setRota("Londres");
        
        GPS g2 = new GPS(rota);
        
        GPS g3 = new GPS("Portugues", "Floripa");
        
        System.out.println(g1.toString());
        System.out.println(g2.getRota() + " - " + g2.getIdioma());
        System.out.println(g3.toString());
    }
    
}
