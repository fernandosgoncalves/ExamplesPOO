/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaotrabalho;

/**
 *
 * @author professor
 */
public class Lista {
    private int[] a;
    private int[] b;
    private int[] c;
    private int[] d;

    public Lista() {
        a = new int[15];
        b = new int[15];
        c = new int[15];
        d = new int[15];
    }
    
    public void inicializaArrays(){
        for(int i=0; i<15; i++){
            a[i] = (int) (Math.random()*100);
            b[i] = (int) (Math.random()*100);
        }
    }
    
    public int totalPares(int codigo){
        int total = 0;
        switch(codigo){
            case 0:
                //A
                total = verificaPares(a);
            break;
            case 1:
                //B
                total = verificaPares(b);
            break;
            case 2:
                //C
                total = verificaPares(c);
            break;
            case 3:
                //D
                total = verificaPares(d);
            break;
        }
        
        return total;
    }
    
    public int verificaPares(int[] lista){
        int contador = 0;
        
        for(int i=0; i<15; i++){
            if((lista[i]%2) == 0)
                contador++;
        }
        
        return contador;
    }
    
    public void mostraDados(int codigo){
        switch(codigo){
            case 0:
                //A
                System.out.println("Vetor A");
                listaValores(a);
            break;
            case 1:
                //B
                System.out.println("Vetor B");
                listaValores(b);
            break;
            case 2:
                //C
                System.out.println("Vetor C");
                listaValores(c);
            break;
            case 3:
                //D
                System.out.println("Vetor D");
                listaValores(d);
            break;
        }
    }
    
    private void listaValores(int[] lista){
        System.out.print("[");
        for(int i=0; i<15; i++)
            System.out.print(lista[i] + ", ");
        
        System.out.println("]");
    }
    
    public int maiorValor(int codigo){
        int valor = 0;
        switch(codigo){
            case 0:
                //A
                System.out.println("Maior valor Vetor A");
                valor = buscaMaior(a);
            break;
            case 1:
                //B
                System.out.println("Maior valor Vetor B");
                valor = buscaMaior(b);
            break;
            case 2:
                //C
                System.out.println("Maior valor Vetor C");
                valor = buscaMaior(c);
            break;
            case 3:
                //D
                System.out.println("Maior valor Vetor D");
                valor = buscaMaior(d);
            break;
        }
        
        return valor;
    }
    
    private int buscaMaior(int[] lista){
        int maior = 0;
        maior = lista[0];
        for(int i=1; i<15; i++){
            if(lista[i] > maior)
                maior = lista[i];
        }
                    
        return maior;
    }
    
    public int totalIguais(int codA, int codB){
        if(codA == 0 && codB == 1){
            return comparaVetores(a, b);
        }else{
            if(codA == 0 && codB == 2){
                return comparaVetores(a, c);
            }else{
                if(codA == 0 && codB == 2){
                    return comparaVetores(a, d);
                }else{
                    if(codA == 1 && codB == 2){
                        return comparaVetores(b, c);
                    }else{
                        if(codA == 1 && codB == 3){
                            return comparaVetores(b, d);
                        } else{
                            return comparaVetores(c, d);
                        }
                    }
                }
            }
        }
    }
    
    private int comparaVetores(int[] x, int[] y){
        int totalIguais = 0;
        
        for(int i= 0; i<15; i++){
            totalIguais += buscaValor(x[i], y);
        }
        
        return totalIguais;
    }
    
    private int buscaValor(int x, int[] lista){
        for(int i= 0; i<15; i++){
            if(lista[i] == x){
                return 1;
            }
        }
        return 0;
    }
    
    public void multiplicaArrays(){
        for(int i=0; i<15; i++){
            c[i] = a[i] * b[i];
        }
        mostraDados(2);
    }
    
}
