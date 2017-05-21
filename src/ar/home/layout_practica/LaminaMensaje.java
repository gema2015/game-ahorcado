package ar.home.layout_practica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaMensaje extends JPanel {
		
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			
			Rectangle2D r = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
			g2.setPaint(Color.BLUE);
			g2.fill(r);
		}

	

}
