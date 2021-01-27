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
public class Avatar extends Item{
    String Nome;
    int PForça;
    int PDefesa;
    int PAgilidade;
    int PVitoria;
    boolean saudavel;
    Mochila mochila;
    

    public Avatar(int posiçãoX, int posiçãoY, boolean estatico, String Nome, int PForça, int PDefesa, int PAgilidade, int PVitoria, boolean saudavel) {
        super(posiçãoX, posiçãoY, estatico);
        this.Nome = Nome;
        this.PForça = PForça;
        this.PDefesa = PDefesa;
        this.PAgilidade = PAgilidade;
        this.PVitoria = PVitoria;
        this.saudavel = saudavel;
        this.mochila = new Mochila(9);
    }
    
    public void usarFruta(String tipo){
        if (this.mochila.temFruta(tipo) == true){
            this.PForça = this.mochila.getFruta(tipo).getForça() * PForça;
            this.PAgilidade = this.mochila.getFruta(tipo).getAgilidade() * PAgilidade;
            this.PVitoria = this.mochila.getFruta(tipo).getOuro() + PVitoria;
            this.saudavel = this.mochila.getFruta(tipo).getAntidoto() || this.saudavel;
            this.mochila.removeFruta(tipo);
        }
    }
}
