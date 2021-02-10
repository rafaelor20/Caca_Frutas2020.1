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
public class Jogador {
    private String Nome;
    private int quantVitorias;
    public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getQuantVitorias() {
		return quantVitorias;
	}
	public void setQuantVitorias(int quantVitorias) {
		this.quantVitorias = quantVitorias;
	}
	public Avatar getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Avatar personagem) {
		this.personagem = personagem;
	}
	Avatar personagem; //a cada partida jogador pode usar um avatar diferente
}
