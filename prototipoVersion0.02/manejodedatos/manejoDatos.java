/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodedatos;

import java.io.File;
import java.io.FileWriter;
import com.mycompany.arduinojavamaven.Estacionamiento;

/**
 *
 * @author Ce
 */
public class manejoDatos {

    public void archivo(String uso) {

        try {
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("registro.txt");

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

//Escribimos en el archivo con el metodo write 
            escribir.write(uso);

//Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
}
