package cata_frutas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
*
* @author joao
*/
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tabuleiro extends JFrame {

	
	int x =20 , y=200;
	int px=1, py=1,posi;
	boolean start = false , movimento = false;
	
	ImageIcon  img  = new ImageIcon(getClass().getResource("back.jpg"));
	ImageIcon  boneco = new ImageIcon(getClass().getResource("avat2.png"));
	ImageIcon pedra = new ImageIcon(getClass().getResource("peda.png"));
	ImageIcon morango = new ImageIcon(getClass().getResource("moran.png"));

	
	JLabel foto = new JLabel(img);
	JLabel Boneco = new JLabel(boneco);
	JLabel Pedra [] [] = new JLabel [5] [5];
	JLabel Morango [] [] = new JLabel [5] [5];
	JLabel Ponto[][] = new JLabel [5][5];
	private JFrame painel;
	
/*		char mapa[][] = {
			{' ','r',' ',' ',' '},
			{' ',' ','r',' ',' '},
			{'p','p','p',' ',' '},
			{' ','r','p',' ',' '},
			{' ',' ','p','r',' '},
			{' ','r',' ',' ',' '},
			{' ',' ','r',' ',' '},
			{'p','p','p',' ',' '},
			{' ','r','p',' ',' '},
			{' ',' ','p','r',' '},
	};
	*/
	
	
	
	
	
	
	
	
	
	public void display() {
		
		JPanel painel = new JPanel();
		this.add(painel); 
		painel.setLayout(null); //tem que setar com o BOUNDS
		painel.add(Boneco);
		Boneco.setBounds(x,200,100,120);
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
		
		
		
		JButton bttDireita = new JButton("RIGHT");
		bttDireita.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para Direita");
				x+=10;
				Boneco.setBounds(x,y,100,120);			
			}
			
		})	;
		
		JButton bttEsquerda = new JButton("LEFT");
		bttEsquerda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para esquerda");	
				x -= 10; 
				Boneco.setBounds(x,y,100,120);			
			}
		});
		
		JButton bttCima = new JButton("UP");
		bttCima.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para Cima");		
				y-=10;
				Boneco.setBounds(x,y,100,120);
				
			}
		});
		
		JButton bttBaixo = new JButton("DOWN");
		bttBaixo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou pra baixo");
				y+=10;
				Boneco.setBounds(x,y,100,120);
				
			}
		});
		
		
		
		painel.add(bttEsquerda);
		bttEsquerda.setBounds(15,325,90,35); //x,y,h,l
		
		painel.add(bttDireita);
		bttDireita.setBounds(110,325,90,35); //organizar
		
		painel.add(bttCima);
		bttCima.setBounds(67,290,90,35);
		
		painel.add(bttBaixo);
		bttBaixo.setBounds(67,360,90,35);
		
		
		
		
		
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
		this.setVisible(true);
		

		
		
		
		
		
		
	}
	
	
	

	
	
	public void Control() {
		/*
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
				Boneco.setBounds(x,y,100,120);
				
			}
		});*/
		
		
	}
}
