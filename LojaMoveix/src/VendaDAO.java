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
            stmt = conexao.prepareStatement("INSERT INTO VENDA VALUES(?,?,?,?)");
            stmt.setInt(1, v.getNumVen());
            stmt.setDouble(2, v.getValor_Total());
            stmt.setInt(3, v.getCodVdd());
            stmt.setInt(4, v.getCodCli());

            stmt.executeUpdate();
            
            stmt = conexao.prepareStatement("INSERT INTO ITEM_VENDA VALUES(?,?,?,?)");
            
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

}