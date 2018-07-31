/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularEstadia;


/**
 *
 * @author marce
 */
public class CalcularEstadia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //este programa para usarse como modelo, las partes comentadas son secciones en desarrollo
        
        //este es el String que almacena lo leido, se asume se le entregara una lina entera de texto
        String horaRAW = "15 de abril a las 00 30 10  2018    15 de abril a las 16 10 10     2018";
        
        //este melimina todos los caracters que no sean numeros, dejando solo los digitos de las horas de entrada y salida
        horaRAW = horaRAW.replaceAll("\\D+","");
        
        //aqui el string anterior se convierte en un array de chars para ser manipulados
        char[] horaChar = horaRAW.toCharArray();
        
        //varialbes que contendran los valors de las horas de entrada y salida
        //int diaEntrada;
        int horaEntrada;
        int minutoEntrada;
        int segundoEntrada;
        //int diaSalida;
        int horaSalida;
        int minutoSalida;
        int segundoSalida;

        // este es el :StrigBuild (sb) uno, se usa para poder convertir los "char" en "Strings" de 2 digitos
        StringBuilder sb1Entrada = new StringBuilder();
        sb1Entrada.append(horaChar[0]);
        sb1Entrada.append(horaChar[1]);

        StringBuilder sb2Entrada = new StringBuilder();
        sb2Entrada.append(horaChar[2]);
        sb2Entrada.append(horaChar[3]);
        
        StringBuilder sb3Entrada = new StringBuilder();
        sb3Entrada.append(horaChar[4]);
        sb3Entrada.append(horaChar[5]);
        
        StringBuilder sb4Entrada = new StringBuilder();
        sb4Entrada.append(horaChar[6]);
        sb4Entrada.append(horaChar[7]);
        
        StringBuilder sb1Salida = new StringBuilder();
        sb1Salida.append(horaChar[12]);
        sb1Salida.append(horaChar[13]);
        
        StringBuilder sb2Salida = new StringBuilder();
        sb2Salida.append(horaChar[14]);
        sb2Salida.append(horaChar[15]);
        
        StringBuilder sb3Salida = new StringBuilder();
        sb3Salida.append(horaChar[16]);
        sb3Salida.append(horaChar[17]);
        
        StringBuilder sb4Salida = new StringBuilder();
        sb4Salida.append(horaChar[18]);
        sb4Salida.append(horaChar[19]);
        
        
        //aqui cada "String" es convertdio en un "int" de dos digitos
        //diaEntrada = Integer.parseInt(sb1Entrada.toString());;
        horaEntrada = Integer.parseInt(sb2Entrada.toString());
        minutoEntrada = Integer.parseInt(sb3Entrada.toString());
        segundoEntrada = Integer.parseInt(sb4Entrada.toString());
        
        //diaSalida = Integer.parseInt(sb1Salida.toString());
        horaSalida = Integer.parseInt(sb2Salida.toString());
        minutoSalida= Integer.parseInt(sb3Salida.toString());
        segundoSalida = Integer.parseInt(sb4Salida.toString());
        
        //estos "ins" guardan la diferencia entre los valores de "entrada" y "salida" 
        //es decir los valores de "estadia"
        //int diaEstadia = diaSalida - diaEntrada;
        int horaEstadia = horaSalida - horaEntrada;
        int minutoEstadia = minutoSalida - minutoEntrada;
        int segundoEstadia = segundoSalida - segundoEntrada;
        
        //aqui se ajustan los valores "int" para que trabajen en formato de dias, horas, minutos, segundos
        /*if (diaEstadia > 0){
            
            diaEstadia -= 1; 
            
            if (horaEstadia >= 0 && minutoEstadia >= 0  && segundoEstadia >= 0){
                
                diaEstadia += 1;
            }   
        }*/
        
       if (horaEstadia < 0){
       
           horaEstadia += 24;
       }
       
       if (minutoEstadia < 0){
       
           minutoEstadia += 60;
           horaEstadia -= 1;  
       }
       
       if (segundoEstadia < 0){
      
           segundoEstadia += 60;
           minutoEstadia -= 1;   
       }
        
        String tiempoEstadia = /*diaEstadia +*/ " dias con " + horaEstadia + ":" + minutoEstadia + ":" + segundoEstadia;
        
        System.out.println("Tiempo de estadia " + tiempoEstadia);
        
        System.out.println("El tiempo de estadia fue de " /*+ diaEstadia + " dia(s) con "*/ + horaEstadia + " hora(s) con " + minutoEstadia + " minuto(s) y " + segundoEstadia + " segundo(s)");
    }
    
}
