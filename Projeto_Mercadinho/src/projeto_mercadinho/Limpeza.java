package projeto_mercadinho;

import java.util.Date;


public class Limpeza extends Produto {
    private String nocivo;

    public Limpeza(String nocivo,int codigo, String descricao, Date dtFabricacao, Date dtValidade, double valor, Mercadinho mercadinho) {
        super(codigo,descricao,dtFabricacao,dtValidade,valor,mercadinho);
        this.nocivo = nocivo;
    }

    public String getNocivo() {
        return nocivo;
    }

    public void setNocivo(String nocivo) {
        this.nocivo = nocivo;
    }

    
}