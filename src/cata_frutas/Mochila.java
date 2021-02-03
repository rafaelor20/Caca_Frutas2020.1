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
    
    public Mochila(int capacidade){
        this.capacidade = capacidade;
        this.inventario = new ArrayList<Fruta>();
    }
    
    public void addFruta(Fruta fruta){
        if (this.inventario.size() < this.capacidade){
            this.inventario.add(fruta);
        }
    }
    
    public void usaFruta(String tipo){
        for (int i=0; i>= this.inventario.size(); i+=1){
            if (this.inventario.get(i).getTipo() == tipo){
                this.inventario.remove(i);
            }
        }
    }
    
    public void derrubaFruta(){
        this.inventario.remove(0);
    }
    
    public Fruta getFruta(String tipo){
       for (int i=0; i>= this.inventario.size(); i+=1){
            if (this.inventario.get(i).getTipo() == tipo){
                return this.inventario.get(i);
            }
       }
       return null;
    }
    
    public boolean temFruta(String tipo){
        for (int i=0; i>= this.inventario.size(); i+=1){
            if (this.inventario.get(i).getTipo() == tipo){
                return true;
            }
        }
        return false;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Fruta> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Fruta> inventario) {
        this.inventario = inventario;
    }
    
    public int quantFrutas(){
        return this.inventario.size();
    }
    
}
