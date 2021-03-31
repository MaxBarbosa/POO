package ProjetoMercadinho;
public abstract class Cliente implements Pagador{
	private String nome;
	private double valorDaCompra;
	
	public Cliente(String nome, double valorDaCompra) {
		this.nome = nome;
		this.valorDaCompra = valorDaCompra;
	}

	public double getValorDaCompra() {
		return valorDaCompra;
	}

	public String toString() {
		return "Nome do cliente: " + nome + ", valor da compra: " + valorDaCompra;
	}
}
