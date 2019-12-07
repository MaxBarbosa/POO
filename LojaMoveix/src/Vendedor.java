public class Vendedor {
    private int CodVdd;
    private long CPF;
    private double V_comissao;
    private String nome, endereco;

    public Vendedor(int CodVdd, long CPF, double V_comissao, String nome, String endereco) {
        this.CodVdd = CodVdd;
        this.CPF = CPF;
        this.V_comissao = V_comissao;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodVdd() {
        return CodVdd;
    }

    public void setCodVdd(int CodVdd) {
        this.CodVdd = CodVdd;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public double getV_comissao() {
        return V_comissao;
    }

    public void setV_comissao(double V_comissao) {
        this.V_comissao = V_comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
