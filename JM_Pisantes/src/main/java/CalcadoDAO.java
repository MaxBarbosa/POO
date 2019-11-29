import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalcadoDAO {
        public void adicionarCalcado(Calcado c) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CALCADO(codCalcado, tamanho, cor, marca, material, valor) VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, c.getCodCalcado());
            stmt.setInt(2, c.getTamanho());
            stmt.setString(3, c.getCor());
            stmt.setString(4, c.getMarca());
            stmt.setString(5, c.getMaterial());
            stmt.setDouble(6 , c.getValor());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void removerCalcado(int codCalcado) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM CALCADO WHERE codCalcado=?");
            stmt.setInt(1, codCalcado);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public List<Calcado> listarContas() {
        List<Calcado> listaRetorno = new ArrayList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CONTA ORDER BY CODIGO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Calcado c = new Chuteira(rs.getInt("codCalcado"),rs.getInt("tamanho"), rs.getString("cor"), rs.getString("marca"), rs.getString("material"), rs.getDouble("valor"));
                listaRetorno.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
}
