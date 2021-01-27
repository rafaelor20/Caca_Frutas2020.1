/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author rafael
 */

public class Floresta {
    int tamanhoFloresta;
    Item[][] terreno; // tabuleiro para grama e pedras
    Arvore[][] arvores; // tabuleiro para arvores
    Avatar[][] avatares; // tabuleiro para avatares
    ArrayList<Fruta>[][] frutas; // tabuleiro para listas de frutas, acho que várias frutas podem ocupar uma mesma posição
    
    
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
        this.terreno = new Item[m][m];
        
    }
    
    public Item[][] inserirGP(Item item, int m){ //insere gramas e pedras em this.terreno
        int temp = 0;
        while (temp==0){
            int i = new Random().nextInt(m); //posicao x em this.terreno
            int j = new Random().nextInt(m); //posiçao y
            if (this.terreno[i][j]==null){
                this.terreno[i][j] = item;
                item.setPosiçãoX(i);
                item.setPosiçãoY(j);
                temp = 1;
            }        
        }        
        return this.terreno;
    }
    
    public void Gramado(int m){ //cria objetos Grama e os inserem em this.terreno
        int k = 0; //posicao x
        int j = 0; //posicao y
        int c = 1; //custoAgilidade
        for(int i=0; i<=(m*m)*0.75;i+=i){
            Grama grama = new Grama(true,k,j,c);
            inserirGP(grama, m);
        }
    }
    
    public void Pedras(int m){ //cria objetos Pedra e os inserem em this.terreno
        int k = 0; //posicao x
        int j = 0; //posicao y
        int c = 3; //custoAgilidade
        for(int i=0; i<=(m*m)*0.25;i+=i){
            Pedra pedra = new Pedra(true,k,j,c);
            inserirGP(pedra, m);
        }
    }
    
    public Arvore[][] inserirA(Arvore arvore, int m){ //insere obejtos Arvore em this.arvores
        int temp = 0;
        while (temp==0){
            int i = new Random().nextInt(m);//posicao x
            int j = new Random().nextInt(m);//posicao y
            if (this.terreno[i][j] instanceof Grama && this.arvores[i][j] == null){
                this.arvores[i][j] = arvore;
                arvore.setPosiçãoX(i);
                arvore.setPosiçãoY(j);
                temp = 1;
            }         
        }        
        return this.arvores;
    }
    
    
    
    public void Arvores(int m){ // cria objetos arvore
        String t = "";//especie de arvore
        int q = (int)((m*m)*0.75);//quantidade de arvores maxima
        int qr = new Random().nextInt(q);//randomiza quantidade de arvores, mas nao sei se isso vai ser necessario
        for(int j=0;j<=qr*0.05;){
            t = "coco";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.05;){
            t = "abacate";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.15;){
            t = "laranja";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "morango";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "amora";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "uva";
            Arvore arvore = new Arvore(true,0,0,0,t);
            inserirA(arvore, m);}  
    }
    
    public void Frutas(int m, String t){ //cria objetos fruta-nao-ouro, mas ainda não sei onde guardá-las para iniciar o jogo
        int k = 0;//posicao x
        int j = 0;//posicao y
        int q = (int)(((m*m)*0.75)*0.2);//limite da quant de frutas baseado na quant de gramas
        for(int i=0; i<=((((m*m)*0.75)*0.2)*(q*0.01))*0.7;i+=i){
            Fruta fruta = new Fruta(k,j,false,t,false);
        }
        for(int i=0; i<=((((m*m)*0.75)*0.2)*(q*0.01))*0.3;i+=i){
            Fruta fruta = new Fruta(k,j,false,t,true);
            }
    }
}
