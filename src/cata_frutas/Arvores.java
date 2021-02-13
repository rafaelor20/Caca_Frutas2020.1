/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

import java.util.Random;

/**
 *
 * @author rafael
 */
public class Arvores {
    Arvore[][] arvores;//matriz de posições para objetos arvore
    int m;//tamanho da matriz
    
    public Arvores(int m){
        this.arvores = new Arvore[m][m];
        Arvores(m);
    }
    
    
    
    public void Arvores(int p){ // cria objetos arvore
        String t = "";//especie de arvore
        Random x = new Random();
        Random y = new Random();
        int i = x.nextInt(p); //posicao x em this.terreno
        int j = y.nextInt(p); //posiçao y em this.terreno
        t = "coco";
        Arvore arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
        x = new Random();
        y = new Random();
        i = x.nextInt(p); //posicao x em this.terreno
        j = y.nextInt(p); //posiçao y em this.terreno
        t = "abacate";
        arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
        x = new Random();
        y = new Random();
        i = x.nextInt(p); //posicao x em this.terreno
        j = y.nextInt(p); //posiçao y em this.terreno
        t = "laranja";
        arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
        x = new Random();
        y = new Random();
        i = x.nextInt(p); //posicao x em this.terreno
        j = y.nextInt(p); //posiçao y em this.terreno
        t = "morango";
        arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
        x = new Random();
        y = new Random();
        i = x.nextInt(p); //posicao x em this.terreno
        j = y.nextInt(p); //posiçao y em this.terreno
        t = "amora";
        arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
        x = new Random();
        y = new Random();
        i = x.nextInt(p); //posicao x em this.terreno
        j = y.nextInt(p); //posiçao y em this.terreno
        t = "uva";
        arvore = new Arvore(i,j,p,t);
        insereArvore(arvore);
    }
    
    
    
    public void insereArvore(Arvore arvore){ 
        //insere obejtos Arvore em this.arvores
        int i = arvore.getPosiçãoX();
        int j = arvore.getPosiçãoY();
        this.arvores[i][j] = arvore;        
    }
    
    public void removeArvore(Arvore arvore){
        //remove obejtos Arvore em this.arvores
        int i = arvore.getPosiçãoX();
        int j = arvore.getPosiçãoY();
        this.arvores[i][j] = null;   
    }
    
    public boolean temArvore(int x, int y){
        //verifica se existe arvore na posicao
        if (this.arvores[x][y] instanceof Arvore){
            return true;
        } else{
            return false;
        }
    }
    
    public Arvore getArvore(int x, int y) {
        return this.arvores[x][y];
    }

    public Arvore[][] getArvores() {
        return this.arvores;
    }

    public void setArvores(Arvore[][] arvores) {
        this.arvores = arvores;
    }   
}
