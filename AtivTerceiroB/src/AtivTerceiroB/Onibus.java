package AtivTerceiroB;

public class Onibus extends VeiculoT{
	private int comprimento; /*interface: padronização de comportamento, padronizar métodos, faz com que a comunicação seja universal */ 
	private int capacidade;
	
	public Onibus(int velocidade, String descricao, int ano, String placa, double valor, int comprimento, int capacidade) {
		super(velocidade, descricao, ano, placa, valor);
		this.comprimento = comprimento;
		this.capacidade = capacidade;
	}
	
	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}


	public int getCapacidade() {
		return capacidade;
	}

	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void acelerar(){
		super.setVelocidade(super.getVelocidade() + 8);
	};
	
	public void frear(){
		if (super.getVelocidade() < 8) {
			System.out.println("Nao foi possivel reduzir a velocidade");
		}
		else {
			super.setVelocidade(super.getVelocidade() - 8);
		}
	}
	
	public  String ToString() {
		return "ONIBUS: ano= " + getAno() + ", velocidade= " + getVelocidade() + ", descricao= " + getDescricao() + "\n" + "";
	}
	
	
}
