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
public class Item {
    
    private String descripcion;
    private String categoria;
    private String subcategoria;

    public Item(String descripcion, String categoria, String subcategoria) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    @Override
    public String toString() {
        return "item{" + "descripcion=" + descripcion + ", categoria=" + categoria + ", subcategoria=" + subcategoria + '}';
    }    
}
