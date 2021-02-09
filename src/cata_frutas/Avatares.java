/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Avatares {
    Avatar[][] avatares;
    int m;
    
    public Avatares(int m){
        this.avatares = new Avatar[m][m];
    }
    
    public void posicionaAvatar(Avatar avatar){
        int i = avatar.getPosiçãoX();
        int j = avatar.getPosiçãoY();
        this.avatares[i][j] = avatar;
    }
    
    public boolean temAvatar(int x, int y){
        if (this.avatares[x][y] instanceof Avatar){
            return true;
        } else{
            return false;
        }
    }
    
    public void moveAvatar (Avatar avatar){
        String s = null;
        Scanner scanner = new Scanner(s);
        s = s.toString();
        
        
        
    }
    
}
