package modelo.adapter;

import java.sql.Connection;

/**
 *
 * @author oscar
 */

public interface IDBAdapter {
    public Connection getConnection();
    public Connection getConnection(String user, String password);
}