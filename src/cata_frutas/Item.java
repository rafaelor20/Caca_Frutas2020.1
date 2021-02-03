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
public class Item {
    int posiçãoX;
    int posiçãoY;

    public Item(int posiçãoX, int posiçãoY) {
        this.posiçãoX = posiçãoX;
        this.posiçãoY = posiçãoY;
    }

    public int getPosiçãoX() {
        return posiçãoX;
    }

    public void setPosiçãoX(int posiçãoX) {
        this.posiçãoX = posiçãoX;
    }

    public int getPosiçãoY() {
        return posiçãoY;
    }

    public void setPosiçãoY(int posiçãoY) {
        this.posiçãoY = posiçãoY;
    }
    
}
