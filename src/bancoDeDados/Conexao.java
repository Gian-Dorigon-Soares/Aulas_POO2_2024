package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectaPostgres () {
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/aulaspooii","postgres","1809");
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
