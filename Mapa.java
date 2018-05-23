package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mapa extends JFrame implements ActionListener {
    private JButton btnVolver;
    private JButton btnActualizar;
    
    Mapa(){
    	super();
    	this.btnVolver = new JButton();
    	this.btnActualizar = new JButton();
    	configuration();
    	inicio();
    }
    
    private void configuration() {
        this.setTitle("Smart Parking: Estacionamiento");               
        this.setSize(510, 510);                               
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                
        this.setResizable(false);                            
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     	
    }
    
    private void inicio() {
        btnVolver.setText("Volver");
        btnVolver.setBounds(5, 10, 80, 30);
        btnVolver.addActionListener(this); 
        btnActualizar.setText("Actualizar");
        btnActualizar.setBounds(400, 10, 100, 30);        
        this.add(btnVolver);
        this.add(btnActualizar);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        this.setVisible(false);	
		
	}
}
