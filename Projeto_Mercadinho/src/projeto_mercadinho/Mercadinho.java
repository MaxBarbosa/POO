package projeto_mercadinho;

import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Mercadinho {
    private String nome;
    private String proprietario;
    private ArrayList<Produto> estoque = new ArrayList<Produto>();
    private int size = 0;
    private double soma = 0; 
    java.util.Date agora = new java.util.Date();

    public Mercadinho(String nome, String proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }
    
    public void inserir(int i,Produto p){
        soma += p.valor;
        size++;
        estoque.add(i,p);
    }
    
    public Produto consultar(int p){
        return estoque.get(p); 
    }
    
    public void remover(int p){
        soma -= estoque.get(p).valor;
        size--;
        estoque.remove(p);
    }
    
    public void alterar(int i,Produto p){
        estoque.set(i,p);
    }
   
    public int numprodutos(){
        return size;
    }
    
    public Produto maisantigo(){
        return estoque.get(0);
    }
    
    public ArrayList<Produto> vencidos(){
        ArrayList<Produto> resposta = new ArrayList<Produto>();
        for(int i=0;i<size;i++){
            Date data = estoque.get(i).dtValidade;
            if(agora.after(data)){
                resposta.add(estoque.get(i));
            }
        }
        return resposta;
    }
    
    public double somaprodutos(){
        return soma;
    }
    
}