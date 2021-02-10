/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

import java.util.*;
/**
 *
 * @author rafael
 */

public class Floresta {
    
    Terreno terreno; // tabuleiro para grama e pedras
    Arvores arvores; // tabuleiro para arvores
    Avatares avatares; // tabuleiro para avatares
    Frutas frutas;/* tabuleiro para listas de frutas, permitindo 
                                   que várias frutas ocupem uma mesma posição*/    
    int tamanhoFloresta;
    float quantArvores; // <= quantGrama
    float quantPedras; // m/4
    float quantGrama; // m-quantPedras
    float quantFrutasFloresta; // quantGrama/5
    
    
    
    public Floresta(int tamanhoFloresta) {
        this.tamanhoFloresta = tamanhoFloresta;
        this.terreno = new Terreno(tamanhoFloresta);
        this.arvores = new Arvores(tamanhoFloresta);
        this.avatares = new Avatares(tamanhoFloresta);
        this.frutas = new Frutas(tamanhoFloresta);
        checaAvoresPedras();
    }
    
    private void checaAvoresPedras(){ 
        //verifica se há arvores sobre pedras
        int x = 0;
        int y = 0;
        for (int i=0;i>=this.tamanhoFloresta;i+=1){
            for(int j=0;j>=this.tamanhoFloresta;j+=1){
                if (this.terreno.qualItem(i,j) instanceof Pedra || 
                                        this.arvores.temArvore(i,j)){
                    checaArvorePedra(this.arvores.getArvore(i, j));
                }
            }
        }      
    }
    
    private void checaArvorePedra(Arvore arvore){
        //verifica se a arvore está encima de uma pedra
        int x = arvore.getPosiçãoX();
        int y = arvore.getPosiçãoY();
        if (this.terreno.qualItem(x,y) instanceof Pedra){
            x= new Random().nextInt(this.tamanhoFloresta);//posicao x
            y= new Random().nextInt(this.tamanhoFloresta);//posicao y
            arvore.setPosiçãoX(x);
            arvore.setPosiçãoY(y);
            checaArvorePedra(arvore);
        } else{
        this.arvores.insereArvore(arvore);
        }
    }
    
    public void inserirAvatar(Avatar avatar, int m){
        //insere obejto Avatar em this.avatares em posicao aleatoria
        int temp = 0;
        while (temp==0){
            int i = new Random().nextInt(m);//posicao x
            int j = new Random().nextInt(m);//posicao y
            if (this.terreno.qualItem(j,j) instanceof Grama ||  !(this.avatares.temAvatar(i,j))){
                avatar.setPosiçãoX(i);
                avatar.setPosiçãoY(j);
                this.avatares.posicionaAvatar(avatar);
                temp = 1;
            }
        }
    }
}