/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
/**
 *
 * @author Ce
 */
public class metodos {
  
    public int estacionamiento[][] = new int [10][10];
    public  void llenado() { //llenado del array
    for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                estacionamiento[i][j] = 0;
            }
        }
    }
    public void mostrar(){ // mostrar el estado del array
    for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(estacionamiento[i][j]+"\t");
            }
            System.out.println();
        }
    } 
    public int[] señalartf(){ //señal momentanea para testeo
    Random rdm = new Random();
    int señal[] = new int[2];
    //int cantseñales= rdm.nextInt(100);
    //for(int i=0;cantseñales>i;i++){
    señal[0] = rdm.nextInt(10);
    señal[1] = rdm.nextInt(10);
    //return señal; no se si hace lo que necesito 
    return señal;
    } 
    public void cambioest(int señal[]){
    int posx = señal[0];//posicion x del arrelo estacionamiento
    int posy = señal[1];//posicion y del arreglo
    if (estacionamiento[posx][posy]==0){ //cambia el valor de la pocision que indica la señal 
    estacionamiento[posx][posy]=1;
    }else {
    estacionamiento[posx][posy]=0;
    }
    }
    }
