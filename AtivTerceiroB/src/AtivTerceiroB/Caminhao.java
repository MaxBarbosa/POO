package AtivTerceiroB;

public class Caminhao extends VeiculoT{
	private double cargaSuport, comprimento;
	
	public Caminhao(int velocidade, String descricao, int ano, String placa, double valor, int cargaSuport, int comprimento) {
		super(velocidade, descricao, ano, placa, valor);
		this.cargaSuport = cargaSuport;
		this.comprimento = comprimento;
	}

	public double getCargaSuport() {
		return cargaSuport;
	}

	public void setCargaSuport(double cargaSuport) {
		this.cargaSuport = cargaSuport;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void acelerar(){
		super.setVelocidade(super.getVelocidade() + 8);
	}
	
	public void frear(){
		if (super.getVelocidade() < 8) {
			System.out.println("Nao foi possivel reduzir a velocidade");
		}
		else {
			super.setVelocidade(super.getVelocidade() - 8);
		}
	}
	public  String ToString() {
		return "CAMINHAO: ano= " + getAno() + ", velocidade= " + getVelocidade() + ", descricao= " + getDescricao() + "\n" + "";
	}
}
