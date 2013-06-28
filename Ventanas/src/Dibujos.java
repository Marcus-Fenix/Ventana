import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;


public class Dibujos extends JFrame{
	
	final static Color BG = Color.BLUE;
	final static Color FG = Color.BLACK;
	
	public void init()
	{
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	Dibujos(int x, int y, String s)
	{
		this.init();
		this.setSize(x, y);
		//this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(s);
		this.setLayout(null);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D.Double rec1 = new Rectangle2D.Double(50, 50, 150, 100);
		g2.setPaint(Color.blue);
		g2.fill(rec1);
		g2.setPaint(Color.gray);
		g2.draw(rec1);
		
		/*Ellipse2D.Double rec2 = new Ellipse2D.Double(200,100,50,50);
		g2.setPaint(Color.green);
		g2.fill(rec2);
		g2.setPaint(Color.gray);
		g2.draw(rec2);
		g2.draw(new Line2D.Double(50,50,250,200 ));
		g2.draw(new Line2D.Double(200,50,400,200 ));
		g2.draw(new Line2D.Double(50,150,250,300 ));
		g2.draw(new Line2D.Double(200,150,400,300 ));*/
		
		//Ellipse2D.Double rec1 = new Ellipse2D.Double(175,75,100,100);
		//g2.setPaint(Color.YELLOW);
		//g2.fill(rec1);
		//g2.setPaint(Color.gray);
		//g2.draw(rec1);
		//Ellipse2D.Double rec2 = new Ellipse2D.Double(200,100,50,50);
		//g2.setPaint(Color.red);
		//g2.fill(rec2);
		//g2.setPaint(Color.gray);
		//g2.draw(rec2);
		
		//g2.draw(new Arc2D.Double(75, 26, 300, 150, 180, 180, Arc2D.OPEN));
		//g2.draw(new Arc2D.Double(75, 75, 300, 150, 360, 180, Arc2D.OPEN));
		
	}

}
