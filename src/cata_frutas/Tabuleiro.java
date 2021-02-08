package cata_frutas;
import java.awt.Color;
/**
*
* @author joao
*/
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tabuleiro extends JFrame {

	int x =0 , y=0;
	
	ImageIcon  img  = new ImageIcon(getClass().getResource("back.jpg"));
	ImageIcon  boneco = new ImageIcon(getClass().getResource("avat2.png"));
	ImageIcon pedra = new ImageIcon(getClass().getResource("peda.png"));
	ImageIcon morango = new ImageIcon(getClass().getResource("moran.png"));

	
	JLabel foto = new JLabel(img);
	JLabel Boneco = new JLabel(boneco);
	JLabel Pedra [] [] = new JLabel [5] [5];
	JLabel Morango [] [] = new JLabel [5] [5];
	
	char mapa[][] = {
			{' ','r',' ',' ',' '},
			{' ',' ','r',' ',' '},
			{' ',' ',' ',' ',' '},
			{' ','r',' ',' ',' '},
			{' ',' ',' ','r',' '},
			
	};
	
	
	
	public void display() {
		setTitle("Caça Frutas");		
		foto.setBounds(0,0,800,600);
		for (int i =0 ; i<5;i++) {
			
			for(int j= 0; j<5;j++) {
				if(mapa[j][i]== ' ') {
					Pedra[j][i] = new JLabel(pedra);
				}else if (mapa[j][i]== 'r') {
					Pedra[j][i] = new JLabel(morango);
				}
			
				
				Pedra[j][i].setBounds(j * 180,i*130,80,60);
				//Morango[j][i] = new JLabel(morango);
				//Morango[j][i].setBounds(40,20,30,30);
				add(Pedra[j][i]);
				
				
				
				
			}
		
		}
		Boneco.setBounds(10,10, 109,100);
		
		add(Boneco);    
		add(foto);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(true);
		
	}
	
	
	
/*
	public Tabuleiro() {
		super("Caça Frutas");
		
		
		
		
		
		
		JPanel painel = new JPanel();
		this.add(painel);
		painel.setLayout(null);
		
		
		JPanel personagem1 = new JPanel();
		personagem1.setLayout(null);
		painel.add(personagem1);
		personagem1.setBounds(10, 10, 200,100);
		personagem1.setBackground(Color.GREEN);
		
		JLabel nome = new JLabel("Nome:");
		personagem1.add(nome);
		nome.setBounds(10,10,50,25);
		
		JLabel pontosVida = new JLabel("PV:");
		personagem1.add(pontosVida);
		pontosVida.setBounds(10,40,50,25);
		
		
		JLabel itens = new JLabel("Itens: ");
		personagem1.add(itens);
		itens.setBounds(10,70,50,25);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(150,35,550,450);
		this.setVisible(true);
		
		
	}*/
	
	
	
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
				Boneco.setBounds(x, y,109,100);

				
			}
		});
	}
}
