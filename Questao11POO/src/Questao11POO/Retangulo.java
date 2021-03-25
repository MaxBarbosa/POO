package Questao11POO;

public class Retangulo extends Forma{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea(double base, double altura) {
		double resultado = base * altura;
		return resultado;
	}

	public double calcularPerimetro(double base, double altura) {
		double resultado = ((2 * base) + (2 * altura));
		return resultado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
