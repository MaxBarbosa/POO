package AtivTerceiroB;

public class Moto extends VeiculoT {
	private int potencia;
	
	public Moto(int velocidade, String descricao, int ano, String placa, double valor, int potencia) {
		super(velocidade, descricao, ano, placa, valor);
		this.potencia = potencia;
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
		return "MOTO: ano= " + getAno() + ", velocidade= " + getVelocidade() + ", descricao= " + getDescricao() + "\n" + "";
	}
	
}
