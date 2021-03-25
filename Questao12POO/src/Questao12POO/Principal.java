package Questao12POO;

public class Principal {

	public static void main(String[] args) {
		Assalariado a1 = new Assalariado("Maria", "Jose", "10320544593", 1200.50);
		Comissionado c1 = new Comissionado("Joao", "Silva", "39916279121", 52.0, 25.0);
		Horista h1 = new Horista("Fulano", "Mendes", "20978464211", 25.5, 80.0);
		
		System.out.println("O vencimento do assalariado eh de: "+a1.vencimento(a1.getSalario())+" reais.");
		System.out.println("O vencimento do comissionado eh de: "+c1.vencimento(c1.getTotalVenda(),c1.getTotalComissao())+" reais.");
		System.out.println("O vencimento do horista eh de: "+h1.vencimento(h1.getPrecoHora(),h1.getHorasTrabalhadas())+" reais.");
	}

}
