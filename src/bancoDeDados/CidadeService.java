package bancoDeDados;

import bancoDeDados.Model.Cidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CidadeService {

    public static int insereCidade (Cidade c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "insert into cidade (cidade,uf) values (?,?)";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setString(2, c.getUf());
            int total = pr.executeUpdate();
            con.close();
            return total;
        }catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static int alteraCidade (Cidade c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "update cidade set cidade=?, uf=? where id=?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setString(2, c.getUf());
            pr.setInt(3, c.getId());
            int total = pr.executeUpdate();
            con.close();
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static int deletaCidade (Cidade c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "delete from cidade where id=?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setInt(1, c.getId());
            int total = pr.executeUpdate();
            con.close();
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static ArrayList<Cidade> listAll() {
        ArrayList<Cidade> lista = new ArrayList<>();
        try {
            Connection con = Conexao.conectaPostgres();
            String sql = "select * from cidade";
            PreparedStatement pr = con.prepareStatement(sql);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                Cidade c = new Cidade();
                c.setId(resultSet.getInt("id"));
                c.setNome(resultSet.getString("cidade"));
                c.setUf(resultSet.getString("uf"));
                lista.add(c);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
