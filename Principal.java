package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends JFrame implements ActionListener{
    private JButton menu;
    Mapa ventana;
    
    Principal(){
    	super();
    	this.menu = new JButton();
    	this.ventana = new Mapa();
    	configuracionVentana();
    	inicioComponentes();
    }
    
    private void configuracionVentana() {
        this.setTitle("Smart Parking");               
        this.setSize(510, 310);                               
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                
        this.setResizable(false);                            
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     	
    }
    
    private void inicioComponentes() {
        menu.setText("Ver");
        menu.setBounds(220, 180, 80, 30);
        menu.addActionListener(this);  
        this.add(menu);
    }


	@Override
	public void actionPerformed(ActionEvent arg0) {
        this.setVisible(false);	
        ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		Principal test = new Principal();
		test.setVisible(true);
	}

	public void volver() {
    	this.setVisible(true);
	}
    
    

}
