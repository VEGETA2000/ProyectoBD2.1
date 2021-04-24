/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author oscar
 */
public class Usuario implements Cloneable{
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    private String direccion;
    private String alias;
    private String contrasenha;
    private int rol;
    private List<Telefono> telefonos; 

    public Usuario() {
        this.telefonos = new ArrayList<>();
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void agregarTelefono(int numero, int tipo) {
        this.telefonos.add(new Telefono(numero, tipo));
    }
    
    public void eliminarTelefono(int indice) {
        this.telefonos.remove(indice);
    }
    
    public Object clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        } 
        catch(CloneNotSupportedException e) {
            // No deberia suceder
        }
        return clone;
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
        final Usuario other = (Usuario) obj;
        if (this.rol != other.rol) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.alias, other.alias)) {
            return false;
        }
        if (!Objects.equals(this.contrasenha, other.contrasenha)) {
            return false;
        }
        return true;
    }    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido1=" + apellido1 
                + ", apellido2=" + apellido2 + ", direccion=" + direccion 
                + ", alias=" + alias + ", contrasenha=" + contrasenha 
                + ", telefonos=" + telefonos + '}';
    }    

}
