/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arduinojavamaven;

/**
 *
 * @author Ce
 */
public class Lote {

    private boolean estado;

    
    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(int entrada) {
        if (entrada == 1) {
            this.estado = true;
        } else {
            this.estado = false;
        }
    }

}
