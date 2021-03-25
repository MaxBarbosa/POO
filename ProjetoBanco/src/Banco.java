import java.util.ArrayList;
import java.util.List;
public class Banco{
	private List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void deposito(int codigoConta, double valor) {
		int posicao = -1;
		for(int i = 0; i < contas.size(); i++) {
	         if(codigoConta == contas.get(i).getCodigo()) {
	        	 posicao = i;
	        	 break;
	         }
	     }
        contas.get(posicao).depositar(valor);
	}
	
	public void saque(int codigoConta, double valor) {
		int posicao = -1;
		for(int i = 0; i < contas.size(); i++) {
	         if(codigoConta == contas.get(i).getCodigo()) {
	        	 posicao = i;
	        	 break;
	         }
	     }
        contas.get(posicao).sacar(valor);
	}
	
	public void getSaldo(int codigoConta) {
		int posicao = -1;
		for(int i = 0; i < contas.size(); i++) {
	         if(codigoConta == contas.get(i).getCodigo()) {
	        	 posicao = i;
	        	 break;
	         }
	     }
        System.out.println("O saldo da conta eh de: "+ contas.get(posicao).getValorSaldo()+" reais");
	}
	
	public void imprimirContas() {
		for(int i = 0; i < contas.size(); i++) {
	         System.out.println(contas.get(i).toString());
	     }
	}
	 
}
