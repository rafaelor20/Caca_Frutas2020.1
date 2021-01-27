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
public class Regras {
    boolean vitoria; // (quantMaracuja/2)+1
    int quantFrutasEmpurrao; //quantidade de frutas = max(0, empurrao​)
    int calculoEmpurrao; //empurrão = round(log2(f_a+1)) - round(log2(f_d+1))
    
    public int calculoEmpurrao(int a, int d){
        calculoEmpurrao = (int)(Math.round(Math.log(a+1)) - Math.round(Math.log(d+1)));
        return calculoEmpurrao;
    }
    
    public int calculoQuantFrutasEmpurrao(int a, int d){
        quantFrutasEmpurrao = Math.max(0, calculoEmpurrao(a,d));
        return quantFrutasEmpurrao;
    }
}
