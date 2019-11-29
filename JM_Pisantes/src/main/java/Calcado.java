public abstract class Calcado {
    private int codCalcado, tamanho;
    private String cor, marca, material;
    double valor;

    public Calcado(int codCalcado, int tamanho, String cor, String marca, String material, double valor) {
        this.codCalcado = codCalcado;
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.valor = valor;
    }

    public int getCodCalcado() {
        return codCalcado;
    }

    public void setCodCalcado(int codCalcado) {
        this.codCalcado = codCalcado;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

    public abstract double Desconto();
    

    
}
