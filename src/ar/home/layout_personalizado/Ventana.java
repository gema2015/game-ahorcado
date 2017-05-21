package ar.home.layout_personalizado;

import javax.swing.*;

public class Ventana extends JFrame {
	
	
private Lamina l = new Lamina ();
	
	public Ventana (){
		
		setTitle("Layout personalizado");
		setSize(200,400);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		add(l);
		
		
	}

}
