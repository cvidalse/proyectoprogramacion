/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arduinojavamaven;

import java.util.ArrayList;

/**
 *
 * @author Ce
 */
public class Estacionamiento {

    ArrayList<Lote> parte = new ArrayList<>();

    public int[] getColor(int pos) {
        boolean estado = parte.get(pos).getEstado();
        int[] color = new int[3];
        if (estado) {
            color[0] = 225;
            color[1] = 0;
            color[2] = 0;
            return color;
        } else {
            color[0] = 0;
            color[1] = 0;
            color[2] = 225;
            return color;
        }

    }

    public void actualizarEstado(int pos, int valorConexion) {
        parte.get(pos).setEstado(valorConexion);
    }

    private void add() {
        parte.add(new Lote());

    }
    
    
    
}
