/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executapessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class Rica extends Pessoa{
    private double dinheiro;

    public Rica() {
    }

    public Rica(double dinheiro, String nome, int idade) {
        this.dinheiro = dinheiro;
        super.setNome(nome);
        super.setIdade(idade);
    }
    
    public void fazCompras(){
        double valorCompra = Double.valueOf(JOptionPane.showInputDialog(null, "Informe o valor da compra"));
        
        if(valorCompra > this.dinheiro)
            System.out.println("Compra não realizada, saldo insuficiente");
        else{
            this.dinheiro -= valorCompra;
            System.out.println("Compra realizada com sucesso! Saldo: " + this.getDinheiro());
        }
        
    }

    @Override
    public String toString() {
        return "Rica: " + super.getNome() + ", " + super.getIdade() + ", " + this.dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
    
    
}
