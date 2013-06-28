import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ComponentesPosicion extends Dibujos implements MouseListener{
	
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JTextField txt;
	private JLabel lb;
	
	ComponentesPosicion(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		
		this.setLayout(null);
		
		//para hacer un boton
		btn = new JButton("hola");
		btn.setBounds(50, 100, 150, 30);
		btn.addMouseListener(this);
		
		//para poner un cuandro de texto
		txt = new JTextField();
		txt.setBounds(50, 200, 150, 30);
		
		//para poner texto en la pantalla
		lb = new JLabel("hola");
		lb.setBounds(50, 50, 150, 30);
		
		this.add(btn);
		this.add(txt);
		this.add(lb);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		lb.setText(txt.getText());
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
}
