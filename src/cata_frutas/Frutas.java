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
public class Frutas {
    ArrayList<Fruta>[][] frutas;
    int m;
    ArrayList<Fruta> listaInicialFrutas;//lista inicial para criacao das frutas
    int quantMaracuja; // >=3
    float quantAbacate; // quantFrutasFloresta/25
    float quantCoco; // quantFrutasFloresta/25
    float quantLaranja; // (quantFrutasFloresta/100)*15
    float quantMorango; // (quantFrutasFloresta/100)*15
    float quantAmora; //(quantFrutasFloresta/100)*15
    float quantUva;
    int quantBichadas; // (quantFrutasFloresta/100)*30 
    
    
    
    public Frutas(int m){
        this.quantMaracuja=3; // >=3
        this.quantAbacate=(int)(((m*m)*0.20)*0.05); // quantFrutasFloresta/25
        this.quantCoco=(int)(((m*m)*0.20)*0.15); // quantFrutasFloresta/25
        this.quantLaranja=(int)(((m*m)*0.20)*0.15); // (quantFrutasFloresta/100)*15
        this.quantMorango=(int)(((m*m)*0.20)*0.25); // (quantFrutasFloresta/100)*15
        this.quantAmora=(int)(((m*m)*0.20)*0.25); //(quantFrutasFloresta/100)*15
        this.quantUva=(int)(((m*m)*0.20)*0.25);
        this.listaInicialFrutas = new ArrayList<Fruta>();
        this.frutas = new ArrayList[m][m];criaArrayListFrutas(m);
        criaArrayListFrutas(m);
        espalhaFrutas(criaFrutas( m, this.quantCoco, this.quantAbacate, this.quantLaranja, 
                this.quantMorango, this.quantAmora, this.quantUva, this.quantMaracuja), m);
    }
    
    public void criaArrayListFrutas(int m){
        /*cria arraylists em que as frutas serao depositadas de acordo com a
          sua psicao*/
        for (int i=0;i<m;i+=1){
            for(int j=0;j<m;j+=1){
                this.frutas[i][j] = new ArrayList<Fruta>();
            }
        }
    }
    
    public void addListaInicialFrutas(Fruta fruta){
        /*add fruta para lista inicial que é usada antes de espalhar as
          as frutas pelo em this.frutas*/
        this.listaInicialFrutas.add(fruta);
    }
    
    public void bichaFrutas(ArrayList<Fruta> frutas, int q){
        /*Recebe um arraylist com frutas, e transforma parte dessas frutas
        //em frutas podres*/
        for (int i=0;i<q;i++){
            frutas.get(i).setBichada(true);
        }
    }
    
    public ArrayList<Fruta> criaFrutas(int m, float quantCoco,
        float quantAbacate, float quantLaranja, float quantMorango, 
        float quantAmora, float quantUva, int quantMaracuja){
        //cria objetos fruta, e os insere em uma lista inicial
        int i = 0;
        int j = 0;
        for (int k=0;k<((m*m)*quantCoco);k+=1){
            System.out.println("teste coco");
            Fruta coco = new Fruta(i,j,"coco",true);
            addListaInicialFrutas(coco);
        }
        for(int k=0;k<((m*m)*quantAbacate);k+=1){
            Fruta abacate = new Fruta(i,j,"abacate",true);
            addListaInicialFrutas(abacate);
        }
        for(int k=0;k<((m*m)*quantLaranja);k+=1){
            Fruta laranja = new Fruta(i,j,"laranja",true);
            addListaInicialFrutas(laranja);
        }
        
        for(int k=0;k<((m*m)*quantMorango);k+=1){
            Fruta morango = new Fruta(i,j,"morango",true);
            addListaInicialFrutas(morango);
        }
        
        for(int k=0;k<((m*m)*quantAmora);k+=1){
            Fruta amora = new Fruta(i,j,"amora",true);
            addListaInicialFrutas(amora);
        }
        
        for(int k=0;k<((m*m)*quantUva);k+=1){
            Fruta uva = new Fruta(i,j,"uva",true);
            addListaInicialFrutas(uva);
        }
        
        for(int k=0;k<quantMaracuja;k+=1){
            Fruta maracuja = new Fruta(i,j,"maracuja",true);
            addListaInicialFrutas(maracuja);
        }
        
        quantBichadas = (int)((m*m)*0.3);
        bichaFrutas(this.listaInicialFrutas, quantBichadas);
        return listaInicialFrutas;
    }
    
    public void espalhaFrutas(ArrayList<Fruta> frutas, int m){
        //Recebe um arraylist de frutas, e as espalha sobre this.frutas 
        for (int k=0;k<frutas.size();k+=1){
            int i = new Random().nextInt(m);//posicao x
            int j = new Random().nextInt(m);//posicao y
            frutas.get(k).setPosiçãoX(i);
            frutas.get(k).setPosiçãoY(j);
            this.frutas[i][j].add(frutas.get(k));
        }    
    }
    
    public void insereFruta(Fruta fruta){
        //insere fruta caída no arraylist da posicao da fruta
        this.frutas[fruta.getPosiçãoX()][fruta.getPosiçãoY()].add(fruta);
    }
    
}
