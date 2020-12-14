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
public class Fruta extends Item{
    String tipo;
    int força;
    int agilidade;
    int ouro;
    boolean antidoto;

    public Fruta(int posiçãoX, int posiçãoY, boolean estatico, String tipo){
        super(posiçãoX, posiçãoY, estatico);
        this.tipo = tipo;
        switch (this.tipo){
            case "maracuja":
                this.força = 1;
                this.agilidade = 1;
                this.ouro = 1;
                this.antidoto = false;
           
            case "coco":
                this.força = 1;
                this.agilidade = 2;
                this.ouro = 0;
                this.antidoto = false;
            
            case "abacate":
                this.força = 2;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "laranja":
                this.força = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = true;
            
            case "morango":
                this.força = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "amora":
                this.força = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "uva":
                this.força = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
        
        }
        this.estatico = false;
    }
}
