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
    int tamanhoFloresta;
    int[][] floresta;
    int quantArvores; // <= quantGrama
    int quantPedras; // m/4
    int quantGrama; // m-quantPedras
    int quantFrutasFloresta; // quantGrama/5
    int quantMaracuja; // >=3
    int quantAbacate; // quantFrutasFloresta/25
    int quantCoco; // quantFrutasFloresta/25
    int quantLaranja; // (quantFrutasFloresta/100)*15
    int quantMorango; // (quantFrutasFloresta/100)*15
    int quantAmora; //(quantFrutasFloresta/100)*15
    int quantBichadas; // (quantFrutasFloresta/100)*30 
    
    
    public Floresta(int m) {
        this.floresta = new int[m][m];
    }
    
    
    
    
}
