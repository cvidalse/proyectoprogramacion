/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arduinojavamaven;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import manejodedatos.manejoDatos;

/**
 *
 * @author Ce
 */
public class Lote implements cambioEstado {

    String uso = "";
    private boolean estado;
    private static ArrayList listeners;
    private manejoDatos md;

    public Lote() {
        estado = false;
        listeners = new ArrayList<>();
        md = new manejoDatos();
    }

    public void addEventListener(ChangeEvent listener) {
        listeners.add(listener);
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(int entrada) {
        if (entrada == 49) {//numero 1 en ascii
            this.triggerEnEstadoEvent();
            this.estado = true;
        } else {
            this.triggerOcupadoEvent();
            this.estado = false;
        }
    }

    @Override
    public void enEstado(ChangeEvent ev) {
        java.util.Date fecha = new Date();
        this.uso = "" + fecha;
    }

    @Override
    public void enOcupado(ChangeEvent ev) {
        java.util.Date fecha = new Date();
        this.uso += "" + fecha;
        md.archivo(uso);
        this.uso = "";
    }

    private void triggerEnEstadoEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            cambioEstado listener = (cambioEstado) li.next();
            ChangeEvent readerEvObj = new ChangeEvent(this, this);
            (listener).enEstado(readerEvObj);
        }
    }

    private void triggerOcupadoEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            cambioEstado listener = (cambioEstado) li.next();
            ChangeEvent readerEvObj = new ChangeEvent(this, this);
            (listener).enOcupado(readerEvObj);
        }
    }

}
