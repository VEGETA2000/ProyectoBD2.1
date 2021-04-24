/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dao.OracleUsuarioDAO;
import proyecto1.utilities.MessageUtil;
import vista.VistaLogin;

/**
 *
 * @author oscar
 */
public class ControladorLogin {
    
    private VistaLogin vistaLogin;

    public ControladorLogin() {
        this.vistaLogin = new VistaLogin();
        this.vistaLogin.jbtIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });
        this.vistaLogin.setVisible(true);
    }
    
    public void iniciarSesion() {
        try {
            OracleUsuarioDAO dao = new OracleUsuarioDAO();
            String alias = vistaLogin.jtxUsuario.getText();
            System.out.println(alias +" "+String.valueOf(vistaLogin.jpassContrasenha.getPassword()));
            String cifrado = dao.validarLogin(alias,
                    String.valueOf(vistaLogin.jpassContrasenha.getPassword()));            
            
            if (cifrado.indexOf("n p")>=0) {
                vistaLogin.dispose();
                new ControladorAdministrador(alias, cifrado);
            }
            else {
                
            }
            
        } catch (SQLException ex) {
            new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
        }
    }
    
}
