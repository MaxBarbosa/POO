public class ContaPoupanca extends Conta {
	
	private double taxaJuros;
	
	public ContaPoupanca(int codigo, String nomeCliente, double valorSaldo, double taxaJuros) {
		super(codigo, nomeCliente, valorSaldo);
		this.taxaJuros = taxaJuros;
	}

	public void depositar(double valorDeposito) {
		super.depositar(valorDeposito);
	}
    
    //Aqui esta acontecendo o polimorfismo
	public double sacar(double valor) {
		double resultado = 0;
		if(valorSaldo- valor >= 0) {
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
