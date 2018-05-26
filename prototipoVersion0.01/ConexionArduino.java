/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arduinojavamaven;

import com.panamahitek.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.*;

/**
 *
 * @author Ce
 */
public class ConexionArduino extends javax.swing.JFrame {

    static private PanamaHitek_Arduino ph = new PanamaHitek_Arduino();
    SerialPortEventListener events = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
        try{
        if(ph.isMessageAvailable()){
            ph.receiveData();
        System.out.println(ph.printMessage());
        }
        }   catch (SerialPortException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
   
//    static SerialPort serialPort;

//    public void openPorts() throws SerialPortException {
//       
//        serialPort = new SerialPort(puerto);
//        serialPort.openPort();
//        serialPort.setParams(9600, 8, 1, 0);
//        throw new SerialPortException("asdas","adas","dasda");
//    }

    public ConexionArduino()  {
     

      try{
          
            ph.arduinoRX("COM10", 9600, events);
    }catch(ArduinoException AE){
     System.out.println("fallo al crear la conexion");
    }       catch (SerialPortException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }


    }}
