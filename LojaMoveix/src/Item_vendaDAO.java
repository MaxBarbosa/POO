import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Item_vendaDAO {

        public void adicionarItem_venda(Item_venda i) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Item_venda(CodPro, NumVen, vUnitario, Qtd) VALUES(?,?,?,?)");
            stmt.setInt(1, i.getCodPro());
            stmt.setInt(2, i.getNumVen());
            stmt.setDouble(3, i.getvUnitario());
            stmt.setInt(4, i.getQtd());
   

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
        
    public void atualizarItem_venda(Item_venda i) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Item_venda SET CodPro=?, NumVen=?, vUnitario=?, Qtd=?) WHERE NumVen=?");
            stmt.setInt(1, i.getCodPro());
            stmt.setInt(2, i.getNumVen());
            stmt.setDouble(3, i.getvUnitario());
            stmt.setInt(4, i.getQtd());
   

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void removerItem_venda(int CodPro) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Item_venda WHERE CodPro=?");
            stmt.setInt(1, CodPro);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Item_venda> listarItem_venda() {
        List<Item_venda> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Item_venda ORDER BY CodPro");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Item_venda ii = new Item_venda(rs.getInt("CodPro"),rs.getInt("NumVen"),rs.getDouble("vUnitario"),rs.getInt("Qtd"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
}