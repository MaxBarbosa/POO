package Questao12POO;

public class Horista extends Empregado{
	private double precoHora;
	private double horasTrabalhadas;
	
	public Horista(String nome, String sobrenome, String CPF, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, CPF);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double vencimento(double precoHora, double horasTrabalhadas) {//aqui esta acontecendo o polimorfismo
		return precoHora * horasTrabalhadas;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
}
