/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author professor
 */
public class Produto {
    private String descricao;
    private String un;
    private float Saldo;
    private float v_unit;
    private float subtotal;
    
    public Produto(){
        this.descricao = "Teste";
        this.un = "PC";
        this.subtotal = 0;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public void setV_unit(float v_unit) {
        this.v_unit = v_unit;
    }

    public void calculaSubtotal(){
        this.subtotal = this.Saldo * this.v_unit;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + 
                ", un=" + un + ", Saldo=" + Saldo + 
                ", v_unit=" + v_unit + ", subtotal=" + 
                subtotal + '}';
    }
    
    public static float soma(float a, float b){
        return a+b;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public float realizaVenda(float quantidade){
        if(this.Saldo <= quantidade){
            System.out.println("Saldo insuficiente!");
            return -1;
        }else{
            System.out.println("Venda Realizada!");
            this.Saldo -= quantidade;
            calculaSubtotal();
            return Saldo;
        }
    } 
}
