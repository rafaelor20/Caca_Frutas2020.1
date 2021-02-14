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
public class Cata_Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Floresta floresta = new Floresta(12);
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.Control();
        tabuleiro.display();
        Janela j = new Janela();
        j.Control();
    }
}
