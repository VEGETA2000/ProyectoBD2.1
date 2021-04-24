/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.utilities;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class MessageUtil {
    
    private String titulo;
    private String mensaje;
    
    

    public MessageUtil(String titulo, String mensaje) {
        this.titulo = titulo;
        /*if (mensaje.indexOf(": ")>=0) {
            String[] mensajeProcesado = mensaje.split(": "); 
            mensajeProcesado = mensajeProcesado[1].split("ORA-");
            this.mensaje = mensajeProcesado[0];
        }
        else
        {
            this.mensaje = mensaje;
        }*/
        this.mensaje = mensaje;
    }
    
    public void generarMensaje() {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/imagenes/subasta.png")));     
    }
    
}
