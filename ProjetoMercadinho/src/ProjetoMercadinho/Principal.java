package ProjetoMercadinho;
public class Principal {

	public static void main(String[] args) {
		Mercadinho mercadinho = new Mercadinho();
		Cliente CR = new ClienteRegular("Joao", 200);
		Cliente CV = new ClienteVip("Maria", 300, "20662");
		Cliente COV = new ClienteOuroVip("Jose", 400, "19883", "Brasil");
		
		mercadinho.adicionarCliente(CR);
		mercadinho.adicionarCliente(CV);
		mercadinho.adicionarCliente(COV);
		
		mercadinho.imprimirClientes();
		
		mercadinho.calcularTotal();

		
		System.out.println("Sem desconto para o cliente REGULAR: " + CR.calcularPagamento(200) +" reais.");
		System.out.println("Desconto de 10 por cento para cliente VIP: " + CV.calcularPagamento(300) + " reais.");
		System.out.println("Desconto de 15 por cento para cliente OURO VIP: "+ COV.calcularPagamento(400) +" reais.");
		
	}

}
