public class Produto {
    private int CodPro;
    private double Custo;
    private String Descricao;
    private double Preco;
    private String Nome;

    public Produto(int CodPro, double Custo, String Descricao, double Preco, String Nome) {
        this.CodPro = CodPro;
        this.Custo = Custo;
        this.Descricao = Descricao;
        this.Preco = Preco;
        this.Nome = Nome;
    }

    public int getCodPro() {
        return CodPro;
    }

    public void setCodPro(int CodPro) {
        this.CodPro = CodPro;
    }

    public double getCusto() {
        return Custo;
    }

    public void setCusto(double Custo) {
        this.Custo = Custo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
}
