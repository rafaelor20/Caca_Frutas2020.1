/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;
import java.util.ArrayList;
/**
 *
 * @author rafael
 */

public class Floresta {
    int tamanhoFloresta;
    Item[][] floresta;
    ArrayList<ArrayList<ArrayList<Item>>> itensDinamicos;
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
        this.floresta = new Item[m][m];
        
    }
    
    public Item[][] inserirItem(Item item){
        int k = 0;
        int j = 0;
        int temp = 0;
        while (temp==0){
            if (this.floresta[k][j]==null){
                this.floresta[k][j] = item;
                item.setPosiçãoX(k);
                item.setPosiçãoY(j);
                temp = 1;
            } 
            else {
                if (j>this.floresta[k].length){
                    k+=k;
                }
            }         
        }        
        return this.floresta;
    }
    
    public void Gramado(int m){
        int k = 0;
        int j = 0;
        int c = 1;
        for(int i=0; i<=(m*m)*0.75;i+=i){
            Grama grama = new Grama(true,k,j,c);
            inserirItem(grama);
        }
    }
    
    public void Pedras(int m){
        int k = 0;
        int j = 0;
        int c = 3;
        for(int i=0; i<=(m*m)*0.25;i+=i){
            Pedra pedra = new Pedra(true,k,j,c);
            inserirItem(pedra);
        }
    }
    
    public void Arvores(int m){
        int k = 0;
        int j = 0;
        int p = 1;
        String t = "";
        for(int i=0; i<=(m*m)*0.25;i+=i){
            Arvore arvore = new Arvore(true,k,j,p,t);
        }
    }
    
    
    
    
}
