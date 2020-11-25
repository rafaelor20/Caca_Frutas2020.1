/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

/**
 *
 * @author rafael
 */
public class Fruta {
    String tipo;
    int força;
    int agilidade;
    int pontos;
    boolean antidoto;

    public void fruta(String tipo){
        this.tipo = tipo;
        switch (this.tipo){
            case "maracuja":
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 1;
            this.antidoto = false;
           
            case "coco":
            this.força = 1;
            this.agilidade = 2;
            this.pontos = 0;
            this.antidoto = false;
            
            case "abacate":
            this.força = 2;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = false;
            
            case "laranja":
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = true;
            
            case "morango":
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = false;
            
            case "amora":
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = false;
            
            case "uva":
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = false;
            
            case default:
            this.força = 1;
            this.agilidade = 1;
            this.pontos = 0;
            this.antidoto = false;
        }
    }
}
