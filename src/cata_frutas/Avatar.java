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
public class Avatar {
    String Nome;
    int força;
    int agilidade;
    int pontos;
    boolean doente;
    
    public void avatar(String Nome, int força, int agilidade, int pontos, boolean doente){
        this.Nome = Nome;
        this.força = força;
        this.agilidade = agilidade;
        this.pontos = pontos;
        this.doente = doente;
    }
}
