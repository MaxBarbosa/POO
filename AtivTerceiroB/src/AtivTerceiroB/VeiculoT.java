package AtivTerceiroB;

public abstract class VeiculoT implements Veiculo {

	private int ano, velocidade;
	private double valor;
	private String descricao, placa;
	
	public VeiculoT(int velocidade, String descricao, int ano, String placa, double valor) {
		this.velocidade = velocidade;
		this.descricao = descricao;
		this.ano = ano;
		this.placa = placa;
		this.valor = valor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public abstract String ToString();
	
	/*public  String ToString() {
		return "MOTO [ano=" + getAno() + ", velocidade=" + getVelocidade() + ", valor=" + getValor() + ", descricao=" + getDescricao()
				+ ", placa=" + getPlaca() + "]";
	}*/
}
