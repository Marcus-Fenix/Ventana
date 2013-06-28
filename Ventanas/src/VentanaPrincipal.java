import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class VentanaPrincipal{

	/**
	 * @param args
	 */
	final static Color BG = Color.white;
	final static Color FG = Color.black;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseComponentes ventana =new ClaseComponentes(800,700,"ventana");
		//Dibujos ventana = new Dibujos(700,800,"ventana");
		ventana.setVisible(true);
	}
}