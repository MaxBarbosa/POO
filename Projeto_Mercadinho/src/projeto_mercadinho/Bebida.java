package projeto_mercadinho;

import java.util.Date;


public class Bebida extends Produto {
    private double gradAlcoolica;

    public Bebida(double gradAlcoolica,int codigo, String descricao, Date dtFabricacao, Date dtValidade, double valor, Mercadinho mercadinho) {
        super(codigo,descricao,dtFabricacao,dtValidade,valor,mercadinho);
        this.gradAlcoolica = gradAlcoolica;
    }

    public double getGradAlcoolica() {
        return gradAlcoolica;
    }

    public void setGradAlcoolica(double gradAlcoolica) {
        this.gradAlcoolica = gradAlcoolica;
    }

    
}