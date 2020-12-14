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
public class Dado {
    Random aleatorio;
    int max;
    int lado;
    
    public Dado (int max){
        this.aleatorio = new Random();
        this.max = max;
        this.lado = 1;
    }
    
    public int rolarDado (){
        return this.lado = this.aleatorio.nextInt(this.max) + 1;        
    }
    
}
