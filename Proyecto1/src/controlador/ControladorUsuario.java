/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import modelo.Telefono;
import modelo.Usuario;
import modelo.dao.OracleUsuarioDAO;
import proyecto1.utilities.MessageUtil;
import vista.VistaUsuario;

/**
 *
 * @author oscar
 */
public class ControladorUsuario {
    
    private VistaUsuario vistaUsuario;
    private String alias;
    private String cifrado;
    private Usuario usuario;
    private Usuario usuarioClonado;
    private DefaultListModel listaTelefonos;
    private OracleUsuarioDAO dao;

    public ControladorUsuario(String alias, String cifrado) {
        this.alias = alias;
        this.cifrado = cifrado;
        this.usuario = new Usuario();
        this.listaTelefonos = new DefaultListModel();
        this.dao = new OracleUsuarioDAO(cifrado);
        this.vistaUsuario = new VistaUsuario();
        this.vistaUsuario.jbtAgregarTelefono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTelefono();
            }        
        });
        this.vistaUsuario.jbtAgregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
            }            
        });
        this.vistaUsuario.jbtBuscarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }            
        });
        this.vistaUsuario.jbtEliminarTelefono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTelefono();
            }            
        });
        this.vistaUsuario.setVisible(true);
    }
    
    public void eliminarTelefono() {
        if(!vistaUsuario.jlistaDeTelefonos.isSelectionEmpty()) {
            try {
                int indice = vistaUsuario.jlistaDeTelefonos.getSelectedIndex();
                usuarioClonado.eliminarTelefono(indice);
                String[] dividir = vistaUsuario.jlistaDeTelefonos
                        .getSelectedValue().split(" =====> ");
                listaTelefonos.remove(indice);
                dao.eliminarTelefono(Integer.parseInt(dividir[0]));
            } catch (Exception ex) {
                new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
            }
        }        
    }
    
    public void buscarUsuario() {
        try {            
            this.usuario = dao.buscarUsuario();
            if (usuario != null) {
                this.usuarioClonado = (Usuario)this.usuario.clone();
                reflejarDatosInterfaz (usuarioClonado);
            }
        } catch (SQLException ex) {
            new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
        }
    }
    
    private void reflejarDatosInterfaz(Usuario encontrado) {
        if(encontrado != null) {
            vistaUsuario.jtxNombre.setText(encontrado.getNombre());
            vistaUsuario.jtxApellido1.setText(encontrado.getApellido1());
            vistaUsuario.jtxApellido2.setText(encontrado.getApellido2());
            vistaUsuario.jtxCorreo.setText(encontrado.getCorreo());
            vistaUsuario.jtxDireccion.setText(encontrado.getDireccion());
            vistaUsuario.jtxAlias.setText(encontrado.getAlias());
            vistaUsuario.jpassContrasenha.setText(encontrado.getContrasenha());
            vistaUsuario.jcbRoles.setSelectedIndex(encontrado.getRol());
            listaTelefonos = new DefaultListModel();
            for (Telefono telefono:encontrado.getTelefonos()) {
                listaTelefonos
                        .addElement(
                        telefono.getNumero()
                        + " =====> " 
                        + vistaUsuario.jcbTipoTelefono
                                .getItemAt(telefono.getTipo()));
            }
            vistaUsuario.jlistaDeTelefonos.setModel(listaTelefonos);
        }
    }
    
    public void agregarUsuario() {
        try {
            String nombre = vistaUsuario.jtxNombre.getText();
            String apellido1 = vistaUsuario.jtxApellido1.getText();
            String apellido2 = vistaUsuario.jtxApellido2.getText();
            String correo = vistaUsuario.jtxCorreo.getText();
            String direccion = vistaUsuario.jtxDireccion.getText();
            String alias = vistaUsuario.jtxAlias.getText();
            String contraseña = String.valueOf(
                    vistaUsuario.jpassContrasenha.getPassword());
            int rol = vistaUsuario.jcbRoles.getSelectedIndex();
            
            if (nombre.equals("") || apellido1.equals("") || apellido2.equals("")
                    || correo.equals("") || direccion.equals("")
                    || alias.equals("") || rol<1 || listaTelefonos.isEmpty()){
                new MessageUtil("Precuación", 
                        "Todos los campos tienen que ser llenados")
                        .generarMensaje();
            }
            else {
                usuario.setNombre(nombre);
                usuario.setApellido1(apellido1);
                usuario.setApellido2(apellido2);
                usuario.setCorreo(correo);
                usuario.setDireccion(direccion);
                usuario.setAlias(alias);
                usuario.setContrasenha(contraseña);
                usuario.setRol(rol);
                dao.agregarUsuario(usuario);
                new MessageUtil("Insertar Usuario", 
                        "El usuario fue agregado a la base de datos")
                        .generarMensaje();
                usuarioClonado = (Usuario)usuario.clone();
                vistaUsuario.jtxNombre.setText("");
                vistaUsuario.jtxApellido1.setText("");;
                vistaUsuario.jtxApellido2.setText("");
                vistaUsuario.jtxCorreo.setText("");
                vistaUsuario.jtxDireccion.setText("");;
                vistaUsuario.jtxAlias.setText("");;
                vistaUsuario.jpassContrasenha.setText("");
                vistaUsuario.jcbRoles.setSelectedIndex(0);
                usuario.setTelefonos(new ArrayList());
                listaTelefonos = new DefaultListModel();
                vistaUsuario.jlistaDeTelefonos.setModel(listaTelefonos);
            }
        } catch (SQLException ex) {
            new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
        }
    }
    
    public void agregarTelefono() {
        try {
            if(!this.vistaUsuario.jtxTelefono.getText().equals("") 
                    && this.vistaUsuario.jcbTipoTelefono.getSelectedIndex()>0) {
                this.usuario.agregarTelefono(
                        Integer.parseInt(
                                this.vistaUsuario.jtxTelefono.getText())
                        , this.vistaUsuario.jcbTipoTelefono.getSelectedIndex());
                this.listaTelefonos
                        .addElement(
                                this.vistaUsuario
                                        .jcbTipoTelefono.getSelectedItem()
                        + " =====> " + this.vistaUsuario.jtxTelefono.getText());
                this.vistaUsuario.jlistaDeTelefonos.setModel(listaTelefonos);
                this.vistaUsuario.jtxTelefono.setText("");
                this.vistaUsuario.jcbTipoTelefono.setSelectedIndex(0);
                this.vistaUsuario.jlistaDeTelefonos.setSelectedIndex(0);
            }
        }
        catch (Exception ex) {
            new MessageUtil("Precuación", "El formato para teléfono es ########").generarMensaje();
        }
    }


    
}
