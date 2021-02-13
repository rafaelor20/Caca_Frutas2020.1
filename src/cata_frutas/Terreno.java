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
public class Terreno {
    Item[][] terreno;
    int tamanhoTerreno;
    
    public Terreno(int tamanhoTerreno){
        this.terreno = new Item[tamanhoTerreno][tamanhoTerreno];
        gramado(tamanhoTerreno);
        pedras(tamanhoTerreno);
    }    
    
    private void preencheGramado(Item item, int tamanhoTerreno){ 
        //insere gramas e pedras em this.terreno
        int temp = 0;
        while (temp==0){
            Random x = new Random();
            Random y = new Random();
            int r = x.nextInt(tamanhoTerreno); //posicao x em this.terreno
            int s = y.nextInt(tamanhoTerreno); //posiçao y em this.terreno
            if (this.terreno[r][s]==null){
                item.setPosiçãoX(r);
                item.setPosiçãoY(s);
                this.terreno[r][s] = item;
                temp = 1;
            }
        }
    }
    
    private void gramado(int tamanhoTerreno){ 
        //cria objetos Grama e os inserem em this.terreno
        int c = 1; //custoAgilidade
        for(int i=0; i<=((tamanhoTerreno*tamanhoTerreno)*0.75);i++){
            Grama grama = new Grama(0,0,c);
            preencheGramado(grama, tamanhoTerreno);
        }
    }
    
    private void poePedra(Pedra pedra){
        int x = pedra.getPosiçãoX();
        int y = pedra.getPosiçãoY();
        this.terreno[x][y] = pedra;
    }
    
    private void pedras(int tamanhoTerreno){ 
        /*cria objetos Pedra e os inserem nas posicoes de this.terreno
        que nao tem gramas*/
        int c = 3; //custoAgilidade
        for(int i=0; i<tamanhoTerreno;i++){
            for (int j=0;j<tamanhoTerreno;j++){
                if (this.terreno[i][j] == null){
                    Pedra pedra = new Pedra(i,j,c);
                    poePedra(pedra);
                }
            }
        }
    }
    
    public Item qualItem(int x, int y){
        //informa se a posicao esta ocupada por pedra ou grama
        return this.terreno[x][y];
    }

    public Item[][] getTerreno() {
        return this.terreno;
    }

    public void setTerreno(Item[][] terreno) {
        this.terreno = terreno;
    }
    
    
    
}
