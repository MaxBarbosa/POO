package AtivTerceiroB;

public class Carro extends VeiculoT {
	private int  qtdPortas, potencia;
	
	public Carro(int velocidade, String descricao, int ano, String placa, double valor, int qtdPortas, int potencia) {
		super(velocidade, descricao, ano, placa, valor);
		this.qtdPortas = qtdPortas;
		this.potencia = potencia;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void acelerar(){
		super.setVelocidade(super.getVelocidade() + 10);
	};
	
	public void frear(){
		if (super.getVelocidade() < 10) {
			System.out.println("Nao foi possivel reduzir a velocidade");
		}
		else {
			super.setVelocidade(super.getVelocidade() - 10);
		}
	}
	
	public  String ToString() {
		return "CARRO: ano= " + getAno() + ", velocidade= " + getVelocidade() + ", descricao= " + getDescricao() + "\n" + "";
	}
	
}
