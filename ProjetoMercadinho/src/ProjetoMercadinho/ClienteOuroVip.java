package ProjetoMercadinho;
public class ClienteOuroVip extends ClienteVip{
	private String endereco;

	public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
		super(nome, valorDaCompra, numeroCartao);
		this.endereco = endereco;
	}
	
	public double calcularPagamento(double valorDaCompra) {
		return valorDaCompra*0.85;
	}
	
	public String toString() {
		return "CLIENTE OURO VIP --> " + super.toString()  + ", endereco: " + endereco;
	}
	
	
}
