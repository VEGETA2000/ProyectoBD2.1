/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Subasta;
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
public class OracleSubastaDAO {
    
    private IDBAdapter dbAdapter;
    private String cifrado;

    public OracleSubastaDAO() {
        dbAdapter = DBFactory.getDefaultDBAdapter();
    }

    public OracleSubastaDAO(String cifrado) {
        dbAdapter = DBFactory.getDBadapter(DBType.Oracle);
        this.cifrado = cifrado;
    }
    
    public String[] obtenerSubCategorias(String categoria) throws SQLException {
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);        
        CallableStatement cs = con.prepareCall("{ call OBTENERSUB(?, ?) }");
        cs.setString(1, categoria);
        cs.registerOutParameter(2, OracleTypes.CURSOR);
        cs.executeQuery();
        ResultSet rs = (ResultSet) cs.getObject(2);
        List subCategoria = new ArrayList<String>();
        while (rs.next()) {            
            subCategoria.add(rs.getString(1));
        }
        //con.close();
        String[] obj = new String[subCategoria.size()];
        obj = (String[])(subCategoria.toArray(obj));
        con.close();
        return obj;
    }
    
    public String[] obtenerCategorias() throws SQLException {
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);        
        CallableStatement cs = con.prepareCall("{ call OBTENERCATEGORIAS(?) }");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.executeQuery();
        ResultSet rs = (ResultSet) cs.getObject(1);
        List categoria = new ArrayList<String>();
        while (rs.next()) {            
            categoria.add(rs.getString(1));
        }
        //con.close();
        String[] obj = new String[categoria.size()];
        obj = (String[])(categoria.toArray(obj));
        con.close();
        return obj;
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

    public void agregarSubasta(Subasta subasta) throws SQLException {
        String[] cifrar = this.cifrado.split(" ");
        Connection con = dbAdapter.getConnection(cifrar[0], cifrar[1]);        
        CallableStatement cs = con.prepareCall("{ call AGREGARSUBASTA(?,?,?,?,?,?,?,?,?) }");
        cs.setString(1, subasta.getAlias());
        cs.setString(2, subasta.getItem().getDescripcion());
        cs.setString(3, subasta.getItem().getCategoria());
        cs.setString(4, subasta.getItem().getSubcategoria());
        cs.setDouble(5, subasta.getPrecioBase());
        cs.setString(6, subasta.getDetallesDeEntrega());
        cs.setDate(7, (Date) subasta.getFechaHoraInicio());
        cs.setDate(8, (Date) subasta.getFechaHoraFinal());
        cs.registerOutParameter(9, OracleTypes.CURSOR);
        cs.executeQuery();
        con.close();
    }


    public void modificarUsuario(String alias) throws SQLException {
        
    }


    public void eliminarUsuario(String alias) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
