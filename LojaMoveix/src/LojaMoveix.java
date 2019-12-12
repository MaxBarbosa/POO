public class LojaMoveix {
    
    public static void main(String[] args) throws Exception {
        
        Cliente c = new Cliente(1, "Jose", "40028922", "59340000", 1112223334, "ze@gmail.com");
        //Entrega e = new Entrega("14:50", '2019-12-10', 1, "ABC-123", 1);
        Motorista m = new Motorista(1, 199299399, 399299199, "Arnaldo", "59230000");
        
        ClienteDAO C = new ClienteDAO();
        EntregaDAO E = new EntregaDAO();
        Item_vendaDAO I = new Item_vendaDAO();
        MotoristaDAO M = new MotoristaDAO();
        ProdutoDAO P = new ProdutoDAO();
        VeiculoDAO V = new VeiculoDAO();
        VendaDAO Ve = new VendaDAO();
        VendedorDAO Ven = new VendedorDAO();
       
        
       C.adicionarCliente(c);
       M.adicionarMotorista(m);
        
        System.out.println(M.listarMotorista());
    }
}
