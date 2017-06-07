package ar.home.componentes_swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.StyledEditorKit;


public class Lamina extends JPanel {
	
	private JLabel etiqueta1 = new JLabel ();
	private JButton botonR = new JButton ();private JButton botonG = new JButton ();private JButton botonB = new JButton ();
	private JTextField campoTexto1 = new JTextField ();
	private JPasswordField campoPass1 = new JPasswordField();private JLabel etiquetaPass = new JLabel ();
	private JTextArea areaTexto1 = new JTextArea();private JButton botonAreaTexto = new JButton();
	private JComboBox comboBox1 = new JComboBox();private JLabel etiquetaComboBox = new JLabel();
	private JMenuBar menuBarra = new JMenuBar();
	private JMenu menu = new JMenu();
	private JMenuItem opcionSalir = new JMenuItem();private JMenuItem opcionReiniciar = new JMenuItem();
	private JMenu opcionOpciones = new JMenu();
	private JCheckBoxMenuItem opcionCB1 = new JCheckBoxMenuItem ();private JCheckBoxMenuItem opcionCB2 = new JCheckBoxMenuItem ();
	private JRadioButtonMenuItem opcionRB1 = new JRadioButtonMenuItem();private JRadioButtonMenuItem opcionRB2 = new JRadioButtonMenuItem();
	private JCheckBox checkBox1 = new JCheckBox();private JCheckBox checkBox2 = new JCheckBox();private JLabel etiquetaCheckBox = new JLabel();
	private JCheckBox checkBox3 = new JCheckBox();private JCheckBox checkBox4 = new JCheckBox();private JButton botonCB = new JButton();
	private JCheckBox checkBox5 = new JCheckBox();private JCheckBox checkBox6 = new JCheckBox();
	private ButtonGroup grupo = new ButtonGroup();private JLabel etiquetaBotonRadio = new JLabel();
	private JRadioButton botonRadioM = new JRadioButton();private JRadioButton botonRadioF = new JRadioButton();
	private JSlider slider1 = new JSlider ();private JLabel etiquetaSlider = new JLabel();
	private JSpinner spinnerList = new JSpinner();private JLabel etiquetaSL = new JLabel();
	private JSpinner spinnerNumber = new JSpinner();private JLabel etiquetaSN = new JLabel();private JLabel etiquetaSpinner = new JLabel();
	private JPopupMenu menuEmergente1 = new JPopupMenu();private JLabel etiquetaME = new JLabel();
	private JMenuItem opcionCopiar=new JMenuItem();private JMenuItem opcionPegar=new JMenuItem();private JMenuItem opcionCortar=new JMenuItem();
	private JToolBar barraHerramientas = new JToolBar();private JLabel etiquetaBH = new JLabel();
	private JMenuItem opcionCursiva = new JMenuItem();private JMenuItem opcionNegrita = new JMenuItem();
	private JButton boton1 = new JButton();private JButton boton2 = new JButton();
	private JButton boton3 = new JButton();private JButton boton4 = new JButton();
	// Procesador de texto -------------------
	private JTextPane procesador = new JTextPane();
	private JMenuBar menuProcesador = new JMenuBar();
	private JMenu estilo = new JMenu();private JMenu tamaño = new JMenu();private JMenu fuente = new JMenu();private JMenu color = new JMenu();
	private JMenuItem negrita = new JMenuItem();private JMenuItem cursiva = new JMenuItem();
	private JMenuItem t13 = new JMenuItem();private JMenuItem t15 = new JMenuItem();private JMenuItem t17 = new JMenuItem();
	private JMenuItem t19 = new JMenuItem();private JMenuItem t21 = new JMenuItem();private JMenuItem t23 = new JMenuItem();
	private JMenuItem calibri = new JMenuItem();private JMenuItem arial = new JMenuItem();private JMenuItem harrington = new JMenuItem();
	private JMenuItem rojo = new JMenuItem();private JMenuItem verde = new JMenuItem();private JMenuItem azul = new JMenuItem();
	//----------------------------------------
	public Lamina (){
		
		etiqueta1.setText("Soy solo una etiqueta");
		etiqueta1.setToolTipText("El cursor esta sobre mi");
		add(etiqueta1);
		
		botonR.setText("R");botonG.setText("G");botonB.setText("B");
		botonR.setBackground(Color.RED);botonG.setBackground(Color.GREEN);botonB.setBackground(Color.BLUE);
		botonR.addActionListener(new EventoBoton());botonG.addActionListener(new EventoBoton());botonB.addActionListener(new EventoBoton());
		add(botonR);add(botonG);add(botonB);
		
		campoTexto1.setText("Escribe aqui");
		campoTexto1.addFocusListener(new EventoCampoTexto());
		add(campoTexto1);
		
		campoPass1.setToolTipText("Introduzca contraseña");
		Document campoPassDoc = campoPass1.getDocument();
		campoPassDoc.addDocumentListener(new EventoCampoPass());
		add(campoPass1);
		add(etiquetaPass);
		
		areaTexto1.setRows(3);
		areaTexto1.setText("Escribe mensaje");
		areaTexto1.setBackground(Color.LIGHT_GRAY);
		areaTexto1.setLineWrap(true);
		botonAreaTexto.setText("Enviar");
		areaTexto1.addFocusListener(new EventoAreaTexto());
		botonAreaTexto.addActionListener(new EventoAreaTexto());
		add(areaTexto1);
		add(botonAreaTexto);
		
		menu.add(opcionReiniciar);opcionReiniciar.setText("Reiniciar");
		opcionReiniciar.setIcon(new ImageIcon("src/ar/home/componentes_swing/reiniciar.gif"));
		menu.addSeparator();
		menu.add(opcionSalir);opcionSalir.setText("Salir");
		opcionSalir.setIcon(new ImageIcon("src/ar/home/componentes_swing/salir.gif"));
		menu.addSeparator();
		menu.add(opcionOpciones);opcionOpciones.setText("Opciones");
		opcionOpciones.add(opcionCB1);opcionCB1.setText("Opcion 1");opcionOpciones.add(opcionCB2);opcionCB2.setText("Opcion 2");
		opcionOpciones.add(opcionRB1);opcionRB1.setText("Opcion 3");opcionOpciones.add(opcionRB2);opcionRB2.setText("Opcion 4");
		opcionOpciones.setIcon((new ImageIcon("src/ar/home/componentes_swing/opcion.gif")));
		menuBarra.add(menu);menu.setText("Menu");
		opcionReiniciar.addActionListener(new EventoMenuBarra());
		opcionSalir.addActionListener(new EventoMenuBarra());
		add(menuBarra);
		
		comboBox1.addItem("Ninguno");
		comboBox1.addItem("Real Madrid");comboBox1.addItem("Atletico Madrid");comboBox1.addItem("Barcelona");
		comboBox1.addItem("Valencia");comboBox1.addItem("Sevilla");comboBox1.addItem("Villareal");
		comboBox1.addActionListener(new EventoComboBox());
		etiquetaComboBox.setText("Elige equipo favorito");
		add(comboBox1);
		add(etiquetaComboBox);
		
		checkBox1.setText("Docente");checkBox2.setText("Medico");checkBox3.setText("Agente civil");
		checkBox4.setText("Obrero");checkBox5.setText("Estudiante");checkBox6.setText("Desocupado");	
		add(checkBox1);add(checkBox2);add(checkBox3);add(checkBox4);add(checkBox5);add(checkBox6);
		etiquetaCheckBox.setText("Elegir ocupación:");
		etiquetaCheckBox.setFont(new Font("New Times Roman",Font.BOLD,15));
		add(etiquetaCheckBox);
		botonCB.setText("OK");
		botonCB.addActionListener(new EventoCheckBox());
		add(botonCB);
		grupo.add(botonRadioM);grupo.add(botonRadioF);
		botonRadioM.setText("Masculino");botonRadioF.setText("Femenino");
		botonRadioM.addActionListener(new EventoBotonRadio());botonRadioF.addActionListener(new EventoBotonRadio());
		add(botonRadioM);add(botonRadioF);
		etiquetaBotonRadio.setText("Elige sexo");
		add(etiquetaBotonRadio);
		
		slider1.setMaximum(100);
		slider1.setMinimum(0);
		slider1.setValue(50);
		slider1.setMajorTickSpacing(50);
		slider1.setMinorTickSpacing(10);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setSnapToTicks(true);
		slider1.setOrientation(1);
		slider1.addChangeListener(new EventoSlider());
		add(slider1);
		add(etiquetaSlider);
		
		String fuentes [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		spinnerList.setModel(new SpinnerListModel(fuentes));
		spinnerList.setPreferredSize(new Dimension(100,20));
		spinnerList.addChangeListener(new EventoSpinner());
		spinnerNumber.setModel(new SpinnerNumberModel());
		spinnerNumber.setValue(14);
		spinnerNumber.addChangeListener(new EventoSpinner());
		add(spinnerList);
		add(spinnerNumber);
		etiquetaSL.setText("Fuente");
		etiquetaSN.setText("Tamaño");
		add(etiquetaSL);
		add(etiquetaSN);
		etiquetaSpinner.setText("aAbBcCdD");
		etiquetaSpinner.setFont(new Font(spinnerList.getValue().toString(),Font.BOLD,spinnerNumber.getValue().hashCode()));
		add(etiquetaSpinner);
		
		opcionCopiar.setText("Copiar");
		opcionPegar.setText("Pegar");
		opcionCortar.setText("Cortar");
		opcionCopiar.addActionListener(new EventoMenuDesplegable());
		opcionPegar.addActionListener(new EventoMenuDesplegable());
		opcionCortar.addActionListener(new EventoMenuDesplegable());
		menuEmergente1.add(opcionCopiar);
		menuEmergente1.add(opcionPegar);
		menuEmergente1.add(opcionCortar);
		add(menuEmergente1);
		etiquetaME.setText("Click derecho para verlo");
		add(etiquetaME);
		this.setComponentPopupMenu(menuEmergente1);
		
		opcionReiniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.ALT_DOWN_MASK));
		opcionSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK));
		opcionCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_DOWN_MASK));
		opcionPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.ALT_DOWN_MASK));
		opcionCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
	
		barraHerramientas.setOrientation(1);
		barraHerramientas.setFloatable(false);
		opcionCursiva.setIcon(new ImageIcon("src/ar/home/componentes_swing/cursiva.png"));opcionCursiva.setText("Cursiva");
		opcionCursiva.addActionListener(new EventoBarraHerramientas());
		opcionNegrita.setIcon(new ImageIcon("src/ar/home/componentes_swing/negrita.png"));opcionNegrita.setText("Negrita");
		opcionNegrita.addActionListener(new EventoBarraHerramientas());
		barraHerramientas.add(opcionCursiva);
		barraHerramientas.addSeparator();
		barraHerramientas.add(opcionNegrita);
		etiquetaBH.setText("asdfsags");
		etiquetaBH.setFont(new Font("Book Antiqua",Font.PLAIN,20));
		add(etiquetaBH);
		add(barraHerramientas);
		
		boton1.setText("Mensaje");
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Lamina.this, "Error 947", "Mensaje de error", 0);
			}
		});
		add(boton1);
		boton2.setText("Confirmacion");
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(Lamina.this, "Quieres guardar el archivo?", "Confirmar opcion", 1, 1);
			}
		});
		add(boton2);
		boton3.setText("Entrada");
		boton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(Lamina.this, "Ingresa email", "Registrate", 3);
			}
		});
		add(boton3);
		boton4.setText("Opcion");
		boton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Object[] obj = new Object[4];
				obj[0]="Guardar";obj[1]="Cargar";obj[2]="Opciones";obj[3]="Salir";
				JOptionPane.showOptionDialog(Lamina.this, "Elige", "Opcion", 1, 1, null, obj, null);
			}
		});
		add(boton4);

		
		// Procesador de texto ---------------------
		procesador.setPreferredSize(new Dimension(225,150));
		procesador.setBackground(Color.LIGHT_GRAY);
		add(procesador);
		fuente.setText("Fuente");
		calibri.setText("Calibri");
		calibri.addActionListener(new StyledEditorKit.FontFamilyAction("","Calibri"));
		calibri.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.CTRL_DOWN_MASK));
		arial.setText("Arial");
		arial.addActionListener(new StyledEditorKit.FontFamilyAction("","Arial"));
		arial.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,InputEvent.CTRL_DOWN_MASK));
		harrington.setText("Harrington");
		harrington.addActionListener(new StyledEditorKit.FontFamilyAction("","Harrington"));
		harrington.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
		fuente.add(calibri);fuente.add(arial);fuente.add(harrington);
		estilo.setText("Estilo");
		negrita.setText("Negrita");
		negrita.setIcon(new ImageIcon("src/ar/home/componentes_swing/negrita.png"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		cursiva.setText("Cursiva");
		cursiva.setIcon(new ImageIcon("src/ar/home/componentes_swing/cursiva.png"));
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_DOWN_MASK));
		estilo.add(negrita);estilo.add(cursiva);
		tamaño.setText("Tamaño");
		t13.setText("13");
		t13.addActionListener(new StyledEditorKit.FontSizeAction("",13));
		t13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,InputEvent.CTRL_DOWN_MASK));
		t15.setText("15");
		t15.addActionListener(new StyledEditorKit.FontSizeAction("",15));
		t15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,InputEvent.CTRL_DOWN_MASK));
		t17.setText("17");
		t17.addActionListener(new StyledEditorKit.FontSizeAction("",17));
		t17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,InputEvent.CTRL_DOWN_MASK));
		t19.setText("19");
		t19.addActionListener(new StyledEditorKit.FontSizeAction("",19));
		t19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4,InputEvent.CTRL_DOWN_MASK));
		t21.setText("21");
		t21.addActionListener(new StyledEditorKit.FontSizeAction("",21));
		t21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5,InputEvent.CTRL_DOWN_MASK));
		t23.setText("23");
		t23.addActionListener(new StyledEditorKit.FontSizeAction("",23));
		t23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6,InputEvent.CTRL_DOWN_MASK));
		tamaño.add(t13);tamaño.add(t15);tamaño.add(t17);tamaño.add(t19);tamaño.add(t21);tamaño.add(t23);
		color.setText("Color");
		rojo.setText("Rojo");
		rojo.addActionListener(new StyledEditorKit.ForegroundAction("",Color.RED));
		rojo.setIcon(new ImageIcon("src/ar/home/componentes_swing/rojo.png"));
		rojo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_DOWN_MASK));
		verde.setText("Verde");
		verde.addActionListener(new StyledEditorKit.ForegroundAction("",Color.GREEN));
		verde.setIcon(new ImageIcon("src/ar/home/componentes_swing/verde.png"));
		verde.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_DOWN_MASK));
		azul.setText("Azul");
		azul.addActionListener(new StyledEditorKit.ForegroundAction("",Color.BLUE));
		azul.setIcon(new ImageIcon("src/ar/home/componentes_swing/azul.png"));
		azul.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.CTRL_DOWN_MASK));
		color.add(rojo);color.add(verde);color.add(azul);
		menuProcesador.add(fuente);
		menuProcesador.add(estilo);
		menuProcesador.add(tamaño);
		menuProcesador.add(color);
		add(menuProcesador);
		//-----------------------------------------
		
		
	}
	
	public void paintComponent (Graphics g){ 
	
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setFont(new Font("Arial",Font.PLAIN,15));
		
		g2.drawString("JLabel", 5, 15);
		etiqueta1.setLocation(5, 25);
		
		g2.drawString("JButton", 5, 65);
		botonR.setLocation(5, 80);botonG.setLocation(5, 110);botonB.setLocation(5, 140);
		
		g2.drawString("JTextField", 5, 195);
		campoTexto1.setLocation(5, 215);
		
		g2.drawString("JPasswordField", 5, 265);
		campoPass1.setSize(70, 20);
		campoPass1.setLocation(5, 285);
		etiquetaPass.setLocation(75, 285);

		g2.drawString("JTextArea", 5, 335);
		areaTexto1.setLocation(5, 355);
		botonAreaTexto.setLocation(20, 415);
		
		g2.drawString("ComboBox", 5, 465);
		comboBox1.setLocation(5, 480);
		etiquetaComboBox.setLocation(5, 520);
		
		g2.drawLine(150, 0, 150, 600);
		
		g2.drawString("JMenuBar", 155, 15);
		menuBarra.setLocation(155, 30);
		
		g2.drawString("JCheckBox", 155, 80);
		etiquetaCheckBox.setLocation(155,88);
		checkBox1.setLocation(155, 110);
		checkBox2.setLocation(155, 130);
		checkBox3.setLocation(155, 150);
		checkBox4.setLocation(155, 170);
		checkBox5.setLocation(155, 190);
		checkBox6.setLocation(155, 210);
		botonCB.setLocation(165, 240);
		
		g2.drawString("JRadioButton", 155, 290);
		botonRadioM.setLocation(155, 300);
		botonRadioF.setLocation(155, 320);
		etiquetaBotonRadio.setLocation(165, 345);
		
		g2.drawString("JSlider", 155, 385);
		slider1.setLocation(155, 395);
		slider1.setSize(75, 150);
		etiquetaSlider.setLocation(155, 550);
		
		g2.drawLine(300, 0, 300, 600);
		
		g2.drawString("JSpinner", 305, 15);
		etiquetaSL.setLocation(305, 25);
		spinnerList.setLocation(305, 45);
		etiquetaSN.setLocation(305, 70);
		spinnerNumber.setLocation(305, 90);
		etiquetaSpinner.setLocation(305, 115);
		
		g2.drawString("JPopupMenu", 305, 160);
		etiquetaME.setLocation(305, 175);
		
		g2.drawString("JToolBar", 305, 220);
		barraHerramientas.setLocation(305, 235);
		etiquetaBH.setLocation(320, 330);
		
		g2.drawString("JOptionPane", 305, 380);
		boton1.setLocation(305, 405);
		boton2.setLocation(305, 435);
		boton3.setLocation(305, 465);
		boton4.setLocation(305, 495);
		
		//Procesador de texto ---------------------
		procesador.setLocation(550, 400);
		menuProcesador.setLocation(570, 370);
		//-----------------------------------------
}


