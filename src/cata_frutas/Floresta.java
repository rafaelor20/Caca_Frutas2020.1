/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author rafael
 */

public class Floresta {
    
    Item[][] terreno; // tabuleiro para grama e pedras
    Arvore[][] arvores; // tabuleiro para arvores
    Avatar[][] avatares; // tabuleiro para avatares
    ArrayList<Fruta>[][] frutas;/* tabuleiro para listas de frutas, permitindo 
                                   que várias frutas ocupem uma mesma posição*/
    
    int tamanhoFloresta;
    float quantArvores; // <= quantGrama
    float quantPedras; // m/4
    float quantGrama; // m-quantPedras
    float quantFrutasFloresta; // quantGrama/5
    ArrayList<Fruta> listaInicialFrutas;//lista inicial para criacao das frutas
    int quantMaracuja; // >=3
    float quantAbacate; // quantFrutasFloresta/25
    float quantCoco; // quantFrutasFloresta/25
    float quantLaranja; // (quantFrutasFloresta/100)*15
    float quantMorango; // (quantFrutasFloresta/100)*15
    float quantAmora; //(quantFrutasFloresta/100)*15
    float quantUva;
    int quantBichadas; // (quantFrutasFloresta/100)*30 
    
    
    public Floresta(int m) {
        this.terreno = new Item[m][m];
        this.arvores = new Arvore[m][m];
        this.avatares = new Avatar[m][m];
        this.frutas = new ArrayList[m][m];
        
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
            Grama grama = new Grama(k,j,c);
            inserirGP(grama, m);
        }
    }
    
    public void Pedras(int m){ //cria objetos Pedra e os inserem em this.terreno
        int k = 0; //posicao x
        int j = 0; //posicao y
        int c = 3; //custoAgilidade
        for(int i=0; i<=(m*m)*0.25;i+=i){
            Pedra pedra = new Pedra(k,j,c);
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
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.05;){
            t = "abacate";
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.15;){
            t = "laranja";
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "morango";
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "amora";
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}
        for(int j=0;j<=qr*0.25;){
            t = "uva";
            Arvore arvore = new Arvore(0,0,0,t);
            inserirA(arvore, m);}  
    }
    
    public void CriaArrayListFrutas(int m){
        for (int i=0;i<=m;i+=1){
            for(int j=0;j<=m;j+=1){
                this.frutas[i][j] = new ArrayList<Fruta>();
            }
        }
    }
    
    public void addListaInicialFrutas(Fruta fruta){
        //add fruta para lista inicial
        listaInicialFrutas.add(fruta);
    }
    
    public void bichaFrutas(ArrayList<Fruta> frutas, int m){
        //Torna a fruta podre
        for (int i=0;i<=m;i+=1){
            frutas.get(i).setBichada(true);
        }
    }
    
    public ArrayList<Fruta> criaFrutas(int m, int ouro, float quantCoco,
        float quantAbacate, float quantLaranja, float quantMorango, 
        float quantAmora, float quantUva, int quantMaracuja){
        //cria objetos fruta, e os insere na lista inicial
        int i = 0;
        int j = 0;
        for (int k=0;k<=((m*m)*quantCoco);k+=1){
            Fruta coco = new Fruta(i,j,"coco",true);
            addListaInicialFrutas(coco);
        }
        for(int k=0;k<=((m*m)*quantAbacate);k+=1){
            Fruta abacate = new Fruta(i,j,"abacate",true);
            addListaInicialFrutas(abacate);
        }
        for(int k=0;k<=((m*m)*quantLaranja);k+=1){
            Fruta laranja = new Fruta(i,j,"laranja",true);
            addListaInicialFrutas(laranja);
        }
        
        for(int k=0;k<=((m*m)*quantMorango);k+=1){
            Fruta morango = new Fruta(i,j,"morango",true);
            addListaInicialFrutas(morango);
        }
        
        for(int k=0;k<=((m*m)*quantAmora);k+=1){
            Fruta amora = new Fruta(i,j,"amora",true);
            addListaInicialFrutas(amora);
        }
        
        for(int k=0;k<=((m*m)*quantUva);k+=1){
            Fruta uva = new Fruta(i,j,"uva",true);
            addListaInicialFrutas(uva);
        }
        
        for(int k=0;k<=((m*m)*quantMaracuja);k+=1){
            Fruta maracuja = new Fruta(i,j,"maracuja",true);
            addListaInicialFrutas(maracuja);
        }
        
        quantBichadas = (int)((m*m)*0.3);
        bichaFrutas(listaInicialFrutas, (int) quantBichadas);
        Collections.shuffle(listaInicialFrutas);
        return listaInicialFrutas;
    }
    
    public void inserirFrutas(ArrayList<Fruta> frutas, int m){
        for (int k=0;k<=frutas.size();k+=1){
            int i = new Random().nextInt(m);//posicao x
            int j = new Random().nextInt(m);//posicao y
            this.frutas[i][j].add(frutas.get(k));
        }    
    }
    
}
