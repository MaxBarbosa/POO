package projeto_mercadinho;

import java.util.Date;


public class Alimento extends Produto {
    
    private String classificacao;

    public Alimento(String classificacao, int codigo, String descricao, Date dtFabricacao, Date dtValidade, double valor, Mercadinho mercadinho) {
        super(codigo,descricao,dtFabricacao,dtValidade,valor,mercadinho);
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
}