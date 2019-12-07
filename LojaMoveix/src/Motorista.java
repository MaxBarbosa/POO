public class Motorista {
    private int CodMot;
    private long CPF, CNH;
    private String Nome, endereco;

    public Motorista(int CodMot, long CPF, long CNH, String Nome, String endereco) {
        this.CodMot = CodMot;
        this.CPF = CPF;
        this.CNH = CNH;
        this.Nome = Nome;
        this.endereco = endereco;
    }

    public int getCodMot() {
        return CodMot;
    }

    public void setCodMot(int codMot) {
        this.CodMot = codMot;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getCNH() {
        return CNH;
    }

    public void setCNH(long CNH) {
        this.CNH = CNH;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
