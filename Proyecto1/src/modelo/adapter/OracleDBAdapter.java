package modelo.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import oracle.jdbc.OracleDriver;
import proyecto1.utilities.PropertiesUtil;


public class OracleDBAdapter implements IDBAdapter {

    private static final String DB_PROPERTIES = "META-INF/DBOracle.properties";
    private static final String DB_SERVICE = "service";
    private static final String DB_HOST = "host";
    private static final String DB_PASSWORD = "password";
    private static final String DB_PORT = "port";
    private static final String DB_USER = "user";

    static {
        //Bloque para registrar el Driver de Oracle
        try {
            new OracleDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(crearStringDeConexion());
            System.out.println("Conectando con ==> " + connection.getClass().getName());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Connection getConnection(String user, String password) {
        try {
            Connection connection = DriverManager.getConnection(crearStringDeConexion(user, password));
            System.out.println("Conectando con ==> " + connection.getClass().getName());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String crearStringDeConexion() {
        Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);
        String host = prop.getProperty(DB_HOST);
        String port = prop.getProperty(DB_PORT);
        String service = prop.getProperty(DB_SERVICE);
        String user = prop.getProperty(DB_USER);
        String password = prop.getProperty(DB_PASSWORD);
        String connectionString = "jdbc:oracle:thin:"+user+"/"+password+"@//"+host+":"+port+"/"+service;
        return connectionString;
    }
    
    private String crearStringDeConexion(String user, String password) {
        Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);
        String host = prop.getProperty(DB_HOST);
        String port = prop.getProperty(DB_PORT);
        String service = prop.getProperty(DB_SERVICE);
        String connectionString = "jdbc:oracle:thin:"+user+"/"+password+"@//"+host+":"+port+"/"+service;
        return connectionString;
    }

}