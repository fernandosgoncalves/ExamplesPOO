/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author professor
 */
public class UsaPaciente {
    
    public static void main(String[] args) {
        Paciente p = new Paciente();
        Paciente p1 = new Paciente("João", 32, "M");
        Paciente p3 = new Paciente("Beatriz", 44, "F", 
                (float)48.5, (float)1.75);
        
        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p3.toString());
    }
}
