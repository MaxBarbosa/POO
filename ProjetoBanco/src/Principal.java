public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Conta CC1 = new ContaCorrente(10, "Joao Silva", 100, 800.2);
		Conta CC2 = new ContaCorrente(20, "Maria Souza", 200.2, 920.5);
		Conta CP1 = new ContaPoupanca(30, "Jose Santos", 300.3, 25.5);
		Conta CP2 = new ContaPoupanca(40, "Josefa Silveira", 400.5, 33.3);
		
		banco.adicionarConta(CC1);
		banco.adicionarConta(CC2);
		banco.adicionarConta(CP1);
		banco.adicionarConta(CP2);
		
		banco.deposito(10, 1000);
		banco.deposito(20, 1000);
		banco.deposito(30, 1000);
		banco.deposito(40, 1000);
		
		banco.getSaldo(10);
		banco.getSaldo(20);
		banco.getSaldo(30);
		banco.getSaldo(40);
		System.out.println();
		
		banco.saque(10, 500);
		banco.saque(20, 500);
		banco.saque(30, 500);
		banco.saque(40, 500);
		
		banco.imprimirContas();
	}

}
