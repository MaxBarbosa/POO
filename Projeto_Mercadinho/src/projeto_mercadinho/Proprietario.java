package projeto_mercadinho;

import java.util.Date;

public class Proprietario {
    String nomePropri;
    Date dtNascimento;
    String sexo;
    Mercadinho mercado;

    public Proprietario(String nomePropri, Date dtNascimento, String sexo, Mercadinho mercado) {
        this.nomePropri = nomePropri;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.mercado = mercado;
    }

    public String getNomePropri() {
        return nomePropri;
    }

    public void setNomePropri(String nomePropri) {
        this.nomePropri = nomePropri;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Mercadinho getMercado() {
        return mercado;
    }

    public void setMercado(Mercadinho mercado) {
        this.mercado = mercado;
    }
    
    
    
}