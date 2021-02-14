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
    int forcaEmpurrao; //empurrão = round(log2(f_a+1)) - round(log2(f_d+1))
    
    /**
     *
     */
    public Regras(){
        
    }
    
    
    public boolean Vitorioso(Avatar a, int frutasOuro){
        // frutasOuro==quantMaracuja
        if (a.getPVitoria()>=((frutasOuro/2)+1)){
            return true;
        } else{
            return false;
        }
    }
    
    public int calculoQuantFrutasEmpurrao(Avatar x, Avatar y){
        quantFrutasEmpurrao = Math.max(0, calculoEmpurrao(x,y));
        return quantFrutasEmpurrao;
    }
    
    public int calculoEmpurrao(Avatar x, Avatar y){
        int a = x.getPForça();
        int d = y.getPForça();
        forcaEmpurrao = (int)(Math.round(Math.log(a+1)) - Math.round(Math.log(d+1)));
        return forcaEmpurrao;
    }
    
}
