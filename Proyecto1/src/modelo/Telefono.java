/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Telefono {
    
    private int numero;
    private int tipo;   

    public Telefono(int numero, int tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
}
