/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Telefono;
import modelo.Usuario;
import modelo.adapter.IDBAdapter;
import modelo.factory.DBFactory;
import modelo.factory.DBType;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;


/**
 *
 * @author oscar
 */
public class OracleUsuarioDAO implements UsuarioDAO {
    
    private IDBAdapter dbAdapter;
    private String cifrado;

    public OracleUsuarioDAO() {
        dbAdapter = DBFactory.getDefaultDBAdapter();
    }

    public OracleUsuarioDAO(String cifrado) {
        dbAdapter = DBFactory.getDBadapter(DBType.Oracle);
        this.cifrado = cifrado;
    }
    
    public void eliminarTelefono(int telefono) throws SQLException {
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);
        CallableStatement cs = con.prepareCall("{ call BORRARTELEFONO(?,?) }");
        System.out.println(telefono);
        cs.setInt(1, telefono);
        cs.registerOutParameter(2, OracleTypes.CURSOR);
        cs.executeQuery();
        con.close();        
    }
        
    public String validarLogin(String alias, String contrasenha) throws SQLException {
        Connection con = dbAdapter.getConnection();
        CallableStatement cs = con.prepareCall("{ call COMPROBARACCESO(?,?,?) }");
        cs.setString(1, alias);
        cs.setString(2, contrasenha);
        cs.registerOutParameter(3, OracleTypes.VARCHAR);
        cs.executeQuery();
        String csString = cs.getString(3);
        System.out.println(csString);
        con.close();
        return csString;
    }

    public void setCifrado(String cifrado) {
        this.cifrado = cifrado;
    }

    @Override
    public void agregarUsuario(Usuario usuario) throws SQLException {
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);        
        CallableStatement cs = con.prepareCall("{ call INGRESARUSUARIO(?,?,?,?,?,?,?,?,?) }");
        cs.setString(1, usuario.getNombre());
        cs.setString(2, usuario.getApellido1());
        cs.setString(3, usuario.getApellido2());
        cs.setString(4, usuario.getCorreo());
        cs.setString(5, usuario.getDireccion());
        cs.setString(6, usuario.getAlias());
        cs.setString(7, usuario.getContrasenha());
        cs.setInt(8, usuario.getRol());
        Object[] telefonoObj = new Object[2];
        List<Telefono> telefonos = usuario.getTelefonos();
        Struct[] struct = new Struct[telefonos.size()];
        int arrayIndex = 0;
        for (Telefono telefono : telefonos) {
            telefonoObj[0] = telefono.getNumero();
            telefonoObj[1] = telefono.getTipo();
            struct[arrayIndex++] = con.createStruct("TELEFONO", telefonoObj);
        }
        Array telefonosArray = ((OracleConnection)con).createOracleArray("ARREGLO_TELEFONOS", struct);
        cs.setArray(9, telefonosArray);
        cs.executeUpdate();
        con.close();
    }

    @Override
    public void modificarUsuario(String alias) throws SQLException {
        
    }

    @Override
    public void eliminarUsuario(String alias) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscarUsuario() throws SQLException {
        Usuario encontrado = new Usuario();
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);        
        CallableStatement cs = con.prepareCall("{ call OBTENERALIAS(?) }");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.executeQuery();
        ResultSet rs = (ResultSet) cs.getObject(1);
        List alias = new ArrayList<String>();
        while (rs.next()) {            
            alias.add(rs.getString(1));
        }
        //con.close();
        Object[] obj = new String[alias.size()];
        obj = alias.toArray(obj);
        Object usuarioBuscado = JOptionPane.showInputDialog(null,"Seleccione el usuario que busca", "Elegir",JOptionPane.QUESTION_MESSAGE,null,obj, obj[0]);
        if(usuarioBuscado != null) {
            cs = con.prepareCall("{ call OBTENERUSUARIO(?,?) }");
            cs.setString(1, usuarioBuscado.toString());
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.executeQuery();
            rs = (ResultSet) cs.getObject(2);
            int soloUnaVez = 0;
            while (rs.next()) {
                if (soloUnaVez == 0) {
                    encontrado.setNombre(rs.getString(2));
                    encontrado.setApellido1(rs.getString(3));
                    encontrado.setApellido2(rs.getString(4));
                    encontrado.setDireccion(rs.getString(5));
                    encontrado.setAlias(rs.getString(6));
                    encontrado.setContrasenha(rs.getString(7));
                    encontrado.setRol(rs.getInt(8));
                    encontrado.setCorreo(rs.getString(9));
                    soloUnaVez++;
                }
                encontrado.agregarTelefono(rs.getInt(10), rs.getInt(11));
            }
            con.close();
            return encontrado;
        }
        con.close();
        return null;
    }

    @Override
    public List<Usuario> obtenerCompras(String alias) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> obtenerVentas(String alias) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
