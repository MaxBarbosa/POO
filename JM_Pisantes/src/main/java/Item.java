import java.util.Date;

public class Item {
    private int quantidade;
    private Calcado produto;

    public Item(int quantidade, Calcado produto, Date data) {
        this.quantidade = quantidade;
        this.produto = produto;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Calcado getProduto() {
        return produto;
    }

    public void setProduto(Calcado produto) {
        this.produto = produto;
    }
    
}