private class EventoBoton implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		if (botonR == e.getSource()){
			setBackground(Color.RED);
			botonR.setEnabled(false);botonG.setEnabled(true);botonB.setEnabled(true);
		}
		
		if (botonG == e.getSource()){
			setBackground(Color.GREEN);
			botonR.setEnabled(true);botonG.setEnabled(false);botonB.setEnabled(true);
		}
		
		if (botonB == e.getSource()){
			setBackground(Color.BLUE);
			botonR.setEnabled(true);botonG.setEnabled(true);botonB.setEnabled(false);
		}
		
		} 

	}

private class EventoCampoTexto implements FocusListener {

	public void focusGained(FocusEvent e) {
		
		campoTexto1.setText("");
	}

	public void focusLost(FocusEvent e) {
		campoTexto1.setText("");
	}
	
	
	
}

private class EventoCampoPass implements DocumentListener {

	public void changedUpdate(DocumentEvent e) {
		
	}

	public void insertUpdate(DocumentEvent e) {
		etiquetaPass.setText(String.valueOf(campoPass1.getPassword()));
	}

	public void removeUpdate(DocumentEvent e) {
		etiquetaPass.setText(String.valueOf(campoPass1.getPassword()));
	}
	
}

private class EventoAreaTexto implements ActionListener,FocusListener{

	

