/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;
import java.util.ArrayList;
/**
 *
 * @author rafael
 */
public class Mochila {
    int capacidade; // total de frutas/3
    ArrayList<Fruta> inventario;
    
    public Mochila(int capacidade, ArrayList<Fruta> inventario){
        this.capacidade = capacidade;
        this.inventario = inventario;
    }
    
}
