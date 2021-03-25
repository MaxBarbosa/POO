package Questao12POO;

public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String CPF;
	
	public Empregado(String nome, String sobrenome, String CPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
	}
	
	public double vencimento() {
		return 0;
	}
}
