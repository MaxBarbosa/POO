import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

        public void adicionarCliente(Cliente c) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Cliente(CodCli, Nome, Tel, Endereco, CPF, email) VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, c.getCodCli());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getTel());
            stmt.setString(4, c.getEndereco());
            stmt.setLong(5, c.getCPF());
            stmt.setString(6, c.getEmail());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void atualizarCliente(Cliente c) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Cliente SET CodCli=?, Nome=?, Tel=?, Endereco=?, CPF=?, email=?) WHERE CodCli=?");
            stmt.setInt(1, c.getCodCli());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getTel());
            stmt.setString(4, c.getEndereco());
            stmt.setLong(5, c.getCPF());
            stmt.setString(6, c.getEmail());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }    
        
    public void removerCliente(int CodCli) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Cliente WHERE CodCli=?");
            stmt.setInt(1, CodCli);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Cliente> listarCliente() {
        List<Cliente> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Cliente ORDER BY CodCli");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente(rs.getInt("CodCli"),
                        rs.getString("Nome"),
                        rs.getString("Tel"),
                        rs.getString("Endereco"),
                        rs.getLong("CPF"),
                        rs.getString("Email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return listaRetorno;
    }
    
}