/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import controlador.ControladorLogin;
import controlador.ControladorSubasta;
import controlador.ControladorUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import modelo.dao.OracleUsuarioDAO;
import proyecto1.utilities.MessageUtil;
import vista.VistaLogin;

/**
 *
 * @author oscar
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*try {
            Usuario usuario = new Usuario();
            
            usuario.setNombre("nombre");
            usuario.setApellido1("apellido1");
            usuario.setApellido2("apellido2");
            usuario.setCorreo("correo");
            usuario.setDireccion("direccion");
            usuario.setAlias("alias4");
            usuario.setContrasenha("contrasena");
            usuario.setRol(1);
            OracleUsuarioDAO dao = new OracleUsuarioDAO("alias", "admin p4ssw0rd");
            //OracleUsuarioDAO dao = new OracleUsuarioDAO("alias", "VEGA 123");
            dao.agregarUsuario(usuario);
            new ControladorLogin();
            new ControladorUsuario("oscar", "admin p4ssw0rd");
            
            //new MessageUtil("Hola", "Mundo").generarMensaje();
            
            /*try {
            // TODO code application logic here
            //new Login().setVisible(true);
            
            OracleUsuarioDAO ouDAO = new OracleUsuarioDAO();
            ouDAO.validarLogin("admin1", "admin1p");
            } catch (SQLException ex) {
            new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
            //System.out.println(ex.getMessage().split(regex));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //new ControladorSubasta("oscar", "partic p4ssw0rd");
        new ControladorUsuario("oscar", "admin p4ssw0rd");
        //new ControladorLogin();
    }
    
}
