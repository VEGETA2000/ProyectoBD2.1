/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaAdministrador;

/**
 *
 * @author oscar
 */
public class ControladorAdministrador {
    
    private String alias;
    private String cifrado;
    private VistaAdministrador vistaAdministrador;

    public ControladorAdministrador(String alias, String cifrado) {
        this.alias = alias;
        this.cifrado = cifrado;
        this.vistaAdministrador = new VistaAdministrador();
        this.vistaAdministrador.jbtUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaAdministrador.dispose();
                new ControladorUsuario(alias, cifrado);
            }            
        });
        this.vistaAdministrador.setVisible(true);
    }    
    
}
