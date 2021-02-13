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
    int periodoFrutaArvore;//intervalo de turnos que a arvore derruba uma fruta
    String tipo;//especie de arvore

    public Arvore(int posiçãoX, int posiçãoY, int periodoFrutaArvore, String tipo) {
        super(posiçãoX, posiçãoY);
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
