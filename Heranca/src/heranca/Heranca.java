/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author professor
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camisa c = new Camisa();
        
        System.out.println(c.getClass());
        System.out.println(c.getClass().getSimpleName());
        System.out.println(c.hashCode());
    }
    
}
