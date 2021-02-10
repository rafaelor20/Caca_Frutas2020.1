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
public class Avatar extends Item{
    String Nome;
    int PForça;
    int PDefesa;
    int PAgilidade;
    int PVitoria;
    boolean saudavel;
    Mochila mochila;
    

    public Avatar(int posiçãoX, int posiçãoY, String Nome, int PForça, int PAgilidade, int PVitoria, boolean saudavel) {
        super(posiçãoX, posiçãoY);
        this.Nome = Nome;
        this.PForça = PForça;
        this.PAgilidade = PAgilidade;
        this.PVitoria = PVitoria;
        this.saudavel = saudavel;
        this.mochila = new Mochila(9);
    }
    





	public void usarFruta(String tipo){ //usa determinado tipo de fruta
        if (this.mochila.temFruta(tipo) == true){
            this.PForça = this.mochila.getFruta(tipo).getForça() * PForça;
            this.PAgilidade = this.mochila.getFruta(tipo).getAgilidade() * PAgilidade;
            this.PVitoria = this.mochila.getFruta(tipo).getOuro() + PVitoria;
            this.saudavel = this.mochila.getFruta(tipo).getAntidoto() || this.saudavel;
            this.mochila.usaFruta(tipo);
        }
    }
    
    public void derrubaFrutas(int f){ //Derruba Frutas caso seja vitima de um empurrao
        for(int i=0;i<f;i+=1){
            this.mochila.derrubaFruta();
        }
    }
    
    public void definePForça(){
        this.PForça = this.mochila.quantFrutas();
    }
    
    public void moverParaEsquerda(){
        setPosiçãoX(this.posiçãoX - 1 );
    }
    
    public void moverParaDireita(){
        setPosiçãoX(this.posiçãoX + 1 );
    }
    
    public void moverParaCima(){
        setPosiçãoY(this.posiçãoY - 1 );
    }
    
    public void moverParaBaixo(){
        setPosiçãoY(this.posiçãoY + 1 );
    }
    
    
    
    
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getPForça() {
        return PForça;
    }

    public void setPForça(int PForça) {
        this.PForça = PForça;
    }

    public int getPDefesa() {
        return PDefesa;
    }

    public void setPDefesa(int PDefesa) {
        this.PDefesa = PDefesa;
    }

    public int getPAgilidade() {
        return PAgilidade;
    }

    public void setPAgilidade(int PAgilidade) {
        this.PAgilidade = PAgilidade;
    }

    public int getPVitoria() {
        return PVitoria;
    }

    public void setPVitoria(int PVitoria) {
        this.PVitoria = PVitoria;
    }

    public boolean isSaudavel() {
        return saudavel;
    }

    public void setSaudavel(boolean saudavel) {
        this.saudavel = saudavel;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
}
