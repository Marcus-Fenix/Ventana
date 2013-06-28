import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;


public class ClaseComponentes extends Dibujos{
	
	private JButton BotonPrueba;
	
	public ClaseComponentes(int x, int y, String s){
		super (x,y,s);
		BotonPrueba = new JButton("Boton de Prueba");
		FlowLayout fl = new FlowLayout(FlowLayout.LEADING);
		//BorderLayout fl = new BorderLayout();
		//GridLayout fl = new GridLayout(3,4,50,50);
		//BoxLayout fl = new BoxLayout();
		Box izq = Box.createVerticalBox();
		ButtonGroup grupoRadio = new ButtonGroup();
		JRadioButton rbutton;
		
		grupoRadio.add(rbutton = new JRadioButton("Rojo"));
		izq.add(rbutton);
		grupoRadio.add(rbutton = new JRadioButton("Verde"));
		
		izq.add(rbutton);
		grupoRadio.add(rbutton = new JRadioButton("Azul"));
		izq.add(rbutton);
		grupoRadio.add(rbutton = new JRadioButton("Amarillo"));
		izq.add(rbutton);
		
		Box central = Box.createVerticalBox();
		central.add(new JCheckBox("Hola"));
		central.add(new JCheckBox("Buenas Tardes"));
		central.add(new JCheckBox("Buenas Noches"));
		
		Box arriba = Box.createHorizontalBox();
		arriba.add(izq, BorderLayout.SOUTH);
		arriba.add(central, BorderLayout.NORTH);
		
		Container  contenedor = this.getContentPane();
		contenedor.setLayout(new BorderLayout());
		contenedor.add(arriba);
		contenedor.setLayout(fl);
		for(int i = 0; i <= 10; i++){
			contenedor.add(new JButton("boton" + i));
		}
		contenedor.add(new JButton("Este"),BorderLayout.EAST);
		contenedor.add(new JButton("Sur"),BorderLayout.SOUTH);
		contenedor.add(new JButton("Norte"),BorderLayout.NORTH);
		contenedor.add(new JButton("Oeste"),BorderLayout.WEST);
		
		this.pack();
		this.add(BotonPrueba);
	}
	
	
	
	

}
