package cata_frutas;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutAtributos extends JPanel {
	
	
	private JLabel nomePersonagem;
	private JLabel lblPForca;
	private JLabel qtPForca;
	
	private JLabel lblPAgi;
	private JLabel qtPAgi;
	
	public LayoutAtributos() {
		
		
		this.setLayout(null);

		//Adcionando no JPanel
		nomePersonagem = new JLabel("Nome: ");
		this.add(nomePersonagem);
		nomePersonagem.setBounds(10,10,50,25);
		
		lblPForca = new JLabel("Pontos de Força: ");
		this.add(lblPForca);
		lblPForca.setBounds(10,40,50,50);

		
		
		
	}
	
	
	
	public void preencher(Jogador jogador) {
		this.nomePersonagem.setText(jogador.getNome());
		
	}
	
	
	
	
	

	public JLabel getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(JLabel nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public JLabel getLblPForca() {
		return lblPForca;
	}

	public void setLblPForca(JLabel lblPForca) {
		this.lblPForca = lblPForca;
	}

	public JLabel getQtPForca() {
		return qtPForca;
	}

	public void setQtPForca(JLabel qtPForca) {
		this.qtPForca = qtPForca;
	}

	public JLabel getLblPAgi() {
		return lblPAgi;
	}

	public void setLblPAgi(JLabel lblPAgi) {
		this.lblPAgi = lblPAgi;
	}

	public JLabel getQtPAgi() {
		return qtPAgi;
	}

	public void setQtPAgi(JLabel qtPAgi) {
		this.qtPAgi = qtPAgi;
	}
	
	
	
	

}
