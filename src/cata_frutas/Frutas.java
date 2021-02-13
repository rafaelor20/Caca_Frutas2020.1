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
    int tamanhoFloresta;
    ArrayList<Fruta> listaInicialFrutas;//lista inicial para criacao das frutas
    int quantMaracuja; // >=3
    float quantAbacate; // quantFrutasFloresta/25
    float quantCoco; // quantFrutasFloresta/25
    float quantLaranja; // (quantFrutasFloresta/100)*15
    float quantMorango; // (quantFrutasFloresta/100)*15
    float quantAmora; //(quantFrutasFloresta/100)*15
    float quantUva;
    int quantBichadas; // (quantFrutasFloresta/100)*30 
    
    
    
    public Frutas(int tamanhoFloresta){
        this.tamanhoFloresta = tamanhoFloresta;
        this.quantMaracuja=3; // >=3
        this.quantAbacate=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.05); // quantFrutasFloresta/25
        this.quantCoco=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.15); // quantFrutasFloresta/25
        this.quantLaranja=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.15); // (quantFrutasFloresta/100)*15
        this.quantMorango=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.25); // (quantFrutasFloresta/100)*15
        this.quantAmora=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.25); //(quantFrutasFloresta/100)*15
        this.quantUva=(int)(((this.tamanhoFloresta*this.tamanhoFloresta)*0.20)*0.25);
        this.listaInicialFrutas = new ArrayList<Fruta>();
        this.quantBichadas = this.listaInicialFrutas.size();
        this.frutas = new ArrayList[this.tamanhoFloresta][this.tamanhoFloresta];criaArrayListFrutas(this.tamanhoFloresta);
        criaArrayListFrutas(this.tamanhoFloresta);
        espalhaFrutas();
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
    
    public void bichaFrutas(){
        /*Recebe um arraylist com frutas, e transforma parte dessas frutas
        //em frutas podres*/
        for (int i=0; i<this.listaInicialFrutas.size(); i++){
            this.listaInicialFrutas.get(i).setBichada(true);
        }
    }
    
    public ArrayList<Fruta> criaFrutas(){
        //cria objetos fruta, e os insere em uma lista inicial
        int i = 0;
        int j = 0;
        for (int k=0;k<this.quantCoco;k+=1){
            System.out.println("teste coco");
            Fruta coco = new Fruta(i,j,"coco",true);
            addListaInicialFrutas(coco);
        }
        for(int k=0;k<this.quantAbacate;k+=1){
            Fruta abacate = new Fruta(i,j,"abacate",true);
            addListaInicialFrutas(abacate);
        }
        for(int k=0;k<this.quantLaranja;k+=1){
            Fruta laranja = new Fruta(i,j,"laranja",true);
            addListaInicialFrutas(laranja);
        }
        
        for(int k=0;k<this.quantMorango;k+=1){
            Fruta morango = new Fruta(i,j,"morango",true);
            addListaInicialFrutas(morango);
        }
        
        for(int k=0;k<this.quantAmora;k+=1){
            Fruta amora = new Fruta(i,j,"amora",true);
            addListaInicialFrutas(amora);
        }
        
        for(int k=0;k<this.quantUva;k+=1){
            Fruta uva = new Fruta(i,j,"uva",true);
            addListaInicialFrutas(uva);
        }
        
        for(int k=0;k<this.quantMaracuja;k+=1){
            Fruta maracuja = new Fruta(i,j,"maracuja",true);
            addListaInicialFrutas(maracuja);
        }
        
        setQuantBichadas((int)(this.listaInicialFrutas.size()*0.3));
        bichaFrutas();
        return listaInicialFrutas;
    }
    
    public void espalhaFrutas(){
        //Recebe um arraylist de frutas, e as espalha sobre this.frutas 
        for (int k=0;k<this.listaInicialFrutas.size();k+=1){
            int i = new Random().nextInt(this.tamanhoFloresta);//posicao x
            int j = new Random().nextInt(this.tamanhoFloresta);//posicao y
            this.listaInicialFrutas.get(k).setPosiçãoX(i);
            this.listaInicialFrutas.get(k).setPosiçãoY(j);
            this.frutas[i][j].add(this.listaInicialFrutas.get(k));
        }    
    }
    
    public void insereFruta(Fruta fruta){
        //insere fruta caída no arraylist da posicao da fruta
        this.frutas[fruta.getPosiçãoX()][fruta.getPosiçãoY()].add(fruta);
    }

    public ArrayList<Fruta>[][] getFrutas() {
        return this.frutas;
    }

    public void setFrutas(ArrayList<Fruta>[][] frutas) {
        this.frutas = frutas;
    }

    public int getTamanhoFloresta() {
        return this.tamanhoFloresta;
    }

    public void setM(int tamanhoFloresta) {
        this.tamanhoFloresta= tamanhoFloresta;
    }

    public ArrayList<Fruta> getListaInicialFrutas() {
        return listaInicialFrutas;
    }

    public void setListaInicialFrutas(ArrayList<Fruta> listaInicialFrutas) {
        this.listaInicialFrutas = listaInicialFrutas;
    }

    public int getQuantMaracuja() {
        return quantMaracuja;
    }

    public void setQuantMaracuja(int quantMaracuja) {
        this.quantMaracuja = quantMaracuja;
    }

    public float getQuantAbacate() {
        return quantAbacate;
    }

    public void setQuantAbacate(float quantAbacate) {
        this.quantAbacate = quantAbacate;
    }

    public float getQuantCoco() {
        return quantCoco;
    }

    public void setQuantCoco(float quantCoco) {
        this.quantCoco = quantCoco;
    }

    public float getQuantLaranja() {
        return quantLaranja;
    }

    public void setQuantLaranja(float quantLaranja) {
        this.quantLaranja = quantLaranja;
    }

    public float getQuantMorango() {
        return quantMorango;
    }

    public void setQuantMorango(float quantMorango) {
        this.quantMorango = quantMorango;
    }

    public float getQuantAmora() {
        return quantAmora;
    }

    public void setQuantAmora(float quantAmora) {
        this.quantAmora = quantAmora;
    }

    public float getQuantUva() {
        return quantUva;
    }

    public void setQuantUva(float quantUva) {
        this.quantUva = quantUva;
    }

    public int getQuantBichadas() {
        return quantBichadas;
    }

    public void setQuantBichadas(int quantBichadas) {
        this.quantBichadas = quantBichadas;
    }
    
    
    
}
