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
    boolean doente;

    public Avatar(int posiçãoX, int posiçãoY, boolean estatico, String Nome, int PForça, int PDefesa, int PAgilidade, int PVitoria, boolean doente) {
        super(posiçãoX, posiçãoY, estatico);
        this.Nome = Nome;
        this.PForça = PForça;
        this.PDefesa = PDefesa;
        this.PAgilidade = PAgilidade;
        this.PVitoria = PVitoria;
        this.doente = doente;
    }
}
