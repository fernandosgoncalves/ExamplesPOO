package exemploarraymulti;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class ExemploArrayMulti {
    public static void main(String[] args) {
        int[][] lista = new int[3][3];
        
        int[][] lista2 = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0; i<3; i++){
            for(int x=0; x<3; x++){
                lista[i][x] = Integer.valueOf(
                        JOptionPane.showInputDialog("Informe o valor " 
                                + i + " " + x));
            }
        }
        
        for(int i=0; i<3; i++){
            for(int x=0; x<3; x++){
                System.out.print(lista[i][x] + " ");
            }
            System.out.println("");
        }
    }
    
}