	public void actionPerformed(ActionEvent e) {
		
		if (botonAreaTexto == e.getSource()){
			JOptionPane.showMessageDialog(null, "El mensaje ha sido enviado");
		}
		
	}

	public void focusGained(FocusEvent e) {
		areaTexto1.setText("");
	}

	public void focusLost(FocusEvent e) {
		
	}


}

private class EventoComboBox implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		if (comboBox1.getSelectedItem()=="Ninguno"){
			etiquetaComboBox.setText("Elige equipo favorito");
		}
		if (comboBox1.getSelectedItem()=="Real Madrid"){
			etiquetaComboBox.setText("Hala Madrid!");
		}
		if (comboBox1.getSelectedItem()=="Atletico Madrid"){
			etiquetaComboBox.setText("Aupa Atleti!");
		}
		if (comboBox1.getSelectedItem()=="Barcelona"){
			etiquetaComboBox.setText("Visca Barca!");
		}
		if (comboBox1.getSelectedItem() != "Real Madrid"&&comboBox1.getSelectedItem() != "Atletico Madrid"&&
				comboBox1.getSelectedItem() != "Barcelona"&&comboBox1.getSelectedItem() != "Ninguno"){
			etiquetaComboBox.setText("Tu equipo es del monton");
		}
		
	}
	
}

