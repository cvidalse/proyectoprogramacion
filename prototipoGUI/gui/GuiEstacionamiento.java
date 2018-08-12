package gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Esta es la ventana secundaria del proyecto
 * En esta ventana se muestra el estacionamiento y el estado
 * de cada lote
 * @author SRobles97
 */
@SuppressWarnings("serial")
public class GuiEstacionamiento extends JFrame implements ActionListener {
	/**
	 * Este JButton llama al metodo cambioVentana();
	 */
	private JButton volver;
	/**
	 * Este JLabel muestra un texto
	 */
	private JLabel texto;
	/**
	 * Este JButton actualiza el estado de los lotes
	 */
	private JButton actualizar;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_1;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_2;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_3;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_4;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_5;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_6;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_7;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_8;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_9;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_10;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_11;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_12;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_13;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_14;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_15;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_16;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_17;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_18;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_19;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_20;
	/**
	 * Representa el espacio de un estacionamiento
	 */
	private JPanel panel_21;
	/**
	 * Este JPanel sirve de leyenda para mostrar al usuario el color
	 * de un lote con el estado Disponible
	 */
	private JPanel disponible;
	/**
	 * Este JPanel sirve de leyenda para mostrar al usuario el color
	 * de un lote con el estado Ocupado
	 */
	private JPanel ocupado;
    /**
     * Este Container se utiliza solo para cambiar el color de fondo
     */
    private Container contenido;
	/**
	 * Este JLabel muestra un texto
	 */
	private JLabel lblOcupado;
	/**
	 * Este JLabel muestra un texto
	 */
	private JLabel lblDisponible;
	
	/**
	 * Constructor de la clase
	 * Aqui se llama a otros metodos y se hace visible el JFrame
	 */
	public GuiEstacionamiento() {
	super();
	configuracionVentana();
	inicioComponentes();
	configPaneles();
    this.contenido = this.getContentPane();
    this.contenido.setBackground(SystemColor.inactiveCaptionBorder);
	accionBoton();
	this.setVisible(true);
	}
	
    /**
     * Este metodo configura el tamaño,titulo,layout y otros aspectos de la ventana
     */
    private void configuracionVentana() {     
     this.setTitle("Smart Parking - Estacionamiento");   
	 this.setBounds(100, 100, 789, 625); 
	 this.setIconImage(Toolkit.getDefaultToolkit().getImage(GuiEstacionamiento.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
     this.setLocationRelativeTo(null);                     
     this.setLayout(null);                                
     this.setResizable(false);          
     this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    
    }
    
    /**
     * En este metodo se instancias las variables y se agregan al JFrame
     */
    private void inicioComponentes() {
	 volver = new JButton("Volver");
	 volver.setIcon(new ImageIcon(GuiEstacionamiento.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
	 volver.setBounds(12, 13, 105, 29);
	 texto = new JLabel("Smart Parking");
	 texto.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 40));
	 texto.setBounds(290, 0, 238, 57);		
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
    
    /**
     * Este metodo configura el tamaño,ubicación y el borde de los paneles
     * ademas de agregarlos al JFrame
     */
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
    
    /**
     * Este metodo configura las acciones de los botones del JFrame
     */
    private void accionBoton() {
        volver.addActionListener(this);
        actualizar.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {

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
			  
    /**
     * Este metodo se llama a traves de un boton y su funcion es cerrar la ventana
     * actual y llamar a la otra
     */
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
