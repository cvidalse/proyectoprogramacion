package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import testing.Lote;

public class Mapa extends JFrame implements ActionListener {
    private JButton botonVolver;
    private JLabel titulo;
    private JButton botonActualizar;
    private JPanel test;
    private JPanel test_1;
    private JPanel test_2;
    private JPanel test_3;
    private JPanel test_4;    
    private java.awt.Container contenido;
    
    public Mapa(){
    	super();
    	this.botonVolver = new JButton();
    	this.botonActualizar = new JButton();
    	this.test = new JPanel();
    	this.test_1 = new JPanel();  	
    	this.test_2 = new JPanel(); 	
    	this.test_3 = new JPanel(); 	
    	this.test_4 = new JPanel();	  	
    	this.titulo = new JLabel();
    	this.contenido = this.getContentPane();
    	this.contenido.setBackground(Color.LIGHT_GRAY);
    	configuracionVentana();
    	inicioComponentes();
    	configPaneles();
    	accionesBotones();
    }
    
    private void configuracionVentana() {
        this.setTitle("SP Estacionamiento");               
        this.setSize(510, 410);                               
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                
        this.setResizable(false);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    private void configPaneles() {
        test.setBounds(5,50,50,50);
        test.setLayout(null);
        test.setBorder(BorderFactory.createLineBorder(Color.black));
        test.setBackground(Color.WHITE);   
        test_1.setBounds(55,50,50,50);
        test_1.setLayout(null);
        test_1.setBorder(BorderFactory.createLineBorder(Color.black));
        test_1.setBackground(Color.WHITE);
        test_2.setBounds(105,50,50,50);
        test_2.setLayout(null);
        test_2.setBorder(BorderFactory.createLineBorder(Color.black));
        test_2.setBackground(Color.WHITE);
        test_3.setBounds(155,50,50,50);
        test_3.setLayout(null);
        test_3.setBorder(BorderFactory.createLineBorder(Color.black));
        test_3.setBackground(Color.WHITE);
        test_4.setBounds(205,50,50,50);
        test_4.setLayout(null);
        test_4.setBorder(BorderFactory.createLineBorder(Color.black));
        test_4.setBackground(Color.WHITE);
        this.add(test);
        this.add(test_1);
        this.add(test_2);       
        this.add(test_3);       
        this.add(test_4);      
    }
    
    private void inicioComponentes() {
    	botonVolver.setText("Volver");
    	botonVolver.setBounds(5, 10, 97, 25);
    	botonActualizar.setText("Actualizar");
    	botonActualizar.setBounds(205, 300, 97, 25);
        titulo.setText("SMART PARKING");
        titulo.setBounds(150, 5, 300, 30);
        titulo.setFont(new Font("Serif",Font.PLAIN, 25));
        this.add(botonVolver);
        this.add(botonActualizar);
        this.add(titulo);
    }
    
    private void accionesBotones() {
    	botonVolver.addActionListener(this); 
        botonActualizar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Lote smart = new Lote();
				if(smart.getDisponibilidad().equals("Ocupado")) {
			        test.setBackground(Color.RED);  					
				}else {
			        test.setBackground(Color.GREEN);  					
				}
				Lote smart_1 = new Lote();				
				if(smart_1.getDisponibilidad().equals("Ocupado")) {
			        test_1.setBackground(Color.RED);  					
				}else {
			        test_1.setBackground(Color.GREEN);  					
				}
				Lote smart_2 = new Lote();				
				if(smart_2.getDisponibilidad().equals("Ocupado")) {
			        test_2.setBackground(Color.RED);  					
				}else {
			        test_2.setBackground(Color.GREEN);  					
				}
				Lote smart_3 = new Lote();				
				if(smart_3.getDisponibilidad().equals("Ocupado")) {
			        test_3.setBackground(Color.RED);  					
				}else {
			        test_3.setBackground(Color.GREEN);  					
				}
				Lote smart_4 = new Lote();				
				if(smart_4.getDisponibilidad().equals("Ocupado")) {
			        test_4.setBackground(Color.RED);  					
				}else {
			        test_4.setBackground(Color.GREEN);  					
				}
			}
        });    	
    }

	@Override
	public void actionPerformed(ActionEvent arg0) { 
		Principal ventana = new Principal();
		ventana.setVisible(true);
		this.dispose();
	}
}
