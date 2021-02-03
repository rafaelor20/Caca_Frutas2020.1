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
public class Pedra extends Item{
    int custoPAgilidade;

    public Pedra(int posiçãoX, int posiçãoY, int custoPAgilidade) {
        super(posiçãoX, posiçãoY);
        this.custoPAgilidade = custoPAgilidade;
    }

    
    
}
