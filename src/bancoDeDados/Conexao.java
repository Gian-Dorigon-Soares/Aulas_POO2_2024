package bancoDeDados;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexao {
    public static Connection conectaPostgres () {
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            Properties props = new Properties();
            props.load(new FileInputStream("db.properties"));
            conn = DriverManager.getConnection(props.getProperty("url"),props.getProperty("user"),props.getProperty("pass"));
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
