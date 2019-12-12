import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

        public void adicionarProduto(Produto p){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Motorista(codPro, Custo, Descricao, Preco, Nome) VALUES(?,?,?,?,?)");
            stmt.setInt(1, p.getCodPro());
            stmt.setDouble(2, p.getCusto());
            stmt.setString(3, p.getDescricao());
            stmt.setDouble(4, p.getPreco());
            stmt.setString(5, p.getNome());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void removerProduto(int CodPro) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Produto WHERE codPro=?");
            stmt.setInt(1, CodPro);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Motorista> listarProduto() {
        List<Motorista> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Produto ORDER BY CodPro");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto(rs.getInt("CodPro"),rs.getDouble("Custo"),rs.getString("Descricao"),rs.getDouble("Preco"),rs.getString("Nome"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    
    public Produto getProdutoPeloCodigo(int CodPro) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Cliente WHERE CodCli=?");
            stmt.setInt(1, CodPro);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Produto pro = new Produto(rs.getInt("CodPro"), rs.getDouble("Custo"), rs.getString("Descricao"), rs.getDouble("Preco"), rs.getString("Nome"));
                return pro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
    
    
    public void updateProduto(Produto pp) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Cliente SET Nome=?, Tel=?, Endereco=?, CPF=?, Email=? WHERE CodCli=?");
            stmt.setInt(1, pp.getCodPro());
            stmt.setDouble(2, pp.getCusto());
            stmt.setString(3, pp.getDescricao());
            stmt.setDouble(4, pp.getPreco());
            stmt.setString(5, pp.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    
    }
}