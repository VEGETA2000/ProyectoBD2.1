/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Toolkit;

/**
 *
 * @author oscar
 */
public class VistaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VistaUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Administrar Usuarios");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbRoles1 = new javax.swing.JComboBox<>();
        jbtAgregarUsuario1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jtxApellido1 = new javax.swing.JTextField();
        jtxApellido2 = new javax.swing.JTextField();
        jtxDireccion = new javax.swing.JTextField();
        jtxAlias = new javax.swing.JTextField();
        jpassContrasenha = new javax.swing.JPasswordField();
        jtxCorreo = new javax.swing.JTextField();
        jtxTelefono = new javax.swing.JTextField();
        jcbTipoTelefono = new javax.swing.JComboBox<>();
        jcbRoles = new javax.swing.JComboBox<>();
        jbtEliminarUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistaDeTelefonos = new javax.swing.JList<>();
        jbtEliminarTelefono = new javax.swing.JButton();
        jbtActualizarUsuario = new javax.swing.JButton();
        jbtBuscarUsuario = new javax.swing.JButton();
        jbtAgregarUsuario = new javax.swing.JButton();
        jbtAgregarTelefono = new javax.swing.JButton();
        jlaFondo = new javax.swing.JLabel();

        jcbRoles1.setBackground(new java.awt.Color(0, 0, 51));
        jcbRoles1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbRoles1.setForeground(new java.awt.Color(255, 255, 255));
        jcbRoles1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular", "Trabajo", "Casa", "Otros" }));

        jbtAgregarUsuario1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtAgregarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jbtAgregarUsuario1.setText("Agregar Usuario");
        jbtAgregarUsuario1.setContentAreaFilled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/subasta.png")));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administar Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alias");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rol");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jtxNombre.setBackground(new java.awt.Color(0, 0, 51));
        jtxNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, -1));

        jtxApellido1.setBackground(new java.awt.Color(0, 0, 51));
        jtxApellido1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxApellido1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 260, -1));

        jtxApellido2.setBackground(new java.awt.Color(0, 0, 51));
        jtxApellido2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxApellido2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 260, -1));

        jtxDireccion.setBackground(new java.awt.Color(0, 0, 51));
        jtxDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxDireccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 260, -1));

        jtxAlias.setBackground(new java.awt.Color(0, 0, 51));
        jtxAlias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxAlias.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 260, -1));

        jpassContrasenha.setBackground(new java.awt.Color(0, 0, 51));
        jpassContrasenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpassContrasenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jpassContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 260, -1));

        jtxCorreo.setBackground(new java.awt.Color(0, 0, 51));
        jtxCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxCorreo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 260, -1));

        jtxTelefono.setBackground(new java.awt.Color(0, 0, 51));
        jtxTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxTelefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtxTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 260, -1));

        jcbTipoTelefono.setBackground(new java.awt.Color(0, 0, 51));
        jcbTipoTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbTipoTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jcbTipoTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Celular", "Trabajo", "Casa", "Otros" }));
        getContentPane().add(jcbTipoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 260, -1));

        jcbRoles.setBackground(new java.awt.Color(0, 0, 51));
        jcbRoles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbRoles.setForeground(new java.awt.Color(255, 255, 255));
        jcbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Administrador", "Participante" }));
        getContentPane().add(jcbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 260, -1));

        jbtEliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtEliminarUsuario.setText("Eliminar");
        jbtEliminarUsuario.setContentAreaFilled(false);
        getContentPane().add(jbtEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 51));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jlistaDeTelefonos.setBackground(new java.awt.Color(0, 0, 51));
        jlistaDeTelefonos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlistaDeTelefonos.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jlistaDeTelefonos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 260, 110));

        jbtEliminarTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtEliminarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jbtEliminarTelefono.setText("Eliminar Telefono");
        jbtEliminarTelefono.setContentAreaFilled(false);
        getContentPane().add(jbtEliminarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jbtActualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtActualizarUsuario.setText("Actualizar");
        jbtActualizarUsuario.setContentAreaFilled(false);
        getContentPane().add(jbtActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        jbtBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtBuscarUsuario.setText("Buscar");
        jbtBuscarUsuario.setContentAreaFilled(false);
        getContentPane().add(jbtBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jbtAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtAgregarUsuario.setText("Agregar");
        jbtAgregarUsuario.setContentAreaFilled(false);
        getContentPane().add(jbtAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, -1, -1));

        jbtAgregarTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtAgregarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jbtAgregarTelefono.setText("Agregar Teléfono");
        jbtAgregarTelefono.setContentAreaFilled(false);
        getContentPane().add(jbtAgregarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jlaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jlaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtActualizarUsuario;
    public javax.swing.JButton jbtAgregarTelefono;
    public javax.swing.JButton jbtAgregarUsuario;
    public javax.swing.JButton jbtAgregarUsuario1;
    public javax.swing.JButton jbtBuscarUsuario;
    public javax.swing.JButton jbtEliminarTelefono;
    public javax.swing.JButton jbtEliminarUsuario;
    public javax.swing.JComboBox<String> jcbRoles;
    private javax.swing.JComboBox<String> jcbRoles1;
    public javax.swing.JComboBox<String> jcbTipoTelefono;
    private javax.swing.JLabel jlaFondo;
    public javax.swing.JList<String> jlistaDeTelefonos;
    public javax.swing.JPasswordField jpassContrasenha;
    public javax.swing.JTextField jtxAlias;
    public javax.swing.JTextField jtxApellido1;
    public javax.swing.JTextField jtxApellido2;
    public javax.swing.JTextField jtxCorreo;
    public javax.swing.JTextField jtxDireccion;
    public javax.swing.JTextField jtxNombre;
    public javax.swing.JTextField jtxTelefono;
    // End of variables declaration//GEN-END:variables
}