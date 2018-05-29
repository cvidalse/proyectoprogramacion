package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame implements ActionListener{
    private JButton botonMostrar;
    private JButton botonSalir;
    private JLabel contacto;
    private JLabel titulo;
    private JLabel version;
    private JLabel imagen;
    private java.awt.Container contenido;
    
    public Principal(){
    	super();
    	this.botonMostrar = new JButton();
    	this.botonSalir = new JButton("Salir");
    	this.contacto = new JLabel();
    	this.titulo = new JLabel();
    	this.version = new JLabel();
    	this.imagen = new JLabel();
    	this.contenido = this.getContentPane();
    	this.contenido.setBackground(Color.LIGHT_GRAY);
    	configuracionVentana();
    	inicioComponentes();
    	accionBotones();
    }
    
    private void configuracionVentana() {
        this.setTitle("SP Menú");               
        this.setSize(510, 310);                               
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                
        this.setResizable(false);                            
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     

    }
    
    private void inicioComponentes() {
        botonMostrar.setText("Ver");
        botonMostrar.setBounds(220, 200, 78, 25);
        botonSalir.setBounds(228, 230, 60, 25);   
        contacto.setText("Contacto");
        contacto.setBounds(5, 5, 80, 30);
        titulo.setText("SMART PARKING");
        titulo.setBounds(150, 30, 300, 30);
        titulo.setFont(new Font("Serif",Font.PLAIN, 25));
        version.setText("v0.1");
        version.setBounds(470, 1,80,30);
        imagen.setBorder(BorderFactory.createLineBorder(Color.black));
        imagen.setBounds(205,70,100,100);
        this.add(botonMostrar);
        this.add(botonSalir);
        this.add(contacto);
        this.add(titulo);
        this.add(version);
        this.add(imagen);

    }
    
    private void accionBotones() {
        botonMostrar.addActionListener(this);  
        botonSalir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
        });    	
    }


	@Override
	public void actionPerformed(ActionEvent arg0) {
        Mapa m = new Mapa();
        m.setVisible(true);
        this.dispose();
	}
	
	public static void main(String[] args) {
		Principal test = new Principal();
		test.setVisible(true); 
	} 

}
