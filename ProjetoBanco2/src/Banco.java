import java.util.ArrayList;
import java.util.List;
public class Banco{
	private List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
    //Percorrendo o ArrayList do Banco
	public void deposito(int codigoConta, double valor) {
		int posicao = -1; //a posicao comeca em -1 que eh pra dar um erro se nenhum CodigoConta for encontrado em um dos elementos do array
		for(int i = 0; i < contas.size(); i++) {//Iterando um for no tamanho do array
	         if(codigoConta == contas.get(i).getCodigo()) { //Comparando SE o 1o parametro bate com algum CODIGO de Conta existente
	        	 posicao = i; //Quando o codigoConta for encotrado pela primeira vez ele vai parar a iteracao com o BREAK
	        	 break;
	         }
	     }
        contas.get(posicao).depositar(valor);//DEPOSITANDO o valor desejado (parametro) no elementro que tem o Codigo igual ao CodigoConta
	}
	
	public void saque(int codigoConta, double valor) {
		int posicao = -1; //a posicao comeca em -1 que eh pra dar um erro se nenhum CodigoConta for encontrado em um dos elementos do array
		for(int i = 0; i < contas.size(); i++) { //Iterando um for no tamanho do array
	         if(codigoConta == contas.get(i).getCodigo()) {  //Comparando SE o 1o parametro bate com algum CODIGO de Conta existente
	        	 posicao = i; //Quando o codigoConta for encotrado pela primeira vez ele vai parar a iteracao com o BREAK
	        	 break;
	         }
	     }
        contas.get(posicao).sacar(valor); //SACANDO o valor desejado (parametro) no elementro que tem o Codigo igual ao CodigoConta
	}
	
	public void getSaldo(int codigoConta) {
		int posicao = -1; //a posicao comeca em -1 que eh pra dar um erro se nenhum CodigoConta for encontrado em um dos elementos do array
		for(int i = 0; i < contas.size(); i++) {//Iterando um for no tamanho do array
	         if(codigoConta == contas.get(i).getCodigo()) { //Comparando SE o 1o parametro bate com algum CODIGO de Conta existente
	        	 posicao = i; //Quando o codigoConta for encotrado pela primeira vez ele vai parar a iteracao com o BREAK
	        	 break;
	         }
	     }
        System.out.println("O saldo da conta eh de: "+ contas.get(posicao).getValorSaldo()+" reais"); //Imprimindo o saldo da conta quando ela eh encontrada
	}
	
	public void imprimirContas() {
		for(int i = 0; i < contas.size(); i++) { //Iterando um for no tamanho do array
	         System.out.println(contas.get(i).toString());//Imprimindo todos os objetos do tipo CONTA (Corrente e Poupanca) que estao no ArrayList
	     }
	}
	 
}
