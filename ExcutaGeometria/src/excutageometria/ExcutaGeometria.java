/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excutageometria;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExcutaGeometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormaGeometrica f;
        
        int tipo = Integer.valueOf(JOptionPane.showInputDialog(null, "Informe o tipo:"));
        
        f = new FormaGeometrica(tipo);
        
        switch(tipo){
            case 0:
                //Quadrado
                f.setnLados(1);
                int[] lados = new int[2];
                lados[0] = Integer.valueOf(JOptionPane.showInputDialog("Informe o valor do lado:"));
                f.setLados(lados);
            break;
            case 1:
                //Retangulo
                f.setnLados(2);
                int[] ladosR = new int[2];
                ladosR[0] = Integer.valueOf(JOptionPane.showInputDialog("Informe o valor do lado:"));
                ladosR[1] = Integer.valueOf(JOptionPane.showInputDialog("Informe o valor do lado 2:"));
                f.setLados(lados);
            break;
            case 2:
                //Triangulo
                f.setnLados(2);
                int[] ladosT = new int[2];
                ladosT[0] = Integer.valueOf(JOptionPane.showInputDialog("Informe o valor da base:"));
                ladosT[1] = Integer.valueOf(JOptionPane.showInputDialog("Informe o valor da altura:"));
                f.setLados(lados);
            break;
            case 3:
                //Circulo
                area = (float) (3.14 * Math.pow(this.raio, 2)); 
            break;
        }
            
        }
    }
    
}
