public class LojaMoveix {
    
    public static void main(String[] args) throws Exception {
        
        MotoristaDAO M = new MotoristaDAO();
        VeiculoDAO Vei = new VeiculoDAO();
        VendedorDAO Ven = new VendedorDAO();
        
        Motorista m = new Motorista(1, 111222333, 111222333, "Igor", "52930000");
        Motorista m2 = new Motorista(2, 222333444, 444555666, "Adriano", "54630000");
        Motorista m3 = new Motorista(3, 555666777, 777888999, "Douglas", "52490000");
        
        Veiculo v = new Veiculo("ABC-123", 10);
        Veiculo v2 = new Veiculo("DEF-456", 11);
        
        M.adicionarMotorista(m);
        M.adicionarMotorista(m2);
        M.adicionarMotorista(m3);
        
        Vei.adicionarVeiculo(v);
        Vei.adicionarVeiculo(v2);
        
        
    }
}
