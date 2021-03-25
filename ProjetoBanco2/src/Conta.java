public abstract class Conta {
	protected int codigo;
	protected String nomeCliente;
	protected double valorSaldo;
	
	public Conta(int codigo, String nomeCliente, double valorSaldo) {
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.valorSaldo = valorSaldo;
	}
	
	public void depositar(double valorDeposito) {
		valorSaldo = valorSaldo + valorDeposito;
	}
	
	public abstract double sacar(double valorSaque);

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public String toString() {
		return "Codigo da conta: " + codigo + ", nome do cliente: " + nomeCliente + ", valor do saldo: " + valorSaldo;
	}
	
}
