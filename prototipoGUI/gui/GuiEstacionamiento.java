package gui;

import javax.swing.*;
import javax.swing.border.*;
import testing.Lote;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GuiEstacionamiento extends JFrame implements ActionListener {
	private JButton volver;
	private JLabel texto;
	private JButton actualizar;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel disponible;
	private JPanel ocupado;
        private Container contenido;
	private Lote testing;
	private JLabel lblOcupado;
	private JLabel lblDisponible;
	
	public GuiEstacionamiento() {
	super();
	configuracionVentana();
	inicioComponentes();
	configPaneles();
	this.testing = new Lote();
    	this.contenido = this.getContentPane();
    	this.contenido.setBackground(SystemColor.inactiveCaptionBorder);
	accionBoton();
	this.setVisible(true);
	}
	
    private void configuracionVentana() {     
        this.setTitle("Smart Parking - Estacionamiento");   
	this.setBounds(100, 100, 789, 625); 
	this.setIconImage(Toolkit.getDefaultToolkit().getImage(GuiEstacionamiento.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                
        this.setResizable(false);          
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    
    }
    
    private void inicioComponentes() {
	volver = new JButton("Volver");
	volver.setIcon(new ImageIcon(GuiEstacionamiento.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
	volver.setBounds(12, 13, 105, 29);
	texto = new JLabel("Smart Parking");
	texto.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 40));
	texto.setBounds(290, 0, 238, 57);		
	actualizar = new JButton("Actualizar");
	actualizar.setBounds(342, 456, 97, 48);
	lblOcupado = new JLabel("Ocupado");
	lblOcupado.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblOcupado.setBounds(181, 517, 96, 40);
	lblDisponible = new JLabel("Disponible");
	lblDisponible.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblDisponible.setBounds(515, 517, 96, 40);
	this.add(lblDisponible);
	this.add(lblOcupado);
        this.add(volver);
        this.add(texto);
        this.add(actualizar);
    }
    
    private void configPaneles() {
    	panel_1 = new JPanel();
    	panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_1.setBounds(19, 70, 96, 110);
    	this.add(panel_1);
    	
    	panel_2 = new JPanel();
    	panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_2.setBounds(127, 70, 96, 110);
    	this.add(panel_2);
    	
    	panel_3 = new JPanel();
    	panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_3.setBounds(235, 70, 96, 110);
    	this.add(panel_3);
    	
    	panel_4 = new JPanel();
    	panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_4.setBounds(343, 70, 96, 110); 
    	this.add(panel_4);   	
    	
    	panel_5 = new JPanel();
    	panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_5.setBounds(451, 70, 96, 110);
    	this.add(panel_5);
    	
    	panel_6 = new JPanel();
    	panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_6.setBounds(559, 70, 96, 110);
    	this.add(panel_6);   
    	
    	panel_7 = new JPanel();
    	panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_7.setBounds(667, 70, 96, 110);
    	this.add(panel_7);
    	
    	panel_8 = new JPanel();
    	panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_8.setBounds(19, 193, 96, 110);
    	this.add(panel_8);
    	
    	panel_9 = new JPanel();
    	panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_9.setBounds(127, 193, 96, 110);
    	this.add(panel_9);
    	
    	panel_10 = new JPanel();
    	panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_10.setBounds(235, 193, 96, 110);
    	this.add(panel_10);
    	
    	panel_11 = new JPanel();
    	panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_11.setBounds(343, 193, 96, 110);
    	this.add(panel_11);
    	
    	panel_12 = new JPanel();
    	panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_12.setBounds(451, 193, 96, 110);
    	this.add(panel_12);
    	
    	panel_13 = new JPanel();
    	panel_13.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_13.setBounds(559, 193, 96, 110);
    	this.add(panel_13);
    	
    	panel_14 = new JPanel();
    	panel_14.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_14.setBounds(667, 193, 96, 110);
    	this.add(panel_14);
    	
    	panel_15 = new JPanel();
    	panel_15.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_15.setBounds(19, 321, 96, 110); 
    	this.add(panel_15);   	
    	
    	panel_16 = new JPanel();
    	panel_16.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_16.setBounds(127, 321, 96, 110);
    	this.add(panel_16);  	
    	
    	panel_17 = new JPanel();
    	panel_17.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_17.setBounds(235, 321, 96, 110);
    	this.add(panel_17);  
    	
    	panel_18 = new JPanel();
    	panel_18.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_18.setBounds(343, 321, 96, 110);
    	this.add(panel_18);  	
    	
    	panel_19 = new JPanel();
    	panel_19.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_19.setBounds(451, 321, 96, 110);
    	this.add(panel_19);
    	
    	panel_20 = new JPanel();
    	panel_20.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_20.setBounds(559, 321, 96, 110);
    	this.add(panel_20);
    	
    	panel_21 = new JPanel();
    	panel_21.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	panel_21.setBounds(667, 321, 96, 110);
    	this.add(panel_21);
    	
    	disponible = new JPanel();
    	disponible.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	disponible.setBackground(SystemColor.activeCaptionBorder);
    	disponible.setBounds(608, 517, 47, 40);
    	this.add(disponible);
    	
    	ocupado = new JPanel();
    	ocupado.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
    	ocupado.setBackground(SystemColor.textHighlight);
    	ocupado.setBounds(127, 517, 47, 40);
    	this.add(ocupado);    	
    	
    }
    
    private void accionBoton() {
        volver.addActionListener(this);
        actualizar.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
		testing.setColor(panel_1);
		testing.setColor(panel_2);
		testing.setColor(panel_3);
		testing.setColor(panel_4);
		testing.setColor(panel_5);
		testing.setColor(panel_6);
		testing.setColor(panel_7);
		testing.setColor(panel_8);
		testing.setColor(panel_9);
		testing.setColor(panel_10);
		testing.setColor(panel_11);
		testing.setColor(panel_12);
		testing.setColor(panel_13);
		testing.setColor(panel_14);
		testing.setColor(panel_15);
		testing.setColor(panel_16);
		testing.setColor(panel_17);
		testing.setColor(panel_18);
		testing.setColor(panel_19);
		testing.setColor(panel_20);
		testing.setColor(panel_21);	
			}
        });    	
       this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
				JOptionPane.showMessageDialog(contenido,
					    "Para cerrar el programa debe hacerlo desde la ventana anterior.",
					    "Información",
					    JOptionPane.INFORMATION_MESSAGE);		
			}
        });   
    }
			  
    private void cambioVentana(){
	    @SuppressWarnings("unused")
	    GuiPrincipal menu = new GuiPrincipal();
	    this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		cambioVentana();
    }

    }
