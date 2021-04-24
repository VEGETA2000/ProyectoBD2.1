/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;


import java.sql.SQLException;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author oscar
 */
public interface UsuarioDAO {
    
    public List<Usuario> obtenerCompras(String alias) throws SQLException;
    public List<Usuario> obtenerVentas(String alias) throws SQLException;
    public Usuario buscarUsuario() throws SQLException;
    public void agregarUsuario(Usuario usuario) throws SQLException;
    public void modificarUsuario(String alias) throws SQLException;
    public void eliminarUsuario(String alias) throws SQLException;
    
}