private class EventoMenuBarra implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		if (opcionReiniciar==e.getSource()){
			new Ventana();
		}
		if (opcionSalir==e.getSource()){
			System.exit(0);
		}
		
	}
	
	
	
}

private class EventoCheckBox implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		String mensaje;
		mensaje = "Usted es: ";
		
		if (checkBox1.isSelected()==true){
			mensaje += checkBox1.getText();
			mensaje += " - ";
		}
		if (checkBox2.isSelected()==true){
			mensaje += checkBox2.getText();
			mensaje += " - ";
		}
		if (checkBox3.isSelected()==true){
			mensaje += checkBox3.getText();
			mensaje += " - ";
		}
		if (checkBox4.isSelected()==true){
			mensaje += checkBox4.getText();
			mensaje += " - ";
		}
		if (checkBox5.isSelected()==true){
			mensaje += checkBox5.getText();
			mensaje += " - ";
		}
		if (checkBox6.isSelected()==true){
			mensaje += checkBox6.getText();
			mensaje += " - ";
		}
		
		if(botonCB==e.getSource()){
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
		
	}
	
}

private class EventoBotonRadio implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		if (botonRadioM.isSelected()==true){
			etiquetaBotonRadio.setText("Hombre");
		}
		if (botonRadioF.isSelected()==true){
			etiquetaBotonRadio.setText("Mujer");
		}
		
	}
	
}

