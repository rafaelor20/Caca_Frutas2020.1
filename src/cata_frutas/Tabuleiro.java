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

public class Tabuleiro extends JFrame implements ActionListener {

	
	int x =20 , y=200;
	int px=13, py=23,dir ,posi;
	boolean start = false , movimento = false;
	
	//adcionando as imagens nas variaveis
	
	ImageIcon  img  = new ImageIcon(getClass().getResource("back.jpg"));
	ImageIcon  boneco = new ImageIcon(getClass().getResource("avat2.png"));
	ImageIcon pedra = new ImageIcon(getClass().getResource("peda.png"));
	ImageIcon morango = new ImageIcon(getClass().getResource("moran.png"));
	private Jogador p1;


	JLabel foto = new JLabel(img);
	JLabel Boneco = new JLabel(boneco);
	JLabel Pedra [] [] = new JLabel [31] [28];
	JLabel Morango [] [] = new JLabel [5] [5];
	JLabel Ponto[][] = new JLabel [5][5];
	/*
		char mapa[][] = {
			{' ','r',' ',' ',' '},
			{' ',' ','r',' ',' '},
			{'p','p','p',' ',' '},
			{' ','r','p',' ',' '},
			{' ',' ','p','r',' '},
			{' ','r',' ',' ',' '},
			{' ',' ','r',' ',' '},
			{'p','p','p',' ',' '},
			{' ','r','p',' ',' '},
			{' ',' ' ,'p','r',' '},
	};
	
	*/
	
	//fiz um mapa de caracteres e cada valor ('x' ou 'o' ou ' ') irão receber elementos ou não
	char mapa[][] = {//    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18   19   20   21   22   23   24   25   26   27   28      
	        {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},//01
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//02
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//03
	        {'x', '-', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', '-', 'x'},//04
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//05
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//06
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//07
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//08
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//09
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//10
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//11
	        {'x', 'x', 'x', 'x', 'x', 'x', ' ', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//12
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//13
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//14
	        {' ', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', ' '},//15
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//16
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//17
	        {'x', 'x', 'x', 'x', 'x', 'x', ' ', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//18
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//19
	        {'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x'},//20
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//21
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//22
	        {'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'x'},//23
	        {'x', '-', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', '-', 'x'},//24
	        {'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x'},//25
	        {'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x'},//26
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//27
	        {'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x'},//28
	        {'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x'},//29
	        {'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x'},//30
	        {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}};//31
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Tabuleiro() {
		
		
		
		
		
	}//construtor
	
	
	//função para saber se o jogo iniciou e ir completando o mapa de caracteres
	public void jogo() {
		if (start) {
			if (mapa[py][px] == 'o') {
				mapa[py][px] = ' ';
				
		}	else if (mapa[py][px] == '-')
		{
			mapa[py][px] = 'o';
		}
			
			for(int i = 0; i<28;++i) {
				for(int j =0;j<31;++j) {
					 switch(mapa[j][i]) {
					 	case 'o':
					 		Pedra[j][i].setIcon(pedra);
					 		break;
					 	case 'x':
					 		Pedra[j][i].setIcon(pedra);
					 		break;
					 	case ' ':
					 		Pedra[j][i].setIcon(pedra);
					 		break;
					 	default:
					 		break;
					 	
					 }
				}
			}
			switch(dir) {
				case 1:
					if(mapa[py][px+1] != 'x') {
						px +=1;
					}
					break;
				case 2:
					if(mapa[py][px-1] != 'x') {
						px -=1;
					}
					break;
				case 3:
					if(mapa[py+1][px] != 'x') {
						py +=1;
					}
					break;
				case 4:
					if(mapa[py-1][px] != 'x') {
						py -=1;
					}
					break;
				default:
					break;
			}
			Boneco.setBounds(px*27+10, py*20-3, 45, 43);
		}
	}
	
	
	
	
	//display do jogo
	public void display() {
		

		p1 = new Jogador();
		JPanel painel = new JPanel();
		this.add(painel);
		//p1.load();
		painel.setSize(1000,690);
		painel.setLayout(null); //tem que setar com o BOUNDS
		painel.add(Boneco);
		Boneco.setBounds(x,200,100,120);
		LayoutAtributos personagem1 = new LayoutAtributos();
		painel.add(personagem1);
		personagem1.setBounds(10,10,200,90);
		personagem1.setBackground(Color.yellow);
		
		for(int i =0; i< 28; ++i) {
			for(int j = 0 ; j<31 ; ++j) {
				switch(mapa[j][i]) {
					case 'o' :
						Pedra[j][i] = new JLabel(pedra);
						Pedra[j][i].setBounds(i*27+27,j+20+12,10,9);
						painel.add(Pedra[j][i]);
						break;
					case 'x' :
						Pedra[j][i] = new JLabel(pedra);
						Pedra[j][i].setBounds(i*27+27,j+20+12,10,9);
						painel.add(Pedra[j][i]);
						break;
					case ' ' :
						Pedra[j][i] = new JLabel(pedra);
						Pedra[j][i].setBounds(0,0,0,0);
						painel.add(Pedra[j][i]);
						break;
					default:
						break;
						
				
				}

				
			}
		}
		
		
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
		
		
		
		
		
		
		//botoes de movimento pelo mouse
	
		JButton bttDireita = new JButton("RIGHT");
		bttDireita.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para Direita");
				x+=10;
				Boneco.setBounds(x,y,100,120);			
			}
			
		})	;
		
		//botoes de movimento pelo mouse
		JButton bttEsquerda = new JButton("LEFT");
		bttEsquerda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para esquerda");	
				x -= 10; 
				Boneco.setBounds(x,y,100,120);			
			}
		});
		//botoes de movimento pelo mouse
		JButton bttCima = new JButton("UP");
		bttCima.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Andou para Cima");		
				y-=10;
				Boneco.setBounds(x,y,100,120);
				
			}
		});
		//botoes de movimento pelo mouse
		JButton bttBaixo = new JButton("DOWN");
		bttBaixo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mapa[py][px+1]!=x) {
				System.out.println("Andou pra baixo");
				y+=10;
				Boneco.setBounds(x,y,100,120);
				}
			}
		});
		
		//adcionando os botoes
		
		painel.add(bttEsquerda);
		bttEsquerda.setBounds(15,325,90,35); //x,y,h,l
		
		painel.add(bttDireita);
		bttDireita.setBounds(110,325,90,35); //organizar
		
		painel.add(bttCima);
		bttCima.setBounds(67,290,90,35);
		
		painel.add(bttBaixo);
		bttBaixo.setBounds(67,360,90,35);
		
		
		
		//layout de atributos para personagens
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
		this.setBounds(0,0,1001,686);
		this.setVisible(true);
		

		
		
		
		
		
		
	}
	
	


	
	//implementação de controle pelo teclado
	public void Control() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				movimento = false;
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode()); //saida no console
				
				start = true;
				if(!movimento) {
					if(e.getKeyCode() == 39 && mapa[py][px+1] != 'x') {
						dir = 1;
					}
					if(e.getKeyCode() == 37 && mapa[py][px-1] != 'o') {
						dir = 2;
					}
					if(e.getKeyCode() == 40 && mapa[py+1][px] != 'x') {
						dir = 3;
					}
					if(e.getKeyCode() == 36 && mapa[py-1][px] != 'x') {
						dir = 4;
					}
					Boneco.setBounds(px*27+10, py*20-3, 45, 43);
					
				}
				
				
			}
		});
		
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		jogo();
		
	}
}
