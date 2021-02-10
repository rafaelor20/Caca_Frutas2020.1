package cata_frutas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame {
	ImageIcon  boneco = new ImageIcon(getClass().getResource("avat2.png"));
	JLabel Boneco = new JLabel(boneco);
	int x=0,y=0;
	
	
	public  Janela() {
		super("Cata-Fruta");
		JPanel painel = new JPanel();
		this.add(painel); 
		painel.setLayout(null); //tem que setar com o BOUNDS
		painel.add(Boneco);
		Boneco.setBounds(50,200,100,120);
		LayoutAtributos personagem1 = new LayoutAtributos();
		painel.add(personagem1);
		personagem1.setBounds(10,10,200,90);
		personagem1.setBackground(Color.yellow);
		
		Jogador jogador1 = new Jogador();
		jogador1.setNome("Di");
		personagem1.preencher(jogador1);
		

		
		
		LayoutAtributos personagem2 = new LayoutAtributos();
		painel.add(personagem2);
		personagem2.setBounds(10,110,200,90);
		personagem2.setBackground(Color.ORANGE);
		
		Jogador jogador2 = new Jogador();
		jogador2.setNome("Ji");
		personagem2.preencher(jogador2);
		
		
		
		JButton bttEmpurra = new JButton("Empurrar");
		bttEmpurra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Empurrou");
				
			}
		});
		
		painel.add(bttEmpurra);
		bttEmpurra.setBounds(15,325,90,35);
		
		
		/*
		LayoutAtributos personagem3 = new LayoutAtributos();
		personagem3.getNomePersonagem().setText("LL"); //metodo get para setar nome(exemplo)
		painel.add(personagem3);
		personagem3.setBounds(10,210,200,90);
		personagem3.setBackground(Color.BLUE);
		
		*/
	
		
		//JButton bttItens = new JButton("Itens");
		//JButton botao2 = new JButton("botao2");
		//painel.add(bttItens);
		//painel.add(botao2);		
		//bttItens.setBounds(10,320,75,35); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(150,35,550,455);
		this.setVisible(false);
		

		
		
		
		
		
	}
	

	//controle atraves do teclado
	public void Control() {
		
	addKeyListener((KeyListener) new KeyListener() {
			
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
				
				if(e.getKeyCode()==39 ) {
					
					x += 10;
					//direita
				}
				
				if(e.getKeyCode()==37) {
					
					x -= 10; 
					//esquerda
					
				}
				if(e.getKeyCode()==38) {
					
					
					y -= 10;
					//cima
				}
				
				if(e.getKeyCode()==40) {
					
					y += 10;
					//baixo
				}
				Boneco.setBounds(x,y,100,250);
				
				
				
			}
		});
		
	
	}
}
