package ar.home.layout_practica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;

public class Ventana extends JFrame {
	

	private Lamina laminaTipo = new Lamina("Tipo",new String [] {"Mensaje","Confirmar","Opcion","Entrada"});
	private Lamina laminaTipoDeMensaje = new Lamina("Tipo de mensaje",new String [] {"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"});
	private Lamina laminaMensaje = new Lamina("Mensaje",new String [] {"Cadena","Icono","Componente","Otros","Object[]"});
	private Lamina laminaConfirmar = new Lamina("Confirmar",new String [] {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
	private Lamina laminaOpcion = new Lamina ("Opcion",new String [] {"String[]","Icon[]","Object[]"});
	private Lamina laminaEntrada = new Lamina("Entrada",new String [] {"Campo de texto","Combo"});
	
	private String mensaje = "Mensaje";
	private Icon icono = new ImageIcon("src/ar/home/layout_practica/wp.jpg");
	private Date fecha = new Date ();
	private Component componente = new LaminaMensaje();
	
	
	public Ventana(){

		setSize(600,450);
		setTitle("Pruebas: JOption Pane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(true);
		
		JPanel laminax6=new JPanel(); //Lamina en donde estan todos los gridlayouts, las 6 laminas
		
		laminax6.setLayout(new GridLayout(2,3));
		
		setLayout(new BorderLayout());
		
		laminax6.add(laminaTipo);
		laminax6.add(laminaTipoDeMensaje);
		laminax6.add(laminaMensaje);
		laminax6.add(laminaConfirmar);
		laminax6.add(laminaOpcion);
		laminax6.add(laminaEntrada);
		
		JPanel laminaInferior = new JPanel(); // Lamina con el boton de mostrar
		JButton botonMostrar = new JButton("Mostrar");
		botonMostrar.addActionListener(new EventoBoton());
		laminaInferior.add(botonMostrar);
		
		add(laminax6,BorderLayout.CENTER);
		add(laminaInferior,BorderLayout.SOUTH);
		
	}
	
	public Object mensaje (){
		
		String s = laminaMensaje.calcula();
		
		if(s.equals("Cadena")) return mensaje;
		if(s.equals("Icono")) return icono;
		if(s.equals("Componente")) return componente;
		if(s.equals("Otros")) return fecha;
		if(s.equals("Object[]")) return new Object[]{mensaje,icono,componente,fecha};
		
		return null;
	}
	
	public int tipo(){
		
		int t=0;
		
		if(laminaTipoDeMensaje.calcula().equals("ERROR_MESSAGE")) t=0;
		if(laminaTipoDeMensaje.calcula().equals("INFORMATION_MESSAGE")) t=1;
		if(laminaTipoDeMensaje.calcula().equals("WARNING_MESSAGE")) t=2;
		if(laminaTipoDeMensaje.calcula().equals("QUESTION_MESSAGE")) t=3;
		if(laminaTipoDeMensaje.calcula().equals("PLAIN_MESSAGE")) t=-1;
		
		return t;
		
	}
	
	public int opcion(){
		
		int o=0;
		
		if(laminaConfirmar.calcula().equals("DEFAULT_OPTION")) o=-1;
		if(laminaConfirmar.calcula().equals("YES_NO_OPTION")) o=0;
		if(laminaConfirmar.calcula().equals("YES_NO_CANCEL_OPTION")) o=1;
		if(laminaConfirmar.calcula().equals("OK_CANCEL_OPTION")) o=2;
		
		return o;
		
	}
	
	public Object[] valor(){
		
		if(laminaOpcion.calcula().equals("String[]")) return new String[]{"Rojo","Verde","Azul"};
		if(laminaOpcion.calcula().equals("Icon[]")) return new Icon[]{icono,new ImageIcon("src/ar/home/layout_practica/fb.png")};
		if(laminaOpcion.calcula().equals("Object[]")) return new Object[]{mensaje,icono,fecha,componente};
		
		return null;
	}
	
	
	private class EventoBoton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if (laminaTipo.calcula().equals("Mensaje")){
				JOptionPane.showMessageDialog(Ventana.this, mensaje(), "Titulo", tipo());
			}
			if(laminaTipo.calcula().equals("Confirmar")){
				JOptionPane.showConfirmDialog(Ventana.this, mensaje(), "Titulo", opcion(), tipo());
			}
			if(laminaTipo.calcula().equals("Opcion")){
				JOptionPane.showOptionDialog(Ventana.this, mensaje(), "Titulo", opcion(), tipo(), null, valor(), null);
			}
			if(laminaTipo.calcula().equals("Entrada")){
				if(laminaEntrada.calcula().equals("Campo de texto")){
				JOptionPane.showInputDialog(Ventana.this, mensaje(), "Titulo", tipo());}
				if(laminaEntrada.calcula().equals("Combo")){
				JOptionPane.showInputDialog(Ventana.this, mensaje(), "Titulo", tipo(), null, new String[]{"Rojo","Verde","Azul"}, null);}
					
				
			}
		}
		
		
	}
	
	
	
	

}

