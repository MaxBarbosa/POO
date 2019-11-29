
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private int codVenda;
    private Date dataV;
    private double valorV;
    private List<Item> itens;

    public Venda(int codVenda, Date dataV, double valorV, List<Item> itens) {
        this.codVenda = codVenda;
        this.dataV = dataV;
        this.valorV = valorV;
        this.itens = itens;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public Date getDataV() {
        return dataV;
    }

    public void setDataV(Date dataV) {
        this.dataV = dataV;
    }

    public double getValorV() {
        return valorV;
    }

    public void setValorV(double valorV) {
        this.valorV = valorV;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    
    
}
