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
public class Arvore extends Item{
    int periodoFrutaArvore;
    String tipo;

    public Arvore(boolean estatico, int posiçãoX, int posiçãoY, int periodoFrutaArvore, String tipo) {
        super(posiçãoX, posiçãoY, estatico);
        this.periodoFrutaArvore = periodoFrutaArvore;
        this.tipo = tipo;
    }

    public int getPeriodoFrutaArvore() {
        return periodoFrutaArvore;
    }

    public void setPeriodoFrutaArvore(int periodoFrutaArvore) {
        this.periodoFrutaArvore = periodoFrutaArvore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
