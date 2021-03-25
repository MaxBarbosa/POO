public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco(); //Criando um objeto do banco - instanciando um Objeto do tipo Banco

        //Cadastrando varias contas
		Conta CC1 = new ContaCorrente(10, "Joao Silva", 100, 800.2);
		Conta CC2 = new ContaCorrente(20, "Maria Souza", 200.2, 920.5);
		Conta CP1 = new ContaPoupanca(30, "Jose Santos", 300.3, 25.5);
		Conta CP2 = new ContaPoupanca(40, "Josefa Silveira", 400.5, 33.3);
		
        //Adicionando as contas ao ArrayList do Banco
		banco.adicionarConta(CC1);
		banco.adicionarConta(CC2);
		banco.adicionarConta(CP1);
		banco.adicionarConta(CP2);
		
        //Depositando mil reais em todas as contas de acordos com o CODIGO de cada conta
		banco.deposito(10, 1000);
		banco.deposito(20, 1000);
		banco.deposito(30, 1000);
		banco.deposito(40, 1000);
    
        //Exibindo o saldo de uma conta cadastrada
		banco.getSaldo(30);

		System.out.println();
		
        //Sacando quinhetos reais de todas as contas cadastradas no Banco
		banco.saque(10, 500);
		banco.saque(20, 500);
		banco.saque(30, 500);
		banco.saque(40, 500);
		

        //Exibindo as informacoes de todas as contas cadastradas
		banco.imprimirContas();
	}

}
