/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author oscar
 */
public class OracleDBConectionUtil {

    public OracleDBConectionUtil() {
    }
    
    public Statement establecerConexion() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando con OracleDB");
            Connection miConexion = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:ORCL","basico","pass123");
            Statement conexionEstablecida = miConexion.createStatement();
            return conexionEstablecida;
        }
        catch (Exception e){
            System.out.println("Se presentó el siguiente problema: " + e);
            return null;
        }
    }
    
    public LinkedList<String> procedimiento(String form) {
        try {
            Statement miConexion = establecerConexion();
            ResultSet resultados = miConexion.executeQuery(form);
            LinkedList<String> respuesta = new LinkedList();
            while(resultados.next()) {
                int j = resultados.getMetaData().getColumnCount();
                for (int i = 1; i < j; i++) {
                    respuesta.add(resultados.getString(i));
                }
            }
            return respuesta;
        }
        catch (Exception e) {
            return null;
        }
    }
    
}
