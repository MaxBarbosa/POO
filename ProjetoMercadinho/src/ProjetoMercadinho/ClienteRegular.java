package ProjetoMercadinho;
public class ClienteRegular extends Cliente{

	public ClienteRegular(String nome, double valorDaCompra) {
		super(nome, valorDaCompra);
	}

	public double calcularPagamento(double valorDaCompra) {
		return valorDaCompra;
	}
	
	public String toString() {
		return "CLIENTE REGULAR --> " + super.toString();
	}
	
}
