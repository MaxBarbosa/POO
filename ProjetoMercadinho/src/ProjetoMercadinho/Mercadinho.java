package ProjetoMercadinho;
import java.util.ArrayList;
import java.util.List;

public class Mercadinho {
	private List<Cliente> clientes = new ArrayList<>();
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void calcularTotal() {
		double total = 0;
		for(int i = 0; i < clientes.size(); i++) {
	         total+= clientes.get(i).getValorDaCompra();
	     }
		
		System.out.println("O valor total de compras realizadas eh de: " + total + " reais. \n");
	}
	
	public void imprimirClientes() {
		for(int i = 0; i < clientes.size(); i++) {
	         System.out.println(clientes.get(i).toString());
	     }
	}
}
