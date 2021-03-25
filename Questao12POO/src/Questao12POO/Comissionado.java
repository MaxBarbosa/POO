package Questao12POO;

public class Comissionado extends Empregado{
	private double totalVenda;
	private double totalComissao;
	
	public Comissionado(String nome, String sobrenome, String CPF, double totalVenda, double totalComissao) {
		super(nome, sobrenome, CPF);
		this.totalVenda = totalVenda;
		this.totalComissao = totalComissao;
	}
	
	public double vencimento(double totalVenda, double totalComissao) { //aqui esta acontecendo o polimorfismo
		return totalVenda * totalComissao;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public double getTotalComissao() {
		return totalComissao;
	}
	
}
