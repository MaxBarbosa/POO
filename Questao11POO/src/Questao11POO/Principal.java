package Questao11POO;

public class Principal {

	public static void main(String[] args) {
		
		final double pi = 3.14159;
		
		Retangulo r1 = new Retangulo(8.5, 9.2);
		Circulo c1 = new Circulo(6.4);
	
		System.out.println("A área do retângulo mede: "+r1.calcularArea(r1.getBase(),r1.getAltura())+".");
		System.out.println("O perímetro do retângulo mede: "+r1.calcularPerimetro(r1.getBase(),r1.getAltura())+".");
		System.out.println("A área do círculo mede: "+c1.calcularArea(pi, c1.getRaio())+".");
		System.out.println("O perímetro do círculo mede: "+c1.calcularPerimetro(pi, c1.getRaio())+".");
	}

}
