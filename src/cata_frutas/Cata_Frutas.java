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
        Avatar avatar1 = new Avatar(0,0,"Avatar 1", 1,1,0,true);
        Avatar avatar2 = new Avatar(0,0,"Avatar 2", 1,1,0,true);
        Floresta floresta = new Floresta(9);
        Tabuleiro tabuleiro = new Tabuleiro();	
        tabuleiro.display();
        tabuleiro.Control();
               
    }
    
    
    
}
