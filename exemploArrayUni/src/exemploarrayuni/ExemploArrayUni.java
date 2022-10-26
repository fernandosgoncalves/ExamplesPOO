package exemploarrayuni;

import java.text.DecimalFormat;
import java.util.Arrays;
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
        
        float[] notas = {8.5f, 4.33f, 8.42f, 99.54f};
        String[] alunos = {"João", "Maria", "Pedro", "Luiza"};
        String nome, mensagem; 
                
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
        
        for(int i=0; i<4; i++){
            System.out.println("Aluno:" + alunos[i] + " - Nota: " + notas[i]);
        }
        
        Arrays.sort(alunos);
        
        for(int i=0; i<4; i++){
            System.out.println(alunos[i]);
        }
        
        
        //Busca em array
        nome = JOptionPane.showInputDialog("Informe um nome");
        mensagem = "Não encontrado";
        
        for(String valor: alunos){
            if(valor.equalsIgnoreCase(nome)){
                mensagem = "Aluno encontrado!";
                break;
            }
        }
        
        System.out.println(mensagem);
        
        
    }
    
}
