public class Cliente {
   private int CodCli;
   private String Nome, Tel, Endereco;
   private long CPF;
   private String email;

    public Cliente(int CodCli, String Nome, String Tel, String Endereco, long CPF, String email) {
        this.CodCli = CodCli;
        this.Nome = Nome;
        this.Tel = Tel;
        this.Endereco = Endereco;
        this.CPF = CPF;
        this.email = email;
    }

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
}
