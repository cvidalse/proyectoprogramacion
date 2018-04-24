/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Ce
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    metodos m = new metodos();
    m.llenado();
    Timer timer = new Timer();
    TimerTask act = new TimerTask() {
        @Override
        public void run() {
       
            
        m.cambioest(m.señalartf());
        }
    };
    timer.schedule(act, 0, 100); //el primer termino muestra el objeto que se ejecuta, el segundo el delay y el tercero el intervalo
    
     TimerTask act1 = new TimerTask() {
        @Override
        public void run() {
        m.mostrar();
        }
    };
    timer.schedule(act1, 1000, 4000);
    }
    
}
