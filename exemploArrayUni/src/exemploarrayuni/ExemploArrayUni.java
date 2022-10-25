package exemploarrayuni;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploArrayUni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[20];
        int aux;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("000");
        for(int i=0; i<10; i++){
            aux = Integer.valueOf(JOptionPane.showInputDialog("Informe um número"));
            lista[i] = aux;
        }
        
        for(int i = 10; i< 20; i++){
            aux = (int) (Math.random()*1000);
            lista[i] = aux;
        }
        
        for(int i=0; i<20; i++){
            System.out.println(df.format(lista[i]));
        }
    }
    
}
