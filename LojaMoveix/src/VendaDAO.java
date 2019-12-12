import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    
    public void efetuarVenda(Venda v){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO VENDA VALUES(?,?,?,?)");
            stmt.setInt(1, v.getNumVen());
            stmt.setDouble(2, v.getValor_Total());
            stmt.setInt(3, v.getCodVdd());
            stmt.setInt(4, v.getCodCli());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO Item_venda VALUES(?,?,?,?)");
            
            for(Item_venda item : v.getItens()) {
                stmt.setInt(1, v.getNumVen());
                stmt.setInt(2, item.getCodPro());
                stmt.setDouble(3, item.getvUnitario());
                stmt.setInt(4, item.getQtd());
                
                stmt.executeUpdate();
            }
                    
              
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void atualizarVenda(Venda v){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Venda SET NumVen=?, Valor_Total=?, CodVdd=?, CodCli=?, itens=?");
            stmt.setInt(1, v.getNumVen());
            stmt.setDouble(2, v.getValor_Total());
            stmt.setInt(3, v.getCodVdd());
            stmt.setInt(4, v.getCodCli());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("UPDATE Item_venda SET CodPro=?, NumVen=?, vUnitario=?, Qtd=?");
            
            for(Item_venda item : v.getItens()) {
                stmt.setInt(1, item.getCodPro());
                stmt.setInt(2, item.getNumVen());
                stmt.setDouble(3, item.getvUnitario());
                stmt.setInt(4, item.getQtd());
                
                stmt.executeUpdate();
            }
                          
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    
    public List<Venda> listarVenda() {
        List<Venda> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Venda ORDER BY NumVen");
            rs = stmt.executeQuery();

            while (rs.next()) {
                //Venda v = new Venda(rs.getInt("NumVen"),rs.getDouble("Valor_Total"), rs.getInt("CodVdd"), rs.getInt("CodCli"), rs.getList<>()("itens"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
}