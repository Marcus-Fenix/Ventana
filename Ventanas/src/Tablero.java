import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Tablero extends Dibujos implements MouseListener,Runnable{
	
	ImageIcon img;
	JButton boton;
	JLabel tiempo;
	Thread reloj;
	boolean alto = true;
	

	Tablero(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		boton = new JButton();
		img = new ImageIcon("src/img/Gears-of-War-3-Game-Official.jpg");
		boton.setBounds(100, 100, 200, 200);
		boton.setIcon(img);
		this.add(boton);
		boton.addMouseListener(this);
		this.tiempo = new JLabel("Hola");
		this.tiempo.setBounds(50, 50, 300, 50);
		this.add(tiempo);
		reloj = new Thread(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		img = new ImageIcon("src/img/wallpaper6.jpg");
		boton.setIcon(img);
		if(alto){
			reloj.resume();
			reloj.start();
			alto = false;
		}
		else{
			reloj.suspend();
			alto = true;
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	int seg = 0, min = 0, horas = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
				if(seg == 59){
					seg = 0; 
					min ++;
				}
				if(min == 59){
					min = 0;
					horas ++;
				}
				seg++;
				this.tiempo.setText(horas+" : "+min+" : "+seg);
				reloj.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	

}
