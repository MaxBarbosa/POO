package ProjetoMercadinho;
public class ClienteVip extends Cliente{
	private String numeroCartao;

	public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
		super(nome, valorDaCompra);
		this.numeroCartao = numeroCartao;
	}

	public double calcularPagamento(double valorDaCompra) {
		return valorDaCompra*0.9;
	}
	
	public String toString() {
		return "CLIENTE VIP --> " + super.toString() + ", numero do cartao: " + numeroCartao;
	}
}
