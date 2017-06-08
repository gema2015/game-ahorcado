package ar.home.layout_practica;

import javax.swing.*;

import java.awt.*;

public class Lamina extends JPanel {
	
	ButtonGroup grupo = new ButtonGroup();
	
	public Lamina(String titulo, String[] opciones){
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		for(int i=0;i<opciones.length;i++){
			
			JRadioButton boton = new JRadioButton(opciones[i]);
			
			add(boton);
			grupo.add(boton);
			
			boton.setActionCommand(opciones[i]);
			
			boton.setSelected(i==0); //Para que el primero siempre este seleccionado
			
		}
		
		
	}
	
	
public String calcula(){ //El metodo me devuelve un boton seleccionado
		
		return grupo.getSelection().getActionCommand();
	}

}
