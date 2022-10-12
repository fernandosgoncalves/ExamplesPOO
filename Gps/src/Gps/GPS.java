package Gps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class GPS {
    private String idioma;
    private String rota;
    
    public GPS(){
    }
    
    public GPS(String rota){
        this.idioma = "Portugues";
        this.rota = rota;
    }

    public GPS(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "Idioma=" + idioma + ", Rota=" + rota;
    }
    
    
    
}
