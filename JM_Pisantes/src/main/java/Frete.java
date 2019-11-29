public class Frete {
    private int distanciaKm;
    private double valorKm;
    
    public Frete(int distanciaKm, double valorKm){
       this.distanciaKm = distanciaKm;
       this.valorKm = valorKm;
    }

    public int getDistanciaKm(){
        return distanciaKm;
    }
    
    public void setDistanciaKm(int distanciaKm){
        this.distanciaKm = distanciaKm;
    }
    
    public double getValorKm(){
        return valorKm;
    }
    
    public void setValorKm(double valorKm){
        this.valorKm = valorKm;
    }
        
    
    public double calcularFrete(){
        return getDistanciaKm()*getValorKm();
    }
}
