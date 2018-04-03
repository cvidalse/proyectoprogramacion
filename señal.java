/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarduinos;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.TooManyListenersException;

/**
 *
 * @author Ce
 */
public class señal {
 private OutputStream Output = null;
 private InputStream Input = null;
 SerialPort serialPort;
 private final String PORT_NAME = "COM3";
 private static final int TIME_OUT = 2000;
 private static final int DATA_RATE = 9600;
 
 SerialPortEventListener evento = new SerialPortEventListener() {
     @Override
     public void serialEvent(SerialPortEvent spe) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
 };
public void ArduinoConnection(){
  CommPortIdentifier portId = null;
  Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

  while (portEnum.hasMoreElements()){
    CommPortIdentifier currPortId =(CommPortIdentifier)portEnum.nextElement();

    if(PORT_NAME.equals(currPortId.getName())){
      portId = currPortId;
      break;
      }
    if(portId == null){
      System.exit(1);
      return;
      }
      try{
        serialPort = (SerialPort)portId.open(this.getClass().getName(),TIME_OUT);

         serialPort.setSerialPortParams(DATA_RATE,
         SerialPort.DATABITS_8,
         SerialPort.STOPBITS_1,
         SerialPort.PARITY_NONE);

         Output = serialPort.getOutputStream();
         Input = serialPort.getInputStream();

         serialPort.addEventListener((SerialPortEventListener) this);
         serialPort.notifyOnDataAvailable(true);
         } catch(PortInUseException | UnsupportedCommOperationException | IOException | TooManyListenersException e){
          System.exit(1);
         }
    }
      
}

    /**
     *
     * @param oEvent
     */
    public synchronized void serialEvent(SerialPortEvent oEvent){
     if(oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE){
     try{
         int datos;
         datos = RecibirDatos();
         System.out.println((char)datos);
     }catch(Exception e){
     System.err.println(e.toString());
     }
     
     }

}

    private int RecibirDatos() throws IOException{
    int Output = 0;
    Output = Input.read();
    return Output;
    }
}
