import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int NumVen;
    private double Valor_Total;
    private int CodVdd, CodCli;
    private List<Item_venda> itens;

    public Venda(int NumVen, double Valor_Total, int CodVdd, int CodCli) {
        this.NumVen = NumVen;
        this.Valor_Total = Valor_Total;
        this.CodVdd = CodVdd;
        this.CodCli = CodCli;
        this.itens = new ArrayList<>();
    }

    public int getNumVen() {
        return NumVen;
    }

    public void setNumVen(int NumVen) {
        this.NumVen = NumVen;
    }

    public double getValor_Total() {
        return Valor_Total;
    }

    public void setValor_Total(double Valor_Total) {
        this.Valor_Total = Valor_Total;
    }

    public int getCodVdd() {
        return CodVdd;
    }

    public void setCodVdd(int CodVdd) {
        this.CodVdd = CodVdd;
    }

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }

    public List<Item_venda> getItens() {
        return itens;
    }

    public void setItens(List<Item_venda> itens) {
        this.itens = itens;
    }

}