private class EventoSlider implements ChangeListener{

	public void stateChanged(ChangeEvent e) {
		
		if (slider1 == e.getSource()){
			etiquetaSlider.setText("Volumen "+slider1.getValue());
		}
		
	}

	
	
}

private class EventoSpinner implements ChangeListener{

	public void stateChanged(ChangeEvent e) {
		
		if(spinnerList==e.getSource()){
			etiquetaSpinner.setFont(new Font(spinnerList.getValue().toString(),Font.BOLD,spinnerNumber.getValue().hashCode()));
		}
		if(spinnerNumber==e.getSource()){
			etiquetaSpinner.setFont(new Font(spinnerList.getValue().toString(),Font.BOLD,spinnerNumber.getValue().hashCode()));
		}
		
	}
	
}

private class EventoMenuDesplegable implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		if(opcionCopiar==e.getSource()){
			System.out.println("Copiando...");
		}
		if(opcionPegar==e.getSource()){
			System.out.println("Pegando...");
		}
		if(opcionCortar==e.getSource()){
			System.out.println("Cortando...");
		}
		
	}
	
}

private class EventoBarraHerramientas implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==opcionNegrita){
			etiquetaBH.setFont(new Font("Book Antiqua",Font.BOLD,20));
		}
		if(e.getSource()==opcionCursiva){
			etiquetaBH.setFont(new Font("Book Antiqua",Font.ITALIC,20));
		}
		
	}
	
}


}