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
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import modelo.Item;
import modelo.Subasta;
import modelo.dao.OracleSubastaDAO;
import proyecto1.utilities.MessageUtil;
import vista.VistaSubasta;

/**
 *
 * @author oscar
 */
public class ControladorSubasta {
    
    private VistaSubasta vistaSubasta;
    private String alias;
    private String cifrado;
    private DefaultListModel listaSubasta;

    private OracleSubastaDAO dao;
    
    public ControladorSubasta(String alias, String cifrado) {
        this.alias = alias;
        this.cifrado = cifrado;
        this.listaSubasta = new DefaultListModel();
        this.dao = new OracleSubastaDAO(cifrado);
        this.vistaSubasta= new VistaSubasta();
        this.cargarCategorias();
        this.vistaSubasta.setVisible(true);
    }
    
    public void agregarSubasta() {
        VistaSubasta v = this.vistaSubasta;
        if(!v.jtxItem.getText().equals("") 
                && v.jcbSubCategoria.getSelectedItem()!=null) {
            Subasta nueva = new Subasta();
            Item item = new Item(v.jtxItem.getText(), v.jcbCategoria.getSelectedItem().toString(), v.jcbSubCategoria.getSelectedItem().toString());
            
        }
    }
    
    public void cargarCategorias(){
        try {
            String[] obj = dao.obtenerCategorias();            
            this.vistaSubasta.jcbCategoria.setModel(new DefaultComboBoxModel<>(obj));
            this.vistaSubasta.jcbCategoria.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        System.out.println(vistaSubasta.jcbCategoria.getSelectedItem().toString());
                        String[] obj = dao.obtenerSubCategorias(vistaSubasta.jcbCategoria.getSelectedItem().toString());
                        vistaSubasta.jcbSubCategoria.setModel(new DefaultComboBoxModel<>(obj));
                    } catch (SQLException ex) {
                        new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
                    }
                }
                
            });
        } catch (SQLException ex) {
            new MessageUtil("Precuación", ex.getMessage()).generarMensaje();
        }
    }
    
}
