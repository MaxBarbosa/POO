import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {

        public void adicionarVendedor(Vendedor v) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Vendedor(CodVdd, CPF, V_comissao, Nome, endereco) VALUES(?,?,?,?,?)");
            stmt.setInt(1, v.getCodVdd());
            stmt.setLong(2, v.getCPF());
            stmt.setDouble(3, v.getV_comissao());
            stmt.setString(4, v.getNome());
            stmt.setString(5, v.getEndereco());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void removerVendedor(int CodVdd) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Vendedor WHERE CodVdd=?");
            stmt.setInt(1, CodVdd);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Vendedor> listarVendedor() {
        List<Vendedor> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Vendedor ORDER BY CodVdd");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vendedor v = new Vendedor(rs.getInt("CodVdd"),rs.getLong("CPF"),rs.getDouble("V_comissao"),rs.getString("Nome"),rs.getString("endereco"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
     public Vendedor getVendedorPeloCodigo(int CodVdd) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Vendedor WHERE CodVdd=?");
            stmt.setInt(1, CodVdd);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Vendedor vdd = new Vendedor(rs.getInt("CodVdd"), rs.getLong("CPF"), rs.getDouble("V_comissao"), rs.getString("nome"), rs.getString("Endereco"));
                return vdd;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
    
    
    public void updateVendedor(Vendedor vend) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Vendedor SET CPF=?, V_comissao=?, nome=?, Endereco=? WHERE CodVdd=?");
            stmt.setInt(1, vend.getCodVdd());
            stmt.setLong(2, vend.getCPF());
            stmt.setDouble(3, vend.getV_comissao());
            stmt.setString(4, vend.getNome());
            stmt.setString(5, vend.getEndereco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }}