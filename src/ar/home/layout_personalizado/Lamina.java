package ar.home.layout_personalizado;

import javax.swing.*;

public class Lamina extends JPanel {
	
	private JLabel etiqueta1 = new JLabel();private JLabel etiqueta2 = new JLabel();private JLabel etiqueta3 = new JLabel();
	private JTextField campo1 = new JTextField();private JTextField campo2 = new JTextField();private JTextField campo3 = new JTextField();
	
	
	public Lamina (){
		
		setLayout(new Layout());
		
		etiqueta1.setText("Nombre");
		etiqueta2.setText("Apellido");
		etiqueta3.setText("Localidad");
		
		add(etiqueta1);
		add(campo1);
		add(etiqueta2);
		add(campo2);
		add(etiqueta3);
		add(campo3);
		
	}

}
