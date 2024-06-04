package bancoDeDados;

import bancoDeDados.Model.Cidade;
import bancoDeDados.Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteService {
    public static int insereCliente (Cliente c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "insert into cliente (nome,idade, sexo, cidade) values (?,?,?,?)";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setInt(2, c.getIdade());
            pr.setString(3, c.getSexo());
            pr.setInt(4, c.getCidade().getId());
            int total = pr.executeUpdate();
            con.close();
            return total;
        }catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static int alteraCliente (Cliente c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "update cliente set nome=?, idade=?, sexo=?, cidade=? where id=?";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setInt(2, c.getIdade());
            pr.setString(3, c.getSexo());
            pr.setInt(4, c.getCidade().getId());
            pr.setInt(5, c.getId());
            int total = pr.executeUpdate();
            con.close();
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static int deletaCliente (Cliente c) {
        Connection con = Conexao.conectaPostgres();
        String sql = "delete from cliente where id=?";
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
    public static ArrayList<Cliente> listAll() {
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            Connection con = Conexao.conectaPostgres();
            String sql = "select * from cliente";
            PreparedStatement pr = con.prepareStatement(sql);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                Cliente c = new Cliente();
                c.setId(resultSet.getInt("id"));
                c.setNome(resultSet.getString("nome"));
                c.setIdade(resultSet.getInt("idade"));
                c.setSexo(resultSet.getString("sexo"));
                c.setCidade(CidadeService.findById(resultSet.getInt("cidade")));
                lista.add(c);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    public static int limpaBaseCliente () {
        Connection con = Conexao.conectaPostgres();
        String sql = "delete from cliente where id>0";
        try {
            PreparedStatement pr = con.prepareStatement(sql);
            int total = pr.executeUpdate();
            sql = "TRUNCATE TABLE cliente RESTART IDENTITY CASCADE";
            pr = con.prepareStatement(sql);
            total = pr.executeUpdate();
            con.close();
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
