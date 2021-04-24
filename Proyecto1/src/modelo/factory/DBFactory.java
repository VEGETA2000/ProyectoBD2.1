package modelo.factory;

import java.util.Properties;
import modelo.adapter.IDBAdapter;
import modelo.adapter.OracleDBAdapter;
import modelo.adapter.PostgreSQLDBAdapter;
import proyecto1.utilities.PropertiesUtil;

public class DBFactory {

    private static final String DB_FACTORY_PROPERTY_URL = "META-INF/DBDefault.properties";
    private static final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";

    public static IDBAdapter getDBadapter(DBType dbType) {
        switch (dbType) {
            case PostgreSQL:
                return new PostgreSQLDBAdapter();
            case Oracle:
                return new OracleDBAdapter();
            default:
                throw new IllegalArgumentException("Not supported");
        }
    }

    public static IDBAdapter getDefaultDBAdapter() {
        try {
            Properties prop =
                    PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
            String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
            System.out.println("Seleccionando Adaptador ==> " + defaultDBClass);
            return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}