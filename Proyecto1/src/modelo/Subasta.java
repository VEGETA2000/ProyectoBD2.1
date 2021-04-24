/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author oscar
 */
public class Subasta {
    
    private double precioBase;
    private double precioFinal;
    private String detallesDeEntrega;
    private String alias;
    private Item item;
    private Date fechaHoraInicio;
    private Date fechaHoraFinal;
    private char habilitado;

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getDetallesDeEntrega() {
        return detallesDeEntrega;
    }

    public void setDetallesDeEntrega(String detallesDeEntrega) {
        this.detallesDeEntrega = detallesDeEntrega;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFinal() {
        return fechaHoraFinal;
    }

    public void setFechaHoraFinal(Date fechaHoraFinal) {
        this.fechaHoraFinal = fechaHoraFinal;
    }

    public char getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(char habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Subasta{" + "precioBase=" + precioBase + ", precioFinal=" + precioFinal + ", detallesDeEntrega=" + detallesDeEntrega + ", alias=" + alias + ", item=" + item + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFinal=" + fechaHoraFinal + ", habilitado=" + habilitado + '}';
    }
    
}
