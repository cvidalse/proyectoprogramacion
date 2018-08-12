package gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Esta es la ventana principal del proyecto
 * Es la presentación del proyecto y hace de puente con otra ventana
 * @author SRobles97
 *
 */
@SuppressWarnings("serial")
public class GuiPrincipal extends JFrame implements ActionListener {
	/**
	 * Este JButton llama al metodo cambioVentana();
	 */
	private JButton mostrar;
	/**
	 * Este JLabel muestra una imagen
	 */
	private JLabel imagen;
	/**
	 * Este JLabel muestra la version del programa
	 */
	private JLabel version;
	/**
	 * Este JButton muestra un messageDialog con los correos electronicos
	 */
	private JButton contacto;
    /**
     * Este Container se utiliza solo para cambiar el color de fondo
     */
    private Container contenido;
	/**
	 * URL para alojar la imagen
	 */
	private URL rutaImagen;
	/**
	 * Lee la URL de la imagen
	 */
	private BufferedImage spImagen;
	
	/**
	 * Constructor de la clase
	 * Aqui se llama a los otros metodos y se hace visible el JFrame
	 */
	GuiPrincipal(){
	 super();
	 configuracionVentana();
	 inicioComponentes();
	 agregarImagen();
	 accionBoton();
   	 this.contenido = this.getContentPane();
     this.contenido.setBackground(SystemColor.inactiveCaptionBorder);
	 this.setVisible(true);
	}
	
    /**
     * Este metodo configura el tamaño,titulo,layout y otros aspectos de la ventana
     */
    private void configuracionVentana() {
     this.setTitle("Smart Parking");               
	 this.setBounds(100, 100, 788, 479);       
	 this.setIconImage(Toolkit.getDefaultToolkit().getImage(GuiPrincipal.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
     this.setLocationRelativeTo(null);                     
     this.setLayout(null);                                
     this.setResizable(false);          
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
    
    /**
     * En este metodo se instancias las variables y se agregan al JFrame
     */
    private void inicioComponentes() {
     mostrar = new JButton();
     mostrar.setText("Mostrar Estacionamiento");
     mostrar.setBounds(305, 313, 184, 63);
	 contacto = new JButton();
  	 contacto.setIcon(new ImageIcon(GuiPrincipal.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
	 contacto.setBounds(12, 13, 36, 29);
 	 imagen = new JLabel();
 	 imagen.setBounds(273, 48, 252, 252);
 	 imagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 	 version = new JLabel("v0.7");
 	 version.setFont(new Font("Consolas", Font.ITALIC, 13));
  	 version.setBounds(748, 3, 29, 16);
     this.add(mostrar);
     this.add(contacto);
     this.add(imagen);
     this.add(version);
    }
	
    /**
     * En este metodo se establece la imagen
     */
    private void agregarImagen(){
	    	try {
			rutaImagen = new URL("https://raw.githubusercontent.com/cvidalse/proyectoprogramacion/master/prototipoGUI/gui/icon/testing.jpg");
			spImagen = ImageIO.read(rutaImagen);
			imagen.setIcon(new ImageIcon(spImagen));
	                this.add(imagen);
		} catch (IOException e) {
			imagen.setText("Imagen no disponible");
	      	        this.add(imagen);
		}
    }
    
    /**
     * Este metodo define las acciones que realizaran los botones
     */
    private void accionBoton() {
        mostrar.addActionListener(this);
        contacto.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contenido,
					    "c.vidal09@ufromail.cl\nm.bustos06@ufromail.cl\ns.robles01@ufromail.cl",
					    "Contacto",
					    JOptionPane.INFORMATION_MESSAGE);		
			}
        });   
    }
	
    /**
     * Este metodo se llama a traves de un boton y lo que hace es cerrar esta ventana
     * y abrir la ventana del estacionamiento
     */
    private void cambioVentana() {
    @SuppressWarnings("unused")
	GuiEstacionamiento estacionamiento = new GuiEstacionamiento();
    this.dispose();
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
	cambioVentana();
	}

}
