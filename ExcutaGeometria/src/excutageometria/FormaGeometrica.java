/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excutageometria;

/**
 *
 * @author professor
 */
public class FormaGeometrica {
    private int tipo; //0 - Quadrado 1 - Retangulo 2 - Triangulo 3 - Circulo
    private int nLados;
    private int raio;
    private int[] lados;

    public FormaGeometrica(int tipo) {
        this.tipo = tipo;
        this.lados = new int[2];
    }

    public void getTipo() {
        switch(this.tipo){
            case 0:
                //Quadrado
                System.out.println("É um quadrado");
                System.out.println("Número de lados 1");
            break;
            case 1:
                //Retangulo
                System.out.println("É um retângulo");
                System.out.println("Número de lados 2");
            break;
            case 2:
                //Triangulo
                System.out.println("É um Triângulo");
            break;
            case 3:
                //Circulo
                System.out.println("É um circulo");
            break;
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int[] getLados() {
        return lados;
    }

    public void setLados(int[] lados) {
        this.lados = lados;
    }
    
    public float getArea(){
        float area = 0;
        switch(this.tipo){
            case 0:
                //Quadrado
                area = this.lados[0] * this.lados[0];
            break;
            case 1:
                //Retangulo
                area = this.lados[0] * this.lados[1];
            break;
            case 2:
                //Triangulo
                area = (this.lados[0] * this.lados[1])/2;
            break;
            case 3:
                //Circulo
                area = (float) (3.14 * Math.pow(this.raio, 2)); 
            break;
        }
        
        return area;
    }
    
    public float getPerimetro(){
        float perimetro = 0;
        switch(this.tipo){
            case 0:
                //Quadrado
                perimetro = this.lados[0] + this.lados[0] + this.lados[0] + this.lados[0];
            break;
            case 1:
                //Retangulo
                perimetro = this.lados[0] + this.lados[1] + this.lados[0] + this.lados[1];
            break;
            case 2:
                //Triangulo
                perimetro = this.lados[0] * 3;
            break;
            case 3:
                //Circulo
                perimetro = (float) (2 * 3.14 * this.raio); 
            break;
        }
        
        return perimetro;
    }
}
