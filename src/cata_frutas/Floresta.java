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

public class Floresta {
    int m;
    int arvore;
    int pedra;
    int grama;
    int[][] floresta;
    
    public void floresta(int m) {
        this.floresta = new int[m][m];
        this.grama = (m*m)/2;
        this.arvore = ((m*m)-grama)/2;
        this.pedra = (m*m)-(grama+arvore);
    }
    
    
    
    
}
