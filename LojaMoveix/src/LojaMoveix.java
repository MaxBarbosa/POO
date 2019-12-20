import java.util.Date;
public class LojaMoveix {
    
    public static void main(String[] args) throws Exception {
        
        MotoristaDAO motDAO = new MotoristaDAO();
        VeiculoDAO veiDAO = new VeiculoDAO();
        VendedorDAO venDAO = new VendedorDAO();
        VendaDAO vendDAO = new VendaDAO();
        ClienteDAO cliDAO = new ClienteDAO();
        ProdutoDAO proDAO = new ProdutoDAO();
        EntregaDAO entreDAO = new EntregaDAO();
       
        Motorista m = new Motorista(1, 111222333, 111222333, "Igor", "52930000");
        Motorista m2 = new Motorista(2, 222333444, 444555666, "Adriano", "54630000");
        Motorista m3 = new Motorista(3, 555666777, 777888999, "Douglas", "52490000");
        
        Veiculo v = new Veiculo("ABC-123", 10);
        Veiculo v2 = new Veiculo("DEF-456", 11);
        
        Vendedor vend = new Vendedor(1, 222333444, 350, "Arnaldo", "Rua Alameda Slim");
        Vendedor vend2 = new Vendedor(2, 555666777, 620, "Armandro", "Rua Sem Volta");
        
        Produto pro = new Produto(1, 150, "Novo", 160, "Cadeira");
        Produto pro2 = new Produto(2, 520, "Novo", 530, "Sofa");
        Produto pro3 = new Produto(3, 600, "Novo", 610, "Mesa");
        Produto pro4 = new Produto(4, 830, "Novo", 840, "Guarda-roupa");
        Produto pro5 = new Produto(5, 690, "Novo", 700, "Cama");
        Produto pro6 = new Produto(6, 520, "Novo", 530, "Poltrona");
        Produto pro7 = new Produto(7, 600, "Novo", 610, "Tamborete");
        Produto pro8 = new Produto(8, 830, "Novo", 840, "Estante");
        Produto pro9 = new Produto(9, 690, "Novo", 700, "Portão");
        Produto pro10 = new Produto(10, 690, "Novo", 700, "Porta");
       
        Venda venda = new Venda(1, 35000, 1, 1);
        venda.getItens().add(new Item_venda(1, 1, 200, 5));
              
        
        Cliente clien = new Cliente(1, "José Barros", "998741664", "Rua Manaira", 158131668, "joseBarros@gmail.com");
        Cliente clien2 = new Cliente(2, "Otacilio Neto", "12345678", "Rua Sobral", 12131415, "otaneto@gmail.com");
        
        Entrega en = new Entrega("13:20", "2019-09-05", 1, "ABC-123", 1);
        
        
        motDAO.adicionarMotorista(m);
        motDAO.adicionarMotorista(m2);
        motDAO.adicionarMotorista(m3);
        
        veiDAO.adicionarVeiculo(v);
        veiDAO.adicionarVeiculo(v2);
        
        venDAO.adicionarVendedor(vend);
        venDAO.adicionarVendedor(vend2);
        
        
        motDAO.listarMotorista();
        veiDAO.listarVeiculo();
        venDAO.listarVendedor();
      
        proDAO.adicionarProduto(pro);
        proDAO.adicionarProduto(pro2);
        proDAO.adicionarProduto(pro3);
        proDAO.adicionarProduto(pro4);
        proDAO.adicionarProduto(pro5);
        proDAO.adicionarProduto(pro6);
        proDAO.adicionarProduto(pro7);
        proDAO.adicionarProduto(pro8);
        proDAO.adicionarProduto(pro9);
        proDAO.adicionarProduto(pro10);
        
        
        
        cliDAO.adicionarCliente(clien);
        cliDAO.adicionarCliente(clien2);
        vendDAO.efetuarVenda(venda);
        entreDAO.adicionarEntrega(en);
    }
}
