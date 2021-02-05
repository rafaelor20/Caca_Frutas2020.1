package cata_frutas;
/**
*
* @author joao
*/
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tabuleiro extends JFrame {

	int x =0 , y=0;
	
	ImageIcon img = new ImageIcon(getClass().getResource("")); //faz a classe pegar a imagem
	JLabel foto = new JLabel(img);  //add imagem na label
	
	
	public void Control() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode()); //saida no console
				if(e.getKeyCode()==39) {
					//direita
				}
				
				if(e.getKeyCode()==37) {
					//esquerda
					
				}
				if(e.getKeyCode()==38) {
					//cima
				}
				
				if(e.getKeyCode()==40) {
					//baixo
				}
				
			}
		});
	}
}
