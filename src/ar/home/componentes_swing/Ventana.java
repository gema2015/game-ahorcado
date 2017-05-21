package ar.home.componentes_swing;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	private Lamina l = new Lamina ();
	
	public Ventana (){
		
		setTitle("Componentes Swing");
		setSize(800,600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		add(l);
		
		
	}

}
