public class ContaCorrente extends Conta{

	private double valorLimite;

	public ContaCorrente(int codigo, String nomeCliente, double valorSaldo, double valorLimite) {
		super(codigo, nomeCliente, valorSaldo);
		this.valorLimite = valorLimite;
	}

	public void depositar(double valorDeposito) {
		super.depositar(valorDeposito);
	}

	public double sacar(double valor) {
		double resultado = 0;
		if(valorSaldo + valorLimite - valor >= 0) {
			resultado = valorSaldo - valor;
		}
		else {
			System.out.println("Nao foi possivel realizar saque! O valor informado eh maior do que o saldo disponivel");
		}
		return valorSaldo = resultado;
	}
	
	public double getValorSaldo() {
		return valorSaldo;
	}
}
