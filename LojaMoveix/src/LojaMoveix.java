public class LojaMoveix {
    
    public static void main(String[] args) throws Exception {
        Motorista m = new Motorista(1, 199299399, 399299199, "Arnaldo", "59230000");
        MotoristaDAO M = new MotoristaDAO();
        
        M.adicionarMotorista(m);
        
        System.out.println(M.listarMotorista());
    }
}
