package Questao11POO;

public class Circulo extends Forma {

	final double pi = 3.14159;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea(double pi, double raio) {
		double resultado = pi * raio * raio;
		return resultado;
	}
	
	public double calcularPerimetro(double pi, double raio) {
		double resultado = 2 * pi * raio;
		return resultado;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}
	
	
}
