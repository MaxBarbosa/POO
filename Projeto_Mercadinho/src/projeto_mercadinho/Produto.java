package projeto_mercadinho;

import java.util.Date;

public abstract class Produto {
    int codigo;
    String descricao;
    Date dtFabricacao;
    Date dtValidade;
    double valor;
    Mercadinho mercadinho;

    public Produto(int codigo, String descricao, Date dtFabricacao, Date dtValidade, double valor, Mercadinho mercadinho) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dtFabricacao = dtFabricacao;
        this.dtValidade = dtValidade;
        this.valor = valor;
        this.mercadinho = mercadinho;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(Date dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }
    
    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Mercadinho getMercadinho() {
        return mercadinho;
    }

    public void setMercadinho(Mercadinho mercadinho) {
        this.mercadinho = mercadinho;
    }
    
    
}