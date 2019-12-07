public class Item_venda {
    private int CodPro, NumVen;
    private double vUnitario;
    private int Qtd;

    public Item_venda(int CodPro, int NumVen, double vUnitario, int Qtd) {
        this.CodPro = CodPro;
        this.NumVen = NumVen;
        this.vUnitario = vUnitario;
        this.Qtd = Qtd;
    }

    public int getCodPro() {
        return CodPro;
    }

    public void setCodPro(int CodPro) {
        this.CodPro = CodPro;
    }

    public int getNumVen() {
        return NumVen;
    }

    public void setNumVen(int NumVen) {
        this.NumVen = NumVen;
    }

    public double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }
    
}
