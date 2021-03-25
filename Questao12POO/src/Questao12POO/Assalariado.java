package Questao12POO;

public class Assalariado extends Empregado{
	private double salario;

	public Assalariado(String nome, String sobrenome, String CPF, double salario) {
		super(nome, sobrenome, CPF);
		this.salario = salario;
	}
	
	public double vencimento(double salario) {//aqui esta acontecendo o polimorfismo
		return salario;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
