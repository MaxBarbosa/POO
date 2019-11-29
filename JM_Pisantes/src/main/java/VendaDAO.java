import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    private String nome;

    public VendaDAO(){
        
    }
    
    public VendaDAO(String nome) {
        this.nome = nome;
    }
    
    
    public void efetuarVenda(Venda v){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO VENDA VALUES(?,?,?)");
            stmt.setInt(1, v.getCodVenda());
            stmt.setDate(2, new Date(v.getDataV().getTime()));
            stmt.setDouble(3, v.getValorV());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO ITEM VALUES(?,?,?)");
            
            for(Item item : v.getItens()) {
                stmt.setInt(1, v.getCodVenda());
                stmt.setInt(2, item.getProduto().getCodCalcado());
                stmt.setInt(3, item.getQuantidade());
           
                stmt.executeUpdate();
            }
                    
              
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

}
